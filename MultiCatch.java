class MultiCatch{
 public static void main(String[] a){
  try{
   int[] x = new int[3];
   x[5] = 10;
  }catch(ArithmeticException e){
   System.out.println("Math error");
  }catch(ArrayIndexOutOfBoundsException e){
   System.out.println("Array error");
  }
 }
}