class LongestWord{
 public static void main(String[]a){
  String s="Java is interesting";
  String w="",longest="";
  for(String x:s.split(" ")){
   if(x.length()>longest.length()) longest=x;
  }
  System.out.println(longest);
 }
}