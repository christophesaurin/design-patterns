package fr.saurin.designpatterns.state.standard;

public class StandardTicketStateDone implements StandardTicketState {

    public static StandardTicketStateDone INSTANCE = new StandardTicketStateDone();

    private StandardTicketStateDone() {
    }

    @Override
    public StandardTicketState nextState(StandardTicketEvent event) {
        throw new IllegalStateException();
    }
}
