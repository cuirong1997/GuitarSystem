package service;

import dao.GuitarDao;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuitarService {

    public List<Guitar> getGuitars(GuitarSpec guitarSpec) {
    	System.out.println("111");
        GuitarDao guitarDao = new GuitarDao();
        System.out.println("222");
        Inventory inventory = new Inventory();
        System.out.println("333");
        inventory.setGuitars(guitarDao.getAllGuitar());
        System.out.println("444");
        return inventory.search(guitarSpec);
    }
}
