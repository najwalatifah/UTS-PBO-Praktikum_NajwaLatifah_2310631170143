package reservasihotel;

import java.util.List;

public class Admin implements User {
    private String namaAdmin;

    public Admin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public void lihatKamar(List<Kamar> kamarList) {
        System.out.println("Admin " + namaAdmin + " menunjukkan kamar yang tersedia: ");
        for (Kamar kamar : kamarList) {
            System.out.println(kamar);
        }
    }

    public void pesanKamar(Kamar kamar) {
        System.out.println("Admin tidak bisa memesan kamar.");
    }

    public void perlihatkanTotalBayar(Booking booking) {
        if (booking != null) {
            System.out.println("Total yang harus dibayar: " + booking.getTotalJumlah());
        } else {
            System.out.println("Pemesanan tidak ditemukan.");
        }
    }

    @Override
    public void LihatKamar(List<Kamar> kamar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void bookRoom(Kamar kamar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
