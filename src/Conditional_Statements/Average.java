package Conditional_Statements;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz.");
        double mat = input.nextInt();

        System.out.println("Fizik notunu giriniz.");
        double fiz = input.nextInt();

        System.out.println("Kimya notunu giriniz.");
        double kim = input.nextInt();

        System.out.println("Türkçe notunu giriniz.");
        double tur = input.nextInt();

        System.out.println("Tarih notunu giriniz.");
        double tarih = input.nextInt();

        System.out.println("Müzik notunu giriniz.");
        double muz = input.nextInt();

        double sum = mat + fiz + kim + tarih + tur + muz;

        double aver = sum/6;

        System.out.println("Ortalaması "+aver);

        String cond = aver>=60 ? "Geçti" : "Kaldı";

        System.out.println(cond);
    }
}
