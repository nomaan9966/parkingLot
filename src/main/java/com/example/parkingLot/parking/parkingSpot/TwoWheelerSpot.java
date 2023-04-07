package com.example.parkingLot.parking.parkingSpot;

public class TwoWheelerSpot extends ParkingSpot {

    private final int price;

    public TwoWheelerSpot(String id, ParkingSpotType parkingSpotType, int price) {
        super(id, parkingSpotType);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}