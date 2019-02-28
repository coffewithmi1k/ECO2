package resources;

import configuration.Configuration;

public class CompaniesJsons extends Configuration {


public String getAddNewCompany() {
    String addNewCompany = "{\n" +
            "  \"contacts\": [],\n" +
            "  \"isVendor\": false,\n" +
            "  \"name\": \"Coffe11" + getDate() + "\",\n" +
            "  \"street\": \"Park Avenue 13\",\n" +
            "  \"zipCode\": \"111222\",\n" +
            "  \"organizationNumber\": \"111\",\n" +
            "  \"city\": \"Lviv\",\n" +
            "  \"notes\": null\n" +
            "}";
    return addNewCompany;
}

public String getNewFact(){
    String addNewFact ="{\n" +
            "  \"factName\": \"Coffe"+getDate()+"\",\n" +
            "  \"valueType\": \"Number\",\n" +
            "  \"applicableTechnologyCodes\": null,\n" +
            "  \"applicableFuelCodes\": null\n" +
            "}";
    return addNewFact;
}
public String getNewLabel(){
    String addNewLabel ="{\n" +
            "  \"code\": \"CoffeLabel"+getDate()+"\",\n" +
            "  \"category\": null,\n" +
            "  \"description\": null,\n" +
            "  \"hasValidityRange\": false,\n" +
            "  \"hasApplicability\": false\n" +
            "}";
    return addNewLabel;
}
}
