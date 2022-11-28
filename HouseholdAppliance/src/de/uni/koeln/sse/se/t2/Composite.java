package de.uni.koeln.sse.se.t2;

import java.util.HashSet;

public class Composite extends Node implements OlympicComponent {

    HashSet<OlympicComponent> nodes = new HashSet<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(OlympicComponent olympicComponent) {
        nodes.add(olympicComponent);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
