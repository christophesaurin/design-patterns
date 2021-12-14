package fr.saurin.designpatterns.state.bad;

public class BadStateMain {

    public static void main(String[] args) {
        BadTicket ticket = new BadTicket();
        System.out.println(ticket.getState());
        ticket.setState(BadTicketState.Cancelled);
    }
}
