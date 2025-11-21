public abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    double r;

    public Circle(double r){ this.r = r; }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {
    double w, h;

    public Rectangle(double w, double h){
        this.w = w;
        this.h = h;
    }

    @Override
    public double area() {
        return w * h;
    }
}
