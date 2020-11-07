package com.rahman.arrayobject;

public class DemoShinobi {
    public static void main(String[] args) {
        shinobi[] n = new shinobi[3];

        //membentuk objek1
        n[0] = new shinobi();
        n[0].setNoRegistrasi("012686");
        n[0].setNama("Uchiha Sasuke");
        n[0].setPeringkatNinja("Genin");

        //objek2
        n[1] = new shinobi();
        n[1].setNoRegistrasi("012687");
        n[1].setNama("Uzumaki Naruto");
        n[1].setPeringkatNinja("Genin");

        //objek3
        n[2] = new shinobi();
        n[2].setNoRegistrasi("012681");
        n[2].setNama("Haruno Sakura");
        n[2].setPeringkatNinja("Chunin");

        //menampilkan 3 objek dari array
        System.out.println("Data Shinobi \n");
        for (shinobi i:n){
            System.out.println("No Registrasi\t: " + i.getNoRegistrasi());
            System.out.println("Nama\t\t\t: " + i.getNama());
            System.out.println("Peringkat\t\t: " + i.getPeringkatNinja());

        }
    }
}
