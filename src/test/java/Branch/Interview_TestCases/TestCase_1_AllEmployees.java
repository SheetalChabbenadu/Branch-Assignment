package Branch.Interview_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Branch.Interview_PageObjects.*;
import Branch.Interview_basic.BaseClassBranch;

public class TestCase_1_AllEmployees extends BaseClassBranch{
	
	@Test
	public void AllEmployees(){
		
		All_Employees all_emp = new All_Employees(driver);
		Data data_team = new Data(driver);
		Engineering engi_team = new Engineering(driver);
		Marketing market_team = new Marketing(driver);
		Operations operation_team = new Operations(driver);
		Partner_Growth partner_team = new Partner_Growth(driver);
		Product product_team = new Product(driver);
		Recruiting recruit_team = new Recruiting(driver);
		
		all_emp.All_Employees_Team_Select();
		data_team.Data_Team_Select();
		engi_team.Engineering_Team_Select();
		market_team.Marketing_Team_Select();
		operation_team.Operations_Team_Select();
		partner_team.Partner_Growth_Team_Select();
		product_team.Product_Team_Select();
		recruit_team.Recruiting_Team_Select();
		
		
		
		int count_All = data_team.count_data + engi_team.count_Engineering + market_team.count_Marketing +operation_team.count_Operations + partner_team.count_Partner_Growth + product_team.count_Product + recruit_team.count_Recruiting;
		
		if(count_All==all_emp.count_All_Employees)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
		driver.close();
	}

}
