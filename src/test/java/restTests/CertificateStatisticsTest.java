package restTests;

import apiControllers.CertificateStatisticsController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class CertificateStatisticsTest extends Configuration {


    CertificateStatisticsController certificateStatisticsController = new CertificateStatisticsController();

    @Test
    public void checkCertificateStatistics(){
        certificateStatisticsController.getCertificatesStatistics();
    }
}
