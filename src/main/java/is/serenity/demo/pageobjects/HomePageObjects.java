package is.serenity.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class HomePageObjects extends PageObject {

    By btnNorthwind = By.xpath("//span[text()='Northwind']");

    By btnCustomers = By.xpath("//span[text()='Customers']");

    public By getBtnNorthwind() {
        return btnNorthwind;
    }

    public By getBtnCustomers() {
        return btnCustomers;
    }
}
