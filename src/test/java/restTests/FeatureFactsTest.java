package restTests;

import apiControllers.FeatureFactsController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class FeatureFactsTest extends Configuration {

    FeatureFactsController featureFactsController = new FeatureFactsController();
    CompaniesJsons companyJson = new CompaniesJsons();

    @Test
    public void checkAllFacts(){
        featureFactsController.getAllfactsList();
    }

    @Test
    public void checkSpecificFact(){
        featureFactsController.getSpecificFact(51);
    }

    @Test
    public void checkCreateNewFact(){
        featureFactsController.createNewFact(companyJson.getNewFact());
    }

    @Test
    public void checkDeleteNewFact(){
        featureFactsController.deleteNewFact();
    }


}
