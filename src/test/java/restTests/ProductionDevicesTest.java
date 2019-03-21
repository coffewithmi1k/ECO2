package restTests;

import apiControllers.ProductionDevicesController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class ProductionDevicesTest extends Configuration {

    ProductionDevicesController productionDevicesController = new ProductionDevicesController();
    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Test
    public void checkGetAllProductionDevices(){
        productionDevicesController.getAllProductionDevices();
    }
    @Test
    public void checkGetAllProductionDevicesExtended(){
        productionDevicesController.getAllProductionDevicesExtendend();
    }
    @Test
    public void checkGetProductionDeviceByID(){
        productionDevicesController.getProductionDeviceByID(29677);
    }
    @Test
    public void checkGetProductionDeviceByGsrn(){
        productionDevicesController.getProductionDeviceByGSRN("13021302Q");
    }
    @Test
    public void checkCreateNewProductionDevice(){
productionDevicesController.createProductionDevice(companiesJsons.addNewProductionDevice());
    }
    @Test
    public void checkdeleteNewlyCreatedProductionDevice(){
        productionDevicesController.deleteNewlyCreatedProductionDevice();
    }


}
