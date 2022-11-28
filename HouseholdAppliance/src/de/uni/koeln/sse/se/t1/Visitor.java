package de.uni.koeln.sse.se.t1;

public interface Visitor {

    void visit(Electronic electronic);

    void visit(Furniture furniture);

    void visit(Glass glass);
}
