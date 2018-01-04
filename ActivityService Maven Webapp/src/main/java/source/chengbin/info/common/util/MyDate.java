package source.chengbin.info.common.util;

import java.text.ParseException;
import java.util.Date;

public class MyDate {
    
	Date date;
	
	public MyDate(Date time){
		this.date=time;
	}
	
	public MyDate(String date)  throws ParseException{
		this.date=DateFormat.StringtoDefaultDate(date);
	}
	
	
	public Date getDate(){
		return this.date;
	}
	
	
	public Long toNumber(String parent){
		return Long.valueOf(DateFormat.DateToString(date, parent));
	}
	
	public Long toTime(){
		return Long.valueOf(DateFormat.DateToString(date, "yyyyMMddHHmmss"));
	}
	
	public String toFormatStr(String pattern){
		return DateFormat.DateToString(date, "yyyy-MM-dd");
	}
	
	
	public Long toDay(){
		return Long.valueOf(DateFormat.DateToDefautlString(date));
	}
	
	public Long toMonth(){
		return Long.valueOf(DateFormat.DateToString(date, "yyyyMM"));
	}
	
	public Long toYear(){
		return Long.valueOf(DateFormat.DateToString(date, "yyyy"));
	}
	
	
}
