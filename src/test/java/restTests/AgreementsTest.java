package restTests;
import apiControllers.AgreementsController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class AgreementsTest extends Configuration {

    AgreementsController agreementsController = new AgreementsController();

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
        agreementsController.setProductionDeviceInAgreement();

    }

}
