package application;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entietes.Department;
import model.entietes.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller find by Id ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 2: seller find all ===");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: seller insert ===");
        Seller seller = new Seller(null, "Rebeka", "Rebeka@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(seller);
        System.out.println("Inserted! New id = " + seller.getId());

        System.out.println("=== TEST 4: seller insert ===");
        seller = sellerDao.findById(1);
        seller.setName("Luiz");
        seller.setEmail("Luiz@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update Seller " + seller.getId() + " New Datas");
        System.out.println(seller);
    }
}
