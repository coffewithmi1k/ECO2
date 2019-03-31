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
    @Test(priority = 1)
    public void checkSpecificPortfolioGroup(){
        int portfolioGroupID = portfolioGroupController.getAllPortfolioGroups();
        portfolioGroupController.getSpecificPortfolioGroup(portfolioGroupID);
    }
}
