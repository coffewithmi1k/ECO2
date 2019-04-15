package restTests;

import apiControllers.LookUpController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class LookUpTest extends Configuration {
    LookUpController lookUpController = new LookUpController();

    @Test
    public void checkLookUpItems(){
        lookUpController.getLookUpItems();
    }
}
