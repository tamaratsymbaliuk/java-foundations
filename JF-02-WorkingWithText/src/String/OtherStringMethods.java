package String;

public class OtherStringMethods {
    public static void main(String[] args) {


        String text = """
                Smith,Fred,1/1/79,1111 ABC St., Apple,CA
                McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
                """;
        String[] people = text.split("\n");
        System.out.println(people.length);
        System.out.println(people[0]);
        String[] fred = people[0].split(",");
        System.out.println(fred[3]);


    }
}