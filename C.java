package com.company.pro;

import com.company.analysis2.B;

import static com.company.analysis.A.aA;
import static com.company.analysis2.B.bB;


public class C {
    public static int cC = -1;

    public void operate() {
        cC = bB;
        cC = aA;
        new Bar().getAction();
        new B().operate();
    }
}
