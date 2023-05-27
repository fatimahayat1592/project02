package project02;

public class Task1 {
   /* Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH"*/
    String reversedStr(String str){
        String reverse="";
        for (int i = str.length()-1; i >=0; i--) {
            reverse=reverse+str.charAt(i);

        }
        return reverse;
    }

    public static void main(String[] args) {
        Task1 obj=new Task1();
        String word="hello";
        System.out.println(obj.reversedStr(word));
    }
}
