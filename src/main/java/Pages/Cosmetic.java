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
        String Log6="Swicthing Tab";
        String Log7="Click on Add-To-Cart button";
        String Log8="Click on MyCart Button";
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
        try {
            driverSwitchNewTab(1);
            extentTest.log(Status.PASS,Log6);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log6);
        }

        //Click on Add-To-Cart button
        try {
            ClickElementByID("addToCart");
            extentTest.log(Status.PASS,Log7);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log7);
        }
        //Click on MyCart Button
        try {
            ClickElementByXpath("//*[starts-with(@id,'AddToCart')]/div/div/div/div/div/div[1]/div/div[1]/div/div[2]/button[1]");
            extentTest.log(Status.PASS,Log8);
        }
        catch (Exception e)
        {
            extentTest.log(Status.FAIL,Log8);
        }
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
        extent.flush();
    }
}
