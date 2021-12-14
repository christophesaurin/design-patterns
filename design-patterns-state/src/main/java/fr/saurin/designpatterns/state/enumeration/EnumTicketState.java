package fr.saurin.designpatterns.state.enumeration;

import java.util.List;

public enum EnumTicketState {
    Todo {
        @Override
        public List<EnumTicketEvent> availableEvents() {
            return List.of(EnumTicketEvent.Start, EnumTicketEvent.Cancel);
        }

        @Override
        public EnumTicketState nextState(EnumTicketEvent event) {
            if (event == EnumTicketEvent.Start) return InProgress;
            if (event == EnumTicketEvent.Cancel) return Cancelled;
            throw new IllegalStateException();
        }
    }, InProgress {
        @Override
        public List<EnumTicketEvent> availableEvents() {
            return List.of(EnumTicketEvent.Stop, EnumTicketEvent.End, EnumTicketEvent.Cancel);
        }

        @Override
        public EnumTicketState nextState(EnumTicketEvent event) {
            if (event == EnumTicketEvent.Stop) return Todo;
            if (event == EnumTicketEvent.End) return Done;
            if (event == EnumTicketEvent.Cancel) return Cancelled;
            throw new IllegalStateException();
        }
    }, Done, Cancelled;

    public List<EnumTicketEvent> availableEvents() {
        return List.of();
    }

    public boolean isCompatible(EnumTicketEvent event) {
        return availableEvents().contains(event);
    }

    public EnumTicketState nextState(EnumTicketEvent event) {
        throw new IllegalStateException();
    }
}
