public class Animal {
    String name;
    public Animal(String name){ this.name = name; }

    public void speak() {
        System.out.println(name + " makes a sound");
    }
}

class Cow extends Animal {
    public Cow(String name){ super(name); }

    @Override
    public void speak() {
        System.out.println(name + " says: Mooo!");
    }

    public void fetch() {
        System.out.println(name + " fetches the ball.");
    }
}

class Bird extends Animal {
    public Bird(String name){ super(name); }

    @Override
    public void speak() {
        System.out.println(name + " says: Cuittt -  cuitt!");
    }
}
