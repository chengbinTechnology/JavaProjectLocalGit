package source.chengbin.info.common.util;


import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class DateSearch {
    private Date date;
    
    public DateSearch(Date date){
    	this.date=date;
    }
    
    public DateSearch(String str) throws ParseException{
    	this.date=DateFormat.StringtoDefaultDate(str);
    }
    
    public DateSearch(String str,String parent) throws ParseException{
    	this.date=DateFormat.StringToDate(str,parent);
    }
    
    public DateSearch(MyDate myDate){
    	this.date=myDate.getDate();
    }
    
    
    public MyDate getDay(){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	return new MyDate(calander.getTime());
    }
    
    /**
     * 返回前多少天的日期
     * @param value
     * @return
     */
    public MyDate getBeforeDay(int value){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	calander.add(Calendar.DAY_OF_MONTH, 0-value);
    	return new MyDate(calander.getTime());
    }
    
    
     
    public int getHourOfDate(){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	return calander.get(Calendar.HOUR_OF_DAY);
    }
    
    /**
     * 返回后多少天的日期
     * @param value
     * @return
     */
    public MyDate getAfterDay(int value){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	calander.add(Calendar.DAY_OF_MONTH, value);
    	return  new MyDate(calander.getTime());
    }
    
    /**
     * 返回前多少个月的日期
     * @param value
     * @return
     */
    public MyDate getBeforeMonth(int value){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	calander.add(Calendar.MONTH, 0-value);
    	return new MyDate(calander.getTime());
    }
    
    /**
     * 返回后多少个月的日期
     * @param value
     * @return
     */
    public MyDate getAfterMonth(int value){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	calander.add(Calendar.MONTH, value);
    	return new MyDate(calander.getTime());
    }
    
    
    /**
     * 返回前几年的日期
     * @param value
     * @return
     */
    public MyDate getBeforeYear(int value){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	calander.add(Calendar.YEAR, 0-value);
    	return new MyDate(calander.getTime());
    }
    
   /**
    * 返回后几年的日期
    * @param value
    * @return
    */
    public MyDate getAfterYear(int value){
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	calander.add(Calendar.YEAR, value);
    	return new MyDate(calander.getTime());
    }
    
    
    /**
     * 获取一个月中最后一天
     * @return
     */
    public MyDate getLastDay() throws ParseException{
    	Calendar calander=Calendar.getInstance();
    	calander.setTime(date);
    	int value=calander.getActualMaximum(Calendar.DAY_OF_MONTH);
    	MyDate mydate=new MyDate(calander.getTime());
    	return new MyDate(mydate.toMonth().toString()+String.valueOf(value));
    }
    
    
  
    
    
    
  
    
   
    
  
    
    
    
    
}
