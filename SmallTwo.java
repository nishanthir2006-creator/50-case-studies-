class SmallTwo {
 public static void main(String[] args) {
  int[] a = {5, 2, 8, 1, 3};

  int s1 = a[0], s2 = a[1];

  for(int i=0; i<a.length; i++){
   if(a[i] < s1){
    s2 = s1;
    s1 = a[i];
   }
   else if(a[i] < s2 && a[i] != s1){
    s2 = a[i];
   }
  }

  System.out.println("Smallest = " + s1);
  System.out.println("Second Smallest = " + s2);
 }
}