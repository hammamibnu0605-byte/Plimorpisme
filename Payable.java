public interface Payable {
    double pay();
}

class Employee implements Payable {
    double salary;

    public Employee(double salary){ this.salary = salary; }

    @Override
    public double pay() { return salary; }
}

class Contractor implements Payable {
    double rate;
    int hours;

    public Contractor(double rate, int hours){
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return rate * hours;
    }
}
