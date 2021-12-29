import java.time.Duration;
import java.time.Instant;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Nopcommerce {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));


		WebElement loginBtn = driver.findElement(By.cssSelector(".buttons button"));
		loginBtn.click();

		Assert.assertTrue(driver.getCurrentUrl().contains("/admin"));
//
//		WebElement catalogNavP = driver.findElement(By.xpath("//ul/li/a/p[contains(text(),'Catalog')]"));
//		catalogNavP.click();
//
//		WebElement catalogNavLink = driver.findElement(By.xpath("//ul/li/a/p[contains(text(),'Catalog')]/parent::a"));
////		System.out.println(catalogNavLink.getAttribute("class"));
////		wait.until(ExpectedConditions.attributeContains(catalogNavLink, "class", "active"));
////		Assert.assertTrue(catalogNavLink.getAttribute("class").contains("active"));
//		
//		WebElement catalogNavItem = driver
//				.findElement(By.xpath("//ul/li/a/p[contains(text(),'Catalog')]/parent::a/parent::li"));
//		wait.until(ExpectedConditions.attributeContains(catalogNavItem, "class", "menu-open"));
//		Assert.assertTrue(catalogNavItem.getAttribute("class").contains("menu-open"));
//
//		WebElement productNavP = driver.findElement(By.xpath("//ul/li/a/p[text()=' Products']"));
//
//		Actions builder = new Actions(driver);
//		builder.moveToElement(productNavP).click().build().perform();
//
//		Assert.assertTrue(driver.getCurrentUrl().contains("Admin/Product/List"));
//		WebElement productsItemsInTableEl = driver.findElement(By.id("products-grid_info"));
//		wait.until(ExpectedConditions.textToBePresentInElement(productsItemsInTableEl, "of"));
//		
//		int productsItemsInTable = Integer.parseInt(productsItemsInTableEl.getText().split(" ")[2]);
//
//		String pageHeadingTxt = driver.findElement(By.cssSelector("form[action='/Admin/Product/List'] h1")).getText();
//		Assert.assertTrue(pageHeadingTxt.contains("Products"));
//
//		WebElement addNewBtn = driver
//				.findElement(By.cssSelector("form[action='/Admin/Product/List'] a[href='/Admin/Product/Create']"));
//		addNewBtn.click();
//
//		Assert.assertTrue(driver.getCurrentUrl().contains("/Admin/Product/Create"));
//		pageHeadingTxt = driver.findElement(By.cssSelector("form#product-form h1")).getText();
//		Assert.assertTrue(pageHeadingTxt.contains("Add a new product"));
//
//		WebElement settingModeCheckbox = driver.findElement(By.id("advanced-settings-mode"));
//		if (settingModeCheckbox.isSelected()) {
//			settingModeCheckbox.click();
//		}
//		WebElement cardBodyEl = driver.findElement(By.cssSelector("#product-cards #product-info .card-body"));
//		WebElement productInfoSection = driver.findElement(By.id("product-info"));
//		if (cardBodyEl.getCssValue("display").equals("none")) {
//			productInfoSection.click();
//		}
//
//		WebElement productNameTxtField = driver.findElement(By.id("Name"));
//		Instant currentTime = Instant.now();
//		String currentTimeValue = String.valueOf(currentTime);
//		String productName = "product_" + currentTimeValue;
//		productNameTxtField.sendKeys(productName);
//		String productNameValue = productNameTxtField.getAttribute("value");
//		Assert.assertEquals(productNameValue, productName);
//
//		WebElement shortDescriptionTxtArea = driver.findElement(By.id("ShortDescription"));
//		currentTime = Instant.now();
//		currentTimeValue = String.valueOf(currentTime);
//		String shortDescription = "short description_" + currentTimeValue;
//		shortDescriptionTxtArea.sendKeys(shortDescription);
//		String shortDescriptionValue = shortDescriptionTxtArea.getAttribute("value");
//		Assert.assertEquals(shortDescriptionValue, shortDescription);
//
////		WebElement fullDescriptionIframe = driver.findElement(By.id("FullDescription_ifr"));
//		wait.until(ExpectedConditions.visibilityOfElementLocated( (By.id("FullDescription_ifr"))));
//		driver.switchTo().frame( driver.findElement(By.id("FullDescription_ifr")));
//		WebElement fullDescriptionTextField = driver.findElement(By.cssSelector("#tinymce p"));
//		currentTime = Instant.now();
//		currentTimeValue = String.valueOf(currentTime);
//		String fullDescription = "full description_" + currentTimeValue;
//		fullDescriptionTextField.sendKeys(fullDescription);
//		String fullDescriptionTxt = fullDescriptionTextField.getText();
//		Assert.assertEquals(fullDescriptionTxt, fullDescription);
//		driver.switchTo().defaultContent();
//
//		WebElement productSKUTxtField = driver.findElement(By.id("Sku"));
//		currentTime = Instant.now();
//		currentTimeValue = String.valueOf(currentTime);
//		String productSKU = "product sku_" + currentTimeValue;
//		productSKUTxtField.sendKeys(productSKU);
//		String productSKUTValue = productSKUTxtField.getAttribute("value");
//		Assert.assertEquals(productSKUTValue, productSKU);
//
//		WebElement categoriesList = driver.findElement(By.id("SelectedCategoryIds_taglist"));
//		builder.moveToElement(categoriesList).click().build().perform();
//		WebElement categoryItem = driver.findElement(By.cssSelector("#SelectedCategoryIds_listbox li:first-child"));
//		String categoryName = categoryItem.getText();
//		categoryItem.click();
//		driver.findElement(By.tagName("body")).click();
//
//		List<WebElement> categoryTagListItems = driver.findElements(By.cssSelector("#SelectedCategoryIds_taglist li"));
//		String categoryTag = driver.findElement(By.cssSelector("#SelectedCategoryIds_taglist li:first-child"))
//				.getText();
//		boolean categoryTagListNotEmpty = categoryTagListItems.size() > 0;
//		Assert.assertTrue(categoryTagListNotEmpty);
//	    Assert.assertTrue(categoryTag.contains(categoryName));
//	    
//	    cardBodyEl = driver.findElement(By.cssSelector("#product-cards #product-price .card-body"));
//		WebElement productPriceSection = driver.findElement(By.id("product-price"));
//		if (cardBodyEl.getCssValue("display").equals("none")) {
//			productPriceSection.click();
//		}
//
//		WebElement spinButtonForPrice = driver.findElement(By.xpath("//*[@id='Price']/preceding-sibling::input"));
//		spinButtonForPrice.click();
//		
//		String price = "40";
//		WebElement priceTxtField = driver.findElement(By.id("Price"));
//		priceTxtField.sendKeys(price);
//		String priceValue = priceTxtField.getAttribute("value");
//		Assert.assertTrue(priceValue.contains(price));
//
//		WebElement taxExemptCheckbox = driver.findElement(By.id("IsTaxExempt"));
//		taxExemptCheckbox.click();
//		Assert.assertTrue(taxExemptCheckbox.isSelected());
//		WebElement panelTaxCategory = driver.findElement(By.id("pnlTaxCategory"));
//		String panelTaxCategoryClasses = panelTaxCategory.getAttribute("class");
//		Assert.assertTrue(panelTaxCategoryClasses.contains("d-none"));
//		taxExemptCheckbox.click();
//		Assert.assertFalse(taxExemptCheckbox.isSelected());
//
//		WebElement taxCategoryEle = driver.findElement(By.id("TaxCategoryId"));
//		Select taxCategorySelect = new Select(taxCategoryEle);
//		taxCategorySelect.selectByVisibleText("Books");
//		Assert.assertEquals(taxCategorySelect.getFirstSelectedOption().getText(), "Books");
//		
//		cardBodyEl = driver.findElement(By.cssSelector("#product-cards #product-inventory .card-body"));
//		WebElement productInventorySection = driver.findElement(By.id("product-inventory"));
//		if (cardBodyEl.getCssValue("display").equals("none")) {
//				productInventorySection.click();
//		}
//		
//		WebElement inventoryMethodEl = driver.findElement(By.id("ManageInventoryMethodId"));
//		Select inventoryMethodSelect = new Select(inventoryMethodEl);
//		inventoryMethodSelect.selectByValue("1");
//		Assert.assertEquals(inventoryMethodSelect.getFirstSelectedOption().getText(), "Track inventory");
//
//		WebElement spinButtonForStockQuantity = driver
//				.findElement(By.xpath("//*[@id='StockQuantity']/preceding-sibling::input"));
//		spinButtonForStockQuantity.click();
//		WebElement stockQuantityTxtField = driver.findElement(By.id("StockQuantity"));
//		stockQuantityTxtField.clear();
//		String stockQuantity = "1000";
//		builder.moveToElement(spinButtonForStockQuantity).click().build().perform();
//		stockQuantityTxtField.sendKeys(stockQuantity);
//		String stockQuantityValue = stockQuantityTxtField.getAttribute("value");
//		Assert.assertEquals(stockQuantityValue, stockQuantity);
//
//		WebElement saveBtn = driver.findElement(By.cssSelector("#product-form button[name='save']"));
//		saveBtn.click();
//
//		new WebDriverWait(driver, Duration.ofSeconds(3))
//				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.alert")));
//		WebElement closeAlertEl = driver.findElement(By.cssSelector("div.alert button"));
//		closeAlertEl.click();
//		Assert.assertTrue(driver.getCurrentUrl().contains("/Admin/Product/List"));
//
//		productsItemsInTableEl = driver.findElement(By.id("products-grid_info"));
//		wait.until(ExpectedConditions.textToBePresentInElement(productsItemsInTableEl, "of"));
//		List<WebElement> paginationList = driver
//				.findElements(By.cssSelector("#products-grid_paginate ul.pagination li"));
//		paginationList.get(paginationList.size() - 2).click();
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajaxBusy")));
//		
//		 int productItemsAfterInsert = Integer.parseInt(productsItemsInTableEl.getText().split(" ")[2]) + 1;
////		 Assert.assertEquals(productItemsAfterInsert, productsItemsInTable);
//		 
//		 WebElement productNameAddedCell = driver.findElement(By.cssSelector("table#products-grid tbody tr:last-child td:nth-child(3)"));
//		 WebElement skuAddedCell = driver.findElement(By.cssSelector("table#products-grid tbody tr:last-child td:nth-child(4)"));
//		 WebElement priceAddedCell = driver.findElement(By.cssSelector("table#products-grid tbody tr:last-child td:nth-child(5)"));
//		 WebElement stockQuantityAddedCell = driver.findElement(By.cssSelector("table#products-grid tbody tr:last-child td:nth-child(6)"));
//
//		 Assert.assertEquals(productNameAddedCell.getText(),productName);
//		 Assert.assertEquals(skuAddedCell.getText(), productSKU);
//		 Assert.assertEquals(priceAddedCell.getText(), price);
//		 Assert.assertEquals(stockQuantityAddedCell.getText(), stockQuantity);
		 
		 WebElement promotionNavP = driver.findElement(By.xpath("//ul/li/a/p[contains(text(),'Promotions')]"));
		 promotionNavP.click();
		 
		WebElement promotionNavLink = driver.findElement(By.xpath("//ul/li/a/p[contains(text(),'Promotions')]/parent::a"));
