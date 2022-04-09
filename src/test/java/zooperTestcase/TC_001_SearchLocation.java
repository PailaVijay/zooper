package zooperTestcase;

import org.testng.annotations.Test;

import zooperPageobjectModel.Homepage;

public class TC_001_SearchLocation extends BaseClass {

	
@Test

public void location()
{
	Homepage hp= new Homepage(driver);
	hp.getSearchField("London");
	hp.clickSearchBtn();
	hp.getPriceList();
}
}
