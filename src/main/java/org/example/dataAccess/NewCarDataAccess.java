package org.example.dataAccess;
//veritabanı işlemleri

import org.example.entities.Cars;

public class NewCarDataAccess implements CarDataDao {
    public void add(Cars cars){
        System.out.println("Araç süper yeni bir şekilde veritabanına kaydedildi.");
    }
}