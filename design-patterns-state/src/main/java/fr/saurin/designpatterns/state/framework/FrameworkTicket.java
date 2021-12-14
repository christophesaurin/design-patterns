package fr.saurin.designpatterns.state.framework;

import java.util.List;

public class FrameworkTicket {
    private StateMachineBuilder.StateMachine<FrameworkTicketState, FrameworkTicketEvent> stateMachine;

    public FrameworkTicket() {
        StateMachineBuilder<FrameworkTicketState, FrameworkTicketEvent> stateMachineBuilder = StateMachineBuilder.builder();
        stateMachineBuilder.setInitialState(FrameworkTicketState.Todo)
                .add(FrameworkTicketState.Todo, FrameworkTicketEvent.Start, FrameworkTicketState.InProgress)
                .add(FrameworkTicketState.Todo, FrameworkTicketEvent.Cancel, FrameworkTicketState.Cancelled)
                .add(FrameworkTicketState.InProgress, FrameworkTicketEvent.Stop, FrameworkTicketState.Todo)
                .add(FrameworkTicketState.InProgress, FrameworkTicketEvent.Cancel, FrameworkTicketState.Cancelled)
                .add(FrameworkTicketState.InProgress, FrameworkTicketEvent.End, FrameworkTicketState.Done);
        stateMachine = stateMachineBuilder.build();
    }

    public FrameworkTicketState getState() {
        return stateMachine.currentState();
    }

    public void nextState(FrameworkTicketEvent event) {
        stateMachine.nextState(event);
    }

    public List<FrameworkTicketEvent> availableEvents() {
        return stateMachine.availableEvents();
    }
}
