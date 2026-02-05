class Power {
 public static void main(String[] args) {
  int n = 2, p = 3;
  int result = 1;

  for(int i=1; i<=p; i++)
   result = result * n;

  System.out.println(result);
 }
}