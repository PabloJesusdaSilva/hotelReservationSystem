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
        this.occupied = true;    
    }

    public void cancelReservation() {
        this.occupied = false;
    }

    @Override
    public String toString() {
        return "Book" + number + occupied;
    }
}
