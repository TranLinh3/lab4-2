package Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private String pattern;
    public Validator (String pattern) {
        this.pattern=pattern;
    }
    public boolean validate(String value){
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(value);
        return m.matches();
    }
}