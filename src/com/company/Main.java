package com.company;

import java.io.*;

public class Main {

    private static void prLine(int l)
    {
        for (int i = 0; i < l; ++i) {
            System.out.printf("=");
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new FileReader("C:\\products.txt"));
        String s;
        double total = 0;

        System.out.printf("%-20s %-10s %-8s %9s\n", "Наименование", "Цена", "Кол-во", "Сумма");
        prLine(50);

        while(true)
        {
            String name;
            double price;
            double quantity;
            s = r.readLine();
            if(s == null)
                break;
            name = s;

            s = r.readLine();
            if(s == null)
                break;
            quantity = Double.parseDouble(s);

            s = r.readLine();
            if(s == null)
                break;
            price = Double.parseDouble(s);

            System.out.printf("%-20s %-10.2f %-8.3f %9.2f\n", name, price, quantity, (price * quantity));
            total += (price * quantity);
        }
        r.close();

        prLine(50);
        System.out.printf("Итого: %g\n", total);
        prLine(50);
    }
}
