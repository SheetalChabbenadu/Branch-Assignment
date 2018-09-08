package Branch.Interview_TestCases;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.testng.Assert;
import org.testng.annotations.Test;

import Branch.Interview_PageObjects.*;
import Branch.Interview_basic.BaseClassBranch;

public class TestCase2_NameChecks extends BaseClassBranch{
	
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
		
		
		//collating names from all depts
		ArrayList<String> alldeptsnames = new  ArrayList<String>() ;
		
		alldeptsnames.addAll(data_team.empNames_data);
		alldeptsnames.addAll(engi_team.empNames_Engineering);
		alldeptsnames.addAll(market_team.empNames_Marketing);
		alldeptsnames.addAll(operation_team.empNames_Operations);
		alldeptsnames.addAll(partner_team.empNames_Partner_Growth);
		alldeptsnames.addAll(product_team.empNames_Product);
		alldeptsnames.addAll(recruit_team.empNames_Recruiting);
		

		for(String alldeps: alldeptsnames)
		{
			if(all_emp.empNames_All_Employees.contains(alldeps))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}
		}
		driver.close();
	}

}
