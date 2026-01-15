package GargeGo;

public abstract class Service {
    protected String serviceId;
    protected String name;
    protected String description;
    protected String priceRange;

    public Service(String serviceId, String name, String description, String priceRange) {
        this.serviceId = serviceId;
        this.name = name;
        this.description = description;
        this.priceRange = priceRange;
    }

    public String getServiceId() { return serviceId; }
}
