public class OperatorTilde{
  public static void main(String args[]){
    OperatorTilde sample=new OperatorTilde();
    byte b = 127;
    sample.tilde(b);
    b = 1;
    sample.tilde(b);
  }
  public void tilde(byte b){
    System.out.println("Original value="+b);
    System.out.println("Tilde Value    +"+~b);
  }
}
    