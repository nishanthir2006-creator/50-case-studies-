import java.util.Scanner;
class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'){
                if("aeiou".indexOf(ch)!=-1) v++;
                else c++;
            }
        }
        System.out.println("Vowels="+v+" Consonants="+c);
    }
}