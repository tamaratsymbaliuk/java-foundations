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

        String text1 = "This is my text1";
        String text2 = "This is my text2";
        System.out.println(text1.concat(text2));


        //StringBuilder - recommended. not thread safe
        String finalString = new StringBuilder(text1.length()+text2.length()+1).append(text1).append(" ").append(text2).toString();
        System.out.println(finalString);


        //StringBuffer - thread safe, older version
        String otherFinalString = new StringBuffer().append(text1).append(" ").append(text2).toString();
        System.out.println(otherFinalString);

        //another option
        System.out.format("%s %s\n",text1,text2);

        String text3 = "Four score and seven years ago";
        System.out.println(text3.length());
        char[] chars = text3.toCharArray();
        System.out.println(chars[2]);//u
        StringBuilder builder = new StringBuilder(text3.length());

        String newText = text3.substring(0,10).toUpperCase();//10 is not included
        System.out.println(newText);//FOUR SCORE

        System.out.println(text3.indexOf("seven"));
        String phoneNumber = "(312) 333-5551";
        String areaCode = phoneNumber.substring(1,4);
        System.out.println(areaCode);







    }


}
