package project02;

public class Task2 {
   /* Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome.*/
    boolean palindrome(String str){
        String rev="";
        boolean isPalindrome=false;
        for (int i = str.length()-1; i >=0 ; i--) {
            rev = rev + str.charAt(i);
        }if (str.equalsIgnoreCase(rev)){
            isPalindrome=true;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Task2 obj=new Task2();
        String str="madam";
        System.out.println(obj.palindrome(str));
    }
}
