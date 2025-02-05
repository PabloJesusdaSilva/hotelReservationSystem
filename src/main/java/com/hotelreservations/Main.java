package com.hotelreservations;

import java.util.Scanner;

import com.hotelreservations.controller.Hotel;
import com.hotelreservations.domain.Room;
import com.hotelreservations.domain.RoomType;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo ao sistema de reservas do hotel!");
            System.out.println("1. Adicionar Quarto");
            System.out.println("2. Reservar Quarto");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Listar Quartos");
            System.out.println("5. Sair\n");

            System.out.print("Enter the option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if(option == 1) {
                System.out.print("\nEnter a number: ");
                int number = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter the room type (SINGLE, DOUBLE, SUITE): ");
                String inputRoomType = scanner.next().toUpperCase();

                RoomType roomType = null;

                try {
                    roomType = RoomType.valueOf(inputRoomType);
                    System.out.println("You chose: " + roomType);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error: invalid type room");
                    return;
                }

                Room room = new Room(number, roomType);
                hotel.addRoom(room);
            } else if(option == 2) {
                System.out.print("Enter de room number: ");
                int number =  scanner.nextInt();
                scanner.nextLine();

                hotel.bookARoom(number);
            } else if(option == 3) {
                System.out.print("Enter the room number: ");
                int number = scanner.nextInt();
                scanner.nextLine();

                hotel.cancelReservation(number);
            } else if(option == 4) {
                hotel.roomsList();
            } else if(option == 5) {
                System.out.println("Finished system...");
                break;
            } else {
                System.err.println("Option invalid!");
            }
        }
    }
}