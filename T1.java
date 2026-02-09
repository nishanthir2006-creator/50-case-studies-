class T1 extends Thread{
 public void run(){ System.out.println("Task 1"); }
}
class T2 extends Thread{
 public void run(){ System.out.println("Task 2"); }
}
class MultiThread{
 public static void main(String[] a){
  new T1().start();
  new T2().start();
 }
}