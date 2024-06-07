/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capstone.pkgcase.study;

/**
 *
 * @author martinho.mussamba
 */
public class Department {
    
    public String name;
    private Employee employees [];
    private Integer capacity;
    private Integer couter = 0;
    
    Department(String name, Integer capacity) {
        this.name = name;
        this.employees = new Employee[capacity];
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String Employees(){ 
        return "";
    }
   
    public void addEmployee(Employee employee) {
        if (this.couter < capacity  ) {
            this.employees[this.couter] = employee;
            this.couter++;
        } else {
            System.out.println("Exceded capacity of employees");
        }
    }
    
    public Employee[] getEmployees(){
        Integer counter = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                counter ++;
            }
        }
       Employee filteredEmployees [] = new Employee[counter];
       counter = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                filteredEmployees[counter] = employee;
                counter ++;
            }
        }
 
        return filteredEmployees;
    }
  
    public Integer numberOfEmployees() {
        return this.getEmployees().length;

    }

    public Employee getEmployeeIdentity(Integer id) {
        for (Employee employee : this.employees) {
            if (employee != null) {
                if (id == employee.id) {
                    return employee;    
                }
            }
        }
        
        return null;
    }
    
    public double totalSalary() {
        double total = 0.0;
        for (Employee employee : this.getEmployees()) {
              total += employee.salary;
        }
        
        return total;
    }
    
   public double avarageSalary() {
        return this.totalSalary()/this.numberOfEmployees();
    }

    @Override
    public String toString() {
        String department = "Department: " + this.name + "\n";
        String employees = "";
        String totalSalary = "Total Salary: "+this.totalSalary() + "\n";
        String averageSalary = "Average Salary: "+this.avarageSalary()+ "\n";
        for(Employee employee : getEmployees()) {
            
            employees +="Employee: "+ employee.toString() + "\n";
        }
        return department + employees + totalSalary + averageSalary;
    }
   
   
}
