package com.enigma.java_oop;

public class Burung {
    public String nama;
    private String warna;
    private String makanan;
    private Integer panjang;
    private Integer lebarSayap;

    Burung (String nama) {
        this.nama = nama;
    }
    Burung (){
        this.nama = "Merpati";
        this.warna = "Putih";
        this.panjang = 50;
        this.lebarSayap = 80;
        this.makanan = "Biji-bijian";
    }

    //Setter
    public void setWarna (String warna){
        this.warna = warna ;
    }
    public void setMakanan (String makanan) {
        this.makanan = makanan;
    }
    public void setPanjang (Integer panjang) {
        this.panjang = panjang;
    }
    public void setLebarSayap (Integer lebarSayap) {
        this.lebarSayap = lebarSayap;
    }

    //Getter
    public String getWarna() {
        return "Warna ikan " + this.warna;
    }
    public String getMakanan() {
        return "Bernafas dengan " + this.makanan;
    }

    public Integer getPanjang() {
        return this.panjang;
    }

    public Integer getLebarSayap() {
        return this.lebarSayap;
    }

    //Print
    public String print() {
        return "Burung {" +
                "\n\tNama burung = " +this.nama +
                "\n\tWarna = " + this.warna +
                "\n\tMakanan = " +this.makanan +
                "\n\tPanjang = " +this.panjang +" cm"+
                "\n\tLebar sayap= " +this.lebarSayap +" cm"+
                "\n\t} ";
    }
}
