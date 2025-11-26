package model.Dao;

import model.Dao.Impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return  new SellerDaoJDBC();
    }
}
