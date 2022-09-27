package hybridfw_datadriven_keyworddriven_methoddriven;

public class New extends BaseTest{

	public static void main(String[] args) throws Throwable {
	
	{
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		LoginPage lp=new LoginPage();
		FileLib fl=new FileLib();
		String u = fl.readPropertyData("D:\\Selenium\\Automation\\data\\config.properties", "username");
        String p = fl.readPropertyData("D:\\Selenium\\Automation\\data\\config.properties", "password");
		lp.typeUn(u);
		lp.typePw(p);
		lp.clickLoginBtn();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.waitForPageTitle("LinkedIn Login, Sign in | LinkedIn");
        wlib.verify("LinkedIn Login, Sign in | LinkedIn", wlib.getPageTitle(), "Login Page");
	

	}

	}
}