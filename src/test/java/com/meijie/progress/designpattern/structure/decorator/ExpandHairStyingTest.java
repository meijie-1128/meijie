package com.meijie.progress.designpattern.structure.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandHairStyingTest {

    @Test
    void test() {
        DecorateHairStyling decorateHairStyling = new ExpandHairStying(new ExistHairStyling());
        decorateHairStyling.beHandsome();
    }
}