import java.util.List;

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
		
		WebElement productNameTxtField = driver.findElement(By.id("Name"));
		String productName ="product1";
		productNameTxtField.sendKeys(productName);
		String productNameValue =productNameTxtField.getAttribute("value");
		Assert.assertEquals(productNameValue, productName);
		
		WebElement shortDescriptionTxtArea = driver.findElement(By.id("ShortDescription"));
		String shortDescription ="short description";
		shortDescriptionTxtArea.sendKeys(shortDescription);
		String shortDescriptionValue = shortDescriptionTxtArea.getAttribute("value");
		Assert.assertEquals(shortDescriptionValue,shortDescription);
		
		
		driver.switchTo().frame("FullDescription_ifr");
		WebElement fullDescriptionTextField = driver.findElement(By.cssSelector("#tinymce p"));
		String fullDescription = "full description";
		fullDescriptionTextField.sendKeys(fullDescription);
		String fullDescriptionTxt = fullDescriptionTextField.getText();
		Assert.assertEquals(fullDescriptionTxt, fullDescription);
	    driver.switchTo().defaultContent();
	    
	    WebElement productSKUTxtField = driver.findElement(By.id("Sku"));
	    String productSKU = "product sku";
	    productSKUTxtField.sendKeys(productSKU);
	    String productSKUTValue =productSKUTxtField.getAttribute("value");
	    Assert.assertEquals(productSKUTValue, productSKU);
	    
	    WebElement categoriesList =driver.findElement(By.id("SelectedCategoryIds_taglist"));
	    builder.moveToElement(categoriesList).click().build().perform();
	    WebElement categoryItem = driver.findElement(By.cssSelector("#SelectedCategoryIds_listbox li"));
	    String categoryName = categoryItem.getText();
	    categoryItem.click();
	    
	    List<WebElement> categoryTagList = driver.findElements(By.cssSelector("#SelectedCategoryIds_taglist li"));
	    String categoryTag = driver.findElement(By.cssSelector("#SelectedCategoryIds_taglist li span:first-child")).getText();
	    boolean categoryTagListNotEmpty =categoryTagList.size() > 0;
	    Assert.assertTrue(categoryTagListNotEmpty);
	    Assert.assertEquals(categoryTag,categoryName);
		
//		driver.quit();
	}

}
