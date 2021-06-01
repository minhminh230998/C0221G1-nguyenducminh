package model.bean.service;

public class Services {
    private int id;
    private String name;
    private double area;
    private float cost;
    private int quantityMax;
    private int floor;
    private String status;
    private ServiceType serviceType;
    private RentType rentType;

    public Services() {
    }

    public Services(String name, double area, float cost, int quantityMax, int floor, String status, ServiceType serviceType, RentType rentType) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.quantityMax = quantityMax;
        this.floor = floor;
        this.status = status;
        this.serviceType = serviceType;
        this.rentType = rentType;
    }

    public Services(int id, String name, double area, float cost, int quantityMax, int floor, String status, ServiceType serviceType, RentType rentType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.quantityMax = quantityMax;
        this.floor = floor;
        this.status = status;
        this.serviceType = serviceType;
        this.rentType = rentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getQuantityMax() {
        return quantityMax;
    }

    public void setQuantityMax(int quantityMax) {
        this.quantityMax = quantityMax;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }
}
