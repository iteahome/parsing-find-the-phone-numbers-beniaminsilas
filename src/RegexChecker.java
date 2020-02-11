import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChecker {

    public void check(String theRegex, String string) {
        Pattern checkRegex = Pattern.compile(theRegex);

        Matcher regexMatcher = checkRegex.matcher(string);

        int counter = 0;
        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println("\nFound " + regexMatcher.group() + " at Index:" + regexMatcher.start() + " having " + (regexMatcher.end() - regexMatcher.start()) + " characters");
                counter++;
            }
        }
        System.out.format("\n----------------\nFound: %d results\n----------------\n", counter);
    }


    public void checkAndReplace(String regexToFind, String theRegex, String givenString) {
        Pattern replace = Pattern.compile(regexToFind);
        Matcher regexMatcher = replace.matcher(givenString);
        System.out.println(regexMatcher.replaceAll(","));
    }

}
