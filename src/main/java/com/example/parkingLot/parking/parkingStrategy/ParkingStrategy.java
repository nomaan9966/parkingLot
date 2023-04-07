package com.example.parkingLot.parking.parkingStrategy;

import com.example.parkingLot.parking.parkingSpot.ParkingSpot;
import com.example.parkingLot.parking.parkingSpot.ParkingSpotType;

import java.util.List;

public abstract class ParkingStrategy {

    private final ParkingSpotType parkingSpotType;

    protected ParkingStrategy(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public boolean accepts(ParkingSpotType parkingSpotType) {
        return this.parkingSpotType.equals(parkingSpotType);
    }

    public abstract ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots);
}
