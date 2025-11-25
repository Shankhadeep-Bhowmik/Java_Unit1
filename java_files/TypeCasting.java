public class TypeCasting {
  public static void main(String[] args) {
    int num = 10;
    double d = num;
    System.out.println("Implicit casting: "+d);
    int val = (int)d;
    System.out.println("Explicit casting: "+val);
  }
}
