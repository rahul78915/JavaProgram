package com.qa.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
String str="08-04-2022";
SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
Date data=sdf.parse(str);
System.out.println(data);
	}

}
