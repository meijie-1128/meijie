package com.meijie.progress.designpattern.create.builder;

import lombok.Data;

@Data
public class MiPc {

    private String keyboard;

    private String mouse;

    private String monitor;

    private MiPc(Builder builder){
        this.keyboard=builder.keyboard;
        this.mouse=builder.mouse;
        this.monitor=builder.monitor;
    }

    static class Builder{
        private String keyboard;

        private String mouse;

        private String monitor;

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public MiPc builder() {
            return new MiPc(this);
        }
    }
}
