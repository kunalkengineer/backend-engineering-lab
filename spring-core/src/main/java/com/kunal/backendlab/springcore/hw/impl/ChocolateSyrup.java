package com.kunal.backendlab.springcore.hw.impl;

import com.kunal.backendlab.springcore.hw.ISyrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnProperty(name = "syrup.type",havingValue = "chocolate")
public class ChocolateSyrup implements ISyrup {
    @Override
    public String getSyrupType() {
        return "Chocolate Syrup";
    }
}
