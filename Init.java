class Init{
 Init(){ System.out.println("No args"); }
 Init(int x){ System.out.println(x); }
 public static void main(String[]a){
  new Init(); new Init(10);
 }
}