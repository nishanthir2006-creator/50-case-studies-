class University{
 void show(){ System.out.println("University"); }
}
class College extends University{}
class Department extends College{
 public static void main(String[] a){
  new Department().show();
 }
}