package Abstract_Interface;

interface IShape {

    // default method in interface
    default void msg() {
        System.out.println("Default Method");
    }

    void draw();

    // Static method in interface
    static int cube(int x) {
        return x*x*x;
    }

    void getArea();
}

class Rectangle implements IShape {

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }

    @Override
    public void getArea() {
        System.out.println("get Area");
    }
}

class Main {
    public static void main(String[] args) {
        IShape iShape = new Rectangle();
        iShape.draw();
        iShape.msg();
        iShape.getArea();
        System.out.println(IShape.cube(4));
    }
}


