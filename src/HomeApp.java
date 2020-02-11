import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeApp {

    public static void main(String[] args) {

        String giventString = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110";

        regexCheck(giventString);
    }

    private static void formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        System.out.println("My formated date: " + simpleDateFormat.format(date));
    }

    private static void regexCheck(String givenString) {
        String regex =("\\(?07\\d{2}\\)?(-|\\s)\\d{3}(-|\\s)?\\d{3}");

        RegexChecker regexChecker = new RegexChecker();
        regexChecker.check(regex, givenString);

    }



}
