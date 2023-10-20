package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author ASUS
 */
public class Validate {

    private final static String PHONEMATCH = "\\d{10}";
    private final static String EMAILMATCH = "^[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]+$";

    public String checkString(String s) {
        String str = "";
        while (str.isBlank() || str.isEmpty()) {
            Scanner sc = new Scanner(System.in);
            System.out.print(s + ": ");
            str = sc.nextLine();
        }
        return str;
    }

    public String checkPhone(String s) {
        String phone;
        while (true) {
            phone = checkString(s);
            if (phone.matches(PHONEMATCH)) {
                return phone;
            }
            System.err.println("Phone number must be 10 digits.");
        }
    }

    public String checkEmail(String s) {
        String email;
        while (true) {
            email = checkString(s);
            if (email.matches(EMAILMATCH)) {
                return email;
            }
            System.err.println("Wrong email format.");
        }
    }

    public Date checkDate(String s) {
        Date date;
        while (true) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                date = sdf.parse(checkString(s));
                return date;
            } catch (ParseException e) {
                System.err.println("Wrong format(dd//MM//yyyy)");
            }
        }
    }
}
