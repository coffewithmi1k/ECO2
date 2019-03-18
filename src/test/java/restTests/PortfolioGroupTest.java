package restTests;

import apiControllers.PortfolioGroupController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class PortfolioGroupTest extends Configuration {

    CompaniesJsons companiesJsons = new CompaniesJsons();
    PortfolioGroupController portfolioGroupController = new PortfolioGroupController();

    @Test
    public void checkGetAllPortfolioGroups(){
        portfolioGroupController.getAllPortfolioGroups();
    }
    @Test
    public void checkSpecificPortfolioGroup(){
        portfolioGroupController.getSpecificPortfolioGroup(53);
    }
}
