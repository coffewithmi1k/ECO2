package restTests;

import apiControllers.PositionDataController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class PositionDataTest extends Configuration {
    PositionDataController positionDataController = new PositionDataController();

    @Test
    public void checkPositionsData(){
positionDataController.getPositionsData();
    }
    @Test
    public void checkEditPositionsData(){
positionDataController.addPositionsData();
    }
    @Test
    public void checkPositionDataPortfolio(){
        positionDataController.getPositionsDataPortfolio();
    }
}
