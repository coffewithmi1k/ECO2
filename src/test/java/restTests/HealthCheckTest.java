package restTests;

import apiControllers.HealthCheckController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class HealthCheckTest extends Configuration {
    HealthCheckController healthCheckController = new HealthCheckController();

    @Test
    public void checkHealthcheck(){
        healthCheckController.getHealthCheckStatus();
    }
}
