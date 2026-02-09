class polymorphism{
 void show(){ System.out.println("Base"); }
}
class B extends A{
 void show(){ System.out.println("Child"); }
 public static void main(String[] a){
  A obj = new B();
  obj.show();
 }
}