package com.kunal.backendlab.springcore.hw.impl;

import com.kunal.backendlab.springcore.hw.IFrosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "frosting.type",havingValue = "strawberry")
public class StrawberryFrosting implements IFrosting {
    @Override
    public String getFrostingType() {
        return "Strawberry Frosting";
    }
}
