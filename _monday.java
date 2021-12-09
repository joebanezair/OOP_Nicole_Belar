
package Monday;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//interface alarm
interface Alarm 
{public void setAlarm(String time);
public String showAlarm();}
//interface alarm

public class Monday extends Weekday{
    
    Monday(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time format (HH:MM): ");
        String input = sc.nextLine(); setAlarm(input);
    }  
    public static void main (String[] args){new Monday();}}

class Weekday implements Alarm {

    private final String time_format = "HH:mm";
    private static String _time;
    
    @Override
    public void setAlarm(String time) {     
 
        Weekday._time = time;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(time_format);

        LocalTime alarm = LocalTime.parse(time, formatter);     
        LocalTime now = LocalTime.now();    
        
        if (alarm.isBefore(now)) { System.out.println("Wait for the alarm!");}
        else { System.out.println("Alarm is set for tomorrow!"); }
 
    }

    @Override
    public String showAlarm(){return _time;}
    
}
