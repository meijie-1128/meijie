package com.meijie.progress.designpattern.structure.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExpandHairStying extends DecorateHairStyling{


    public ExpandHairStying(HairStyling hairStyling) {
        super(hairStyling);
    }

    @Override
    public void beHandsome(){
        log.info("定型前先让头发蓬松");
        super.beHandsome();
    }
}
