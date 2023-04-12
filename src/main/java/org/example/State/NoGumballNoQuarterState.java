package org.example.State;

import org.example.GumballMachine;

public class NoGumballNoQuarterState extends GumballMachineState{

    public NoGumballNoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void addGumballs(int count){
        gumballMachine.setNumGumballs(gumballMachine.getNumGumballs() + count);
        System.out.println("Added gumballs. Total: " + gumballMachine.getNumGumballs());
        gumballMachine.setState(new WithGumballNoQuarterState(gumballMachine));
    }
    public void insertQuarter(){
        gumballMachine.setQuarterInSlot(true);
        gumballMachine.setState(new NoGumballsWithQuarterState(gumballMachine));
        System.out.println("Added quarter.");
    }
    public void removeQuarter(){
        gumballMachine.setQuarterInSlot(false);
        System.out.println("No quarter anyways...");
    }
    public void turnHandle(){
        System.out.println("Turning handle...");
        System.out.println("Sorry. No money, no gumballs!");
        System.out.println("Total money in machine: $" + gumballMachine.getTotalMoney());
    }
}
