package restTests;
import apiControllers.AgreementsController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

import java.io.File;

public class AgreementsTest extends Configuration {

    AgreementsController agreementsController = new AgreementsController();
    File setProductionDeviceInAgreement = new File("src\\test\\java\\resources\\SetProductionDeviceInAgreement.json");

CompaniesJsons companiesJsons = new CompaniesJsons();
    @Test
    public void checkAllAgreements(){
        agreementsController.getAllAgreeements();
    }
    @Test
    public void checkSpecificAgreement(){
        agreementsController.getSpecificAgreement(123);
    }
    @Test
    public void checkCreateAgreement(){
        agreementsController.createAgreement(companiesJsons.getNewAgreement());
    }
    @Test
    public void checkDeleteAgreement(){
        agreementsController.deleteAgreement();
    }
    @Test
    public void setProductionDeviceInAgreement(){
        agreementsController.setProductionDeviceInAgreement(setProductionDeviceInAgreement);

    }

}
