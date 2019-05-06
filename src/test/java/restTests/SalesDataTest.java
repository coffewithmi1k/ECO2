package restTests;

import apiControllers.SalesDataController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class SalesDataTest extends Configuration {
    SalesDataController salesDataController = new SalesDataController();
    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Test
    public void checkAllSalesData(){
salesDataController.getAllSalesData();
    }

    @Test
    public void checkEditSalesData(){
salesDataController.editSalesData(companiesJsons.editSalesData());
    }

    @Test
    public void checkSalesDataBalances(){
salesDataController.getSalesDataBalances();
    }
}
