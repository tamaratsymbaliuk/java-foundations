package regExPractice;

public class RegexPractice2 {
    public static void main(String[] args) {
        System.out.println("doggy".matches("^.....$"));// dot matches any character, $ end of the string, ^ beginning of the string
        System.out.println("cat doggy".matches("...\\s\\b.....")); //true \\s space and \\b boundary
    }


}
