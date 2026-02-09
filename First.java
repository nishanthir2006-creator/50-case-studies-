class First extends Thread{
 public void run(){ System.out.println("First task"); }
}
class Second extends Thread{
 public void run(){ System.out.println("Second task"); }
}
class JoinDemo{
 public static void main(String[] a) throws Exception{
  First t1 = new First();
  Second t2 = new Second();

  t1.start();
  t1.join();   // waits for t1 to finish
  t2.start();
 }
}