package com.yevhen_parkhomenko.main;

import com.yevhen_parkhomenko.converter.Converter;

public class Main {
    public static void main(String[] args) {
        Converter converter1 = new Converter(30.42, 26.32);
        System.out.println(converter1.hrnToEur(50));
        System.out.println(converter1.eurToHrn(50));
        System.out.println(converter1.hrnToUsd(50));
        System.out.println(converter1.usdToHrn(50));
    }
}
