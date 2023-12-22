package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Иван", "Иванов");
        Employee employee1 = new Employee("Семён", "Семёнов");
        Employee employee2 = new Employee("Владимир", "Владимиров");
        Employee employee3 = new Employee("Сидор", "Сидоров");
        Employee employee4 = new Employee("Гавриил", "Гаврилов");

        Map<Integer, Employee> Fio = new HashMap<>(Map.of(employee.hashCode(), employee,
                employee1.hashCode(), employee1,
                employee2.hashCode(), employee2,
                employee3.hashCode(), employee3,
                employee4.hashCode(), employee4));

        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl(Fio);

        if (employeeServiceImpl.seachEmployee(employee3)) {
            System.out.println("Сотрудник найден");
        } else {
            System.out.println("Сотрудник не найден");
        }

        employeeServiceImpl.removeEmployee(employee);
        System.out.println(Fio.toString());

        System.out.println("--------------");
        employeeServiceImpl.addEmployee(employee);
        System.out.println(Fio.toString());


    }
}