package restTests;

import apiControllers.AuditController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class AuditTest extends Configuration {

    AuditController auditController = new AuditController();
    @Test
    public void checkInteractionLogs(){
        auditController.getInteractionLogsForPeriod();
    }
}
