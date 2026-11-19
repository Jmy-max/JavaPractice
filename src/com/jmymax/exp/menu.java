package com.jmymax.exp;

import java.util.Scanner;

public class menu {

    private static shape readShape(Scanner input) {
        while (true) {
            System.out.println("请选择图形：1.三角形  2.矩形  3.圆形  0.返回到主菜单");
            int type = input.nextInt();

            switch (type) {
                case 1:
                    System.out.println("请输入三条边：");
                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double c = input.nextDouble();
                    TriangleValidator temp = new validator();
                    if (!temp.isValid(a, b, c)) {
                        System.out.println("该三角形不合法，请重新输入。");
                        break;
                    }
                    return new Triangle(a, b, c);

                case 2:
                    System.out.println("请输入长和宽：");
                    double l = input.nextDouble();
                    double s = input.nextDouble();
                    return new Rectangle(l, s);

                case 3:
                    System.out.println("请输入半径：");
                    double r = input.nextDouble();
                    return new Circle(r);

                case 0:
                    return null;


                default:
                    System.out.println("选择无效，请重新输入。");
            }
        }
    }

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. 创建并显示图形");
            System.out.println("2. 比较两个图形");
            System.out.println("0. 退出");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    shape current = readShape(input);
                    System.out.println(current);
                    break;

                case 2:
                    System.out.println("请输入第一个图形：");
                    shape first = readShape(input);
                    if(first == null) {
                        break;
                    }

                    System.out.println("请输入第二个图形：");
                    shape second = readShape(input);
                    if(second == null) {
                        break;
                    }

                    System.out.println("第一个：" + first);
                    System.out.println("第二个：" + second);

                    int p = first.comparePerimeter(second);
                    int a = first.compareArea(second);

                    String perimeterRelation =
                            p < 0 ? "小于" : (p > 0 ? "大于" : "等于");
                    String areaRelation =
                            a < 0 ? "小于" : (a > 0 ? "大于" : "等于");

                    System.out.println("第一个图形的周长"
                            + perimeterRelation + "第二个图形的周长");
                    System.out.println("第一个图形的面积"
                            + areaRelation + "第二个图形的面积");
                    break;

                case 0:
                    input.close();
                    return;

                default:
                    System.out.println("选择无效，请重新输入。");
            }
        }
    }
}
