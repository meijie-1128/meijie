package com.meijie.progress.designpattern.structure.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExistHairStyling implements HairStyling{
    @Override
    public void beHandsome() {
      log.info("用定型发胶让头发定型");
    }
}
