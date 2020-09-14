class Main {
    public static void main(String[] args) {
        String s = "Orthodontist";
        Appointment app = new Appointment(11, 7, 1990, 1, 5,s);
        // app.getDate(); 
    

        AppointmentHolder h = new AppointmentHolder(); 
        h.addNewApp(4,6,2019, 2,30, s); 
        h.printAppointments(); 

    }
}