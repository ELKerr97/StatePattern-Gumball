package org.example.State;

import org.example.GumballMachine;

public abstract class GumballMachineState{

    GumballMachine gumballMachine;

    public GumballMachineState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void addGumballs(int count){}
    public void insertQuarter(){}
    public void removeQuarter(){}
    public void turnHandle(){}
}
