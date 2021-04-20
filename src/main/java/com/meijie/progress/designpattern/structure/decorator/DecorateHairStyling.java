package com.meijie.progress.designpattern.structure.decorator;

public abstract class DecorateHairStyling implements HairStyling{

    private HairStyling hairStyling;

    public DecorateHairStyling(HairStyling hairStyling) {
        this.hairStyling = hairStyling;
    }

    @Override
    public void beHandsome() {
        hairStyling.beHandsome();
    }
}
