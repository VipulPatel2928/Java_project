import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
    System.out.println("Hello, How Are You?");
    
    int a =10 , b =20;
    
    System.out.println("sum of a and b is "+(a+b));
    
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\VP\\Resources\\chromedriver_2_41.exe");
	 
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	 
	// Open google
	System.out.println("Browser launching and open https://www.google.com/");
	driver.get("https://www.google.com/");
	
	 
	// Maximize browser
	
	System.out.println("Maximizing the window");  
	driver.manage().window().maximize();
	
	
	
	System.out.println("Waiting for 5 second"); 
	Thread.sleep(5000);
	
	
	System.out.println("Closing the browser"); 
    driver.close();
        
	}

}
