import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node030g192q2gewvsio734jy01jd968053.node0");
        Thread.sleep(3000);
    }

    @Test
    public void testBoxTests(){
//        type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Madusha");


//      append country to the city
        WebElement appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("India");



//        verify if test box is disabled
        boolean enabled = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is text Box enabled"+ enabled);


//        Clear the typed text
        WebElement clearText = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearText.clear();

//        Retrive the typed text
        WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97"));
        String value = textElement.getAttribute("value");
        System.out.println(value);



//        Type email and tab.confirm control moved to next element
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("madushadesilvad6@gmail.com"+ Keys.TAB+"confirm control moved to next element");








    }





}
