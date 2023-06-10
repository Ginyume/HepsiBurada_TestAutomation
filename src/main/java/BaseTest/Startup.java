package BaseTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.time.Duration;

public class Startup {
    public static WebDriver webdriver;
    public static Actions action;
    public static WebDriverWait wait;
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest extentTest;


    @BeforeAll
    public static void Startup()
    {
        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        // options.addArguments("headless");
        options.addArguments("disable-popup-blocking");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        webdriver=new ChromeDriver(options);
        action= new Actions(webdriver);
        wait=new WebDriverWait(webdriver, Duration.ofSeconds(15));
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\report.html");
        extent.attachReporter(spark);
        spark.config().enableOfflineMode(true);
        spark.config().setDocumentTitle("Simple Automation Report");
        spark.config().setReportName("Test Report");
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        spark.config().setEncoding("UTF-8");
    }
    @AfterAll
    public static void Quit()
    {
        webdriver.close();
        webdriver.quit();
    }

}
