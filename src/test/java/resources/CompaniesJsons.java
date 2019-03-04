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
public String getNewAgreement(){
    String addNewAgreement ="{\"masterDistributionRules\":\"{\\\"current\\\":[0,0,0,0,0,0,0,0,0,0,0,0]," +
            "\\\"future\\\":[0,0,0,0,0,0,0,0,0,0,0,0]}\"," +
            "\"vendorAgreementsProductionDevices\":[]," +
            "\"startDate\":\"2019-03-03T00:00:00.000Z\"," +
            "\"endDate\":null,\"reconciliationFrequency\":1," +
            "\"type\":1," +
            "\"vendorID\":2984," +
            "\"vendor\":{\"contacts\":[]," +
            "\"id\":2984," +
            "\"name\":\"# new\"," +
            "\"businessID\":\"\"," +
            "\"city\":\"\"," +
            "\"zipCode\":\"\",\"organizationNumber\":\"\"," +
            "\"countryID\":3," +
            "\"indirectOwnerID\":null," +
            "\"notes\":\"\"," +
            "\"isVendor\":false," +
            "\"erpVendorID\":null," +
            "\"erpCustomerID\":2200," +
            "\"category1\":null," +
            "\"category2\":null," +
            "\"countryName\":\"Algeria\"," +
            "\"street\":\"\"," +
            "\"paymentTerms\":21," +
            "\"lastUpdatedAt\":\"2019-02-26T09:37:17.603Z\"," +
            "\"updatedBy\":\"ykurylo\"}}";
    return addNewAgreement;
}
}
