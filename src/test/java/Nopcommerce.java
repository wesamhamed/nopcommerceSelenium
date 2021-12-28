import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Nopcommerce {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement loginBtn = driver.findElement(By.cssSelector(".buttons button"));
		loginBtn.click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("/admin"));
		
		WebElement catalogNavItem =driver.findElement(By.xpath("//ul/li/a/p[contains(text(),'Catalog')]"));
		catalogNavItem.click();
		
		WebElement productNavItem = driver.findElement(By.xpath("//ul/li/a/p[text()=' Products']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(productNavItem).click().build().perform();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("Admin/Product/List"));
		
		String pageHeadingTxt = driver.findElement(By.cssSelector("form[action='/Admin/Product/List'] h1")).getText();
		
		Assert.assertTrue(pageHeadingTxt.contains("Products"));
		
		WebElement addNewBtn = driver.findElement(By.cssSelector("form[action='/Admin/Product/List'] a[href='/Admin/Product/Create']"));
		addNewBtn.click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("/Admin/Product/Create"));
		pageHeadingTxt = driver.findElement(By.cssSelector("form#product-form h1")).getText();
		Assert.assertTrue(pageHeadingTxt.contains("Add a new product"));
		
		
//		driver.quit();
	}

}