//		System.out.println(promotionNavLink.getAttribute("class"));
//		wait.until(ExpectedConditions.attributeContains(promotionNavLink, "class", "active"));
//		Assert.assertTrue(promotionNavLink.getAttribute("class").contains("active"));
		
		WebElement promotionNavItem = driver
			.findElement(By.xpath("//ul/li/a/p[contains(text(),'Promotions')]/parent::a/parent::li"));
		wait.until(ExpectedConditions.attributeContains(promotionNavItem, "class", "menu-open"));
		Assert.assertTrue(promotionNavItem.getAttribute("class").contains("menu-open"));
		
		WebElement discountNavP = driver.findElement(By.xpath("//ul/li/a/p[text()=' Discounts']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(discountNavP).click().build().perform();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("/Admin/Discount/List"));

		WebElement discountItemsInTableEl = driver.findElement(By.id("discounts-grid_info"));
		wait.until(ExpectedConditions.textToBePresentInElement(discountItemsInTableEl, "of"));
		
		int discountItemsInTable = Integer.parseInt(discountItemsInTableEl.getText().split(" ")[2]);
		
		String pageHeadingTxt = driver.findElement(By.cssSelector(".content-header h1")).getText();
		Assert.assertTrue(pageHeadingTxt.contains("Discounts"));
		
		WebElement addNewDiscountBtn = driver
			.findElement(By.cssSelector(".content-header a[href='/Admin/Discount/Create']"));
		addNewDiscountBtn.click();
	
		Assert.assertTrue(driver.getCurrentUrl().contains("/Admin/Discount/Create"));
		pageHeadingTxt = driver.findElement(By.cssSelector("form#discount-form h1")).getText();
		Assert.assertTrue(pageHeadingTxt.contains("Add a new discount"));

		WebElement cardBodyEl = driver.findElement(By.cssSelector("#discount-cards .card-body"));
		WebElement discountSection = driver.findElement(By.id("discount-info"));
		if (cardBodyEl.getCssValue("display").equals("none")) {
			discountSection.click();
		}
		
		WebElement discountNameTxtField = driver.findElement(By.id("Name"));
		Instant currentTime = Instant.now();
		String currentTimeValue = String.valueOf(currentTime);
		String dicountName = "dicount_" + currentTimeValue;
		discountNameTxtField.sendKeys(dicountName);
		String discountNameValue = discountNameTxtField.getAttribute("value");
		Assert.assertEquals(discountNameValue, dicountName);
		
		WebElement discountTypeEl = driver.findElement(By.id("DiscountTypeId"));
		Select discountTypeSelect = new Select(discountTypeEl);
		discountTypeSelect.selectByValue("2");
		Assert.assertEquals(discountTypeSelect.getFirstSelectedOption().getText(), "Assigned to products");

		WebElement spinButtonForDiscountAmount = driver.findElement(By.xpath("//*[@id='DiscountAmount']/preceding-sibling::input"));
		spinButtonForDiscountAmount.click();
		String dicount = "40";
		WebElement discountAmountTxtField = driver.findElement(By.id("DiscountAmount"));
		discountAmountTxtField.sendKeys(dicount);
		String discountValue = discountAmountTxtField.getAttribute("value");
		Assert.assertTrue(discountValue.contains(dicount));
		
		WebElement startDateInput = driver.findElement(By.id("StartDateUtc"));
		String startDate ="12/31/2021 12:00 AM";
		startDateInput.sendKeys(startDate);
		String startDateValue = startDateInput.getAttribute("value");
		Assert.assertEquals(startDateValue,startDate);
		
		WebElement endDateInput = driver.findElement(By.id("EndDateUtc"));
		String endDate ="2/28/2022 12:00 AM";
		endDateInput.sendKeys(endDate);
		String endDateValue = endDateInput.getAttribute("value");
		Assert.assertEquals(endDateValue,endDate);
      
		
		WebElement saveDiscountBtn = driver.findElement(By.cssSelector("[name='save']"));
		saveDiscountBtn.click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("/Admin/Discount/List"));
		pageHeadingTxt = driver.findElement(By.cssSelector(".content-header h1")).getText();
		Assert.assertTrue(pageHeadingTxt.contains("Discounts"));
		new WebDriverWait(driver, Duration.ofSeconds(3))
		.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.alert")));
		WebElement closeAlertEl = driver.findElement(By.cssSelector("div.alert button"));
		closeAlertEl.click();
		
		
		 
//		driver.quit();
	}

}
