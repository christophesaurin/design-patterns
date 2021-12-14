package fr.saurin.designpatterns.state.standard;

public class StandardStateMain {

    public static void main(String[] args) {
        StandardTicket ticket = new StandardTicket();
        System.out.println(ticket.getState());
        ticket.nextState(StandardTicketEvent.Start);
        System.out.println(ticket.getState());
        ticket.nextState(StandardTicketEvent.Stop);
        System.out.println(ticket.getState());
        ticket.nextState(StandardTicketEvent.Start);
        System.out.println(ticket.getState());
        ticket.nextState(StandardTicketEvent.End);
        System.out.println(ticket.getState());
        ticket.nextState(StandardTicketEvent.Start);
        System.out.println(ticket.getState());
    }
}
