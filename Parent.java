class Parent{
 void show(){ System.out.println("Parent"); }
}
class Child extends Parent{
 void show(){ System.out.println("Child"); }
 public static void main(String[] a){
  new Child().show();
 }
}