package com.meijie.progress.designpattern.prototypemodel;

import lombok.Data;

@Data
public class Person implements Cloneable {
    private String name;

    private String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }
}
