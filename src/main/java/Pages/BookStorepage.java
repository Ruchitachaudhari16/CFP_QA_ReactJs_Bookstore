package Pages;

import baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookStorepage extends BaseClass {
    @FindBy(xpath = "//input[@placeholder='Which book are you looking for?']")
    WebElement bookAreulookingfor;

    public BookStorepage() {
        PageFactory.initElements(driver, this);
    }

    public void bookSearch(String book) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait for up to 10 seconds
        wait.until(ExpectedConditions.elementToBeClickable(bookAreulookingfor)).sendKeys(book);
    }
}

