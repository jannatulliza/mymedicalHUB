package Provider_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    public WebDriver driver;

    WebElement username= driver.findElement(By.id("Email"));

    WebElement password =  driver.findElement(By.id("Password"));
    WebElement Login = driver.findElement(By.id("login-btn"));


@BeforeTest
    public void loginMethod() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\88017\\Desktop\\intelij\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();


        String URL = "https://stg.injurycloud.com/";
    driver.get(URL);

    driver.manage().window().maximize();

    Thread.sleep(1000);



    }
    @Test (priority = 1, description = "Login to Providers Portal with Authentic Provider Username and Password")

    public void verify_login() throws InterruptedException {



        username.sendKeys("jliza@mymedicalhub.com");

        password.sendKeys("Dkjj4@");

        Login.click();
        Thread.sleep(3000);

        System.out.println("Provider Login successfully");



    }


//    @Test (priority = 2, description = "Verify Provider can not login with Invalid User name or Password")
//
//    public void verify_invalid_login() throws InterruptedException {
//
//
//
//    username.sendKeys("aaa@grr.la");
//
//        password.sendKeys("00Dkjj4@");
//
//        Login.click();
//        Thread.sleep(3000);
//
//        String errorMsg= "Invalid username or password.";
//        String actualMsg=driver.findElement(By.id("swal2-content")).getText();
//        if(actualMsg.equals(errorMsg)) {
//            System.out.println("Test Case Passed");
//        }else {
//            System.out.println("Test Case Failed");
//
//             }


    }








