class RemoveDuplicate {
 public static void main(String[] args) {
  int[] a = {1,2,2,3,4,4,5};

  for(int i=0; i<a.length; i++){
   boolean found = false;

   for(int j=0; j<i; j++){
    if(a[i] == a[j])
     found = true;
   }

   if(!found)
    System.out.print(a[i] + " ");
  }
 }
}