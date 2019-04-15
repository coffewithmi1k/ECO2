package restTests;

import apiControllers.ClassificationController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class ClassificationTest extends Configuration {
    ClassificationController classificationController = new ClassificationController();

    @Test
    public void checkClassificationFuels(){
        classificationController.getClassificationFuels();
    }

    @Test
    public void checkClassificationTechnologies(){
        classificationController.getClassificationTechnologies();
    }
}
