package fr.saurin.designpatterns.state.framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StateMachineBuilder<State, Event> {
    private State initialState;
    private List<Link<State, Event>> links = new ArrayList<>();

    private StateMachineBuilder() {
    }

    public static <State, Event> StateMachineBuilder<State, Event> builder() {
        return new StateMachineBuilder<>();
    }

    public StateMachineBuilder<State, Event> setInitialState(State initialState) {
        this.initialState = initialState;
        return this;
    }

    public StateMachineBuilder<State, Event> add(State originState, Event event, State targetState) {
        links.add(new Link<>(originState, targetState, event));
        return this;
    }

    public StateMachine<State, Event> build() {
//        HashMap<State, HashMap<State, Event>> map = new HashMap<>();
//        links.forEach(link -> {
//            map.computeIfAbsent(link.originState, map.put(link.originState, new HashMap<State, Event>()));
//
//        });
        // Todo : development in progress
        return new StateMachine<>(this);
    }

    public static class StateMachine<State, Event> {
        private StateMachineBuilder<State, Event> builder;
        private State currentState;

        private StateMachine(StateMachineBuilder<State, Event> builder) {
            this.builder = builder;
            this.currentState = builder.initialState;
        }

        public State currentState() {
            return currentState;
        }

        public List<Event> availableEvents() {
            return builder.links.stream().filter(link -> (link.getOriginState() == currentState)).map(Link::getEvent).
                    collect(Collectors.toList());
        }

        public void nextState(Event event) {
            Optional<State> newState = builder.links.stream().filter(link -> (link.getEvent() == event)).map(Link::getTargetState).findFirst();
            if (newState.isEmpty()) throw new IllegalStateException();
            currentState = newState.get();
        }

        public boolean isCompatible(Event event) {
            return availableEvents().contains(event);
        }
    }

    private static class Link<State, Event> {
        private State originState;
        private State targetState;
        private Event event;

        public Link(State originState, State targetState, Event event) {
            this.originState = originState;
            this.targetState = targetState;
            this.event = event;
        }

        public State getOriginState() {
            return originState;
        }

        public State getTargetState() {
            return targetState;
        }

        public Event getEvent() {
            return event;
        }
    }
}
