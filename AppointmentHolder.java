import java.util.*; 

class AppointmentHolder {

    ArrayList<Appointment> holder = new ArrayList<>();


    public void addNewApp(int m, int d,int y, int h, int min, String s){
        holder.add(new Appointment(m,d,y,h,m,s));
    }

    public void printAppointments(){
        for(int i = 0; i < holder.size(); i++) {   
    holder.get(i).getAppointment();
} 
    }
}