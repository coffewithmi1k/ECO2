package restTests;

import apiControllers.SourcingOrdersController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class SourcingOrdersTest extends Configuration {
    SourcingOrdersController sourcingOrdersController = new SourcingOrdersController();
    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Test
    public void checkGetAllSourcingOrders(){
        sourcingOrdersController.getAllSourcingOrders();
    }
    @Test
    public void checkSpecificSourcingOrder(){
        int sourcingOrderID = sourcingOrdersController.getAllSourcingOrders();
        sourcingOrdersController.getSpecificOrder(sourcingOrderID);
    }
    @Test
    public void checkCreateNewSourcingOrder(){
        sourcingOrdersController.createSourcingOrder(companiesJsons.getNewSourcingOrder());
    }
    @Test
    public void checkDeleteNewSourcingOrder(){
        sourcingOrdersController.deleteNewlyCreatedOrder();
    }
}
