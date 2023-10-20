package repository;

import dataAccess.FormatDao;

/**
 *
 * @author ASUS
 */
public class FormatRepository implements IFormat {

    @Override
    public void checkPhone() {
        System.out.println(FormatDao.Instance().checkPhone());
    }

    @Override
    public void checkEmail() {
        System.out.println(FormatDao.Instance().checkEmail());
    }

    @Override
    public void checkDate() {
        System.out.println(FormatDao.Instance().checkDate());
    }
}
