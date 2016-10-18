package SourceTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author Ewout
 */
public class MockTimeSource implements TimeSource {

    @Override
    public Date getTimeMoment() {
        Date date = new Date();
        return date;
        
    }
    
}
