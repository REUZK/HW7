package de.uni.koeln.sse.se.t1;

public class CostVisitor implements Visitor {
    @Override
    public void visit(Electronic electronic) {
        double cost;
        if (electronic.getFragile()) {
            cost = (electronic.getWeight() / 10.0) * 5;

        } else {
            cost = (electronic.getWeight() / 15.0) * 5;

        }
        System.out.println("Total cost of " + electronic.getName() + " is " + cost + " Euros");
    }

    @Override
    public void visit(Furniture furniture) {
        double cost = (furniture.getWeight() / 20.0) * 5.0;
        System.out.println("Total cost of " + furniture.getName() + " is " + cost + " Euros");

    }

    @Override
    public void visit(Glass glass) {
        double cost;
        if (glass.getThickness() == 1) {
            cost = 2.0 * (glass.getLength() / 100.0);

        } else if (glass.getThickness() == 2) {
            cost = 1.2 * (glass.getLength() / 100.0);

        } else {
            cost = 0.7 * (glass.getLength() / 100.0);

        }
        System.out.println("Total cost of " + glass.getName() + " is " + cost + " Euros");

    }
}
