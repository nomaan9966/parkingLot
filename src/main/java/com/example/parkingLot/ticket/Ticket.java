package com.example.parkingLot.ticket;

import com.example.parkingLot.parking.parkingSpot.ParkingSpot;
import com.example.parkingLot.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private final LocalDateTime entryTime;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;

    private Ticket(LocalDateTime entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public static class TicketBuilder {
        private LocalDateTime entryTime;
        private Vehicle vehicle;
        private ParkingSpot parkingSpot;

        public TicketBuilder withEntryTime(LocalDateTime entryTime) {
            this.entryTime = entryTime;
            return this;
        }

        public TicketBuilder withVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public TicketBuilder withParkingSpot(ParkingSpot parkingSpot) {
            this.parkingSpot = parkingSpot;
            return this;
        }

        public Ticket build() {
            return new Ticket(entryTime, vehicle, parkingSpot);
        }
    }
}
