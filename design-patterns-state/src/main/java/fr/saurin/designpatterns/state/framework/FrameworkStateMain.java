package fr.saurin.designpatterns.state.framework;

import java.util.Scanner;

public class FrameworkStateMain {

    public static void main(String[] args) {
        FrameworkTicket ticket = new FrameworkTicket();

        System.out.println(ticket.getState());
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println(ticket.availableEvents());
                FrameworkTicketEvent event = ticket.availableEvents().get(scanner.nextInt());
                ticket.nextState(event);
                System.out.println(ticket.getState());
            } while (!ticket.availableEvents().isEmpty());
        }
    }

}
