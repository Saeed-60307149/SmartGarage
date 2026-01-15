package GargeGo;

public class AdminFactory implements UserFactory {
    public User createUser(String role) {
        return new Admin("admin1", "adminUser", "1234567890", "adminPass");
    }
}
