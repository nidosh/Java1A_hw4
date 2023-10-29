package org.example.dataAccess;

import org.example.entities.Cars;
//Interface'ler sadece metot imzasını barındırabilir.

public interface CarDataDao {
    void add(Cars cars);
}
