package utilities;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON {
    public static void main(String[] args) throws IOException, ParseException {
        String filepath = System.getProperty("user.dir") + "/jsonSample";
        FileReader file = new FileReader(filepath);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(file);
        System.out.println(jsonObject.toJSONString());

        JSONObject menu = (JSONObject) jsonObject.get("menu");
        System.out.println(menu);

        JSONObject popup = (JSONObject) menu.get("popup");
        System.out.println(popup);

        JSONArray menuItems = (JSONArray) popup.get("menuitem");
        System.out.println(menuItems);

        JSONObject firstMenuItem = (JSONObject) menuItems.get(0);
        System.out.println(firstMenuItem);

        String createNewDocValue = (String) firstMenuItem.get("value");
        System.out.println(createNewDocValue);

    }
}