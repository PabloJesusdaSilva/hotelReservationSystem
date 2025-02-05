package com.hotelreservations.domain;

import lombok.Data;

@Data
public class Room {
    
    private int number;
    private RoomType roomType;
    private boolean occupied;

    public Room (int number, RoomType roomType) {
        this.number = number;
        this.roomType = roomType;
        this.occupied = false; // standart value
    }

    public void toBook () {
        if(!occupied) {
            occupied = true;
            System.out.println("The room " + number + " successfully booked!");    
        } else {
            System.err.println("Room already occupied");
        }
    }

    public void cancelReservation() {
        if(occupied) {
            occupied = false;
            System.out.println("Reservation for room " + number + " successfully canceled");
        } else {
            System.err.println("The room is now available");
        }
    }

    @Override
    public String toString() {
        return "Book | " + number + " | " + occupied;
    }
}
