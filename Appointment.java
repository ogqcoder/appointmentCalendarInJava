import java.util.*; 
import java.text.SimpleDateFormat;

public class Appointment {

    String description;
    String date; 
    

    public Appointment(int m, int d, int y, int h, int min, String s){
        date = date(m,d,y,h,min);
        addDescription(s);
        
    }

    public void addDescription(String x){
        description = x; 

    }

    public void getAppointment(){
       System.out.println(description + " " + getDate());
    }

    public String date(int month, int date, int year, int hour, int minute) {
        Calendar calendar = Calendar.getInstance();

        // minute = minute -1; 
        hour = hour - 12; 
        // month = month-1; 

      calendar.set(Calendar.YEAR, year);
      calendar.set(Calendar.MONTH, month);
      calendar.set(Calendar.DATE, date);
       calendar.set(Calendar.HOUR, hour);
       calendar.set(Calendar.MINUTE,minute);
       calendar.set(Calendar.SECOND,0);
      // util date object
      java.util.Date dt = calendar.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    System.out.println(sdf.format(dt));
    return sdf.format(dt);

    }

    public String getDate(){
        return date; 
    }
    public void appointments(){
        System.out.println(description + " " + date);
    }

}