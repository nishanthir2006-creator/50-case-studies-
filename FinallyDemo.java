class FinallyDemo{
 public static void main(String[] a){
  try{
   int x = 5/0;
  }catch(Exception e){
   System.out.println("Error occurred");
  }finally{
   System.out.println("Cleanup done");
  }
 }
}