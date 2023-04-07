package com.example.parkingLot.parking.parkingManager;

import com.example.parkingLot.parking.parkingSpot.ParkingSpot;
import com.example.parkingLot.parking.parkingStrategy.ParkingStrategy;
import com.example.parkingLot.vehicle.Vehicle;
import com.example.parkingLot.vehicle.VehicleType;

import java.util.List;

public class ParkingManager {

    private final List<ParkingSpot> parkingSpots;
    private final VehicleType vehicleType;

    public ParkingManager(List<ParkingSpot> parkingSpots, VehicleType vehicleType) {
        this.parkingSpots = parkingSpots;
        this.vehicleType = vehicleType;
    }

    public boolean accepts(VehicleType vehicleType){
        return this.vehicleType.equals(vehicleType);
    }

    public void addParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots.addAll(parkingSpots);
    }

    public void removeParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots.removeAll(parkingSpots);
    }

    public ParkingSpot parkVehicle(Vehicle vehicle, ParkingStrategy parkingStrategy) {
        ParkingSpot parkingSpot = parkingStrategy.findParkingSpot(parkingSpots);
        parkingSpot.setVehicle(vehicle);
        parkingSpot.setEmpty(false);
        return parkingSpot;
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.setVehicle(null);
        parkingSpot.setEmpty(true);
    }
}
