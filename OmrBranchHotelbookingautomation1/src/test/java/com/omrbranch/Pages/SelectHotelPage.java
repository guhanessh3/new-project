package com.omrbranch.Pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	public static String hotelName;
	public static String hotelprice;
	
	@FindBy(xpath ="//h5[text()='Select Hotel']")
	private WebElement printselecthotel;
	@FindBy(xpath = "//h5[text()='Hilton Studio']")
	private WebElement printhotelname;
	@FindBy(xpath ="(//strong[@class='total-prize'])[1]")
	private WebElement printhotelcost;
	@FindBy(xpath = "(//a[@class='btn filter_btn'])")
	private  List<WebElement> btncontinue;
	@FindBy(xpath = "//h2[text()='Sort By']")
	private WebElement scrollintoview;
	@FindBy(xpath = "//label[text()='Price low to high']")
	private WebElement btnlowtohigh;
	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> elementslist;
	@FindBy(xpath = "//label[@for='value_phtol']")
	private WebElement btnhightolow;
	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> elementslisthightolow;
	@FindBy(xpath = "//label[@for='value_nasc']")
	private WebElement assendingorder;
	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']/h5")
	private List<WebElement> elementsassendimgorder;
	@FindBy(xpath = "//label[@for='value_ndesc']")
	private WebElement descendingorder;
	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']/h5")
	private List<WebElement> hotelNamesList;
	@FindBy(id = "room_type")
	private WebElement standard;
	@FindBy(xpath = "(//a[@class='btn filter_btn'])[1]")
	private WebElement btnContinueSingle;
	

	public WebElement getPrintselecthotel() {
		return printselecthotel;
		
	}
	public WebElement getPrinthotelname() {
		return printhotelname;
	}
	public WebElement getPrinthotelcost() {
		return printhotelcost;
	}
	public List<WebElement> getBtncontinue() {
		return btncontinue;
	}
	public WebElement getScrollintoview() {
		return scrollintoview;
	}
	public WebElement getBtnlowtohigh() {
		return btnlowtohigh;
	}
	public List<WebElement> getElementslist() {
		return elementslist;
	}
	public WebElement getBtnhightolow() {
		return btnhightolow;
	}
	public List<WebElement> getElementslisthightolow() {
		return elementslisthightolow;
	}
	public WebElement getAssendingorder() {
		return assendingorder;
	}
	public List<WebElement> getElementsassendimgorder() {
		return elementsassendimgorder;
	}
	public WebElement getDescendingorder() {
		return descendingorder;
	}
	public List<WebElement> getHotelNamesList() {
		return hotelNamesList;
	}
	public WebElement getStandard() {
		return standard;
	}
	public void clickHotelPriceLowToHigh() throws InterruptedException {
		pagescrolldown(scrollintoview);
		elementClick(btnlowtohigh);
		Thread.sleep(3000);
	}
	public boolean verifyHotelPricesLowToHigh() {
		List<Integer> dev = new ArrayList<Integer>();
    for (int i=0; i < elementslist.size(); i++) {
    	WebElement hotelPrice = elementslist.get(i);
    	String text = elementGetText(hotelPrice);
    	String without$ = text.replace("$", "");
    	String withoutComma = without$.replace(",", "");
    	String finalprice = withoutComma.replace(" ", "");
    	int price = Integer.parseInt(finalprice);
    	dev.add(price);
    }
    List<Integer> qa = new ArrayList<Integer>();
    qa.addAll(dev);
    Collections.sort(qa);
    boolean equals = qa.equals(dev);
    return equals;
		
	}
	public void clickhotelpricesHighTolow() throws InterruptedException {
		pagescrolldown(scrollintoview);
		elementClick(btnhightolow);
		Thread.sleep(3000);
	}
	public boolean verifypricesHighTOLow() {
		List<Integer> dev = new ArrayList<Integer>();
		for(int i = 0; i < elementslisthightolow.size();i++) {
		WebElement hotelprice = elementslisthightolow.get(i);
		String text = elementGetText(hotelprice);
    	String without$ = text.replace("$", "");
    	String withoutComma = without$.replace(",", "");
    	String finalprice = withoutComma.replace(" ", "");
    	int price = Integer.parseInt(finalprice);
    	dev.add(price);
    }
    List<Integer> qa = new ArrayList<Integer>();
    qa.addAll(dev);
    Collections.sort(qa);
    Collections.reverse(qa);
    boolean equals = qa.equals(dev);
    return equals;
		}
	public void verifyHotelNamesacc() throws InterruptedException {
		pagescrolldown(scrollintoview);
		elementClick(assendingorder);
		Thread.sleep(3000);
	}
	public boolean VerifyHotelNameAsc() {
		List<String> dev = new ArrayList<String>();
		for(int i = 0; i < elementsassendimgorder.size();i++) {
		WebElement hotelprice = elementsassendimgorder.get(i);
		String text = elementGetText(hotelprice);
		dev.add(text);
    }
		 List<String> qa = new ArrayList<String>();
		    qa.addAll(dev);
		    Collections.sort(qa);
		    boolean equals = qa.equals(dev);
		    return equals;
	}
	public void verifyHotelNamesdes() throws InterruptedException {
		pagescrolldown(scrollintoview);
		elementClick(descendingorder);
		Thread.sleep(3000);
	}
	public boolean VerifyHotelNamedes() {
		List<String> dev = new ArrayList<String>();
		for(int i = 0; i < elementsassendimgorder.size();i++) {
		WebElement hotelprice = elementsassendimgorder.get(i);
		String text = elementGetText(hotelprice);
		dev.add(text);
    }
		 List<String> qa = new ArrayList<String>();
		    qa.addAll(dev);
		    Collections.sort(qa);
		    boolean equals = qa.equals(dev);
		    return equals;
}
	public String getSelectHotelTxt() {
		
		return elementGetText(printselecthotel);
	}
	public String getRoomTypeInHeader() {
    return elementGetText(standard);
	}
