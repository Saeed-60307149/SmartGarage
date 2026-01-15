package GargeGo;

public class UserObserver implements Observer {
    private User user;

    public UserObserver(User user) {
        this.user = user;
    }

    public void update(String message) {
        System.out.println(user.username + " received: " + message);
    }
}
