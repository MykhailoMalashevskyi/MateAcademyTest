package provider;

import dto.testData.UrlManagerModal;
import dto.testData.UserDataModal;
import handler.JsonFileDecoder;
import lombok.NonNull;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ConfigProvider {
    public static final String ENV_URLS_FILE_NAME = "BaseUrls";
    public static final String TEST_DATA_FILE_NAME = "TestData";

    public static final UrlManagerModal URL_MANAGER = JsonFileDecoder
            .decode(getAbsolutePath(ENV_URLS_FILE_NAME), UrlManagerModal.class);

    public static final UserDataModal TEST_DATA = JsonFileDecoder
            .decode(getAbsolutePath(TEST_DATA_FILE_NAME), UserDataModal.class);


    private static String getAbsolutePath(@NonNull String filename) {
        Path staticDataProjectPath = Paths.get("src", "main", "resources", filename.concat(".json"));
        return staticDataProjectPath.toAbsolutePath().toString();
    }

}
