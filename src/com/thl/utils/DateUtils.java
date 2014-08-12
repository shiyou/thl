package com.thl.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import freemarker.template.SimpleDate;

public class DateUtils {
	/**
	 * 获取现在时间
	 * @return 字符串 yyyyMMdd HHmmss
	 */
	
	public static String getFormatTime1(){
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");
		String dateString = formatter.format(currentTime);
		return dateString;
		
	}
	
	/**
	 * 获取现在时间
	 * @return 字符串yyyy-MM-dd HH:mm:ss
	 */
	public static String getFormatTime2(){
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
		
	}
	
	@Test
	public void test(){
		System.out.println(getFormatTime2());
	}

}
