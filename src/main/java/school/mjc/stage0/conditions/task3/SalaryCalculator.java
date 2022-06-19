package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double finalSalary;
        if(salary > 0 && salary <= 10000) {
            finalSalary = salary * 0.85;
            System.out.println(finalSalary);
        } else if(salary > 10000 && salary <= 20000) {
            finalSalary = salary * 0.82;
            System.out.println(finalSalary);
        } else if(salary > 20000) {
            finalSalary = salary * 0.80;
            System.out.println(finalSalary);
        } else {
            System.out.println("wrong input!");
        }
    }
}

// Basic Salary <= 10000: taxes - 15%. done
// 10000 < Basic Salary <= 20000: taxes - 18% doen

// Basic Salary > 20000 : taxes - 20%
// Basic salary < 0 -> "wrong input!