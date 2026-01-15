package GargeGo;

public abstract class User {
    protected String userId;
    protected String username;
    protected String phone;
    protected String password;

    public User(String userId, String username, String phone, String password) {
        this.userId = userId;
        this.username = username;
        this.phone = phone;
        this.password = password;
    }

    public String getUserId() { return userId; }
}
