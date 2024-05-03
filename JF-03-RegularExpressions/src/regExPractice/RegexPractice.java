package regExPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("Cat".matches("[cC]at")); //true either c or C
        System.out.println("bat".matches("[a-fA-F]at"));//specify range
        System.out.println("car".matches("[^c]ar")); // ^ except false

        System.out.println("Lat".matches("\\wat")); //string of any first char true
        System.out.println("G_T".matches("\\w\\w\\w"));//3 chars

        String phoneNumber = "321-333-4567";
        System.out.println(phoneNumber.matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));
        //instead we can use quantifiers
        String regex = "\\d{3}[-\\s]*\\d{3,}[-\\s]*\\d{3,4}";
        String phoneNumber1 = "1.232.333.2365";

        System.out.println(phoneNumber1.matches(regex));//still true

        String regex1 = """
                # This is my regex to parse the parts of a phone number
                (?:(?<countryCode>\\d{1,2})[-.,\\s]?)? #Get's country code
                (?:(?<areaCode>\\d{3})[-.,\\s]?) # Get's area code
                (?:(\\d{3})[-.,\\s]?) # Get's exchange
                (\\d{4}) # Get's line number
                """;


        Pattern pat = Pattern.compile(regex1, Pattern.COMMENTS);
        Matcher mat = pat.matcher(phoneNumber1);

        if (mat.matches()) {
            System.out.format("Whole number: %s\n",mat.group(0)); //entire number 1.232.333.2365
            System.out.format("Country code: %s\n", mat.group("countryCode")); //1
            System.out.format("Area code: %s\n", mat.group("areaCode")); //232
            System.out.format("Exchange: %s\n", mat.group(3)); //333
            System.out.format("Line number: %s\n",mat.group(4)); //2365


        }





    }

}
