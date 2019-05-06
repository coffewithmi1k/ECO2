package restTests;

import apiControllers.ProductsController;
import configuration.Configuration;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class ProductsTest extends Configuration {
    ProductsController productsController = new ProductsController();

    @Test
    public void checkAllProducts() {
        productsController.getAllProducts();
    }

    @Test
    public void checkSpecificProduct(){
        int productID = productsController.getAllProducts();
        productsController.getSpecificProduct(productID);
    }

}
