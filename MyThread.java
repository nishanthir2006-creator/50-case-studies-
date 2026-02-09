class MyThread extends Thread{
 public void run(){
  System.out.println("Thread running");
 }
 public static void main(String[] a){
  new MyThread().start();
 }
}