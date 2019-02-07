package employeeRecords;

public class EmployeeRecords implements Employee {

    @Override
    public String empId(String number) {
        return number;
    }

    @Override
    public String empName(String name) {
        return name;
    }

    @Override
    public String empDepartment(String department) {
        return department;
    }

    @Override
    public String day(String empday) {
        return empday;
    }

    @Override
    public String workedHours(String empHours) {
        return empHours;
    }

    @Override
    public String setHours(String emptime) {
        return emptime;
    }

    @Override
    public String empLogin(String empEntry) {
        return empEntry;
    }

    @Override
    public String empLogout(String empExit) {
        return empExit;
    }
}


