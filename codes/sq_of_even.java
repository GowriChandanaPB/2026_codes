import java.util.*;
public class sq_of_even {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) % 2 == 0)
                res.add(list.get(i) * list.get(i));
        }
        // System.out.println(res);
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<res.size(); i++){
            set.add(res.get(i));
        }
        System.out.println(set);
    }
}
