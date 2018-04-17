package com.sda.chain;

public class DefoultChainItem implements ChainItem {
    @Override
    public boolean isMyResponsibility(String value) {
        return true;
    }

    @Override
    public void action(String value) {
        System.out.println("You're Died");
    }
}
