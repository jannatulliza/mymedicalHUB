package Provider_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class invite_telemedicine {

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
    public void clickInvite() throws InterruptedException {

        //click invite menu
        driver.findElement(By.xpath("//*[@id=\"topRefer\"]/span")).click();
        Thread.sleep(3000);

        //telemedicine click
        driver.findElement(By.xpath("//*[@id=\"div-refer\"]/div/div[1]/label")).click();
        // enter room name

        driver.findElement(By.id("refer-room-name")).sendKeys("room name");


    }

    @Test(priority = 2)
    public void Body_Region() throws InterruptedException {


//posture click
        driver.findElement(By.xpath("//*[@id=\"msk-region\"]/div/div[5]/label/span[3]")).click();


//        // neck click
//        driver.findElement(By.xpath("//*[@id=\"msk-region\"]/div/div[1]/label/span[3]")).click();
//        Thread.sleep(2000);
//// back click
//        driver.findElement(By.xpath("//*[@id=\"msk-region\"]/div/div[3]/label/span[3]")).click();
//        Thread.sleep(2000);
//
//
//        // legs click
//        driver.findElement(By.xpath("//*[@id=\"msk-region\"]/div/div[4]/label/span[3]")).click();
//        Thread.sleep(2000);


    }

    @Test(priority = 3)
    public void invitation() throws InterruptedException {

        //email enter

        driver.findElement(By.id("emails")).sendKeys("liza@yopmail.com");

//send email
        driver.findElement(By.id("refersendrefermodalbtn")).click();
        Thread.sleep(9000);
// go to room button click
        driver.findElement(By.xpath("/html/body/div[15]/div/div[3]/button[1]")).click();
        Thread.sleep(2000);


    }

//    @AfterTest
//    public void browserClose() throws InterruptedException {
//
//
//      //click corss button
//        //driver.findElement(By.xpath("/html/body/div[15]/div/div[3]/button[3]/i")).click();
//        Thread.sleep(2000);
//        // driver.close();

    }

