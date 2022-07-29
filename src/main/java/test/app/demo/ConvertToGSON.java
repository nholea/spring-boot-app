package test.app.demo;
import com.google.gson.Gson;

public class ConvertToGSON {
    public static String convertUsingGson(Object obj)
    {
        Gson gson = new Gson();
        String objectJson = gson.toJson(obj);
        return objectJson;
    }
}
