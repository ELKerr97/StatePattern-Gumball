package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting gumball machine...");
        GumballMachine gumballMachine = new GumballMachine();

        gumballMachine.addGumballs(30);
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();

        gumballMachine.turnHandle();
        gumballMachine.turnHandle();
        gumballMachine.turnHandle();

        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();

        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();
        gumballMachine.insertQuarter();
        gumballMachine.turnHandle();

    }
}