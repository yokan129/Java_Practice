public class Profile{
  String name;
  int age;
  public static void main(String[] args){
    Profile pro = new Profile();
    pro.setName("Min");
    pro.setAge(20);
    pro.printName();
    pro.printAge();
  }
  public void setName(String str){
    name = str;
  }
  public void setAge(int val){
    age = val;
  }
  public void printName(){
    System.out.println("My name is "+name);
  }
  public void printAge() {
    System.out.println("My age is "+age);
  }
}