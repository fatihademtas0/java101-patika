package Classes.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0;

        if (this.salary >= 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    int bonus() {
        int bonus = 0;
        if (this.workHours >= 40) {
            int bonusHour = this.workHours;
            bonusHour -= 40;
            bonus = bonusHour * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        double raise = 0;
        int workedYears = 0;
        int year = 2021;

        workedYears = year - this.hireYear;

        if (workedYears < 10) {
            raise = this.salary * 0.05;
        } else if (workedYears >= 10 && workedYears < 20) {
            raise = this.salary * 0.1;
        } else if (workedYears >= 20) {
            raise = this.salary * 0.15;
        }
        return raise;
    }

    public  String toString() {
        return String.format("Name : %-5s | Salary : %-5f | Work Hours : %-1d | Hire Years : %-5d |",
                this.name, this.salary, this.workHours, this.hireYear);
    }
}
