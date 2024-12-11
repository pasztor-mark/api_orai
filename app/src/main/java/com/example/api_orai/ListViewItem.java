package com.example.api_orai;

public class ListViewItem {
    private String nev;
    private String kategoria;
    private int ar;
    private int mennyiseg;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public ListViewItem(String nev, int ar, int mennyiseg, String kategoria) {
        this.nev = nev;
        this.ar = ar;
        this.mennyiseg = mennyiseg;
        this.kategoria = kategoria;
    }



}
