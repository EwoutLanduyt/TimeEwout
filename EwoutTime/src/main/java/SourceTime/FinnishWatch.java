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
    
    public TimeSource source = new InternetTimeSource();
    public SimpleDateFormat timeFormatter;
    public TimeZone easternEuropeanTIme;
    
   

    @Override
    public String getTime() {
       
        Date currentDate = source.getTimeMoment();
        
        return currentDate.toString();
       
    }

    @Override
    public String getDate() {
        
        Date currentDate  = source.getTimeMoment();
        
        String dateFormatted = timeFormatter.format(currentDate);
        
        
        return dateFormatted;
    }
    
    
    
    
    
    
}
