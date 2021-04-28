package com.my.rentalstore;




import java.util.Calendar;
import java.util.Date;

public class DateManager {
    
    Calendar c = Calendar.getInstance();
        
   public Date generateDueDate(Date date, int days){
        c.setTime(date);
	c.add(Calendar.DAY_OF_MONTH, days);  
	return c.getTime();  
   }
   
   public Date getCrrentDate(){
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());               
        return date;
   }

   public java.sql.Date convertUtilToSql(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;

   }   
}
