package restTests;

import apiControllers.SalesOrdersController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class SalesOrdersTest extends Configuration {
    SalesOrdersController salesOrdersController = new SalesOrdersController();
    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Test
    public void checkGetAllSalesOrders() {
        salesOrdersController.getAllSalesOrders();
    }

    @Test
    public void checkSpecificSalesOrder() {
        salesOrdersController.getSpecificOrder(41674);
    }

    @Test
    public void checkCreateNewSalesOrder() {
        salesOrdersController.createNewSalesOrder(companiesJsons.addNewSalesOrder());
    }
}
