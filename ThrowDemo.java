class ThrowDemo{
 public static void main(String[] a){
  int n = -5;
  if(n < 0)
   throw new ArithmeticException("Negative number");
 }
}