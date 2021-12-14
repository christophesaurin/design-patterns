package fr.saurin.designpatterns.state.enumeration;

import java.util.Scanner;

public class EnumStateMain {

    public static void main(String[] args) {
        EnumTicket ticket = new EnumTicket();
        System.out.println(ticket.getState());

        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println(ticket.availableEvents());
                EnumTicketEvent event = ticket.availableEvents().get(scanner.nextInt());
                ticket.nextState(event);
                System.out.println(ticket.getState());
            } while (!ticket.availableEvents().isEmpty());
        }
    }
}
