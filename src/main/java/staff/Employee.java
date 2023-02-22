package staff;

public abstract class Employee {
    private String name;
    private String NI;
    private Double salary;

    public Employee(String name, String NI, Double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNI() {
        return this.NI;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void raiseSalary(Double valueToIncrease) {
        if (valueToIncrease > 0.0) {
            this.salary += valueToIncrease;
        }
    }

    public Double payBonus() {
        return this.salary * 0.01;
    }

    public void changeName(String name) {
        if(name != "" && name != null) {
            this.name = name;
        }
    }
}
