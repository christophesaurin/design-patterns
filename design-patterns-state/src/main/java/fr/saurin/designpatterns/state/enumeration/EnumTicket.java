package fr.saurin.designpatterns.state.enumeration;

import java.util.List;

public class EnumTicket {
    private EnumTicketState state;

    public EnumTicket() {
        state = EnumTicketState.Todo;
    }

    public EnumTicketState getState() {
        return state;
    }

    public void nextState(EnumTicketEvent event) {
        state = state.nextState(event);
    }

    public List<EnumTicketEvent> availableEvents() {
        return state.availableEvents();
    }
}
