import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node030g192q2gewvsio734jy01jd968053.node0");

    }

    @Test
    public void testBoxTests(){
//        type your name
        driver.findElement(By.id("j_idt88:name")).sendKeys("Madusha De Silva");

//      append country to the city
        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("India");

//        verify if test box is disabled
        boolean enabled = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is text Box enabled"+ enabled);


//        Retrive the typed text






//        Type email and tab.confirm control moved to next element









    }





}
