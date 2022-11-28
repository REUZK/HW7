package de.uni.koeln.sse.se.t2;

public interface Visitor {

    void visit(Leaf leaf);

    void visit(Composite composite);
}
