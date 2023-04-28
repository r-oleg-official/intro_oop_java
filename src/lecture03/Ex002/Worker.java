package lecture03.Ex002;

import java.util.Iterator;

public class Worker implements Iterator<String> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
//                return firstName;
                return String.format("firstName: %s", firstName);
            case 2:
//                return lastName;
                return String.format("lastName: %s", lastName);
            case 3:
//                return age;
                return String.format("age: %s", age);
            case 4:
//                return salary;
                return String.format("salary: %s", salary);
        }
        return null;
    }
}
