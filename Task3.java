package project02;

public class Task3 {
   /* Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.*/
    int countNumber(String[] str){
        int count=0;
        for (int i = 0; i <str.length ; i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        String[] str={"Hello", "world!"};
        System.out.println(obj.countNumber(str));
    }
}
