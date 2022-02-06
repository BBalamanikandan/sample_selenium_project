import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample1 {
    public static void main(String[] args) {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver wd = new ChromeDriver();
            wd.manage().window().maximize();
            wd.navigate().to("https://www.google.co.in/");
            if (wd.getTitle().equals("Google"))
                System.out.println("Page Title Verification Passed!");
            else
                System.out.println("Page Title Verification failed...\nExpected:\tGoogle\nActual:\t" + wd.getTitle());
            wd.close();
        }catch (Exception e){
            System.out.println("Exception thrown and cached....\n"+e.getMessage());
        }

    }
}
