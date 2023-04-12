package org.example.State;

import org.example.GumballMachine;

public class WithGumballsWithQuarterState extends GumballMachineState{

    public WithGumballsWithQuarterState(GumballMachine gumballMachine) {
        super(gumballMachine);
    }

    public void addGumballs(int count){
        gumballMachine.setNumGumballs(gumballMachine.getNumGumballs() + count);
        System.out.println("Added gumballs. Total: " + gumballMachine.getNumGumballs());
    }
    public void insertQuarter(){
        gumballMachine.setQuarterInSlot(true);
        System.out.println("Only one quarter at a time.");
    }
    public void removeQuarter(){
        gumballMachine.setQuarterInSlot(false);
    }
    public void turnHandle(){
        System.out.println("Turning handle...");
        gumballMachine.setTotalMoney(gumballMachine.getTotalMoney() + 0.25);
        gumballMachine.setNumGumballs(gumballMachine.getNumGumballs() - 1);
        System.out.println("Yay! A gumball!");
        if (gumballMachine.getNumGumballs() <= 0){
            System.out.println("No more gumballs!");
            gumballMachine.setState(new NoGumballNoQuarterState(gumballMachine));
        } else {
            System.out.println("Gumballs in machine: " + gumballMachine.getNumGumballs());
            gumballMachine.setState(new WithGumballNoQuarterState(gumballMachine));
        }
        System.out.println("Total money in machine: $" + gumballMachine.getTotalMoney());
    }
}
