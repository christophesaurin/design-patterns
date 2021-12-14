package fr.saurin.designpatterns.state.standard;

public class StandardTicketStateCancelled implements StandardTicketState {

    public static StandardTicketStateCancelled INSTANCE = new StandardTicketStateCancelled();

    private StandardTicketStateCancelled() {
    }

    @Override
    public StandardTicketState nextState(StandardTicketEvent event) {
        throw new IllegalStateException();
    }
}
