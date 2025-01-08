public class Payroll {
    private String name;
    private int idNumber;
    private double payRate;
    private double hoursWorked;


    //constructor
    public Payroll(String n, int i) {
        name = n;
        idNumber = i;
    }

    //setters
    public void setName(String n) {
        name = n;
    }

    public void setIdNumber(int i) {
        idNumber = i;
    }

    public void setPayRate(double p) {
        payRate = p;
    }

    public void setHoursWorked(double h) {
        hoursWorked = h;
    }

    //getters (always return smth)
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getGrossPay() {
        return payRate * hoursWorked;
    }


}
