package resources;

import configuration.Configuration;

public class CompaniesJsons extends Configuration {


public String getAddNewCompany() {
    String addNewCompany = "{\n" +
            "  \"contacts\": [],\n" +
            "  \"isVendor\": false,\n" +
            "  \"name\": \"Coffe" + getDate() +getRandomNumber()+ "\",\n" +
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
            "  \"valueType\": \"Whole Number\",\n" +
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
            "\"vendorID\":3018," +
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

public String getNewSourcingOrder(){
    String newSourcingOrder ="{\n" +
            "  \"orderLines\": [],\n" +
            "  \"serviceLines\": [],\n" +
            "  \"totalOrderedSum\": 0,\n" +
            "  \"totalReceivedSum\": 0,\n" +
            "  \"currencyCode\": \"EUR\",\n" +
            "  \"statusID\": 0,\n" +
            "  \"createdDate\": \"2019-03-06T00:00:00.000Z\",\n" +
            "  \"isLineUpdated\": false,\n" +
            "  \"isMainUpdated\": false,\n" +
            "  \"supplierID\": 3018,\n" +
            "  \"supplier\": {\n" +
            "    \"contacts\": [],\n" +
            "    \"id\": 2989,\n" +
            "    \"name\": \"133\",\n" +
            "    \"businessID\": \"\",\n" +
            "    \"city\": \"\",\n" +
            "    \"zipCode\": \"\",\n" +
            "    \"organizationNumber\": \"\",\n" +
            "    \"countryID\": null,\n" +
            "    \"indirectOwnerID\": null,\n" +
            "    \"notes\": \"\",\n" +
            "    \"isVendor\": false,\n" +
            "    \"erpVendorID\": null,\n" +
            "    \"erpCustomerID\": null,\n" +
            "    \"category1\": \"\",\n" +
            "    \"category2\": \"\",\n" +
            "    \"countryName\": \"\",\n" +
            "    \"street\": \"\",\n" +
            "    \"paymentTerms\": null,\n" +
            "    \"lastUpdatedAt\": \"2019-03-05T15:57:01.247Z\",\n" +
            "    \"updatedBy\": \"ykurylo\"\n" +
            "  },\n" +
            "  \"contactPersonID\": null,\n" +
            "  \"contactPerson\": null,\n" +
            "  \"brokerCompanyID\": null,\n" +
            "  \"ecohzContactPersonID\": null,\n" +
            "  \"erpOrderID\": null,\n" +
            "  \"exchangeRate\": \"4.5255\",\n" +
            "  \"expectedDate\": null,\n" +
            "  \"paymentTerms\": null,\n" +
            "  \"ecohzReference\": null,\n" +
            "  \"comments\": null,\n" +
            "  \"isControlled\": false,\n" +
            "  \"isBroker\": false\n" +
            "}";
    return newSourcingOrder;
}

public String addNewSalesOrder(){
    String addNewSalesOrder="{\n" +
            "  \"orderLines\": [],\n" +
            "  \"serviceLines\": [],\n" +
            "  \"totalOrderedSum\": 0,\n" +
            "  \"totalOrderedVolume\": 0,\n" +
            "  \"totalDeliveredSum\": 0,\n" +
            "  \"statusID\": 1,\n" +
            "  \"orderedDate\": \"2019-03-07T00:00:00.000Z\",\n" +
            "  \"margin\": 0.2,\n" +
            "  \"invoiceStatus\": 1,\n" +
            "  \"invoiceStatusLabel\": \"Not Ready\",\n" +
            "  \"nextInvoiceDate\": null,\n" +
            "  \"nextDeliveryDate\": null,\n" +
            "  \"isLineUpdated\": false,\n" +
            "  \"isMainUpdated\": false,\n" +
            "  \"customerCompanyID\": null,\n" +
            "  \"customer\": null,\n" +
            "  \"brokerCompanyID\": null,\n" +
            "  \"contactPersonID\": null,\n" +
            "  \"contactPerson\": null,\n" +
            "  \"ecohzContactPersonID\": null,\n" +
            "  \"erpOrderID\": null,\n" +
            "  \"validityDate\": null,\n" +
            "  \"paymentTerms\": null,\n" +
            "  \"ecohzReference\": null,\n" +
            "  \"comments\": null,\n" +
            "  \"isControlled\": false,\n" +
            "  \"isBroker\": false\n" +
            "}";
    return addNewSalesOrder;
}
public String addNewProductionDevice(){
    String addNewProductionDevice ="{\n" +
            "    \"trShortPosition\": 0.5,\n" +
            "    \"owners\": [],\n" +
            "    \"certificateTypeID\": 1,\n" +
            "    \"labels\": [],\n" +
            "    \"regions\": [],\n" +
            "    \"facts\": [],\n" +
            "    \"presentationLabels\": [],\n" +
            "    \"presentationFeatures\": [\n" +
            "        {\n" +
            "            \"seqNo\": 0,\n" +
            "            \"groupNo\": 2,\n" +
            "            \"featureName\": \"Power Plant Name\",\n" +
            "            \"featureValue\": \"qqewqeqwe\",\n" +
            "            \"isPersisted\": true\n" +
            "        }\n" +
            "    ],\n" +
            "    \"productionStatistics\": [\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 1,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"January\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 2,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"February\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 3,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"March\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 4,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"April\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 5,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"May\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 6,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"June\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 7,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"July\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 8,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"August\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 9,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"September\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 10,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"October\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 11,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"November\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 0,\n" +
            "            \"month\": 12,\n" +
            "            \"productionMWH\": 0,\n" +
            "            \"monthName\": \"December\",\n" +
            "            \"weeks\": [\n" +
            "                0,\n" +
            "                0,\n" +
            "                0,\n" +
            "                0\n" +
            "            ]\n" +
            "        }\n" +
            "    ],\n" +
            "    \"plantName\": \"Coffe"+getDate()+"\",\n" +
            "    \"name\": \"Coffe"+getDate()+"\",\n" +
            "    \"gsrn\": \"13021302"+getRandomNumber()+"\",\n" +
            "    \"notes\": null,\n" +
            "    \"goCeritificationExpirationDate\": null,\n" +
            "    \"isInfoCompleted\": false,\n" +
            "    \"commissionClassificationCode\": \"G\",\n" +
            "    \"upgradeClassificationCode\": null,\n" +
            "    \"upgradeCoverage\": null\n" +
            "}";
    return addNewProductionDevice;
}
public String editSalesData(){
    String salesDataJson = "[\n" +
            "  {\n" +
            "    \"id\": 244,\n" +
            "    \"year\": 2019,\n" +
            "    \"feeType\": 2,\n" +
            "    \"itemType\": 9,\n" +
            "    \"sum\": 13,\n" +
            "    \"volume\": 0\n" +
            "  }\n" +
            "]";
    return  salesDataJson;
}

}
