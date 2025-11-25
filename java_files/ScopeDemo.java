public class ScopeDemo {
  int instanceVar = 50;
  static int staticVar = 45;

  public void display(){
    int localVar = 100;
    System.out.println("Local Var: "+localVar);
    System.out.println("Instance Var: "+instanceVar);
    System.out.println("Static Var: "+staticVar);
  }
  public static void main(String[] args) {
    ScopeDemo scopeDemo = new ScopeDemo();
    scopeDemo.display();
  }
}
