package com.gentlemansbarberspanyc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class AppTest {

        WebDriver driver;


        @Test
        public void testHomeButton() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver1.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                WebElement homeButton = driver.findElement(By.cssSelector("a[href='/']"));
                boolean homeButtonIsDisplayed = homeButton.isDisplayed();
                System.out.println("Home button is displayed: " + homeButtonIsDisplayed);
                Assert.assertTrue(homeButtonIsDisplayed);
                driver.quit();
        }

        @Test
        public void testTitle() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                String title = driver.getTitle();
                System.out.println(title);
                Assert.assertEquals("Best Barbershop Tribeca|Barber Shave Near Financial District", title);
                driver.quit();
        }

        @Test
        public void testAboutButton() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.xpath("//a[@href='/about']")).click();
                System.out.println("About Button click success");
                driver.quit();
        }

        @Test
        public void testBarberingService(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.partialLinkText("Barbering Services")).click();
                System.out.println("BarberingService click success");
                driver.quit();
        }

        @Test
        public void testShopGentlemanProducts(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.partialLinkText("Shop Gentleman's® Products")).click();
                System.out.println("Shop Gentleman's® Products click success");
                driver.quit();
        }

        @Test
        public void testContact(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.partialLinkText("Contact 646-490-5008")).click();
                System.out.println("Click on Contact Success");
                driver.quit();
        }

        @Test
        public void testGentlemanBlog(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.partialLinkText("Gentleman's Blog")).click();
                System.out.println("Click on Gentleman Blog success, new page opens up");
                driver.quit();
        }

        @Test
        public void testGentNycGallery(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.partialLinkText("Gent NYC Gallery")).click();
                System.out.println("Click on Gent NYC Gallery Success");
                driver.quit();
        }

        @Test
        public void testSocialSiteFacebook(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, SECONDS);
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.xpath("//a[@aria-label='Facebook']")).click();
                System.out.println("Click on Facebook icon Success");
                driver.quit();
        }

        @Test
        public void testSocialSiteInstagram(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.xpath("//a[@aria-label='Instagram']")).click();
                System.out.println("Click on Instagram icon Success");
                driver.quit();
        }

        @Test
        public void testSocialSiteTwitter(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.xpath("//a[@aria-label='Twitter']")).click();
                System.out.println("Click on Twitter icon Success");
                driver.quit();
        }
        @Test
        public void testBookOnline() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.xpath("//a[contains(text(),'Book Online')]")).click();
                System.out.println("Click on Book Online icon Success");

                driver.get("https://getsquire.com/booking/book/gentlemans-barber-spa-nyc-new-york-1");
                WebElement titleElement = driver.findElement(By.tagName("title"));
                String titleText = titleElement.getAttribute("textContent");
                System.out.println("Page Title: " + titleText);
                String keyword = "Gentleman's Barber Spa - NYC";
                if (titleText.contains(keyword)) {
                        System.out.println("Title contains the keyword: " + keyword);
                } else {
                        System.out.println("Title does not contain the keyword: " + keyword);
                }

                WebElement chooseServiceElement = driver.findElement(By.cssSelector("div.jkLWQo p:nth-of-type(1)"));
                chooseServiceElement.click();
                System.out.println("Click on Categories");

                WebElement element = driver.findElement(By.cssSelector("p.Text__StyledText-sc-rurwhc-0.Text__PrimarySelectableOnPrimary-sc-rurwhc-1.Text__Primary14-sc-rurwhc-10.eiCxKx.Box-sc-3wfaso-0.jXSwVk"));
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", element);


                System.out.println("Click in  MakeUp Success");

                WebElement headShaveElement = driver.findElement(By.xpath("//span[contains(text(),'Head Shave')]"));
                headShaveElement.click();



                System.out.println("Click in  eye waxing Success");
                }



                //WebElement allCategoriesElement = driver.findElement(By.cssSelector("div[data-testid='select-all-categories'] > button > span"));
                //allCategoriesElement.click();





                //driver.quit();


        @Test
        public void testBookOnline2nd() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.linkText("BOOK ONLINE")).click();
                System.out.println("Click on Book Online icon Success");

                driver.quit();

        }

        @Test
        public void testCallNow(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.linkText("CALL NOW")).click();
                System.out.println("Click on Call Now Success");
                driver.quit();
        }

        @Test
        public void testClickonPhota(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.xpath("//*[contains(@class, 'fluidImageOverlay')]"));
                System.out.println("Click on Image Success");


        }
        @Test
        public void testClickOnOurStory() {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                driver.findElement(By.xpath("//strong[text()='Our Story']")).click();
                System.out.println("Click on Our Story Success");
        }

        @Test
        public void testSelectTest(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                WebElement quote = driver.findElement(By.xpath("//blockquote[contains(., 'Will never go anywhere else for a haircut again. Absolutely excellent. The staff is super friendly, and the barbers are artists. Not a single strand of hair goes unnoticed. Can’t speak highly enough about this place!')]"));
                Actions actions = new Actions(driver);
                actions.moveToElement(quote)
                        .clickAndHold()
                        .moveByOffset(100, 75)
                        .release()
                        .perform();
                System.out.println("Text select success");
                driver.quit();
        }

        @Test
        public void TestScrollEg(){
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devraj\\IdeaProjects\\gentlemansbarberspanyc\\WebDriver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.gentlemansbarberspanyc.com/");
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

                // Wait for the page to load
                try {
                        Thread.sleep(2000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                // Scroll all the way up using JavascriptExecutor
                js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
                System.out.println("Page Scroll down success");
                driver.quit();
        }
}










