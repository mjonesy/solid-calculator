package com.mjonesy.models;

import com.mjonesy.singleResponsibility.SumCalculatorOutputter;
import lombok.Data;

@Data
public class Circle {
    SumCalculatorOutputter sumCalculatorOutputter = new SumCalculatorOutputter();
    private double radius;

}
