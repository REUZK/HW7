package de.uni.koeln.sse.se.t1;

public class PackagingVisitor implements Visitor {


    @Override
    public void visit(Furniture furniture) {
        System.out.println(furniture.getName() + "should be covered with waterproof covers with area of: " + furniture.getWidth() + "x" + furniture.getLength());
    }

    @Override
    public void visit(Electronic electronic) {
        System.out.println(electronic.getName() + " " + "should be covered with polyethylene foam film and packed in a box with dimension: "
                + electronic.getWidth() + "x" + electronic.getLength() + "x" + electronic.getHeight());
    }

    @Override
    public void visit(Glass glass) {
        System.out.println(glass.getName() + " "
                + "should be wrapped with bubble wraps and packed in a box with dimension: "
                + glass.getWidth() + 1 + "x" + glass.getLength() + 1 + "x" + glass.getHeight() + 1);
    }


}
