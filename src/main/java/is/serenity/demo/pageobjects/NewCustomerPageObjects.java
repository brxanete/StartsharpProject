package is.serenity.demo.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NewCustomerPageObjects extends PageObject {

    By btnSave = By.xpath("//span[text()=' Guardar']");

    By banError = By.xpath("//div[@class='toast toast-error']");

    By txtCustomerId = By.xpath("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CustomerID']");

    By txtCompanyName = By.xpath("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CompanyName']");




    public By getBtnSave() {
        return btnSave;
    }

    public By getBanError() {
        return banError;
    }

    public By getTxtCustomerId() {
        return txtCustomerId;
    }

    public By getTxtCompanyName() {
        return txtCompanyName;
    }
}
