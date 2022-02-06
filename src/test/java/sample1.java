import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample1 {
    public static void main(String[] args) {
        try {//comments added
            WebDriverManager.chromedriver().setup(); //setting up chrome browser driver according to the version available in the system automatically
            WebDriver wd = new ChromeDriver(); //instantiating chrome browser
            wd.manage().window().maximize(); //launching and maximizing browser window
            wd.navigate().to("https://www.google.co.in/"); //navigating to google in browser
            if (wd.getTitle().equals("Google")) //webpage title verification check
                System.out.println("Page Title Verification Passed!");
            else
                System.out.println("Page Title Verification failed...\nExpected:\tGoogle\nActual:\t" + wd.getTitle());
            wd.close(); //closed and exit
        }catch (Exception e){ // exception handled
            System.out.println("Exception thrown and cached....\n"+e.getMessage());
        }

    }
}
