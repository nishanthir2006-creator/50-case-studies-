class Data{
 private int x;
 void set(int x){ this.x = x; }
 int get(){ return x; }
 public static void main(String[] a){
  Data d = new Data();
  d.set(10);
  System.out.println(d.get());
 }
}