import java.util.ArrayList;
/**
 * @author anant
 * @created 23/03/2023 - 20:36
 * @project Praktikum2
 */

public class latihan2 {
        public static void main(String[] args) {
            // Membuat objek ArrayList
            ArrayList<String> hewan = new ArrayList<String>();
            // Menambahkan elemen ke ArrayList
            hewan.add("Sapi");
            hewan.add("Kelinci");
            hewan.add("Kambing");
            hewan.add("Unta");
            hewan.add("Domba");

            // Menampilkan isi ArrayList menggunakan loop for
            System.out.println("Contoh Hewan: " + hewan);

            //hapus index
            ArrayList<String> delete = new ArrayList<String>();
            String element1 = hewan.remove(0);
            delete.add(element1);
            String element2 = hewan.remove(3);
            delete.add(element2);
            System.out.println("Setelah menghapus elemen kedua: " + hewan);
            System.out.println("Elemen yang dihapus adalah: "+delete);
        }
}
