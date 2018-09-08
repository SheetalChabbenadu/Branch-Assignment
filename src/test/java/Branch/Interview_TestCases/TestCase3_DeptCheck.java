
	
	package Branch.Interview_TestCases;

	import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthSpinnerUI;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import Branch.Interview_PageObjects.*;
	import Branch.Interview_basic.BaseClassBranch;

	public class TestCase3_DeptCheck extends BaseClassBranch{
		
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
			
			HashMap<String,String> allemps = new HashMap();
			//System.out.println(data_team.newmap_data);
			allemps.putAll(data_team.newmap_data);
			allemps.putAll(engi_team.newmap_Engineering);
			allemps.putAll(market_team.newmap_Marketing);
			allemps.putAll(operation_team.newmap_Operations);
			allemps.putAll(partner_team.newmap_Partner_Growth);
			allemps.putAll(product_team.newmap_Product);
			allemps.putAll(recruit_team.newmap_Recruiting);
			//System.out.println(allemps.size());
			int count = 0;
			for(String key:allemps.keySet())
			{
				if(all_emp.newmap_All_Employees.containsKey(key))
				{
					count++;
					if((allemps.get(key)).equals(all_emp.newmap_All_Employees.get(key)))
							{
								Assert.assertTrue(true);
							}
					else
					{
						Assert.fail();
					}
					
				}
			}
			//System.out.println(count);
			
			driver.close();

	}


}
