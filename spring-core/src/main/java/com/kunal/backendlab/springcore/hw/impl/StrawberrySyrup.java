package com.kunal.backendlab.springcore.hw.impl;

import com.kunal.backendlab.springcore.hw.ISyrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "syrup.type",havingValue = "strawberry")
public class StrawberrySyrup implements ISyrup {
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
