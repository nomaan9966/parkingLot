package com.example.parkingLot.parking.parkingStrategy;


import com.example.parkingLot.parking.parkingSpot.ParkingSpot;
import com.example.parkingLot.parking.parkingSpot.ParkingSpotType;

import java.util.List;

public class DefaultStrategy extends ParkingStrategy {
    protected DefaultStrategy(ParkingSpotType parkingSpotType) {
        super(parkingSpotType);
    }

    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots) {
        return null;
    }
}