package com.hotelreservations.controller;

import java.util.ArrayList;
import java.util.List;

import com.hotelreservations.domain.Room;

public class Hotel {
    List<Room> rooms;

    public Hotel() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom (Room room) {
        for (Room unit: rooms) {
            if(unit.getNumber() == room.getNumber()) {
                System.err.println("This room " + room.getNumber() + "already exists!");
                return;
            }
        }

        rooms.add(room);
        System.out.println("\nAdd room successfully: " + room.getNumber());
    }

    public void bookARoom (int number) {
        for (Room unit: rooms) {
            if (unit.getNumber() == number) {
                unit.toBook();
                return;
            }
        }

        System.err.print("\nRoom occupied successfully\n");
    }
    
    public void cancelReservation (int number) {
        for (Room unit: rooms) {
            if(unit.getNumber() == number) {
                unit.cancelReservation();
                return;
            }
        }

        System.err.println("The reservation does not exist!");
    }

    public void roomsList () {
        if (rooms.isEmpty()) {
            System.out.println("There are no room available");
        } else {
            System.out.println("The rooms availables");
            for (Room unit: rooms) {
                System.out.println(unit);
            }
        }
    }
}
