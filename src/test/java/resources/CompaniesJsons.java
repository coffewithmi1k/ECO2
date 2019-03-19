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
            "  \"supplierID\": 2989,\n" +
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
            "    \"id\": 29517,\n" +
            "    \"name\": \"coffePD"+getDate()+"\",\n" +
            "    \"plantName\": \"coffePD\",\n" +
            "    \"certificateType\": null,\n" +
            "    \"gsrn\": \"13021302b"+getRandomNumber()+"\",\n" +
            "    \"operatorCompanyID\": 2996,\n" +
            "    \"operatorCompany\": {\n" +
            "        \"contacts\": [],\n" +
            "        \"id\": 2996,\n" +
            "        \"name\": \"13.03CoffeCompany1\",\n" +
            "        \"businessID\": \"\",\n" +
            "        \"city\": \"\",\n" +
            "        \"zipCode\": \"\",\n" +
            "        \"organizationNumber\": \"\",\n" +
            "        \"countryID\": null,\n" +
            "        \"indirectOwnerID\": null,\n" +
            "        \"notes\": \"\",\n" +
            "        \"isVendor\": false,\n" +
            "        \"erpVendorID\": null,\n" +
            "        \"erpCustomerID\": null,\n" +
            "        \"category1\": \"D 15\",\n" +
            "        \"category2\": \"\",\n" +
            "        \"countryName\": \"\",\n" +
            "        \"street\": \"\",\n" +
            "        \"paymentTerms\": null,\n" +
            "        \"lastUpdatedAt\": \"2019-03-13T08:25:25.497Z\",\n" +
            "        \"updatedBy\": \"ykurylo\"\n" +
            "    },\n" +
            "    \"accountHolderCompanyID\": 2996,\n" +
            "    \"accountHolderCompany\": {\n" +
            "        \"contacts\": [],\n" +
            "        \"id\": 2996,\n" +
            "        \"name\": \"13.03CoffeCompany1\",\n" +
            "        \"businessID\": \"\",\n" +
            "        \"city\": \"\",\n" +
            "        \"zipCode\": \"\",\n" +
            "        \"organizationNumber\": \"\",\n" +
            "        \"countryID\": null,\n" +
            "        \"indirectOwnerID\": null,\n" +
            "        \"notes\": \"\",\n" +
            "        \"isVendor\": false,\n" +
            "        \"erpVendorID\": null,\n" +
            "        \"erpCustomerID\": null,\n" +
            "        \"category1\": \"D 15\",\n" +
            "        \"category2\": \"\",\n" +
            "        \"countryName\": \"\",\n" +
            "        \"street\": \"\",\n" +
            "        \"paymentTerms\": null,\n" +
            "        \"lastUpdatedAt\": \"2019-03-13T08:25:25.497Z\",\n" +
            "        \"updatedBy\": \"ykurylo\"\n" +
            "    },\n" +
            "    \"upgradeDate\": null,\n" +
            "    \"upgradeCoverage\": null,\n" +
            "    \"publicUpgradeInfo\": null,\n" +
            "    \"commissionDate\": \"2019-03-14T00:00:00.000Z\",\n" +
            "    \"installedCapacityMW\": \"1\",\n" +
            "    \"annualEstimatedCapacityMWh\": \"1\",\n" +
            "    \"annualCalculatedProductionMWh\": 1320,\n" +
            "    \"goCeritificationExpirationDate\": \"2019-03-13T00:00:00.000Z\",\n" +
            "    \"city\": \"Oslo\",\n" +
            "    \"countryID\": 160,\n" +
            "    \"county\": \"Oslo\",\n" +
            "    \"municipality\": \"Oslo kommune\",\n" +
            "    \"longitude\": 10.741557,\n" +
            "    \"latitude\": 59.914267,\n" +
            "    \"technologyFullCode\": \"T040000\",\n" +
            "    \"fuelFullCode\": \"F02000000\",\n" +
            "    \"earmark\": 3,\n" +
            "    \"upgradeEarmark\": null,\n" +
            "    \"trShortPosition\": 0.5,\n" +
            "    \"country\": {\n" +
            "        \"id\": 160,\n" +
            "        \"name\": \"NORWAY\",\n" +
            "        \"isocodE2\": \"NO\",\n" +
            "        \"isocodE3\": \"NOR\",\n" +
            "        \"displayName\": \"Norway\",\n" +
            "        \"numCode\": 578,\n" +
            "        \"phoneCode\": 47,\n" +
            "        \"inUse\": true\n" +
            "    },\n" +
            "    \"technology\": {\n" +
            "        \"fullCode\": \"T040000\",\n" +
            "        \"level1Code\": \"04\",\n" +
            "        \"level1Description\": \"Marine\",\n" +
            "        \"level2Code\": \"00\",\n" +
            "        \"level2Description\": \"Unspecified\",\n" +
            "        \"level3Code\": \"00\",\n" +
            "        \"level3Description\": \"Unspecified\",\n" +
            "        \"isIRec\": true\n" +
            "    },\n" +
            "    \"owners\": [\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"ownerCompanyID\": \"2996\",\n" +
            "            \"sharePercentage\": 1,\n" +
            "            \"agreementValidFrom\": null,\n" +
            "            \"agteementValidTo\": null\n" +
            "        }\n" +
            "    ],\n" +
            "    \"certificateTypeID\": 1,\n" +
            "    \"presentationHeaderImageURI\": \"/ecohz-dev/PresentationImages/20190314094444704_2019-03-05_1446.png\",\n" +
            "    \"fullPresentationHeaderImageURI\": null,\n" +
            "    \"presentationMapImageURI\": \"/ecohz-dev/PresentationImages/20190314094445399_2019-03-05_1221.png\",\n" +
            "    \"fullPresentationMapImageURI\": null,\n" +
            "    \"presentationHeaderImageCopyright\": null,\n" +
            "    \"presentationPlantDescription\": null,\n" +
            "    \"fuel\": {\n" +
            "        \"fullCode\": \"F02000000\",\n" +
            "        \"level1Code\": \"02\",\n" +
            "        \"level1Description\": \"Fossil\",\n" +
            "        \"level2Code\": \"00\",\n" +
            "        \"level2Description\": \"Unspecified\",\n" +
            "        \"level3Code\": \"00\",\n" +
            "        \"level3Description\": \"Unspecified\",\n" +
            "        \"level4Code\": \"00\",\n" +
            "        \"level4Description\": \"Unspecified\",\n" +
            "        \"isIRec\": false\n" +
            "    },\n" +
            "    \"labels\": [\n" +
            "        {\n" +
            "            \"labelID\": 24,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"applicableTo\": 1,\n" +
            "            \"validFrom\": null,\n" +
            "            \"validTo\": null\n" +
            "        }\n" +
            "    ],\n" +
            "    \"regions\": [\n" +
            "        {\n" +
            "            \"regionID\": 3,\n" +
            "            \"productionDeviceID\": 29517\n" +
            "        },\n" +
            "        {\n" +
            "            \"regionID\": 2,\n" +
            "            \"productionDeviceID\": 29517\n" +
            "        }\n" +
            "    ],\n" +
            "    \"facts\": [\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"featureFactID\": 1,\n" +
            "            \"factValue\": \"1.00\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"presentationFeatures\": [\n" +
            "        {\n" +
            "            \"id\": 40190,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"groupNo\": 2,\n" +
            "            \"seqNo\": 0,\n" +
            "            \"featureName\": \"Power Plant Name\",\n" +
            "            \"featureValue\": \"coffePD\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 40191,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"groupNo\": 2,\n" +
            "            \"seqNo\": 1,\n" +
            "            \"featureName\": \"GSRN\",\n" +
            "            \"featureValue\": \"13021302b\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 2,\n" +
            "            \"groupNo\": 1,\n" +
            "            \"featureName\": \"Longitude\",\n" +
            "            \"featureValue\": \"10.741557\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 3,\n" +
            "            \"groupNo\": 1,\n" +
            "            \"featureName\": \"Latitude\",\n" +
            "            \"featureValue\": \"59.914267\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 4,\n" +
            "            \"groupNo\": 5,\n" +
            "            \"featureName\": \"Technology Code\",\n" +
            "            \"featureValue\": \"T040000\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 5,\n" +
            "            \"groupNo\": 5,\n" +
            "            \"featureName\": \"Fuel Code\",\n" +
            "            \"featureValue\": \"F02000000\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 6,\n" +
            "            \"groupNo\": 3,\n" +
            "            \"featureName\": \"Installed Capacity\",\n" +
            "            \"featureValue\": \"1.00 MW\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 7,\n" +
            "            \"groupNo\": 3,\n" +
            "            \"featureName\": \"Annual Estimated Production\",\n" +
            "            \"featureValue\": \"1 MWh\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 8,\n" +
            "            \"groupNo\": 4,\n" +
            "            \"featureName\": \"Commission Year\",\n" +
            "            \"featureValue\": \"2019\",\n" +
            "            \"isPersisted\": true\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 9,\n" +
            "            \"groupNo\": 6,\n" +
            "            \"featureName\": \"Turbine type\",\n" +
            "            \"featureValue\": \"1.00\",\n" +
            "            \"isPersisted\": false\n" +
            "        },\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 10,\n" +
            "            \"groupNo\": 4,\n" +
            "            \"featureName\": \"Operator\",\n" +
            "            \"featureValue\": \"13.03CoffeCompany1\",\n" +
            "            \"isPersisted\": true\n" +
            "        }\n" +
            "    ],\n" +
            "    \"presentationLabels\": [\n" +
            "        {\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"seqNo\": 0,\n" +
            "            \"labelID\": 24,\n" +
            "            \"labelDisplayText\": \"Bra Miljöval\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"productionStatistics\": [\n" +
            "        {\n" +
            "            \"id\": 8029,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 1,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"January\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8030,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 2,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"February\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8031,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 3,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"March\",\n" +
            "            \"weeks\": [\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8032,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 4,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"April\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8033,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 5,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"May\",\n" +
            "            \"weeks\": [\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8034,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 6,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"June\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8035,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 7,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"July\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8036,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 8,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"August\",\n" +
            "            \"weeks\": [\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8037,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 9,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"September\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8038,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 10,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"October\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8039,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 11,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"November\",\n" +
            "            \"weeks\": [\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22,\n" +
            "                22\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"id\": 8040,\n" +
            "            \"productionDeviceID\": 29517,\n" +
            "            \"month\": 12,\n" +
            "            \"productionMWH\": 110,\n" +
            "            \"monthName\": \"December\",\n" +
            "            \"weeks\": [\n" +
            "                28,\n" +
            "                28,\n" +
            "                27,\n" +
            "                27\n" +
            "            ]\n" +
            "        }\n" +
            "    ],\n" +
            "    \"isInfoCompleted\": true,\n" +
            "    \"lastUpdatedAt\": \"2019-03-14T09:40:00.167Z\",\n" +
            "    \"updatedBy\": \"ykurylo\",\n" +
            "    \"isRemoved\": false,\n" +
            "    \"isUnknown\": false,\n" +
            "    \"scale\": \"Mini (<2 MW)\",\n" +
            "    \"notes\": \"note 1\",\n" +
            "    \"searchIndex\": null,\n" +
            "    \"commissionClassificationCode\": \"G-NO-M0S-0-1302b\",\n" +
            "    \"upgradeClassificationCode\": null,\n" +
            "    \"sourceType\": 6,\n" +
            "    \"portfolioGroup\": \"\",\n" +
            "    \"upgradedPortfolioGroup\": \"\",\n" +
            "    \"ageCategory\": 0,\n" +
            "    \"upgradeAgeCategory\": null\n" +
            "}";
    return addNewProductionDevice;
}

}
