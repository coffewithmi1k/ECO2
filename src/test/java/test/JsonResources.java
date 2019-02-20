package test;
import org.json.JSONObject;

import java.util.Date;

public class JsonResources {
    JSONObject requestBody = new JSONObject();

    Date d = new Date();
    String date = d.toString().replace(":", "_").replace(" ", "_");
    int x = 6;

      String addNewCompany = "{\n" +
            "  \"contacts\": [],\n" +
            "  \"isVendor\": false,\n" +
            "  \"name\": \"Coffe11\",\n"+
            "  \"street\": null,\n" +
            "  \"zipCode\": null,\n" +
            "  \"organizationNumber\": null,\n" +
            "  \"city\": null,\n" +
            "  \"notes\": null\n" +
            "}";
}
