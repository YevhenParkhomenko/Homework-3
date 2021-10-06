package com.yevhen_parkhomenko.converter;

public class Converter {
    double eur, usd;
    public Converter(double eur, double usd) {
        this.eur = eur;
        this.usd = usd;
    }

    public double hrnToEur(double hrn){
        return hrn/eur;
    }

    public double hrnToUsd(double hrn){
        return hrn/usd;
    }

    public double eurToHrn(double eur){
        return eur*this.eur;
    }

    public double usdToHrn(double usd){
        return usd*this.usd;
    }
}
