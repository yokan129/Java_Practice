public class ProfilePrint{
  byte age;
  String name;
  boolean isMarried;
  
  public static void main(String[]args){
    ProfilePrint pro=new ProfilePrint();
    byte age = 20;
    String name = "Min";
    boolean isMarried = false;
    
    pro.setAge(age);
    pro.setName(name);
    pro.setMarried(isMarried);
    System.out.println(pro.getAge());
    System.out.println(pro.getName());
    System.out.println(pro.getMarried());
  }
  public void setAge(byte paraAge){
    age = paraAge;
  }
  public byte getAge(){
    return age;
  }
  public void setName(String paraName){
    name = paraName;
  }
  public String getName(){
    return name;
  }
  public void setMarried(boolean flag){
    isMarried=flag;
  }
  public boolean getMarried(){
    return isMarried;
  }
}