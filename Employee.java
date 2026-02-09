class Employee{
 void work(){ System.out.println("Employee working"); }
}
class Manager extends Employee{
 public static void main(String[] a){
  new Manager().work();
 }
}