# Automation test using Selenium
[![Selenium - 4.1.1](https://img.shields.io/badge/Selenium-4.1.1-2ea44f)](https://) [![Coverage - 
85%](https://img.shields.io/badge/Coverage-85%-2D4263)](https://) <a href="https://selenium.dev"><img 
src="https://selenium.dev/images/selenium_logo_square_green.png" width="180" alt="Selenium"/></a> **Website:** 
[NopCommerce](https://admin-demo.nopcommerce.com/)
### Quick start
```Java git clone https://github.com/wesamhamed/nopcommerceSelenium ```
### Requirenments
1. Java (JDK) 2. Eclipse. 3. Selenium Client and WebDriver Language bindings. 4. Configuring Selenium Webdriver with Eclipse.
### Description
This test will test two scenario, add a new product and check if the product has been added to the list, and then add new discount then 
add the added product to the new discount
### Tests covered
1. Check login url 2. Check url after login 3. Check username after login 4. Check aside 1. Catalog 1. Catalog has class opened when 
      expand it 2. Click on product section 3. Check product list url 4. Click on add new button 5. Check the focus style for the 
      button 6. Check the add new product url 7. Verify form fields (fill, assert) 8. Save product 9. Search for added product 10. 
      verify if table has the added product
    1.  Promotion 1. Click on discount 2. Click on add new button 3. Check the focus style for the button 4. Check the url after 
          navigating 5. Verify discount form (fill, assert) 6. Return to discount list after add 7. Check the url 8. Search for added 
          discount 9. Edit the added discount 10. Scroll to add new product to discount 11. Handle the new window 12. Search for the 
          product added 13. Select the product from the table 14. Verify if product added to the discount table product list 15. Click 
          on save 16. Return and check the alert message
5. Close the driver
