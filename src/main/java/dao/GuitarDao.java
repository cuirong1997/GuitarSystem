package dao;

import model.Guitar;
import model.GuitarSpec;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuitarDao {

    public List<Guitar> getAllGuitar(){
        ResultSet rs=SqliteUtil.executeQuery("SELECT * FROM instrument;", new Object[]{});
        List<Guitar> guitarList =new ArrayList<Guitar>();
        try{
            while(rs.next()){
                Guitar Guitar =new Guitar();
                Guitar.setSerialNumber(rs.getInt(1));
                Guitar.setInstrumentType(rs.getString(2));
                GuitarSpec guitarSpec = new GuitarSpec();
                guitarSpec.setBuilder(rs.getString(3));
                guitarSpec.setStyle(rs.getString(4));
                guitarSpec.setType(rs.getString(5));
                guitarSpec.setPrice(rs.getInt(8));
                guitarSpec.setBackWood(rs.getString(6));
                guitarSpec.setTopWood(rs.getString(7));
                Guitar.setGuitarSpec(guitarSpec);
                guitarList.add(Guitar);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return guitarList;
    }
}
