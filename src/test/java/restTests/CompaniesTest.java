package restTests;

import apiControllers.CompaniesController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class CompaniesTest extends Configuration {


CompaniesController companiesController = new CompaniesController();
CompaniesJsons companyJson = new CompaniesJsons();


@Test
    public void checkAllCompanies(){
    companiesController.getAllCompanies();
}

@Test
    public void checkCreateNewCompany(){
    companiesController.createCompany(companyJson.getAddNewCompany());
}

@Test
    public void checkEditCompany(){
companiesController.editCompany(companyJson.getEditCompany());
}
@Test
    public void checkDeleteCompany(){

}

@Test
    public void checkSpecificCompany(){

}
}
