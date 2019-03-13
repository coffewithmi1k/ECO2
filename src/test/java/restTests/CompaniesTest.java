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
   String companyID= companiesController.createCompany(companyJson.getAddNewCompany());
   System.out.println(companyID+"Nice!!!!");
}

@Test
    public void checkDeleteCompany(){
companiesController.CheckDeleteCompany();
}

@Test
    public void checkSpecificCompany(){
companiesController.getSpecificCompany(2902);
}
}
