package fr.saurin.designpatterns.state.bad;

public class BadTicket {
    private BadTicketState state;

    public BadTicket() {
        state = BadTicketState.Todo;
    }

    public BadTicketState getState() {
        return state;
    }

    public void setState(BadTicketState state) {
        if (isNext(state)) {
            this.state = state;
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean isNext(BadTicketState state) {
        return (this.state == BadTicketState.Todo && (state == BadTicketState.InProgress || state == BadTicketState.Cancelled))
                || (this.state == BadTicketState.InProgress && (state == BadTicketState.Done || state == BadTicketState.Cancelled));
    }
}
