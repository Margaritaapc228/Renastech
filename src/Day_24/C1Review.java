package Day_24;

public class C1Review {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom",(byte)25, 65000, "NYC");
        Employee e2 = new Employee("Jerry", (byte)23, 60000, "Austin");
        e2.raiseSalary(1.2);

        System.out.println(("NAME:"+e1.getName()+ "\nAGE:"+e1.getAge()+"\nSALARY:"+ e1.getSalary()+"\nLOCATION:"+e1.getLocation()));
        System.out.println(("NAME:"+e2.getName()+ "\nAGE:"+e2.getAge()+"\nSALARY:"+ e2.getSalary()+"\nLOCATION:"+e2.getLocation()));

    }
}

class Employee {
    String name;
    byte age;
    double Salary;
    String location;

    public Employee(String name, byte age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.Salary = salary;
        this.location = location;
    }

    void raiseSalary(double raise_percent) {
        this.Salary = this.Salary + (raise_percent / 100 * this.Salary);
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public double getSalary() {
        return Salary;
    }

    public String getLocation() {
        return location;
    }
}