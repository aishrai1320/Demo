package com.comcast.crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class javaUtility {
public int getRandomNumber() {
	Random random =new Random();
	int randomNum=random.nextInt(8000);
	return randomNum;
}
	
	
public String getSystemdatedYYYYDDMM() {
	Date dateobj=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
	String date =sdf.format(dateobj);
	
	
	return date;
	

}
public String getRequiredDateYYYYDDMM(int days)	{
	Date dateobjDate =new Date();
	
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
	
	Calendar cal = simpleDateFormat.getCalendar();
	cal.add(Calendar.DAY_OF_MONTH,days);
	String reqDate= simpleDateFormat.format(cal.getTime());
	return reqDate;
	
}
	
	
	
	
	
	
	
	
	
}
