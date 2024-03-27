package com.enigma.java_oop;

public class Ikan {
    public String nama;
    private String warna;
    private String pernafasan;
    private Integer panjang;
    private Integer lebar;

    Ikan(String nama) {
        this.nama = nama;
    }
    Ikan(){
        this.nama = "Bandeng";
        this.warna = "Abu-abu";
        this.panjang = 30;
        this.lebar = 8;
        this.pernafasan = "Insang";
    }

    //Setter
    public void setWarna (String warna){
        this.warna = warna ;
    }
    public void setPernafasan (String pernafasan) {
        this.pernafasan = pernafasan;
    }
    public void setPanjang (Integer panjang) {
        this.panjang = panjang;
    }
    public void setLebar (Integer lebar) {
        this.lebar = lebar;
    }

    //Getter
    public String getWarna() {
        return "Warna ikan " + this.warna;
    }
    public String getPernafasan() {
        return "Bernafas dengan " + this.pernafasan;
    }

    public Integer getPanjang() {
        return this.panjang;
    }

    public Integer getLebar() {
        return this.lebar;
    }

    //Print
    public String print() {
        return "Ikan {" +
                "\n\tNama ikan = " +this.nama +
                "\n\tWarna = " + this.warna +
                "\n\tBernafas dengan = " +this.pernafasan +
                "\n\tPanjang = " +this.panjang +" cm"+
                "\n\tLebar = " +this.lebar +" cm"+
                "\n\t} ";
    }
}
