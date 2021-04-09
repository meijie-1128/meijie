package com.meijie.progress.designpattern.abstractfactory;

public class CgStationeryFactory implements StationeryFactory{

    @Override
    public Pen getPen() {
        return new CgPen();
    }

    @Override
    public Rubber getRubber() {
        return new CgRubber();
    }
}
