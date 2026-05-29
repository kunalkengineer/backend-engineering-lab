package com.kunal.backendlab.springcore.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cakebaker {
    private final IFrosting frosting;
    private final ISyrup syrup;


    @Autowired
    public Cakebaker(@Qualifier("chocolateFrosting") IFrosting frosting,
                     @Qualifier("chocolateSyrup") ISyrup syrup )
    {
        this.frosting = frosting;
        this.syrup = syrup;

    }

    public void bakeCake(){
        System.out.println("Baking cake");
        System.out.println(frosting.getFrostingType());
        System.out.println(syrup.getSyrupType());
    }
}
