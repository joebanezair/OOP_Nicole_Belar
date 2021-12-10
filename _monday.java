
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
    
    public static String input;
    public static void main (String[] args){
        Monday monmon = new Monday();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time format (HH:MM): ");
        input = sc.nextLine();
        String time = "24:00";
        if (input == "") {
          monmon.setAlarm(time);
          System.out.println("the alarm is set for tommorow");
        }else{
           monmon.setAlarm(input);
           System.out.println("I'll wake you up later!");
        }
        
    }
}

class Weekday implements Alarm {

    private final String time_format = "HH:mm";
    private static String _time;
    
    @Override
    public void setAlarm(String time) {     
 
         Monday mon = new Monday();
         Weekday._time = time;
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern(time_format);
         LocalTime alarm = LocalTime.parse(time, formatter);     
         LocalTime now = LocalTime.now();   
         alarm.isBefore(now);

    }

    @Override
    public String showAlarm(){return _time;}
    
}
