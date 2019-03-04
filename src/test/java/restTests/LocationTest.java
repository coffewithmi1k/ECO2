package restTests;

import apiControllers.LocationController;
import configuration.Configuration;
import org.testng.annotations.Test;

public class LocationTest extends Configuration {

    LocationController locationController = new LocationController();


    @Test
    public void checkCountries(){
        locationController.getCountries();
    }
    @Test
    public void checkAllCountries(){
        locationController.getAllCountries();
    }
    @Test
    public void checkRegions(){
        locationController.getAllRegions();
    }
    @Test
    public void checkAllRegionsForSpecificCountry(){
        locationController.getAllRegionsOfSelectedCountry(105);
    }
    @Test
    public void checkAllCountriesForSpecificRegion(){
        locationController.getAllCountriesOfRegion(5);
    }
    @Test
    public void checkLocationCertificateTypes(){
        locationController.getLocationCertificateTypes();
    }
}
