package de.uni.koeln.sse.se.t2;

public class Leaf extends Node implements OlympicComponent{

    public Leaf(String name, int athletes, int goldMedals) {
        this.name = name;
        this.athletes = athletes;
        this.goldMedals = goldMedals;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
