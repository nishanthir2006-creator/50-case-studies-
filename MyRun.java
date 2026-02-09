class MyRun implements Runnable{
 public void run(){
  System.out.println("Runnable thread");
 }
 public static void main(String[] a){
  Thread t = new Thread(new MyRun());
  t.start();
 }
}