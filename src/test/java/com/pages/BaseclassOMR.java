package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassOMR {

	public static WebDriver driver;

	public static void getDriver(String browserType) {
		switch (browserType) {

		case "chromeDriver":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}
	}

	public static String getPropertyFileValue(String key) throws IOException {
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		Object name = properties.get(key);
		String value = (String) name;
		return value;
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void staticWait(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public static void maximize() {
		driver.manage().window().maximize();

	}

	public static void type(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void Click(WebElement element) {
		element.click();

	}

	public void threadwait() throws InterruptedException {
		Thread.sleep(4000);

	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static WebElement findELementById(String Attributevalue) {
		WebElement element = driver.findElement(By.id(Attributevalue));
		return element;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void implicit() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public String getAttribute(WebElement element, String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return attribute;

	}

	public static void SelectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void SelectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public static void SelectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void typeJS(String data, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].SetAttribute('value','" + data + "')", element);
	}

	// To get Data
	public static String getData(String sheetname, int rowNo, int cellNo) throws IOException {
		String res = null;

		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Framework\\Excel\\Hotel booking.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet(sheetname);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		CellType cellType = cell.getCellType();

		switch (cellType) {

		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				res = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long d = (long) numericCellValue;
				BigDecimal valueOf = BigDecimal.valueOf(d);
				res = valueOf.toString();
			}
			break;
		default:
			break;
		}
		return res;
	}

	// To update Value in cell
	public void updateData(String SheetName, int rowNo, int cellNo, String oldData, String Newdata) throws IOException {
		File file = new File("Excel Sheet\\Test Excel Sheet.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(Newdata);
		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

	// To insert value in cell

	public static void writeData(String SheetName, int rowNo, int cellNo, String Data) throws IOException {
		File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Framework\\Excel\\Hotel booking.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNo);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(Data);
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

	public static void txtClear(WebElement element) {
		element.clear();

	}

	public static WebElement findELementByName(String Attributevalue) {
		WebElement element = driver.findElement(By.name(Attributevalue));
		return element;
	}

	public static WebElement findElementByXpath(String xpathExpression) {
		WebElement element = driver.findElement(By.xpath(xpathExpression));
		return element;
	}

	public void closeCurrentWindow() {
		driver.close();

	}

}
