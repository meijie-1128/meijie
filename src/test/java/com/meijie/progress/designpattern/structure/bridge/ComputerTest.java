package com.meijie.progress.designpattern.structure.bridge;

import org.junit.jupiter.api.Test;

class ComputerTest {

    @Test
    void test() {
        Computer desktop = new Desktop();
        desktop.setBrand(new Mi());
        desktop.sale();

        Computer noteBook = new NoteBook();
        noteBook.setBrand(new Mi());
        noteBook.sale();
    }

}