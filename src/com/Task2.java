package com;

import java.util.Scanner;

import static com.SafeScanner.nextDouble;
import static com.SafeScanner.nextInt;

public class Task2{
    //Для считывания данных с консоли
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Выберите задание (все задания пронумерованы от 1 до 7)");
        int task = nextInt(in);
        while (task!=0){
            switch (task) {
                case 1:
                    first();
                    break;
                case 2:
                    second();
                    break;
                case 3:
                    third();
                    break;
                case 4:
                    fourth();
                    break;
                case 5:
                    fifth();
                    break;
                case 6:
                    sixth();
                    break;
                case 7:
                    seventh();
                    break;
            }
            System.out.println("Если необходимо выполнить другое задание введите его номер, либо введите \'0\' для выхода");
            task = nextInt(in);
        }
    }

    private static void first(){
        System.out.println("Чётные числа");
        for (int i=1;i<=100;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }

    private static void second(){
        System.out.println("2.Рисуем прямоугольник");

        System.out.println("Введите высоту прямоугольника: ");
        int m = nextInt(in);
        System.out.println("Введите ширину прямоугольника:");
        int n = nextInt(in);

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(8);
            System.out.print('\n');
        }
    }

    private static void third(){
        System.out.println("3.Рисуем треугольник");
        int temp=0;
        for (int i=0;i<10;i++){
            for(int j=0;j<=temp;j++)
                System.out.print(8);
            temp++;
            System.out.println();
        }
    }

    private static void fourth(){
        System.out.println("4.Минимум двух чисел \n Введите пару чисел для сравнения: ");
        Double n1,n2;
        n1 = nextDouble(in);
        n2 = nextDouble(in);
        /*1.Метод тоже является функцией
          2.Велосипеды не есть хорошо
        */
        if (n1.compareTo(n2)<=0)
            System.out.println(n1);
        else
            System.out.println(n2);
    }

    private static void fifth(){
        System.out.println("Сравнить имена \n Введите поочерёдно два имени (Каждоё имя в отдельной строке): ");
        String s1,s2;
        //Проверка на ввод имени отсутствует по причине существования имён состоящих из нескольких слов
        s1 = in.next();
        s2 = in.next();

        if(s1.compareTo(s2)==0)
            System.out.println("Имена идентичные");
        else if(s1.length()==s2.length())
            System.out.println("Длины имён равны");

    }

    private static void sixth(){
        System.out.println("Минимум четырёх чисел \n Введите 4 числа:");
        Double least =  min(nextDouble(in),nextDouble(in),nextDouble(in),nextDouble(in));
        System.out.println("Наименьшее число: "+least);

    }

    private static Double min(double a,double b, double c,double d){
        if(Double.compare(a,b)>0)
            a=b;
        if(Double.compare(c,d)>0)
            c=d;
        if(Double.compare(a,c)>0)
            return c;
        else
            return a;
    }

    private static void seventh(){
        System.out.println("Координатные четверти \n Введите два целых числа образующих координату точки");
        int x,y;
        x = nextInt(in);
        y = nextInt(in);
        while (x==0||y==0){
            System.out.println("Точка не должан лежать на осях OX и OY, повторите ввод координат точки!");
            x = nextInt(in);
            y = nextInt(in);
        }

        if (x>0 && y>0)
            System.out.println("Точка находится в I четверти");
        if (x<0 && y>0)
            System.out.println("Точка находится в II четверти");
        if (x<0 && y<0)
            System.out.println("Точка находится в III четверти");
        if (x>0 && y<0)
            System.out.println("Точка находится в IV четверти");


    }


}