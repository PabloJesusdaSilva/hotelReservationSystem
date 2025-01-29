package com.hotelreservations.controller;

import java.util.ArrayList;
import java.util.List;

import com.hotelreservations.domain.Room;

public class Hotel {
    List<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        for (Room unit: rooms) {
            if(unit.getNumber() == room.getNumber()) {
                System.err.println("This room " + room.getNumber() + "already exists!");
                return;
            }
        }

        rooms.add(room);
    }
}
