package Provider_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTelemedicineInvitation {
    public WebDriver driver;


    @BeforeTest
    public void Login_method() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\88017\\Desktop\\intelij\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();


        String URL = "https://stg.injurycloud.com/";


        driver.get(URL);
        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.id("Email")).sendKeys("jliza@mymedicalhub.com");
        Thread.sleep(1000);

        driver.findElement(By.id("Password")).sendKeys("Dkjj4@");
        Thread.sleep(1000);

        driver.findElement(By.id("login-btn")).click();
        Thread.sleep(3000);


    }

    @Test(priority = 1)
    public void roomJoin() throws InterruptedException {


        //click my telemed invitation
        driver.findElement(By.xpath("//*[@id=\"pagesidebarmenu\"]/li[5]/a/span")).click();
        Thread.sleep(3000);
         //click Meet now button
        //driver.findElement(By.xpath("//*[@id=\"all-telemed\"]/tbody/tr[1]/td[8]/a")).click();
        Thread.sleep(3000);

        // To Delete an invitation
        driver.findElement(By.xpath("//*[@id=\"all-telemed\"]/tbody/tr[1]/td[10]/a")).click();
        Thread.sleep(3000);
        // Delete confirmation
        driver.findElement(By.xpath("/html/body/div[13]/div/div[3]/button[1]")).click();
        Thread.sleep(3000);
        // click on OK
        driver.findElement(By.xpath("/html/body/div[13]/div/div[3]/button[1]")).click();
        Thread.sleep(3000);
    }
}
