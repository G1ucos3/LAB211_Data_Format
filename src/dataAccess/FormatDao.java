package dataAccess;

import common.Validate;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class FormatDao {

    private static FormatDao instance = null;
    Validate validate = new Validate();

    public static FormatDao Instance() {
        if (instance == null) {
            synchronized (FormatDao.class) {
                if (instance == null) {
                    instance = new FormatDao();
                }
            }
        }
        return instance;
    }

    public String checkPhone() {
        String phone = validate.checkPhone("Enter phone");
        return "Accepted.";
    }

    public String checkEmail() {
        String email = validate.checkEmail("Enter email");
        return "Accepted.";
    }

    public String checkDate() {
        Date date = validate.checkDate("Enter date");
        return "Accepted.";
    }
}
