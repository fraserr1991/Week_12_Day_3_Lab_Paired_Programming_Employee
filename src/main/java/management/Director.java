package management;

public class Director extends Manager {
    private Double budget;
    public Director(String name, String NI, Double salary, String deptName, Double budget){
        super(name, NI, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget(){
        return this.budget;
    }

    @Override
    public Double payBonus(){
        return getSalary() * 0.02;
    }

}
