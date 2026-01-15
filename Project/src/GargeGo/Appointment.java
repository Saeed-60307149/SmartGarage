package GargeGo;

public class Appointment {
    private String appointmentId;
    private String dateTime;
    private String status;
    private Service service;

    public Appointment(String appointmentId, String dateTime, String status, Service service) {
        this.appointmentId = appointmentId;
        this.dateTime = dateTime;
        this.status = status;
        this.service = service;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Service getService() { return service; }

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}
}
