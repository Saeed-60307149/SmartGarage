package GargeGo;

public class VehicleOwnerFactory implements UserFactory {
    public User createUser(String role) {
        return new VehicleOwner("veh1", "vehUser", "1122334455", "vehPass");
    }
}