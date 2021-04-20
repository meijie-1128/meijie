package com.meijie.progress.designpattern.create.abstractfactory;

public class MiStationeryFactory implements StationeryFactory{

    @Override
    public Pen getPen() {
        return new MiPen();
    }

    @Override
    public Rubber getRubber() {
        return new MiRubber();
    }
}
