import org.testng.annotations.*;




public class MobileTest {
	
	
	@Parameters({"URL","ID"})
	@Test
	public void mob(String url,String id ) {
		System.out.println(url);
		System.out.println(id);
	}
	
	
	
	@BeforeSuite()
	public void mobil() {
		System.out.println("I willl execute first ");
	}
	
	

	@BeforeMethod()
	public void beforeMethod() {
		System.out.println("I willl execute first ");
	}
	

	@AfterMethod()
	public void afterMethod() {
		System.out.println("I willl execute first ");
	}
	
	
	
	
	
	@Test
	public void API() {
		System.out.println("API Method");
	}
	
	@Test(dataProvider="getData")
	public void animals(String username,String Passwd) {
		System.out.println(username);
		System.out.println(Passwd);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		
		data[0][0]="firstname";
		data[0][1]="password";
		data[1][0]="secondsetusername";
		data[1][1]="secpassword";
		data[2][0]="Thirdusername";
		data[2][1]="thirdpassword";
		
		return data;
		
		
		
	}
	
	
	
}
