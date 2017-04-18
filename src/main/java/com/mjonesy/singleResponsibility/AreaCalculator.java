package com.mjonesy.singleResponsibility;

import com.mjonesy.models.Circle;
import com.mjonesy.models.Square;

public class AreaCalculator {
    SumCalculatorOutputter sumCalculatorOutputter = new SumCalculatorOutputter();

    public void area(Circle circle) {
        double radius = circle.getRadius();
        double circleArea = Math.PI * (radius * radius);
        sumCalculatorOutputter.outputArea(circleArea);
    }

    public void area(Square square) {
        double length = square.getLength();
        double squareArea = length * length;
        sumCalculatorOutputter.outputArea(squareArea);
    }

}
