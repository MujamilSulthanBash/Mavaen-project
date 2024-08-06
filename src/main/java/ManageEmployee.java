import java.util.Scanner;

import com.i2it.ems.department.controller.DepartmentController;
import com.i2it.ems.employee.controller.EmployeeController;
import com.i2it.ems.project.controller.ProjectController;

/**
 * <p>
 * This is responsible for manage the employee related data.
 * </p>
 */
public class ManageEmployee {

    EmployeeController employeeController = new EmployeeController();
    DepartmentController departmentController = new DepartmentController();
    ProjectController projectController = new ProjectController();
    Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        ManageEmployee manageEmployee = new ManageEmployee();
        manageEmployee.displayChoice();
    }

    /**
     * <p>
     * This is responsible for manage the employee related data based on user choice.
     * </p>
     */
    public void displayChoice() {
        boolean repeat = true;
        while (repeat) {
            System.out.println("Select the choice");
            System.out.println("1 ==> Employee page");
            System.out.println("2 ==> Department page");
            System.out.println("3 ==> Project page");
            System.out.println("4 ==> Exit");
            switch (scanner.nextInt()) {
                case 1:
                    employeeController.displayChoice();
                    break;
                case 2:
                    departmentController.displayChoice();
                    break;
                case 3:
                    projectController.displayChoice();
                    break;
                case 4:
                    repeat = false;
            }
        }
    }

}