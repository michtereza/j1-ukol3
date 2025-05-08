package cz.czechitas.ukol3;


import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());
        mujPocitac.zapniSe();      // Vypíše chybu, protože počítač v tuto chvíli nemá všechny povinné součásti.

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(3_700_000_000L);
        mujProcesor.setVyrobce("AMD");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(32_000_000_000L);

        Disk druhyDisk = new Disk();
        druhyDisk.setKapacita(999_000_000_000L);

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(953_869_000_000L);

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);
        mujPocitac.setDruhyDisk(druhyDisk);


        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();      // Vypíše chybu, protože počítač už běží
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();

        mujPocitac.vypniSe();      // Nevypíše chybu, ale nic neprovede, protože počítač už je vypnutý


// testovani

        mujPocitac.zapniSe();
        mujPocitac.vytvorSouborOVelikosti(250_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vymazSouboryOVelikosti(200_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vypniSe();

        mujPocitac.vymazSouboryOVelikosti(400_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();
        mujPocitac.vymazSouboryOVelikosti(400_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vytvorSouborOVelikosti(953_869_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vytvorSouborOVelikosti(996_900_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vytvorSouborOVelikosti(85_550_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vymazSouboryOVelikosti(997_400_000_000L);
        System.out.println(mujPocitac.toString());

        mujPocitac.vymazSouboryOVelikosti(850_400_000_000L);
        System.out.println(mujPocitac.toString());

    }
}
