package regExPractice;

public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("Cat".matches("[cC]at")); //true
        System.out.println("bat".matches("[a-fA-F]at"));//specify range
        System.out.println("car".matches("[^c]ar")); // ^ except false

    }

}
