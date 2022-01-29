package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;



public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeTest() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");


    }

    @Test
    public void test1() throws InterruptedException {
        String expectedTittle ="Amazon.com.Spend less. Smile more.";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell XPS 13 9310");
        driver.findElement(By.id("nav-search-submit-button")).click();


    }

    @Test
    public void test2() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad");
        driver.findElement(By.id("nav-search-submit-button")).click();

       // nav-link-prime


    }

   @Test
  public void test3() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
       driver.findElement(By.id("nav-search-submit-button")).click();
   }


    @Test
    public void test4() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver.findElement(By.id("glow-ingress-line2")).click();

    }

    @Test
    public void test5() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver.findElement(By.id("nav-logo-sprites")).click();

    }

    @Test
    public void test6() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver.findElement(By.id("icp-touch-link-language")).click();

    }

    @Test
    public void test7() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver.findElement(By.id("nav-orders")).click();

    }

    @Test
    public void test8() {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        driver.findElement(By.id("searchDropdownBox")).click();
    }

        @AfterMethod
    public void afterMethod(){
        driver.close();
    }}
