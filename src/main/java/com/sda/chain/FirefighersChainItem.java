package com.sda.chain;

public class FirefighersChainItem implements ChainItem {
    @Override
    public boolean isMyResponsibility(String value) {
        return value.contains("fire");
    }

    @Override
    public void action(String value) {
        System.out.println("Whuuu Whuuuu");

    }
}
