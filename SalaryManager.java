public class SalaryManager{
  public static void main(String args[]){
    SalaryManager manager=new SalaryManager();
    System.out.println("Real monthlySalary:"+manager.getMonthlySalary(20000000));
  }
  public double getMonthlySalary(int yearlySalary){
     double monthSalary=yearlySalary/12.0;
     System.out.println("Monthly salary original:"+monthSalary);
     
     double tax=calculateTax(monthSalary);
     double nationalPension=calculateNationalPension(monthSalary);
     double healthInsurance=calculateHealthInsurance(monthSalary);
     double minusTotal=tax+nationalPension+healthInsurance;
     
     System.out.println("Tax per month"+tax);
     System.out.println("NationalPension per month"+nationalPension);
     System.out.println("HealthInsurance per month"+healthInsurance);
     
     monthSalary-=minusTotal;
     
     return monthSalary;
  }
  public double calculateTax(double monthSalary){
    double tax=monthSalary*(12.5/100);
    return tax;
  }
  public double calculateNationalPension(double monthSalary){
    double nationalPension=monthSalary*(8.1/100);
    return nationalPension;
  }
  public double calculateHealthInsurance(double monthSalary){
    double healthInsurance=monthSalary*(13.5/100);
    return healthInsurance;
  }
}