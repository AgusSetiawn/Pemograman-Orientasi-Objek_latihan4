class Pegawai {
    private String nama;
    private double gajiPokok;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

class Manager extends Pegawai {
    private double tunjangan;

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }

    public void cetakTunjangan() {
        System.out.println("Tunjangan: " + tunjangan);
    }
}

class Programmer extends Pegawai {
    private double bonus;

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus: " + bonus);
    }

    public void cetakBonus() {
        System.out.println("Bonus: " + bonus);
    }
}

public class diagramclass {
    public static void main(String[] args) {

        // Add another blank line for spacing
        System.out.println();


        // Membuat objek Pegawai
        Pegawai pegawai = new Pegawai();
        pegawai.setNama("nama pegawai");
        pegawai.setGajiPokok(5000000);
        pegawai.cetakInfo();

        // Add another blank line for spacing
        System.out.println();

        // Membuat objek Manager
        Manager manager = new Manager();
        manager.setNama("nama manager");
        manager.setGajiPokok(70000 );
        manager.setTunjangan(200000);
        manager.cetakInfo();

        // Add another blank line for spacing
        System.out.println();


        // Membuat objek Programmer
        Programmer programmer = new Programmer();
        programmer.setNama("nama programmer");
        programmer.setGajiPokok(600000);
        programmer.setBonus(150000);
        programmer.cetakInfo();
    }
}