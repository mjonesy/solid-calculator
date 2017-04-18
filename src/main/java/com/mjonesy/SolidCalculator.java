package com.mjonesy;

import com.mjonesy.models.Circle;
import com.mjonesy.models.Square;
import com.mjonesy.singleResponsibility.AreaCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolidCalculator {
    public static void main(String[] args) {
        SpringApplication.run(SolidCalculator.class, args);

    Circle circle = new Circle();
    circle.setRadius(3);

    AreaCalculator areaCalculator = new AreaCalculator();

        areaCalculator.area(circle);

        Square square = new Square();
        square.setLength(5);

        areaCalculator.area(square);

    }

}