public boolean getHotelNamesEndsWithRoomType(String roomType) {
		
		List<String> hotelNames = new ArrayList<String>();
		List<Boolean> booleans = new ArrayList<Boolean>();
		for (int i = 0; i < hotelNamesList.size(); i++) {
			WebElement webElement = hotelNamesList.get(i);
			String text = webElement.getText();
			hotelNames.add(text);
			boolean endsWith = text.endsWith(roomType);
			booleans.add(endsWith);
		}
		System.out.println(hotelNames);
		System.out.println(booleans);
		boolean contains = booleans.contains(false);
		System.out.println(contains);
		return contains;

	
}
public void getFirstHotelName() {
WebElement firstHotelNameElement = hotelNamesList.get(0);
hotelName = firstHotelNameElement.getText();
System.out.println(hotelName);
}
public void getFirstHotelPrice() {
WebElement firstHotelPriceElement = elementslist.get(0);
hotelprice = firstHotelPriceElement.getText();
System.out.println(hotelprice);
}
public void clickFirstHotel() {
btnContinueSingle.click();
alertaccept();
}
public void getlastHotelName() {
int size = hotelNamesList.size();
int select = size-1;
WebElement lastHotelNameElement = hotelNamesList.get(select);
hotelName = lastHotelNameElement.getTagName();
System.out.println(hotelName);
}
public void getLastHotelPrice() {
int size = elementslisthightolow.size();
int select = size-1;
WebElement lastHotelPriceElement = hotelNamesList.get(select);
hotelprice = lastHotelPriceElement.getText();
System.out.println(hotelprice);
}
public void clickLastHotel() {
	WebElement webElement = btncontinue.get(btncontinue.size()-1);
	elementClick(webElement);
	alertaccept();
	
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

