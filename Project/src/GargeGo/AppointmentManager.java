package GargeGo;

public class AppointmentManager {
    private Garage garage;
    private NotificationManager notificationManager;

    public AppointmentManager(Garage garage, NotificationManager notificationManager) {
        this.garage = garage;
        this.notificationManager = notificationManager;
    }

    public void bookAppointment(String appointmentId, String dateTime, Service service) {
        Appointment appointment = new Appointment(appointmentId, dateTime, "Booked", service);
        garage.addAppointment(appointment);
        notificationManager.notifyObservers("Appointment booked: " + appointmentId);
    }

    public void cancelAppointment(String appointmentId) {
        for (Appointment app : garage.getAppointments()) {
            if (app.getAppointmentId().equals(appointmentId) && app.getStatus().equals("Booked")) {
                app.setStatus("Canceled");
                garage.removeAppointment(appointmentId);
                notificationManager.notifyObservers("Appointment canceled: " + appointmentId);
                break;
            }
        }
    }

    public void manageSchedule(String dateTime, Service service, boolean add) {
        if (add) {
            Appointment appointment = new Appointment("newSlot", dateTime, "Available", service);
            garage.addAppointment(appointment);
            notificationManager.notifyObservers("New slot added: " + dateTime);
        } else {
            garage.removeAppointment("newSlot");
            notificationManager.notifyObservers("Slot removed: " + dateTime);
        }
    }
}
