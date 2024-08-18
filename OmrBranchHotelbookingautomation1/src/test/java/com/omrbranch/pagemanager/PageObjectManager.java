package com.omrbranch.pagemanager;

import com.omrbranch.Pages.BookHotelPage;
import com.omrbranch.Pages.BookingConfirmPage;
import com.omrbranch.Pages.Loginpage;
import com.omrbranch.Pages.MyBookingPage;
import com.omrbranch.Pages.SearchHotelPage;
import com.omrbranch.Pages.SelectHotelPage;

public class PageObjectManager {
	private Loginpage loginpage;
	private SearchHotelPage searchhotelpage;
	private SelectHotelPage selecthotelpage;
	private BookHotelPage bookhotelpage;
	private BookingConfirmPage bookconfirmpage;
	private MyBookingPage mybookingpage;
	public Loginpage getLoginpage() {
		return (loginpage==null)?loginpage=new Loginpage():loginpage;
	}
	public SearchHotelPage getSearchhotelpage() {
		return (searchhotelpage==null)?searchhotelpage = new SearchHotelPage():searchhotelpage;
	}
	public SelectHotelPage getSelecthotelpage() {
		return (selecthotelpage ==null)?selecthotelpage = new SelectHotelPage():selecthotelpage;
	}
	public BookHotelPage getBookhotelpage() {
		return (bookhotelpage==null)?bookhotelpage = new BookHotelPage():bookhotelpage;
	}
	public BookingConfirmPage getBookconfirmpage() {
		return (bookconfirmpage==null)?bookconfirmpage= new BookingConfirmPage():bookconfirmpage;
	}
	public MyBookingPage getMybookingpage() {
		return (mybookingpage==null)?mybookingpage=new MyBookingPage():mybookingpage;
	}
	

}
