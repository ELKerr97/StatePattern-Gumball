package org.example.State;

import org.example.GumballMachine;

public class WithGumballNoQuarterState extends GumballMachineState{
    public WithGumballNoQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void addGumballs(int count){
        gumballMachine.setNumGumballs(gumballMachine.getNumGumballs() + count);
        System.out.println("Added gumballs. Total: " + gumballMachine.getNumGumballs());
    }
    public void insertQuarter(){
        gumballMachine.setQuarterInSlot(true);
        gumballMachine.setState(new WithGumballsWithQuarterState(gumballMachine));
        System.out.println("Added quarter to machine.");
    }
    public void removeQuarter(){
        gumballMachine.setQuarterInSlot(false);
        System.out.println("Removed quarter.");
    }
    public void turnHandle(){
        System.out.println("Turning handle...");
        System.out.println("No quarter provided. Please enter a quarter.");
        System.out.println("Total money in machine: $" + gumballMachine.getTotalMoney());
    }
}
