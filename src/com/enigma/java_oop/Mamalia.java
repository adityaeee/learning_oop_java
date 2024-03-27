package com.enigma.java_oop;

public class Mamalia {
    public String jenis;
    private String behavior;
    private String makanan;
    private Integer panjang;
    private Integer lebar;
    private Integer berat;

    Mamalia (String jenis) {
        this.jenis = jenis;
    }
    Mamalia (){
        this.jenis = "Primata";
        this.behavior = "Memanjat";
        this.panjang = 130;
        this.lebar = 70;
        this.berat = 30;
        this.makanan = "Buah-buahan";

    }

    //Setter
    public void setBehavior (String behavior){
        this.behavior = behavior ;
    }
    public void setMakanan (String makanan) {
        this.makanan = makanan;
    }
    public void setPanjang (Integer panjang) {
        this.panjang = panjang;
    }
    public void setLebar (Integer lebar) {
        this.lebar = lebar;
    }
    public void setBerat (Integer berat) {
        this.berat = berat;
    }

    //Getter
    public String getBehavior() {
        return "Behavior ikan " + this.behavior;
    }
    public String getMakanan() {
        return "Bernafas dengan " + this.makanan;
    }
    public Integer getPanjang() {
        return this.panjang/100;
    }
    public Integer getLebar() {
        return this.lebar/100;
    }
    public Integer getBerat() {
        return this.berat;
    }



    //Print
    public String print() {
        return "Mamalia {" +
                "\n\tJenis hewan = " +this.jenis +
                "\n\tBehavior = " + this.behavior +
                "\n\tMakanan = " +this.makanan +
                "\n\tPanjang = " +this.getPanjang() +" m"+
                "\n\tLebar = " +this.getLebar() +" m"+
                "\n\tBerat = " +this.berat +" kg"+
                "\n\t} ";
    }
}
