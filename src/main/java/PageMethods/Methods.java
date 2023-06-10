package PageMethods;

import BaseTest.Startup;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class Methods extends Startup {
    public void Navigate(String URL)
    {
        webdriver.get(URL);
    }

    public void ClickElementByID(String ID) throws InterruptedException {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.elementToBeClickable(By.id(ID)));
        webdriver.findElement(By.id(ID)).click();
    }
    public void ClickElementByXpath(String Xpath)
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
        webdriver.findElement(By.xpath(Xpath)).click();
    }
    public void SendKeysElementsByID(String ID,String key)
    {
        webdriver.findElement(By.id(ID)).sendKeys(key);
    }
    public void SendKeysElementsByXpath(String Xpath,String Key)
    {
        webdriver.findElement(By.xpath(Xpath)).sendKeys(Key);
    }
    public void MoveToElementsAndClick(String Xpath)
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
        action.moveToElement(webdriver.findElement(By.xpath(Xpath))).click().perform();
    }
    public void driverSwitchNewTab(int tabNumber)
    {
        ArrayList<String> newTb = new ArrayList<String>(webdriver.getWindowHandles());
        webdriver.switchTo().window(newTb.get(tabNumber));
    }
    public void ClickElementByText(String Text) throws InterruptedException {
        Thread.sleep(5000);
        webdriver.findElement(By.linkText(Text)).click();
    }
    public void MoveToElement(String Xpath)
    {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
        action.moveToElement(webdriver.findElement(By.xpath(Xpath))).perform();
    }
}
