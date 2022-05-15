package upskill.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot {
	
	public void screenShot() throws Exception {
		//Screenshot: 
				File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
				//FileUtils.copyFile(screenshot, new File("C:\\UpSkillSoftware\\Screenshots\\ebay.jpg"));
				//FileUtils.copyFile(screenshot, new File("C:\\Users\\19293\\workspace\\SaturdaySkywalkerProject\\screenshot\\ebay.jpg"));
				FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"\\screenshot\\ebay.jpg"));
				System.out.println(" >>>>>>>>>>>>>>>>> Screenshot Taken");
		}

}
