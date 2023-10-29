package org.example.dataAccess;
//veritabanı işlemleri

import org.example.entities.Cars;

public class CarDataAccess implements CarDataDao{
    public void add(Cars cars){
        System.out.println("Araç veritabanına kaydedildi.");
    }
}
