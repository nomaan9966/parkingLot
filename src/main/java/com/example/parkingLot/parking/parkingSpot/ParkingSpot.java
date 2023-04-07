package com.example.parkingLot.parking.parkingSpot;

import com.example.parkingLot.vehicle.Vehicle;

public abstract class ParkingSpot {

    private final String id;
    private final ParkingSpotType parkingSpotType;
    private boolean isEmpty;
    private Vehicle vehicle;

    protected ParkingSpot(String id, ParkingSpotType parkingSpotType) {
        this.id = id;
        this.parkingSpotType = parkingSpotType;
    }

    public abstract int getPrice();

    public String getId() {
        return id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
