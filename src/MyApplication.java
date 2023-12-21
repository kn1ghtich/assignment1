import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//что бы записать добл в переменную надо использовать запятую
// а выводит точку

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\jmiha\\IdeaProjects\\assingment1se2313\\src\\source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        Point firstPoint = null;
        Point previousPoint = null;

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
            // on first iteration does not work
            if (previousPoint != null) {
                double distance = previousPoint.distance(point);
                System.out.println("Distance between " + previousPoint + " and " + point + " = " + distance);
            } else {
                firstPoint = point;
            }
            previousPoint = point;

        }

        // was added because the cycle does no work corrcetly
        if (previousPoint != null && firstPoint != null) {
            double distance = previousPoint.distance(firstPoint);
            System.out.println("Distance between " + previousPoint + " and " + firstPoint + " = " + distance);
        }

        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Average side: " + shape.getAverageSide());
        System.out.println("Longest side: " + shape.getLongestSide());
    }
}