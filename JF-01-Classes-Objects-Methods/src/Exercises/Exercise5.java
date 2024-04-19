package Exercises;

public class Exercise5 {
    /* A method that allows any number of Strings to be passed as parameter inputs without an array */
    private void myMultiInputMethod(String...args) {}

    public static void main(String[] args) {
        Exercise5 ex5 = new Exercise5();
       ex5.myMultiInputMethod("I'm passing multiple Strings without an array");
    }

}
