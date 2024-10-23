public class latihan {

    public static void main(String[] args) {
        // Membuat object
        Mahasiswa anton = new Mahasiswa();

        // Menggunakan setter untuk memberikan nilai
        anton.setNim("10102020");
        anton.setNama("Anton Santoso");
        anton.setJenisKelamin("Laki-laki");
        anton.setUmur(28);
        anton.setAlamat("Bekasi Kota");
        anton.setJurusan("Informatika");

        // Menggunakan getter untuk mengambil nilai
        System.out.println("NIM : " + anton.getNim());
        System.out.println("Jurusan : " + anton.getJurusan());

        anton.cetakInfo();
    }

    static class Manusia {
        private String nama;
        private String jenisKelamin;
        private int umur;
        private String alamat;

        // Constructor
        public Manusia() {
        }

        // Setter dan Getter untuk atribut nama
        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getNama() {
            return this.nama;
        }

        // Setter dan Getter untuk atribut jenisKelamin
        public void setJenisKelamin(String jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
        }

        public String getJenisKelamin() {
            return this.jenisKelamin;
        }

        // Setter dan Getter untuk atribut umur
        public void setUmur(int umur) {
            this.umur = umur;
        }

        public int getUmur() {
            return this.umur;
        }

        // Setter dan Getter untuk atribut alamat
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getAlamat() {
            return this.alamat;
        }

        public void cetakInfo() {
            System.out.println("Nama : " + this.nama);
            System.out.println("Jenis Kelamin : " + this.jenisKelamin);
            System.out.println("Umur : " + this.umur);
            System.out.println("Alamat : " + this.alamat);
        }
    }

    static class Mahasiswa extends Manusia {
        private String nim;
        private String jurusan;

        // Constructor
        public Mahasiswa() {
        }

        // Setter dan Getter untuk atribut nim
        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getNim() {
            return this.nim;
        }

        // Setter dan Getter untuk atribut jurusan
        public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
        }

        public String getJurusan() {
            return this.jurusan;
        }
    }
}