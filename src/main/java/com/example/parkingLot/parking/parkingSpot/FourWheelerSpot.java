package com.example.parkingLot.parking.parkingSpot;

public class FourWheelerSpot extends ParkingSpot {

    private final int price;

    public FourWheelerSpot(String id, ParkingSpotType parkingSpotType, int price) {
        super(id, parkingSpotType);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
