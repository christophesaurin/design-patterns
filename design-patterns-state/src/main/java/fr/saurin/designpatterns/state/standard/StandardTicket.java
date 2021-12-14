package fr.saurin.designpatterns.state.standard;

public class StandardTicket {
    private StandardTicketState state;

    public StandardTicket() {
        state = StandardTicketStateTodo.INSTANCE;
    }

    public StandardTicketState getState() {
        return state;
    }

    public void nextState(StandardTicketEvent event) {
        state = state.nextState(event);
    }
}
