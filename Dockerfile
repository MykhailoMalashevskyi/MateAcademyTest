# syntax=docker/dockerfile:1
# Use openjdk:17 as base image.
FROM openjdk:17-jdk-slim

# Show OS info
RUN cat /etc/os-release

# Install utilities and dependencies
RUN apt-get clean && apt-get update && apt-get install -y --fix-missing \
    wget \
    curl \
    ca-certificates \
    fonts-liberation \
    libasound2 \
    libatk-bridge2.0-0 \
    libatk1.0-0 \
    libcups2 \
    libdbus-1-3 \
    libgdk-pixbuf2.0-0 \
    libnspr4 \
    libnss3 \
    libxcomposite1 \
    libxdamage1 \
    libxrandr2 \
    xdg-utils \
    --no-install-recommends \
    && rm -rf /var/lib/apt/lists/*

# Set the Dockerfile's default shell to bash
SHELL ["/bin/bash", "-c"]

# Install Maven
RUN apt-get update && apt-get install -y maven

# Install Node.js for Playwright
RUN curl -fsSL https://deb.nodesource.com/setup_18.x | bash - \
    && apt-get update \
    && apt-get install -y nodejs \
    && node -v \
    && npm -v

# Install Playwright and only the Chromium browser
RUN npm install -g playwright@1.41.1 \
    && playwright install --with-deps chromium

# Install Google Chrome browser
RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google-chrome.list \
    && apt-get update \
    && apt-get install -y google-chrome-stable --fix-missing \
    && rm -rf /var/lib/apt/lists/*

# Copy project files to container
WORKDIR /app
COPY . .

# Correct command for creating a directory
RUN mkdir -p artifacts

# Define mount directory
VOLUME /app/artifacts

# Build project
RUN mvn clean install

# Run tests
CMD ["mvn", "test"]
