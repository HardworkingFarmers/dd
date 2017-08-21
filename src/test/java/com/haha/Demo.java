package com.haha;

import com.fz.util.DbUtil;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by webrx on 2017-08-17.
 */
public class Demo {

    @Test
    public  void aa(){

        String url = "jdbc:mysql://192.168.0.183:3306/zuipin?"
                + "user=zuipin&password=zuipin&useUnicode=true&characterEncoding=UTF8";
        try{
            Connection conn  = DriverManager.getConnection(url);
            System.out.println(conn);
        }catch (Exception e){

        }

    }

    @Test
    public  void a(){
        System.out.println("再见");
    }

    @Test
    public void hh(){
        Properties pro = new Properties();
        try {
            pro.load(Demo.class.getClassLoader().getResourceAsStream("db.properties"));

            System.out.println(pro.get("db.driver"));
            System.out.println(pro.get("db.url"));
            System.out.println(pro.get("db.user"));
            System.out.println(pro.get("db.password"));

            Class.forName(pro.getProperty("db.driver"));
            Connection conn = DriverManager.getConnection(pro.getProperty("db.url"), pro.getProperty("db.user"),pro.getProperty("db.password"));

            System.out.println(conn);

            DbUtil dbUtil = new DbUtil();
            List<Map<String,Object>> list = dbUtil.page(1,"user");
            for(Map<String,Object> o : list){
                System.out.println(o.get("username"));

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
