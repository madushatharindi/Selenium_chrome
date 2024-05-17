import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest {

    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");

    }

    @Test
    public void buttonTests(){

//        click and confirm title
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
        clickButton.click();
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("actual title is same as expected");
        }else{
            System.out.println("actual title is not same");
        }

//        find the position of the submit button
        driver.navigate().back();
        WebElement getPosition = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xyPoint = getPosition.getLocation();
        int x = xyPoint.getX();
        int y = xyPoint.getY();
        System.out.println("X position is :" + x + "Y position is:" + y);

//        find the save button color
        WebElement buttonColor = driver.findElement(By.id("j_idt88:j_idt96"));
        String color = buttonColor.getCssValue("background-color");
        System.out.println("Button color is " + color);





    }


}
