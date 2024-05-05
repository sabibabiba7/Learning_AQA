package lesson3;

public class EmployeesArray {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Petrov", "Petr", "Petrovich", "Teacher", "petr@mail.ru", "6547896", "50000", "40");
        employees[1] = new Employees("Petrov1", "Petr1", "Petrovich1", "Teacher1", "petr@mail.ru", "652365", "55000", "30");
        employees[2] = new Employees("Petrov2", "Petr2", "Petrovich2", "Teacher2", "petr@mail.ru", "987654321", "60000", "25");
        employees[3] = new Employees("Petrov3", "Petr3", "Petrovich3", "Teacher3", "petr@mail.ru", "9876666", "65000", "55");
        employees[4] = new Employees("Petrov4", "Petr4", "Petrovich4", "Teacher5", "petr@mail.ru", "98788888", "70000", "45");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge()>40) {
                employees[i].GetInfo();
            }
            }
        }
    }

