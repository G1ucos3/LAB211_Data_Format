package controller;

import repository.FormatRepository;

/**
 *
 * @author ASUS
 */
public class FormatController {

    FormatRepository fr;

    public FormatController() {
        fr = new FormatRepository();
    }

    public void run() {
        System.out.println("====== Validate Progaram ======");
        fr.checkPhone();
        fr.checkEmail();
        fr.checkDate();
    }
}
