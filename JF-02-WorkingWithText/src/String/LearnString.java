package String;

public class LearnString {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple"; //Java will check that it allocated String literal before"apple", so it will not give another space in memory
        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");//with new Java doesn't check it would simply add a new address in memory


        //Here we're checking if it's located in the same memory location
        System.out.println(fruit == anotherFruit);//True
        System.out.println(vegetable == anotherVegetable);//False

        String myText = " ";
        System.out.println(myText.isEmpty()); //false
        System.out.println(myText.isBlank()); //true

        String replaceText = "Hello how are you?";
        System.out.println(replaceText.replace('e','A'));

        String firstName = " Jake ";
        System.out.println(firstName.strip());
        System.out.format("'%s'",firstName.stripLeading());
        System.out.format("'%s'",firstName.stripTrailing());

        String anotherName = " Tom ";
        System.out.println(anotherName.trim()); //trim is used in older versions. better to use strip()

        String fruits = "Apples";
        System.out.println(fruits.charAt(3));

        String firstWord = "Oranges";
        String secondWord = "Banana";

        System.out.println(firstWord.compareTo(secondWord));

        String someText = "Four score and seven years ago";
        System.out.println(someText.contains("our"));//true





    }


}
