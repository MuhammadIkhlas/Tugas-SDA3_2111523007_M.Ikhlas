import java.util.LinkedList;

public class SDA3
{
    public static void main(String[] args) {
        LinkedList <String>nama_mahasiswa = new LinkedList<String>();
        LinkedList <String> no_bp = new LinkedList<String>();
        LinkedList <String> alamat = new LinkedList<String>();

        nama_mahasiswa.add("MUHAMMAD IKHLAS");
        no_bp.add("2111523007");
        alamat.add("Komp. Taruko Blok D/8");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        System.out.println("Alamat Mahasiswa : " +alamat);

        System.out.println("Menambahkan Data Mahasiswa : ");
        //menambahkan nama mahasiswa
        nama_mahasiswa.addFirst("MUHAMMAD DZAKY DINNUL HAQ");
        nama_mahasiswa.add("LUTFI MAULANA");
        nama_mahasiswa.add("REVI PUTRA");
        nama_mahasiswa.addLast("ARIF WAHYUDI");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);
       
        //menambahkan nomor induk mahasiswa
        no_bp.addFirst("2111522015");
        no_bp.add("2111523001");
        no_bp.add("2111523022");
        no_bp.addLast("2111523018");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        //menambahkan alamat mahasiswa
        alamat.addFirst("Jln. LIMAU MANIS");
        alamat.add("Jln. LIMAU MANIS");
        alamat.add("Jln. LIMAU MANIS");
        alamat.addLast("Jln. LIMAU MANIS");
        System.out.println("Alamat Mahasiswa : " +alamat);
        
        System.out.println("Menghapus Data Mahasiswa : ");
        //menghapus nama mahasiswa
        nama_mahasiswa.removeFirst();
        nama_mahasiswa.remove();
        nama_mahasiswa.removeLast();
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        //menghapus nomor induk mahasiswa
        no_bp.removeFirst();
        no_bp.remove();
        no_bp.removeLast();
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);

        //menghapus alamat mahsiswa
        alamat.removeFirst();
        alamat.remove();
        alamat.removeLast();
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Menyisipkan Data Mahasiswa : ");
        //menyisipkan nama mahasiswa
        nama_mahasiswa.set(0,"NURUL INSAN");
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa);

        //menyisipkan nomor induk mahasiswa
        no_bp.set(0,"2111522013");
        System.out.println("Nomor Induk Mahasiswa : " +no_bp);
        
        //menyisipkan alamat mahasiswa
        alamat.set(0,"Jln. LIMAU MANIS");
        System.out.println("Alamat Mahasiswa : " +alamat);
        System.out.println("");

        System.out.println("Mencari Data Mahasiswa : ");
        //mencari nama mahasiswa
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getFirst());
        System.out.println("Nama Mahasiswa : " +nama_mahasiswa.getLast());
        System.out.println("");

        //mencari nomor induk mahasiswa
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getFirst());
        System.out.println("Nomor Induk Mahasiswa : " +no_bp.getLast());
        System.out.println("");

        //mencari alamat mahasiswa
        System.out.println("Alamat Mahasiswa : " +alamat.getFirst());
        System.out.println("Alamat Mahasiswa : " +alamat.getLast());
        System.out.println("");

    }
}