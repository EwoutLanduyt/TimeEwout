package SourceTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Ewout Landuyt
 */
public class FinnishWatch implements Watch{
    
    public TimeSource source = new SystemTimeSource();
    public SimpleDateFormat timeFormatter;
    public TimeZone easternEuropeanTIme;
    
   
    /**
     * Gets the date from SystemTimeSource and place it in Time Format.
    * @return 
     */
    @Override
    public String getTime() {
       
        Date currentDate = source.getTimeMoment();
        
        return currentDate.toString();
       
    }
    /**
     * Gets the date from SystemTimeSource and place it in Date Format.
    * @return 
     */
    @Override
    public String getDate() {
        
        Date currentDate  = source.getTimeMoment();
        
        String dateFormatted = timeFormatter.format(currentDate);
        
        
        return dateFormatted;
    }
    
    
    
    
    
    
}
