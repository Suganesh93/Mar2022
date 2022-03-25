package org.BaseMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassMethod 
{
	public static WebDriver driver;
	Actions ac;	
	JavascriptExecutor jscript;
	/*1) browser launch
	===================*/
	public  void browserLaunch(String browserName) 
	{
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\ZzzzzpackageDdemo\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "      ");
			driver= new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "       ");
			driver = new EdgeDriver();
		}
		else {
			System.out.println("invalid browser launch");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	/*2) urlLaunch
	==============*/
	public  void launchUrl(String urlLink)
	{
		driver.get(urlLink);
	}

	/*3) getCurrentURl
	==================*/
	public String geturl() 
	{
		String currentUrl = null;
		try {
			currentUrl = driver.getCurrentUrl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentUrl;
	}

	/*4) getTitle of the page
	=========================*/
	public String getTitle() 
	{
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return title;
	}

	/*5) find Locators
	==================*/
	public WebElement findLocators(String attrName,String attValue) 
	{
		WebElement findElement = null;
		if (attrName.equalsIgnoreCase("ID")) 
		{
			findElement = driver.findElement(By.id(attValue));
		}
		else if (attrName.equalsIgnoreCase("name")) 
		{
			findElement = driver.findElement(By.name(attValue));
		}
		else if (attrName.equalsIgnoreCase("XPATH"))
		{
			findElement = driver.findElement(By.xpath(attValue));
		}
		return findElement;
	}

	/*6) Sendkeys
	=============*/
	public  void sendKeys(WebElement refName,String data) 
	{
		refName.sendKeys(data);
	}

	/*7) button Click
	=================*/
	public void btnClick(WebElement refName)
	{
		refName.click();
	}

	/*8) getText
	============*/
	public String getText(WebElement refName)
	{
		String text = null;
		text = refName.getText();
		return text;
	}

	/*9) selectMethodDropDown
	=========================*/

	public void dropDownSelect(WebElement refName,String selectBYtypes,String data)
	{		
		Select sc = new Select(refName);
		if (selectBYtypes.equalsIgnoreCase("index")) 
		{
			sc.selectByIndex(Integer.parseInt(data));
		}
		else if (selectBYtypes.equalsIgnoreCase("value"))
		{
			sc.selectByValue(data);
		}
		else if (selectBYtypes.equalsIgnoreCase("visibletext"))
		{
			sc.selectByVisibleText(data);
		}	
	}

	/*10) getAttribute	
	=================*/
	public String getAttribute(WebElement refName,String value)
	{
		String text = null;
		text =refName.getAttribute(value);
		return text;
	}

	/*11) mouseover moveToElement
	=============================*/
	public void moveToelmnt(WebElement refName)
	{ 
		ac= new Actions(driver);
		ac.moveToElement(refName).perform();
	}

	/*12) drag And Drop
	===================*/
	public void dragandDrp(WebElement srcrefName, WebElement  targerRefNAme)
	{
		ac = new Actions(driver);
		ac.dragAndDrop(srcrefName, targerRefNAme).perform();
	}

	/*13) rightClick
	================*/
	public void rightClk(WebElement refName) 
	{
		ac = new Actions(driver);
		ac.contextClick(refName).perform();
	}

	/*14) doubleClick
	=================*/	
	public void doubleclick(WebElement refName) 
	{ 
		ac= new Actions(driver);
		ac.doubleClick(refName).perform();
	}

	/*15) alertHandling
	===================*/
	Alert a ;
	public void alertHandling(String data,String sndData) 
	{
		a = driver.switchTo().alert();
		if (data.equalsIgnoreCase("accept")) 
		{
			a.accept();
		}
		else if (data.equalsIgnoreCase("dismiss"))
		{
			a.dismiss();
		}
		else if (data.equalsIgnoreCase("promptAccept")) 
		{
			a.sendKeys(sndData);
			a.accept();			
		}
		else if (data.equalsIgnoreCase("promptDismiss")) 
		{
			a.sendKeys(sndData);
			a.dismiss();			
		}		
	}

	/*16) getxcelsheet
	==================*/
	public String getExceeel(String xcelPath,String sheetName,String data,int rowNO,int cellNo,String newtextOrRefName) throws IOException 
	{    String value = null;
	File file = new File(xcelPath);		
	FileInputStream fileInput = new FileInputStream(file);
	Workbook book = new XSSFWorkbook(fileInput);
	if (data.equalsIgnoreCase("getting value")) 
	{
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNO);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		if (cellType==1)
		{
			value = cell.getStringCellValue();
		} 
		else if (DateUtil.isCellDateFormatted(cell)) 
		{
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			value = dateFormat.format(dateCellValue);				
		}
		else 
		{
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		}
	}

	else if (data.equalsIgnoreCase("inserting value")) 
	{	String sheetName2 = null;
	//if (!newtextOrRefName.equalsIgnoreCase("nil")) {


	for (int i = 0; i < book.getNumberOfSheets(); i++) 
	{
		sheetName2 = book.getSheetName(i);
		if (sheetName2.equals(sheetName)) {
			break;
		}
	} 
	if (sheetName2.equals(sheetName)) {
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNO);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(newtextOrRefName);			
	} 
	else
	{
		Sheet sheet1 = book.createSheet(sheetName);
		Row row1 = sheet1.createRow(rowNO);
		Cell cell1 = row1.createCell(cellNo);
		cell1.setCellValue(newtextOrRefName);			
	}
	}
	//}
	FileOutputStream outputStream = new FileOutputStream(file);
	book.write(outputStream);
	return value;	
	}

	/*17) javaScript
	================ */

	public void javascrpt(String sendkeys,WebElement refName)
	{
		jscript = (JavascriptExecutor)driver; 
		jscript.executeScript("arguments[0].setAttribute('value','"+sendkeys+"')", refName);			
	}

	/*18) javascript getatt
	=======================*/
	public String jscriptGetatt(WebElement refName) 
	{
		String text;
		jscript =(JavascriptExecutor)driver;
		Object executeScript = jscript.executeScript("return arguments[0].getAttribute('value')", refName);
		text = (String) executeScript;
		//		System.out.println(text);
		return text;
	}

	/*19) javascript click
	======================*/
	public void jscriptClick(WebElement refName)
	{
		jscript =(JavascriptExecutor)driver;
		jscript.executeScript("arguments[0].click()", refName);
	}

	/*20) scroll up
	===============*/
	public void jscriptScrollupORdown(String data,WebElement refName)
	{
		jscript = (JavascriptExecutor)driver;
		if (data.equalsIgnoreCase("scrollup")) 
		{
			jscript.executeScript("arguments[0].scrollIntoView(false)", refName);
		} 
		else if (data.equalsIgnoreCase("scrolldown"))
		{
			jscript.executeScript("arguments[0].scrollIntoView(true)", refName);
		}
	}

	/*21) screenshot
    ================*/
   public void screenshot(String name) throws IOException 
   {
	   TakesScreenshot shot = (TakesScreenshot)driver;
	   File source = shot.getScreenshotAs(OutputType.FILE);
	   File desti = new File("C:\\Users\\sugan.v\\eclipse-workspace\\MavenProject\\ScreenShots\\"+name+".png");
	   FileUtils.copyFile(source, desti);
 }







	/*  )browser close
	==================*/
	public void browserClose() {
		driver.close();

	}
}
