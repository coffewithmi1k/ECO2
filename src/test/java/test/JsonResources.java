package test;

import java.util.Date;

public class JsonResources {

    public String getDate() {
        Date d = new Date();
        String date = d.toString().replace(":", "").replace(" ", "")
                .replace("EET","");
        return date;
    }
    int x = 66;

      String addNewCompany = "{\n" +
            "  \"contacts\": [],\n" +
            "  \"isVendor\": false,\n" +
            "  \"name\": \"Coffe11"+getDate()+"\",\n"+
            "  \"street\": null,\n" +
            "  \"zipCode\": null,\n" +
            "  \"organizationNumber\": null,\n" +
            "  \"city\": null,\n" +
            "  \"notes\": null\n" +
            "}";

}
