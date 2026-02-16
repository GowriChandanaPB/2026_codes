import java.util.*;
public class anagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char [] str = str1.toCharArray();
        char [] strb = str2.toCharArray();
        Arrays.sort(str);
        Arrays.sort(strb);

        if(str.length != strb.length) {System.out.println("false"); return;}
        if (Arrays.equals(str, strb)) System.out.println("true");
        else System.out.println("false"); 
        return;

    }
    
}
