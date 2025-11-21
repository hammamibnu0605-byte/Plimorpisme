import java.util.*;

public class Polymorphism {
    public static void main(String[] args) {

        // ===== LATIHAN 1 =====
        System.out.println("LATIHAN 1");
        List<Animal> zoo = Arrays.asList(
            new Cow("Buddy"),
            new Bird("Koko"),
            new Cow("Rex")
        );

        for (Animal a : zoo) {
            a.speak();
        }

        System.out.println("\nCasting:");
        Animal a = zoo.get(0);
        if (a instanceof Cow) {
            ((Cow) a).fetch();
        }


        // ===== LATIHAN 2 =====
        System.out.println("\nLATIHAN 2");
        List<Shape> shapes = List.of(
            new Circle(3),
            new Rectangle(4, 5)
        );

        double total = 0;
        for (Shape s : shapes) {
            total += s.area();
        }
        System.out.println("Total area = " + total);


        // ===== LATIHAN 3 =====
        System.out.println("\nLATIHAN 3");
        List<Payable> payroll = List.of(
            new Employee(5000),
            new Contractor(100, 40)
        );

        double totalPay = 0;
        for (Payable p : payroll) {
            totalPay += p.pay();
        }
        System.out.println("Total payroll = " + totalPay);
    }
}
