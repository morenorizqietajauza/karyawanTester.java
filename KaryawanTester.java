//object class
import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Inputkan Nama Siswa");
        String nama = input.nextline();
        System.out.println("Inputkan ID siswa");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();
        
        // object
        // Class object = new Construction
        Karyawan Ibra = new Karyawan(26,"Ibra","TU","TulungAgung");
        Karyawan Burhan = new Karyawan(29,"Burhan","Kesiswaan","Lamongan");
        Karyawan Kinza = new Karyawan(21,"Kinza","TU","Sidoarjo");
        Karyawan Gilam = new Karyawan(19,"Gilam","Kesiswaan","Papua");
        Karyawan Melvin = new Karyawan(15,"Melvin","Kurikulum","Malang");

        Burhan.print();
        System.out.println();
        Ibra.print();
        System.out.println();
        Melvin.print();
        System.out.println();
        Gilam.print();
        System.out.println();
        Kinza.print();
    }
}