class Human {
    //Property/ attribute/field / variable super
    String nama;
    int umur;

    //constraktor
    //shadowing parameter pada attribute jika kita tidak menggunakan kata kunci "this" dan ketika nama attribute sama dengan nama parameter
    //this ini mewakili si objek
    Human(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //konstraktor juga, hanya saja menggunakan polimorfisme overloading, seperti membuat by default jika waktu membuat objek tidak mengisi attribute
    Human() {
        this.nama = "orang";
        this.umur = 0;
    }

    void makan() {
        System.out.println(this.nama+" sedang makan");
    }

    void minum(String minfav) {
        System.out.println("Minuman favorit "+this.nama+ " adalah "+minfav);
    }

    String print(){
        return "Human {"+
                " nama="+this.nama+
                " umur="+this.umur+" }";
    }
}



public class Main {
    public static void main(String[] args) {
//        Human dokter =  new Human() //instance
        Human dokter = new Human("Aditya", 23);
        Human polisi = new Human("Rifky", 24);
        Human suster = new Human();


        dokter.makan();
        dokter.minum("jus jeruk");
//        System.out.println(polisi.print());

        Human[] arrHum = new Human[] {
                dokter,
                polisi,
                suster
        };

        for (var hum: arrHum){
            System.out.println(hum.print());
        }

    }
}