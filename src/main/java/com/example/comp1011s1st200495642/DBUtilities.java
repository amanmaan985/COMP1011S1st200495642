package com.example.comp1011s1st200495642;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class DBUtilities {
        //the user name and password are what ever you have defined on your local
        //MySQL server
        private static String user = "Amanpreet200495642";
        private static String pass = "rR_mkXkXcL";

        private static String connectUrl = "jdbc:mysql://172.31.22.43:3306/Amanpreet200495642";

    public static ArrayList<CarSold> getSoldCarObjectFromDB()
    {
        ArrayList<CarSold> carSolds = new ArrayList();

        String sql = "SELECT * FROM carSales;";

        try(
                Connection conn = DriverManager.getConnection(connectUrl,user,pass);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            while (resultSet.next())
            {

                int carId = resultSet.getInt("carID");
                int modelYear = resultSet.getInt("modelYear");
                String make = resultSet.getString("make");
                String model = resultSet.getString("model");
                int price = resultSet.getInt("price");
                LocalDate dateSold = resultSet.getDate("dateSold").toLocalDate();

                CarSold carSoldObject = new CarSold(carId, modelYear,price,make,model,dateSold);

                carSolds.add(carSoldObject);
            }
        }
        catch (Exception e)
        {e.printStackTrace();}

        return carSolds;

    }




}
