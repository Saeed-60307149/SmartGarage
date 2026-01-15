package GargeGo;

public class Admin extends User {
    public Admin(String userId, String username, String phone, String password) {
        super(userId, username, phone, password);
    }

    public void admin() {
        // Admin-specific logic
    }
}