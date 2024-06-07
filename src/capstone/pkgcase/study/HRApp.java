/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capstone.pkgcase.study;

/**
 *
 * @author martinho.mussamba
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HrApp starts!");
        
        Employee employee1 = new Employee(1, "Martinho Mussamba", 2000.0);
        Employee employee2 = new Employee(2, "Dev Martin", 3000.0);
        Employee employee3 = new Employee(1, "Mamadou Mutxeba", 4000.0);
        
        Employee employees[] = {employee1, employee2, employee3};
        Department department = new Department("Software Enginner", 5 );
        
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(employee3);
         
        
        Integer capacity =  department.numberOfEmployees();

        Employee [] dpEmployee = department.getEmployees();
  
      /*  for(Integer i=0; i < dpEmployee.length; i++) {
            System.out.println("Employee "+ i + " " + dpEmployee[i]);
        }*/
        
        System.out.println(department);
        
    }
    
}
