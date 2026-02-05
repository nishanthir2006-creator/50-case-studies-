class SumAvg {
 public static void main(String[] args) {
  int[] a = {10,20,30,40};
  int sum = 0;

  for(int i=0; i<a.length; i++)
   sum = sum + a[i];

  float avg = sum / (float)a.length;

  System.out.println("Sum = " + sum);
  System.out.println("Average = " + avg);
 }
}