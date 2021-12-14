package fr.saurin.designpatterns.state.standard;

public class StandardTicketStateTodo implements StandardTicketState {

    public static StandardTicketStateTodo INSTANCE = new StandardTicketStateTodo();

    private StandardTicketStateTodo() {
    }

    @Override
    public StandardTicketState nextState(StandardTicketEvent event) {
        if (event == StandardTicketEvent.Start) return StandardTicketStateInProgress.INSTANCE;
        if (event == StandardTicketEvent.Cancel) return StandardTicketStateCancelled.INSTANCE;
        throw new IllegalStateException();
    }
}
