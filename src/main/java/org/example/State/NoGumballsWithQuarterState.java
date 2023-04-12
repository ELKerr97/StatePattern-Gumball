package org.example.State;

import org.example.GumballMachine;

public class NoGumballsWithQuarterState extends GumballMachineState implements GumballMachineStateInterface{

    public NoGumballsWithQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void addGumballs(int count){
        gumballMachine.setNumGumballs(gumballMachine.getNumGumballs() + count);
        System.out.println("Added gumballs. Total: " + gumballMachine.getNumGumballs());
        gumballMachine.setState(new WithGumballsWithQuarterState(gumballMachine));
    }
    public void insertQuarter(){
        gumballMachine.setQuarterInSlot(true);
        System.out.println("Thanks for the extra money!");
    }
    public void removeQuarter(){
        gumballMachine.setQuarterInSlot(false);
        gumballMachine.setState(new NoGumballNoQuarterState(gumballMachine));
    }
    public void turnHandle(){
        System.out.println("Turning handle...");
        System.out.println("Sorry, no gumballs. But thanks for your money!");
        gumballMachine.setTotalMoney(gumballMachine.getTotalMoney() + 0.25);
        System.out.println("Total money in machine: $" + gumballMachine.getTotalMoney());
    }
}
