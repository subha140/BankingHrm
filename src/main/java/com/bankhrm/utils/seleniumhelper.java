package com.bankhrm.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class seleniumhelper {
	
	public static void selectitemTextFromList(WebElement Dropdownitem ,String Dropdownitemtext)
	{
		Select list=new Select(Dropdownitem);
		list.selectByVisibleText(Dropdownitemtext);
	}

}
