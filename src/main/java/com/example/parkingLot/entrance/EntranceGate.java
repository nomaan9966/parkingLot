package com.example.parkingLot.entrance;

import com.example.parkingLot.parking.parkingManager.ParkingManager;
import com.example.parkingLot.parking.parkingSpot.ParkingSpot;
import com.example.parkingLot.parking.parkingStrategy.ParkingStrategy;
import com.example.parkingLot.parking.parkingSpot.ParkingSpotType;
import com.example.parkingLot.ticket.Ticket;
import com.example.parkingLot.vehicle.Vehicle;
import com.example.parkingLot.vehicle.VehicleType;

import java.time.LocalDateTime;
import java.util.List;

public class EntranceGate {

    private final List<ParkingManager> parkingManagers;
    private final List<ParkingStrategy> parkingStrategies;
    private final ParkingStrategy defaultStrategy;

    protected EntranceGate(List<ParkingManager> parkingManagers, List<ParkingStrategy> parkingStrategies, ParkingStrategy defaultStrategy) {
        this.parkingManagers = parkingManagers;
        this.parkingStrategies = parkingStrategies;
        this.defaultStrategy = defaultStrategy;
    }

    public Ticket entry(Vehicle vehicle, ParkingSpotType type) {
        ParkingManager parkingManager = getParkingManager(vehicle.getVehicleType());
        ParkingStrategy parkingStrategy = getParkingStrategy(type);

        ParkingSpot parkingSpot = parkingManager.parkVehicle(vehicle, parkingStrategy);

        return new Ticket.TicketBuilder()
                .withEntryTime(LocalDateTime.now())
                .withVehicle(vehicle)
                .withParkingSpot(parkingSpot)
                .build();
    }

    private ParkingManager getParkingManager(VehicleType vehicleType) {
        return parkingManagers.stream()
                .filter(parkingManager -> parkingManager.accepts(vehicleType))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Vehicle Not Allowed"));
    }

    private ParkingStrategy getParkingStrategy(ParkingSpotType parkingSpotType) {
        return parkingStrategies.stream()
                .filter(parkingStrategy -> parkingStrategy.accepts(parkingSpotType))
                .findFirst()
                .orElse(defaultStrategy);
    }
}
