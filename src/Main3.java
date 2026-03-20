public class Main3 {
    public static void main(String[] args) {
        HourlyEmployee max = new HourlyEmployee("Max", "22/02/2012", "2423223", 10);

        System.out.println(max.getDoublePay());

        HourlyEmployee tim = new HourlyEmployee("Tim", "11/11/1982", "2222" , 5);

//        System.out.println(tim);
//        System.out.println(tim.getAge());
//        System.out.println(tim.collectPay());

        System.out.println(tim.getDoublePay());

    }
}

class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker() {

    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0;
    }

    private void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

class Employee extends Worker{
    private long employeeId;
    private String hiredDate;

    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hiredDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hiredDate = hiredDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hiredDate='" + hiredDate + '\'' +
                "} " + super.toString();
    }
}


class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    HourlyEmployee(String name, String birthDate, String hiredDate, double hourlyPayRate) {
        super(name, birthDate, hiredDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
    return hourlyPayRate * 40;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }

}