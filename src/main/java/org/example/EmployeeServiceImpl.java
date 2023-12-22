package org.example;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {

    private Map<Integer, Employee> Fio = new HashMap<>();

    public EmployeeServiceImpl(Map<Integer, Employee> fio) {
        Fio = fio;
    }

    @Override
    public void addEmployee(Employee employee) {
        Fio.put(employee.hashCode(), employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        Fio.remove(employee.hashCode(), employee);
    }

    @Override
    public boolean seachEmployee(Employee employeу) {
        return Fio.containsValue(employeу);


    }
}
