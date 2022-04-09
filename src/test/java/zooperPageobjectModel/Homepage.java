package zooperPageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="header-location")
	WebElement searchArea;

	@FindBy(xpath="//button[text()='Search']")
	WebElement searchBtn;
     
	@FindBy(xpath="//div[@data-testid='listing-price']")
	WebElement priceList;


public void getSearchField(String location)
{
	searchArea.sendKeys(location);
}
public void clickSearchBtn()
{
	searchBtn.click();
}

public void getPriceList()
{
	System.out.println(priceList.getText());
}


}