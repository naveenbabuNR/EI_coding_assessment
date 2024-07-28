
# Exercise1

## *Behavioural pattern*

## Command pattern

***Command.java:***  Interface for commands.

***Light.java:***  Receiver class that performs the actions.

***LightOnCommand.java:***  Command to turn the light on.

***LightOffCommand.java:***  Command to turn the light off.

***RemoteControl.java:***  Invoker class that executes commands.

***CommandPatternDemo.java:***  Demonstrates using commands to control the light.

## Observer pattern

***InteractiveTextEditor.java:*** 
               
                Implements an interactive text editor that checks for misspelled words and provides suggestions using the Observer pattern, with ImprovedSpellChecker providing spelling suggestions.

## *Creational pattern*

## Factory pattern

***Notification.java:***  Interface for notifications.

***EmailNotification.java:***  Concrete class for email notifications.

***SMSNotification.java:***  Concrete class for SMS notifications.

***NotificationFactory.java:***  Abstract factory that provides the factory method.

***FactoryMethodPatternDemo.java:***  Demonstrates creating different types of notifications using the factory method.

## Singleton pattern

***Singleton.java:***  Implements the singleton design to ensure a single instance.

***SingletonPatternDemo.java:***  Demonstrates accessing the single instance of Singleton.

## *Structural pattern*

## Adaptor pattern

***Shape.java:***  Interface for shapes.

***Rectangle.java:***  Implements Shape but has its own API.

***RectangleAdapter.java:***  Adapts Rectangle to the Shape interface.

***SimpleAdapterPatternDemo.java:***  Demonstrates using the adapter to work with a rectangle as a shape.

## Decorator pattern

***Coffee.java:***  Defines the Coffee interface with methods for description and cost.

***CoffeeDecorator.java:***  Abstract decorator class that extends Coffee and holds a reference to a Coffee object.

***MilkDecorator.java:***  Concrete decorator that adds milk to the coffee.

***SugarDecorator.java:***  Concrete decorator that adds sugar to the coffee.

***DecoratorPatternDemo.java:***  Demonstrates adding milk and sugar to a basic coffee object using decorators.


# Exercise2




# Astronaut Scheduler

A console-based Java application designed to help astronauts manage their daily schedules. Users can add, remove, and view tasks, ensuring no time conflicts.




## Features

Add a new task with a description, start time, end time, and priority level.

Remove an existing task by its description.

View all tasks sorted by start time.

Ensure that new tasks do not overlap with existing tasks.


## Design Patterns Used

*Singleton Pattern:* Ensures only one instance of the ScheduleManager.

*Factory Pattern:* Provides a factory method for creating Task objects.

*Observer Pattern:* Notifies users of task conflicts.
## Classes

*AstronautScheduler:*  Main class that runs the application and handles user input.

*Task:*  Represents a task with attributes such as description, start time, end time, and priority.

*ScheduleManager:*  Manages the list of tasks, ensuring no overlaps and maintaining order.

*TaskFactory:*  Provides a way to create Task objects.

*Observer:*  Defines the observer interface.

*TaskObserver:*  Abstract class implementing the Observer interface.

*TaskConflictObserver:*  Concrete observer class for handling task conflict notifications.


## Usage

*Add Task:*  Follow the prompts to enter the task description, start time, end time, and priority.

*Remove Task:*  Enter the description of the task to remove.

*View Tasks:*  Displays all tasks sorted by start time.

*Exit:*  Terminates the application.
