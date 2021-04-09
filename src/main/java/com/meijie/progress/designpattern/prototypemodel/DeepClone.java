package com.meijie.progress.designpattern.prototypemodel;

import lombok.Data;

@Data
public class DeepClone implements Cloneable {
    private int id;

    private Person person;

    public DeepClone(int id, Person person) {
        this.id = id;
        this.person = person;
    }

    public DeepClone clone() throws CloneNotSupportedException {
        DeepClone deepClone = (DeepClone)super.clone();
        deepClone.setPerson(deepClone.getPerson().clone());
        return deepClone;
    }
}
