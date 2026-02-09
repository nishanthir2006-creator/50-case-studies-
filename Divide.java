class Divide{
 public static void main(String[] a){
  try{
   int x = 10/0;
  }catch(ArithmeticException e){
   System.out.println("Cannot divide by zero");
  }
 }
}