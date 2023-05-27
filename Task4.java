package project02;

import java.util.Arrays;

public class Task4 {
    /*Check if Two Strings are Anagrams: Given two strings, determine if
    they are anagrams, meaning they contain the same characters in a
    different order. For example, "listen" and "silent" are anagrams.*/
    boolean anagrams(String s1,String s2){
        boolean isAnagram=false;
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        if(c1.length==c2.length){
            Arrays.sort(c1);
            Arrays.sort(c2);
            isAnagram=true;
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        Task4 obj=new Task4();
        String s1="silent";
        String s2="listen";
        System.out.println(obj.anagrams(s1,s2));
    }
}
