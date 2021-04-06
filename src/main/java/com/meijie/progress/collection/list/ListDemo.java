package com.meijie.progress.collection.list;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class ListDemo {

    // list排序
    @Data
    class Person implements Comparable<Person> {

        private int age;

        private double height;


        /***
         *  首先根据年纪升序,再根据降序排序
         *  升序是当前对象-传入的对象
         *  降序是传入对象-当前对象
         * @param o
         * @return
         */
        @Override
        public int compareTo(Person o) {
            if(this.age == o.age) {
                return (int)(o.height - this.height);
            }
            return this.age - o.age;
        }
    }

    public void sortList() {
        List<Person> personList = new ArrayList<>();
        Person person01 = new Person();
        person01.setAge(20);
        person01.setHeight(175.00d);

        Person person02 = new Person();
        person02.setAge(15);
        person02.setHeight(178.00d);

        Person person03= new Person();
        person03.setAge(20);
        person03.setHeight(176.00d);


        personList.add(person01);
        personList.add(person02);
        personList.add(person03);
        // 排序方法1 （结合implements Comparable<Person>）
        Collections.sort(personList);

        // 排序方法2
        Collections.sort(personList, (Person a, Person b) -> {
            if(a.age == b.age) {
                return (int)(b.height - a.height);
            }
            return a.age - b.age;
        });
        // 排序方法3
        Collections.sort(personList, (Person a, Person b) -> {
            if(a.age == b.age) {
                return (int)(b.height - a.height);
            }
            return a.age - b.age;
        });

        personList.forEach(item -> {
            log.info("排序后的结果为:{}",item);
        });

    }


}
