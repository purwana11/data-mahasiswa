import java.util.Scanner;

class Mahasiswa {
    private String namaMahasiswa;
    private int nim;
    private String alamat;
    private String prodi;

    public Mahasiswa() {
    }

    public Mahasiswa(String namaMahasiswa, int nim, String alamat, String prodi) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        this.alamat = alamat;
        this.prodi = prodi;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void display() {
        System.out.println("Nama saya adalah " + namaMahasiswa);
        System.out.println("Nomor NIM saya adalah " + nim);
        System.out.println("Prodi saya adalah " + prodi);
        System.out.println("Alamat saya adalah " + alamat);
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mahasiswa data = new Mahasiswa();

        System.out.print("Masukkan nama anda : ");
        data.setNamaMahasiswa(scanner.nextLine());

        System.out.print("Masukkan nomor NIM anda: ");
        data.setNim(scanner.nextInt());

        scanner.nextLine(); // consume newline character

        System.out.print("Masukkan prodi anda: ");
        data.setProdi(scanner.nextLine());

        System.out.print("Masukkan alamat anda: ");
        data.setAlamat(scanner.nextLine());

        System.out.println("\n\n");

        data.display();

        scanner.close();
    }
}
