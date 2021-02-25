package com.company;

public class Liczba{
    private int wartosc=0;
    void setWartosc(int w){ wartosc=w;}
    int getWartosc(){ return wartosc; }
    void losuj(){
        wartosc = (int)(Math.random()*10);
    }
}
