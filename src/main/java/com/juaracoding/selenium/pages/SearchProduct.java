package com.juaracoding.selenium.pages;

import com.juaracoding.selenium.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
    private WebDriver driver;

    public SearchProduct() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div/div/div/div/input")
    WebElement searchItem;

    @FindBy(xpath = "//span[normalize-space()='Menampilkan 1 - 60 barang dari total 5.1jt+ untuk']")
    WebElement txtTotalItem;

    public void setSearchItem() {
        searchItem.sendKeys("dompet" + Keys.ENTER);
    }
    public String getTextTotalItem() {return txtTotalItem.getText();}
}
