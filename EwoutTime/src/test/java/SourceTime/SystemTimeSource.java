package SourceTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.InetAddress;
 import java.util.Date;


/**
 *
 * @author Ewout
 */
public class SystemTimeSource implements TimeSource {

    @Override
    public Date getTimeMoment() {
           Date date = new Date();
        return date;
       /* NTPUDPClient timeClient = new NTPUDPClient();
        InetAddress inetAddress = InetAddress.getByName("time-a.nist.gov");
        TimeInfo timeInfo = timeClient.getTime(inetAddress);
        long returnTime = timeInfo.getReturnTime();
        Date time = new Date(returnTime);
        return time;
*/
    }

}
