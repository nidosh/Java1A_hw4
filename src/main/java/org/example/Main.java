package org.example;

import org.example.bussiness.CarsBussinessRules;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.dataAccess.CarDataAccess;
import org.example.dataAccess.NewCarDataAccess;
import org.example.entities.Cars;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Cars car1 = new Cars(1,"Skoda","Fabia",2018,10000);
        Cars car2 = new Cars(2,"Peugeot","2008",2012,6000);
        Cars car3 = new Cars(3,"Toyota","Corolla",2010,4000);
        Cars car4 = new Cars(4,"Renault","Brodway",1995,950);
        Cars car5 = new Cars(5,"Audi","A4",2023,20000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};

        CarsBussinessRules carsBussinessRules = new CarsBussinessRules(new NewCarDataAccess(), List.of(loggers));
        carsBussinessRules.add(car1);
        carsBussinessRules.add(car2);
        carsBussinessRules.add(car3);
        carsBussinessRules.add(car4);
        carsBussinessRules.add(car5);
    }
}