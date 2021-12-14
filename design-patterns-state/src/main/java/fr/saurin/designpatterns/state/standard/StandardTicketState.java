package fr.saurin.designpatterns.state.standard;

public interface StandardTicketState {
    StandardTicketState nextState(StandardTicketEvent event);
}
