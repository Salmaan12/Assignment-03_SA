public class MVCPatternDemo {
    public static void main(String[] args) {

        Employee employeeModel = retriveEmployeeFromDatabase();

        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);

        employeeModel.setFirstName("Hammad Malick");
        employeeModel.setSalary((float) 3000.00);
        employeeController.updateView();


    }

        private static Employee retriveEmployeeFromDatabase(){
            Employee employee = new Employee();
            employee.setEmployeeID(001);
            employee.setFirstName("Hafiz Salman");
            employee.setLastName("Mohammad Rafiq");
            employee.setGender("Male");
            employee.setHiredDate("15/December/2020");
            employee.setSalary((float) 17000.00);
            return employee;
        }
}
