package GargeGo;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private String garageId;
    private String operatingHours;
    private List<Appointment> appointments = new ArrayList<>();

    public Garage(String garageId, String operatingHours) {
        this.garageId = garageId;
        this.operatingHours = operatingHours;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(String appointmentId) {
        appointments.removeIf(a -> a.getAppointmentId().equals(appointmentId));
    }

    public List<Appointment> getAppointments() {
        return new ArrayList<>(appointments);
    }
}
