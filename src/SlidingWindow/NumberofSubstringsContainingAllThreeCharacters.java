package SlidingWindow;

import java.util.*;

public class NumberofSubstringsContainingAllThreeCharacters {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        int i=0;
        int j=0;
        int count = 0;
        int n = s.length();
        while(j<n){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while(map.size()==3){
                count+=(n-j);
                int t = map.get(s.charAt(i));
                if(t==1){
                    map.remove(s.charAt(i));
                }else{
                    map.put(s.charAt(i),t-1);
                }
                i++;
            }
            j++;
        }
        System.out.println(count);
    }
}
