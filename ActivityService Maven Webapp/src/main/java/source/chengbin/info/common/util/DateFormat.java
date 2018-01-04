package source.chengbin.info.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
	
    private SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
    
    private DateFormat(){
    	
    }
    
    private DateFormat(String parent){
    	this.sdf=new SimpleDateFormat(parent);
    }
    
    public static DateFormat getInstance(){
    	return new DateFormat();
    }
    
    public static DateFormat getInstance(String parent){
    	return new DateFormat(parent);
    }
    
    public static Integer getBetweenDay(Date start,Date end){
    	if(start==null || end==null){
    		return null;
    	}
    	Long startTime=start.getTime();
    	Long endTime=end.getTime();
    	Long betweenTime=(endTime-startTime)/(1000*60*60*24);
    	return Integer.valueOf(betweenTime.toString());
    }
    
    
    public String parse(Date date){
    	return this.sdf.format(date);
    }
    
    
    public Date parse(String str) throws ParseException{
    	return this.sdf.parse(str);
    }
    
    
    /**
     * 
     * @param str
     * @return
     * @throws ParseException
     */
    public Date YearOne(String str) throws ParseException{
    	Date date=this.sdf.parse(str);
    	Calendar calder=Calendar.getInstance();
    	calder.setTime(date);
    	int year=calder.get(Calendar.YEAR);
    	calder.set(year, 1, 1);
    	return calder.getTime();
    	
    }
    
    /**
     * 
     * @param str
     * @return
     * @throws ParseException
     */
    public Date MonthOne(String str) throws ParseException{
    	Date date=this.sdf.parse(str);
    	Calendar calder=Calendar.getInstance();
    	calder.setTime(date);
    	calder.set(calder.get(Calendar.YEAR),calder.get(Calendar.MONTH), 1);
    	return calder.getTime();
    }
    
	
    public static String DateToString(Date date,String parent){
    	SimpleDateFormat sdf=new SimpleDateFormat(parent);
    	if(date==null){
    		return null;
    	}
    	return sdf.format(date);
    }
    
    
    public static String DateToDefautlString(Date date){
    	return DateToString(date,"yyyy-MM-dd");
    }


    public static Date StringToDate(String string,String parent) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat(parent);
        return sdf.parse(string);
    }

    /**
     * 
     * @param dateString
     * @return
     */
    public static Date StringtoDefaultDate(String dateString) throws ParseException{
        return StringToDate(dateString,"yyyyMMdd");
    }
    
    
    public static Date StringtoParamDate(String dateString) throws ParseException{
        return StringToDate(dateString,"yyyy-MM-dd");
    }
    
    
    public static Date StringToDateOrNull(String dateString){
    	try{
    		  return StringToDate(dateString,"yyyy-MM-dd");
    	}catch(Exception e){
    		return null;
    	}
    }
    
    
    



    
    
    
    
    
    
}
