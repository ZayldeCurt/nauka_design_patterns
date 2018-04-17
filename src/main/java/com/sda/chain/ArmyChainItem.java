package com.sda.chain;

public class ArmyChainItem implements ChainItem{
    @Override
    public boolean isMyResponsibility(String value) {
        return value.contains("war");
    }

    @Override
    public void action(String value) {
        System.out.println("bum bum buuuuum");
        System.out.println("You're Dead");
    }
}
