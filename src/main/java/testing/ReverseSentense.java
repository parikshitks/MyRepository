package testing;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReverseSentense {

	static WebDriver driver;

	public static void main(String[] args) {

		String or = "Here is Parikshit";


		//reverseUsingForLoop(or);

		try {

			String url = "https://www.easemytrip.com/";
			initializeWebDriver(url);

			String julMonthFare = "//div[contains(text(),'Jul 2022')]/ancestor::div[contains(@class,'box')]//div[@class='days']//ul/li/span";
			String julMonthDate = "//div[contains(text(),'Jul 2022')]/ancestor::div[contains(@class,'box')]//div[@class='days']//ul/li";
			//this xpath will be used for selecting the date with the lowest fare			
			String selectDate = "//div[contains(text(),'Jul 2022')]/ancestor::div[contains(@class,'box')]//div[@class='days']//ul/li[contains(text(),'xxxxxx')]";

			WebElement ele = driver.findElement(By.xpath("//*[@class='s_col_2 mgr10 ccp']"));

			//click on the date picker
			ele.click();

			//Get the webelement list for fare and dates
			List<WebElement> fareList = driver.findElements(By.xpath(julMonthFare));
			List<WebElement> dateList = driver.findElements(By.xpath(julMonthDate));

			//stream through the fareList and get the text for the fares
			List<String> fareListRate = getTextsFromWebElementList(fareList);

			//stream through the dateList and get the text for the dates and fares
			List<String> dateLists = getTextsFromWebElementList(dateList);

			String lowestFare = Collections.min(fareListRate);
			System.out.println("LowestFareis: " + lowestFare);

			//Get the index for which the fare is lowest
			int lastIndex = fareListRate.lastIndexOf(lowestFare);

			//The first 2 digits are the dates
			String lastDateWithLowestFare = dateLists.get(lastIndex).substring(0,2);
			System.out.println("Last Date with lowest fare: " + lastDateWithLowestFare);

			//Click on the date on which the fare is the lowest
			driver.findElement(By.xpath(selectDate.replaceAll("xxxxxx", lastDateWithLowestFare))).click();

		}
		catch(Exception e) {
			System.out.println("some exception occurred: " + e);
		}
		finally {
			driver.quit();
		}
	}
	

/**
 * This method will return the texts in a list the list of webelement.
 * @param list
 * @return
 */
	public static List<String> getTextsFromWebElementList(List<WebElement> list){

		return list
				.stream()
				.map(e -> e.getText()
						.trim())
				.filter(e -> !e.equals(""))
				.collect(Collectors.toList());
	}



	public static void reverseUsingForLoop(String or) {

		String[] br = or.split(" ");
		StringBuffer bffr = new StringBuffer();


		for(int i=0;i<br.length;i++) {

			bffr.append(br[br.length-i-1]);
			bffr.append(" ");

		}

		System.out.println(bffr.toString());

	}


	public static void initializeWebDriver(String url){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shrey\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}


}