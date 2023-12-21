package models;

import helpers.Calculus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

// переписать джаву шейп
// git add git
public class Shape {
    // creating empty array of points
    // (is empty for now)
    private ArrayList<Point> points = new ArrayList<>();


    // function adds point to array of points
    public void addPoint(Point point){
        points.add(point);
    }
    // логику в отдельный метод который будет приватным что бы убрать дубликацию из пару методов в шапе

    // here is so simple to understand what code does.
    public double getAverageSide() {
        return Calculus.getAvg(getSides());
    }
    public double getPerimeter() {
        return Calculus.getSum(getSides());
    }

    public double getLongestSide() {
        return Calculus.getMax(getSides());
    }

    private double[] getSides() {
        int n = points.size();
        double[] sides = new double[n];
        for (int i = 0; i < n; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % n);
            sides[i] = currentPoint.distance(nextPoint);
        }

        return sides;
    }
}