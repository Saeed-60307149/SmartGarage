package GargeGo;

public class Main {
    public static void main(String[] args) {
        // Initialize dependencies
        NotificationManager notificationManager = new NotificationManagerImpl();
        Garage garage = new Garage("garage1", "9:00-17:00");
        AppointmentManager appointmentManager = new AppointmentManager(garage, notificationManager);

        // Create a user observer
        User user = new VehicleOwner("veh1", "vehUser", "1122334455", "vehPass");
        UserObserver userObserver = new UserObserver(user);
        notificationManager.subscribe(userObserver);

        // Test 1: Booking Appointment
        Service basicService = new BasicService("svc1", "Basic Oil Change", "Standard oil change service", "$30-$50");
        appointmentManager.bookAppointment("app1", "2025-06-24 10:00", basicService);
        System.out.println("Current appointments: " + garage.getAppointments().size());

        // Test 2: Canceling an Appointment
        appointmentManager.cancelAppointment("app1");
        System.out.println("Current appointments after cancellation: " + garage.getAppointments().size());

        // Test 3: Managing Garage Schedules (Adding and Removing a slot)
        Service premiumService = new PremiumService("svc2", "Premium Tune-Up", "Comprehensive tune-up", "$100-$150");
        appointmentManager.manageSchedule("2025-06-25 14:00", premiumService, true);
        System.out.println("Appointments after adding slot: " + garage.getAppointments().size());
        appointmentManager.manageSchedule("2025-06-25 14:00", premiumService, false);
        System.out.println("Appointments after removing slot: " + garage.getAppointments().size());
    }
}
