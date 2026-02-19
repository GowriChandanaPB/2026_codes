/*
list1 = [1,6,3,8,5,3,4,7]
list2 = [9,2,5,1,4,6,8,7]

output = [1,2,3,3,4,4,5,5,6,6,7,7,8,8,9]
*/
import java.util.*;
public class feb_19 {
    public static void main(String[] args){
        List<Integer> l1 = Arrays.asList(1,6,3,8,5,3,4,7);
        List<Integer> l2 = Arrays.asList(9,2,5,1,4,6,8,7);
        List<Integer> res = new ArrayList<>();
        res.addAll(l1);
        res.addAll(l2);
        for(int i=0; i<res.size(); i++){
            for(int j=1; j<res.size()-i; j++){
                if(res.get(j-1) > res.get(j)){
                    int temp = res.get(j-1);
                    res.set(j-1, res.get(j));
                    res.set(j, temp);
                }
            }
        }
        System.out.println(res);
    }
}
