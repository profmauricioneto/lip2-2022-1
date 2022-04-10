/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite.UniversityDepartments;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author maumneto
 */
public class HeadDepartment implements Department {
    public int id;
    public String name;
    public List<Department> departments;
    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        departments = new ArrayList<>();
    }
    public void addDepartment(Department d) {
        departments.add(d);
    }
    public void removeDepartment(Department d) {
        departments.remove(d);
    }
    @Override
    public void printDepartmentName() {
        departments.forEach(Department::printDepartmentName);
    }    
}
