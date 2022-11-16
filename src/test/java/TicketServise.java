import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TicketServise {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.get("https://ticket-service-69443.firebaseapp.com/");
    }

    @Test
    public void Test() {
        System.out.println("Start Test");
    }

    @AfterMethod
    public void pastCondition() {
        wd.quit();
    }

}
