package com.meijie.progress.designpattern.prototypemodel;

import lombok.Data;

@Data
public class ShallowClone implements Cloneable {

    private int id;

    private Person person;


    public ShallowClone(int id, Person person) {
        this.id = id;
        this.person = person;
    }

    public ShallowClone clone() throws CloneNotSupportedException {
        return (ShallowClone) super.clone();
    }

}
