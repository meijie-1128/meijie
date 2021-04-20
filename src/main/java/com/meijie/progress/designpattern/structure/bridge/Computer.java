package com.meijie.progress.designpattern.structure.bridge;

public class Computer {

    private Brand brand;

    public void setBrand(Brand brand){
        this.brand = brand;
    }

    void sale() {
        this.brand.sale();
    }
}
