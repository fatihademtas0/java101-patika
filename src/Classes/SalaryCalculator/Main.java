package Classes.SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Fatih Tas",1000,45,2000);
        Employee emp2 = new Employee("Esra Akaydın",2500,50,2015);

        emp1.salary += (emp1.bonus() + emp1.raiseSalary()) - emp1.tax();
        emp2.salary += (emp2.bonus() + emp2.raiseSalary()) - emp2.tax();


        System.out.println(emp1.name+"'s salary is : "+ emp1.salary);
        System.out.println(emp2.name+"'s salary is : "+ emp2.salary);
    }
}
