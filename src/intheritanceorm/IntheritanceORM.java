package intheritanceorm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IntheritanceORM {

    public static void main(String[] args) {
        FulltimeEmployee emp1 = new FulltimeEmployee();
        ParttimeEmployee emp2 = new ParttimeEmployee();
        
        EmployeeTable.insertEmployee(emp1);
        emp1.setName("Supawich");
        emp1.setSalary(9999);
        emp2.setName("Sukkanta");
        emp2.setHoursWork(1);
        
        EmployeeTable.updateFullTimeEmployee(emp1);
        emp1.setName("Supawich");
        emp1.setSalary(999999);
        
        EmployeeTable.updatePartTimeEmployee(emp2);
        emp2.setName("Sukkanta");
        emp2.setHoursWork(2);
        
        EmployeeTable.deleteFullTimeEmployee(emp1);
        EmployeeTable.deletePartTimeEmployee(emp2);
    }
    
}
