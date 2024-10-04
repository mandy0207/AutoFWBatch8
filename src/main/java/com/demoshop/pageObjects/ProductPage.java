package com.demoshop.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoshop.utils.PageActions;

public class ProductPage extends PageActions {

	private WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".product-title a")
	private List<WebElement> productList;
	
	@FindBy(css="[value='Add to cart']")
	private WebElement addToCartBtn;
	
	@FindBy(css=".header-links .ico-cart ")
	private WebElement shoppingCartHeader;
	

	
	public List<String> getSearchedProductList() {
		return getElementTextList(productList);
	}
	
	public ProductPage clickAddToCartButton() {
		clickElement(addToCartBtn);
		return this;
	}
	
	public void navigateToCart() {
		clickElement(shoppingCartHeader);
	}
	
}
