package com.blz.linecomparision;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, x3, y3, x4, y4;
        int line1, line2;

        System.out.println("Enter x1 & y1 values of First point");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.println("Enter x2 & y2 values of Second point");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        line1 = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance of First line = " + line1);

        System.out.println("Enter x3 & y3 values of Third point");
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();

        System.out.println("Enter x4 & y4 values of Fourth point");
        x4 = sc.nextDouble();
        y4 = sc.nextDouble();

        line2 = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Distance of Second line = " + line2);

        String str1 = Double.toString(line1);
        String str2 = Double.toString(line2);

        if (str1.equals(str2) == true)
            System.out.println("Both lines are Equal");
        else
            System.out.println("Both The Lines are Not Equal");

    }

}