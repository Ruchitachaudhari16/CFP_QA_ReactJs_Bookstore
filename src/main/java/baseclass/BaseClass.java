package baseclass;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public WebDriver driver;

    public static Properties properties;

    public BaseClass() {
        try {
            properties = new Properties();

            FileInputStream inputStream = new FileInputStream("C:\\Users\\www.abcom.in\\IdeaProjects\\BookStoreReactjs\\src\\main\\java\\Config\\config.properties");
            properties.load(inputStream);
            System.out.println("Properties loaded successfully: " + properties);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialization() {
        String browserName = properties.getProperty("browser");

        if (browserName.equals("Chrome")) {
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();

        driver.get(properties.getProperty("url"));
    }
}



