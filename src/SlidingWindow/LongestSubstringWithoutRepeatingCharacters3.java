package SlidingWindow;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        Map<Character,Integer> map = new HashMap<>();
//        int n = s.length();
//        int i = 0;
//        int j = 0;
//        int ws = 0;
//        int max = 0;
//
//        while(j<n){
//            char c = s.charAt(j);
//            map.put(c,map.getOrDefault(c,0)+1);
//            while(map.get(c)>1){
//                char x = s.charAt(i);
//                int t = map.get(x);
//                if(t==1){
//                    map.remove(x);
//                }else map.put(x,t-1);
//                i++;
//            }
//            ws = (j-i)+1;
//            if(ws>max){
//                max = ws;
//            }
//            j++;
//        }
//        System.out.println(max);

        Set<Character> list = new HashSet<>();
        int left = 0,max = 0;
        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            while(list.contains(c)){
                list.remove(s.charAt(left));
                left++;
            }
            list.add(c);
            if(max<right-left+1){
                max = right-left+1;
            }
        }
        System.out.println(max);
    }
}
