package Pages;

import PageMethods.Methods;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class Cosmetic extends Methods {
    @Test
    public void AddingaPerfumetoShoppingCart() throws InterruptedException {
        String Log1="Navigate to Link";
        String Log2="Click on Cookie ";
        String Log3="Click on Cosmetic and Personal Care Button";
        String Log4="Click on the Perfume Button";
        String Log5="Click on the First row second element on page";
        extentTest=extent.createTest("Adding a Perfume to Shopping Cart");
        //Navigate to Link
        try {
            Navigate("https://www.hepsiburada.com/");
            extentTest.log(Status.PASS,Log1);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log1);
        }
        //Click the Cookie Accept Button
        try {
            ClickElementByXpath("//*[@id=\"onetrust-accept-btn-handler\"]");
            extentTest.log(Status.PASS,Log2);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log2);
        }
        //Click on the Cosmetic and Personal Care Button
        try {
            ClickElementByXpath("//div[starts-with(@id,'NavigationDesktop')]/div/div/div/div/div[1]/div/ul/li[7]/span/span");
            extentTest.log(Status.PASS,Log3);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log3);
        }
        //Click on the Perfume Button
        try {
            ClickElementByText("Parfüm");
            extentTest.log(Status.PASS,Log4);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log4);
        }

        //Click on the First row second element on page
        try {
            ClickElementByXpath("//*[@id='i1']");
            extentTest.log(Status.PASS,Log5);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log5);
        }

        //ClickElementByID("i1");
        //Swicth the current tab
        driverSwitchNewTab(1);
        //Click to Add-To-Cart button
        ClickElementByID("addToCart");
        //Click MyCart Button
        ClickElementByXpath("//*[starts-with(@id,'AddToCart')]/div/div/div/div/div/div[1]/div/div[1]/div/div[2]/button[1]");
        //ClickElementByText("Sepete Git");
        extent.flush();
    }
    @Test
    public void RemoveProductAddedtoCart() throws InterruptedException {
        String Log1="Navigate to Link";
        String Log2="Navigate to Shopping Cart";
        String Log3="Remove the Product";
        extentTest=extent.createTest("Remove Product Added to Cart");
        //Navigate to Link
        try {
            Navigate("https://www.hepsiburada.com/");
            extentTest.log(Status.PASS,Log1);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log1);
        }
        //Click MyCart Button
        try {
            ClickElementByXpath("//*[@id=\"shoppingCart\"]");
            extentTest.log(Status.PASS,Log2);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log2);
        }
        //Remode The Product
        try {
            ClickElementByXpath("//a[@aria-label='Sepetten Çıkar']");
            extentTest.log(Status.PASS,Log3);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log3);
        }

    }
    @Test
    public void Deneme() throws IOException {
        extentTest=extent.createTest("MyFirstTest");
        try {
            extentTest.log(Status.FAIL,"Başarılı");
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,"Başarısız");
        }
        extent.flush();
    }
}
