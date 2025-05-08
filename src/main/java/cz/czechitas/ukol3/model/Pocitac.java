package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk druhyDisk;


    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty()) {
            System.err.println("POCITAC JE UZ ZAPNUTY");
            return;
        }
        if (pevnyDisk == null) {
            System.err.println("POCITAC NEMA PEVNY DISK");
            return;
        }
        if (ram == null) {
            System.err.println("POCITAC NEMA PAMET");
            return;
        }
        if (cpu == null) {
            System.err.println("POCITAC NEMA PROCESSOR");
            return;
        }
        jeZapnuty = true;
        System.out.println("POCITAC JE ZAPNUTY");
    }

    public void vypniSe() {
        if (jeZapnuty()) {
            System.out.println("POCITAC SE VYPINA");
        }
        jeZapnuty = false;
    }

    public String jeZapnutyString() {
        if (jeZapnuty()) {
            return "ZAPNUTY";
        }
        return "VYPNUTY";
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty()) {
            long noveObsazeneMisto = (pevnyDisk.getVyuziteMisto() + velikost);

            if (noveObsazeneMisto > pevnyDisk.getKapacita()) {
                noveObsazeneMisto = (druhyDisk.getVyuziteMisto() + velikost);
                if (noveObsazeneMisto > druhyDisk.getKapacita()) {
                    System.err.println("NIKDE NENI MISTO");
                    return;
                }
                druhyDisk.setVyuziteMisto(noveObsazeneMisto);
                return;
            }
            pevnyDisk.setVyuziteMisto(noveObsazeneMisto);
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty()) {
            if (druhyDisk.getVyuziteMisto() > 0) {
                long noveObsazeneMisto = (druhyDisk.getVyuziteMisto() - velikost);
                if (noveObsazeneMisto < 0) {
                    druhyDisk.setVyuziteMisto(0);
                    return;
                }
                druhyDisk.setVyuziteMisto(noveObsazeneMisto);
                return;
            }
            long noveObsazeneMisto = (pevnyDisk.getVyuziteMisto() - velikost);
            if (noveObsazeneMisto < 0) {
                pevnyDisk.setVyuziteMisto(0);
                return;
            }
            pevnyDisk.setVyuziteMisto(noveObsazeneMisto);
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public Disk getDruhyDisk() {
        return druhyDisk;
    }

    public void setDruhyDisk(Disk druhyDisk) {
        this.druhyDisk = druhyDisk;
    }

    @Override
    public String toString() {
        return "pocitac je: " + jeZapnutyString() + "\ncpu: " + cpu + "\nram: " + ram + "\npevnyDisk: " + pevnyDisk + "\ndruhyDisk: " + druhyDisk;

    }
}
