package project02;

public class Task5 {
  /*  Find the First Non-Repeating Character in a String: Given a string,
    find and return the first non-repeating character. For example, in the
    string "abracadabra", the first non-repeating character is 'c'.*/
    char firstNonRepeatingChar(String str){
        char nonRepeating=' ';

        for (int i = 0; i <str.length() ; i++) {
            boolean isRepeating=false;
            for (int j = 0; j <str.length() ; j++) {
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    isRepeating=true;
                }
            }
            if(!isRepeating){
                nonRepeating=str.charAt(i);
                break;
            }
        }
        return nonRepeating;
    }

    public static void main(String[] args) {
        Task5 obj=new Task5();
        String str="abracadabra";
        System.out.println(obj.firstNonRepeatingChar(str));
    }
}
