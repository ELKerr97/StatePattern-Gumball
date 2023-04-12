package org.example;

import org.example.State.GumballMachineState;
import org.example.State.NoGumballNoQuarterState;

public class GumballMachine {

    double totalMoney;
    int numGumballs;
    boolean quarterInSlot;
    GumballMachineState state = new NoGumballNoQuarterState(this);

    void addGumballs(int count){
        state.addGumballs(count);
    }
    void insertQuarter(){
        state.insertQuarter();
    }
    void removeQuarter(){
        state.removeQuarter();
    }
    void turnHandle(){
        state.turnHandle();
    }
    public void setState(GumballMachineState newState){
        this.state = newState;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getNumGumballs() {
        return numGumballs;
    }

    public void setNumGumballs(int numGumballs) {
        this.numGumballs = numGumballs;
    }

    public boolean isQuarterInSlot() {
        return quarterInSlot;
    }

    public void setQuarterInSlot(boolean quarterInSlot) {
        this.quarterInSlot = quarterInSlot;
    }

    public GumballMachineState getState() {
        return state;
    }
}
