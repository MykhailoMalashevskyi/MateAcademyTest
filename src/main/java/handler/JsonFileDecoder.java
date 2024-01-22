package handler;

import com.google.gson.Gson;
import lombok.SneakyThrows;

import java.io.FileReader;

public final class JsonFileDecoder {
    private static final Gson GSON = new Gson();

    @SneakyThrows
    public static <T> T decode(String filePath, Class<T> classType) {
        return GSON.fromJson(new FileReader(filePath), classType);
    }
}
