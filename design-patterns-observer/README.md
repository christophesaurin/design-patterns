# design-patterns observer

1. Standard Observer 
2. Observer with an ObserverManager
3. Example in a game

## Standard Observer

### UML Diagram
![alt text](images/observer.png "Design Pattern Observer")

### Class Observer
```java
public interface Observer {
	void notifyObserver();
}
```

### Class Subject
```java
public class Subject {
	private List<Observer> observers = new ArrayList<>();

	public void addObserver(final Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(final Observer observer) {
		observers.remove(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.notifyObserver();
		}
	}

	public void compute() {
		System.out.println("Start compute");
		notifyAllObservers();
		System.out.println("End compute");
	}
}
```

### class ConcreteObserver1 and ConcreteObserver2
```java
public class ConcreteObserver1 implements Observer {
	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver1 is notified !");
	}
}

public class ConcreteObserver2 implements Observer {
	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver1 is notified !");
	}
}
```

## Observer with an ObserverManager

## UML Diagram
![alt text](images/observerManager.png "Design Pattern Observer")

### class Observer
No change

### class Subject
Delete all design pattern methods
Use the ObserverManager

```java
public class Subject {
	public void compute() {
		System.out.println("Start compute");
		ObserverManager.notifyAllObservers();
		System.out.println("End compute");
	}
}
```

### class ObserverManager
Move all design patterns methods of Subject in the ObserverManager
Rename method "addObserver" to "register"
Rename method "removeObserver" to "unregister"

```java
public class ObserverManager {
	private static List<Observer> observers = new ArrayList<>();

	private ObserverManager() {
	}

	public static void register(final Observer observer) {
		observers.add(monsterObserver);
	}

	public static void unregister(final Observer observer) {
		observers.remove(monsterObserver);
	}

	public static void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.notifyObserver();
		}
	}
}
```

### class ConcreteObserver
Call register in the constructor

```java
public class ConcreteObserver1 implements Observer {
	public ConcreteObserver1() {
		ObserverManager.register(this);
	}

	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver1 is notified !");
	}
}

public class ConcreteObserver2 implements Observer {
	public ConcreteObserver2() {
		ObserverManager.register(this);
	}

	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver2 is notified !");
	}
}
```

## Code PlantUml

### Standard Observer
```
@startuml

title Observer/Observable Design Patterns

interface Observer {
    void notify()
}

class Subject {
    List<Observer> observers
    public void addObserver(Observer observer)
    public void removeObserver(Observer observer)
    public void notifyAllObservers()
}
note left
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.notify();
        }
    }
end note

Subject o- Observer

class ConcreteObserver1 extends Observer {
    @Override public void notify()
}

class ConcreteObserver2 extends Observer {
    @Override public void notify()
}

@enduml
```

### Observer with an ObserverManager
```
@startuml

title Observer/Observable Design Patterns

interface Observer {
    void notify()
}

class ObserverManager {
    List<Observer> observers
    public void register(Observer observer)
    public void unregister(Observer observer)
    public void notifyAllObservers()
}
note left
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.notify();
        }
    }
end note
ObserverManager o- Observer

class Subject {
}
Subject -down-> ObserverManager : notifyAllObservers

class ConcreteObserver1 extends Observer {
    @Override public void notify()
}
ConcreteObserver1 -> ObserverManager : register

class ConcreteObserver2 extends Observer {
    @Override public void notify()
}
ConcreteObserver2 -> ObserverManager : register

@enduml
```