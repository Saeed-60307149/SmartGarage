package GargeGo;

public interface NotificationManager {
    void subscribe(Observer observer);
    void notifyObservers(String message);
}
