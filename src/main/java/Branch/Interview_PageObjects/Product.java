package Branch.Interview_PageObjects;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Product {
		
		@FindBy(xpath="//a[text()='Product']")
		private WebElement teamProduct;
		
		
		@FindBy(xpath="//div[@class='info-block']/h2")
		private List<WebElement> empNameList_Product;
		
		@FindBy(xpath="//div[@class='info-block']/h4")
		private List<WebElement> empDeptList_Product;
		
		public int count_Product=0;
		public Map<String, String> map_Product = new HashMap<String, String>();
		public ArrayList<String> empNames_Product = new  ArrayList<String>() ;
		public ArrayList<String> empDepts_Product = new ArrayList<String>();
		public HashMap<String,String> newmap_Product = new HashMap();
		
		public Product(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void Product_Team_Select(){
		
		teamProduct.click();
		//System.out.println("Product Team");

				
		
		for(WebElement Product_team_name: empNameList_Product)
		{
					int count=0;
					String data_name=Product_team_name.getText();
					if(data_name.length()!=0)
					{	
					empNames_Product.add(data_name);
					
					count++;
					}
		
		}
		
		
		for(WebElement Product_team_dept: empDeptList_Product)
		{
		
				String Product_dept=Product_team_dept.getText();
				if(Product_dept.length()!=0)
				{
				empDepts_Product.add(Product_dept);
			
				
				}
			
		}
		
		//System.out.println("moving to hash");
		
		for(int c=0;c<empNames_Product.size();c++)
		{
		
		newmap_Product.put(empNames_Product.get(c), empDepts_Product.get(c));
		
		}
		
		
		for(String name_Product:newmap_Product.keySet())
		{
		count_Product++;
		}
		//System.out.println("Product Team Count" +count_Product);
		}
	}





