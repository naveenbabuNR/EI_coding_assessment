# EI_CODING_ASSESSMENT (NAVEEN BABU N R)

# Exercise1

## *Behavioural pattern*

## Command pattern

***Command.java:***  Interface for commands.

***Light.java:***  Receiver class that performs the actions.

***LightOnCommand.java:***  Command to turn the light on.

***LightOffCommand.java:***  Command to turn the light off.

***RemoteControl.java:***  Invoker class that executes commands.

***CommandPatternDemo.java:***  Demonstrates using commands to control the light.

![image](https://github.com/user-attachments/assets/e56c3c09-21d3-430f-b9e8-045251e9808f)

## Observer pattern

***InteractiveTextEditor.java:*** 
               
                Implements an interactive text editor that checks for misspelled words and provides suggestions using the Observer pattern, with ImprovedSpellChecker providing spelling suggestions.
                
![image](https://github.com/user-attachments/assets/77660488-9bd3-4145-ac67-387761ec58d4)

## *Creational pattern*

## Factory pattern

***Notification.java:***  Interface for notifications.

***EmailNotification.java:***  Concrete class for email notifications.

***SMSNotification.java:***  Concrete class for SMS notifications.

***NotificationFactory.java:***  Abstract factory that provides the factory method.

***FactoryMethodPatternDemo.java:***  Demonstrates creating different types of notifications using the factory method.

![image](https://github.com/user-attachments/assets/338dc5db-1c30-414a-a520-25bec8a6ff85)

## Singleton pattern

***Singleton.java:***  Implements the singleton design to ensure a single instance.

***SingletonPatternDemo.java:***  Demonstrates accessing the single instance of Singleton.

![image](https://github.com/user-attachments/assets/0115975b-6191-4c30-9c72-f3c00a84c09a)


## *Structural pattern*

## Adaptor pattern

***Shape.java:***  Interface for shapes.

***Rectangle.java:***  Implements Shape but has its own API.

***RectangleAdapter.java:***  Adapts Rectangle to the Shape interface.

***SimpleAdapterPatternDemo.java:***  Demonstrates using the adapter to work with a rectangle as a shape.

![image](https://github.com/user-attachments/assets/c532a6d7-fbfd-4ef1-9f6e-91697d4c5173)

## Decorator pattern

***Coffee.java:***  Defines the Coffee interface with methods for description and cost.

***CoffeeDecorator.java:***  Abstract decorator class that extends Coffee and holds a reference to a Coffee object.

***MilkDecorator.java:***  Concrete decorator that adds milk to the coffee.

***SugarDecorator.java:***  Concrete decorator that adds sugar to the coffee.

***DecoratorPatternDemo.java:***  Demonstrates adding milk and sugar to a basic coffee object using decorators.

![image](https://github.com/user-attachments/assets/6e0a6cd1-c4aa-41eb-abae-3fa9f85af121)

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


![image](https://github.com/user-attachments/assets/bafccd7b-027f-4d30-a2ff-a19473a0bf2c)



*Remove Task:*  Enter the description of the task to remove.


![image](https://github.com/user-attachments/assets/650fe2c6-8471-4985-ac95-8ca774bc832b)



*View Tasks:*  Displays all tasks sorted by start time.


![image](https://github.com/user-attachments/assets/922763de-4df6-4bec-8aef-60a2d6135624)



*Exit:*  Terminates the application.


![image](https://github.com/user-attachments/assets/ce9f3f05-c8da-4b06-af80-cb619cce5b32)


