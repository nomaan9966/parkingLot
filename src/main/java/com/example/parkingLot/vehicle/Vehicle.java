package com.example.parkingLot.vehicle;

public class Vehicle {
    private final String number;
    private final VehicleType vehicleType;

    public Vehicle(String number, VehicleType vehicleType) {
        this.number = number;
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
