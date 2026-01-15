package GargeGo;

public class GarageOwner extends User {
    private String garageId;
    private String operatingHours;

    public GarageOwner(String userId, String username, String phone, String password, String garageId, String operatingHours) {
        super(userId, username, phone, password);
        this.garageId = garageId;
        this.operatingHours = operatingHours;
    }

    public void managesGarage() {
        // Garage management logic
    }
}
