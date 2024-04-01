package com.enigma.enumClass;

//enum tetap sebuah class tapi menyimpan data yang unik yaitu data constant
public enum Gender {
    //scream case, bersifat final tanpa perlu akses modifier, harus mengikuti naming convention

    MALE("Laki-laki"),
    FEMALE("Perempuan");
    //ibarat objek yang lansung di instance saat dideklarasi
    public String description;
    Gender(String description) {
        this.description = description;
    }
//    konstraktor dibuat hanya bisa diakses oleh parameter dia sendiri
//    params = objek

}
