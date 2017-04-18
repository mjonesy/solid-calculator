package com.mjonesy.singleResponsibility;

import com.mjonesy.models.Circle;
import com.mjonesy.models.Square;
import org.springframework.beans.factory.annotation.Autowired;

public class AreaCalculator {
    @Autowired
    SumCalculatorOutputter sumCalculatorOutputter = new SumCalculatorOutputter();

    public void sum(Circle circle) {
        double radius = circle.getRadius();
        double circleRadius = Math.PI * (radius * radius);
        sumCalculatorOutputter.outputArea(circleRadius);
    }

    public void sum(Square square) {
        double length = square.getLength();
        sumCalculatorOutputter.outputArea(length);
    }

}
