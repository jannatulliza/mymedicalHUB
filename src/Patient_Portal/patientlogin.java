package Patient_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class patientlogin {

    public WebDriver driver;

@BeforeTest
    public void Login_method() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\88017\\Desktop\\intelij\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();


        String URL = "https://stg.mypainlog.ai/#/";


        driver.get(URL);
    Thread.sleep(3000);
        driver.manage().window().maximize();

        Thread.sleep(1000);
        // click sign in button
driver.findElement(By.linkText("SIGN IN")).click();
    Thread.sleep(3000);
       //enter email
        driver.findElement(By.name("Email")).sendKeys("stgtele@yopmail.com");
        Thread.sleep(1000);
    //enter password
        driver.findElement(By.name("Password")).sendKeys("Qweqwe1234@");
        Thread.sleep(1000);
    //check remember me checkbox
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[2]/form/div[3]/div[1]/label/span")).click();
        // click sign in button
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div[2]/form/div[4]/button")).click();
        Thread.sleep(3000);


    }

    @Test(priority = 1)

    public void patientlg(){

    System.out.println("patient Login successfully");
    }


}
