package lesson3;

public class Employees {
    private static String Surname;
        private String Name;
        private String FatherName;
        private String position;
        private String email;
        private String phone;
        private String salary;
        private int age;
public int getAge() {
    return age;
}
public Employees(String Surname, String Name, String FatherName, String position, String email, String phone, String salary, String Age)
    {
        this.Surname = Surname;
        this.Name = Name;
        this.FatherName = FatherName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        }
public void GetInfo () {
    System.out.println("Surname"+Surname+ "Name"+ Name+"FatherName"+FatherName+"Position"+position+"Email"+email+"Phone"+phone+"Salary"+salary+"Age"+age);
    }
}
