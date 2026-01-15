package GargeGo;

public class GarageOwnerFactory implements UserFactory {
    public User createUser(String role) {
        return new GarageOwner("owner1", "ownerUser", "0987654321", "ownerPass", "garage1", "9:00-17:00");
    }
}