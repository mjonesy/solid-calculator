package com.mjonesy.models;

import com.mjonesy.singleResponsibility.SumCalculatorOutputter;
import lombok.Data;

@Data
public class Square {
    SumCalculatorOutputter sumCalculatorOutputter = new SumCalculatorOutputter();
    private double length;

}
