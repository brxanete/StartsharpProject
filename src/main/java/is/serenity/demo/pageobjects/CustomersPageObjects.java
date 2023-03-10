package is.serenity.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CustomersPageObjects extends PageObject {

    By btnNewCustomer = By.xpath("//span[text()=' Nuevo Customer']");
    By btnSave = By.xpath("//span[text()=' Nuevo Customer']");
    By txtFilter = By.xpath("//input[@class='s-Serenity-QuickSearchInput s-QuickSearchInput']");
    String idValue = "//a[text()='Replace']";


    public By getBtnNewCustomer() {
        return btnNewCustomer;
    }

    public By getBtnSave() {
        return btnSave;
    }

    public By getTxtFilter() {
        return txtFilter;
    }

    public String getIdValue() {
        return idValue;
    }
}
