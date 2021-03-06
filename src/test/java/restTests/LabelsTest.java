package restTests;

import apiControllers.LabelsController;
import configuration.Configuration;
import org.testng.annotations.Test;
import resources.CompaniesJsons;

public class LabelsTest extends Configuration {
    LabelsController labelsController = new LabelsController();
    CompaniesJsons companiesJsons = new CompaniesJsons();

    @Test
    public void checkAllLabels(){
        labelsController.getAllLabels();
    }

    @Test
    public void checkSpecificLabel(){
        int labelID = labelsController.getAllLabels();
        labelsController.getSpecificLabel(labelID);
    }
    @Test
    public void checkCreateNewLabel(){
        labelsController.createNewLabel(companiesJsons.getNewLabel());
    }
    @Test
    public void deleteNewLabel(){
        labelsController.deleteNewLabel();
    }
}
