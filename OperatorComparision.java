public class OperatorComparision{
  public static void main(String args[]){
    OperatorComparision sample=new OperatorComparision();
    sample.comparision();
  }
  public void comparision(){
    boolean boolValue1=false;
    boolean boolValue2=true;
    boolean boolValue3=false;
    System.out.println(boolValue1==boolValue2);
    System.out.println(boolValue1==boolValue3);
    System.out.println(boolValue1!=boolValue2);
    System.out.println(boolValue1!=boolValue3);
  }
}