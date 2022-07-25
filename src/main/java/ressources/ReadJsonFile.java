package ressources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.asm.TypeReference;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadJsonFile {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static Object getItemFromJson() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream(new File("src/main/java/resources/ItemList.json"));
        TypeReference<List<Item>> typeReference = new TypeReference<List<Item>>() {};
        return objectMapper.readValue(inputStream, typeReference);
    }

    public static <T> List<T> getListFromJson(String path){
        InputStream inputStream = new FileInputStream(new File("path"));
        TypeReference<List<Item>> typeReference = new TypeReference<List<Item>>() {};
        return objectMapper.readValue(inputStream, typeReference);
    }

    //@Test
    void getItemFromJsonTest() throws FileNotFoundException, JsonProcessingException {
        System.out.println(objectMapper.writeValueAsString(getItemFromJson()));
    }

    @Test
    void getItemFromJsonTest() throws FileNotFoundException, JsonProcessingException {
        System.out.println(objectMapper.writeValueAsString(getItemFromJson("src/main/java/resources/ItemList.json")));
    }
}
