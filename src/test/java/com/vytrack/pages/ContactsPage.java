package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ContactsPage extends BasePage {

    @FindBy(css=".input-widget")
    public WebElement pageNumber;


    public WebElement getContactEmail(String email){
        String xpath = "//*[contains(text(), '"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }

    @FindBy(xpath = "//button/span[@class='caret']")
    public WebElement toggle;

    public void changeView(String str){
        toggle.click();
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.partialLinkText(str)).click();
    }

    public void getMeOneContact(){
        Random rand = new Random();
        int randomRow = rand.nextInt(Driver.get().findElements(By.xpath("//table/tbody//tr")).size()); // 55
// //table/tbody/tr[1]//td//i[@class='fa-edit hide-text']

        Driver.get().findElement(By.xpath("//table/tbody/tr["+randomRow+"]//td//i[@class='fa-edit hide-text']")).click();
    }


}

