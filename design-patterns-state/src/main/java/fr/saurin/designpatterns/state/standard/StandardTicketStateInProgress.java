package fr.saurin.designpatterns.state.standard;

public class StandardTicketStateInProgress implements StandardTicketState {

    public static StandardTicketStateInProgress INSTANCE = new StandardTicketStateInProgress();

    private StandardTicketStateInProgress() {
    }

    @Override
    public StandardTicketState nextState(StandardTicketEvent event) {
        if (event == StandardTicketEvent.Stop) return StandardTicketStateTodo.INSTANCE;
        if (event == StandardTicketEvent.End) return StandardTicketStateDone.INSTANCE;
        if (event == StandardTicketEvent.Cancel) return StandardTicketStateCancelled.INSTANCE;
        throw new IllegalStateException();
    }
}
