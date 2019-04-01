public class InterestManager{
  
  public static void main(String[] args){
    InterestManager manager=new InterestManager();
    for(int day=1;day<=365;day++){
      double amount=manager.calculateAmount(day,1000000);
      if(day%10==0) System.out.println(day+":"+amount+" ");
      if(day==365) System.out.println(day+":"+amount+" ");  
    }
  }
  public double getInterestRate(int day){
    double interest;
    
    if(1<day && day<=90){
      interest=0.5;
    } else if(91<day && day <=180){
      interest=1.0;
    } else if(180<day && day <= 364){
      interest=2.0;
    } else{
      interest=5.6;
    }
    return interest;
  }
  
  public double calculateAmount(int day, long amount){
    double interest =getInterestRate(day);
    double interestAmount = amount * interest/100.0;
    double totalAmount = amount+interestAmount;
    return totalAmount;
  }
}