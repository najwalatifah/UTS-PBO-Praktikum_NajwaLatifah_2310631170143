package reservasihotel;

import java.util.List;

public class Customer implements User {
    private String namaCustomer;

    public Customer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public void lihatKamar(List<Kamar> kamarList) {
        System.out.println("Customer " + namaCustomer + " melihat kamar yang tersedia:");
        for (Kamar kamar : kamarList) {
            System.out.println(kamar);
        }
    }

    public void pesanKamar(Kamar kamar, int durasiMenginap, Admin admin) {
        if (kamar.tersedia()) {
            System.out.println("Booking kamar " + kamar.getNomorKamar() + " untuk " + namaCustomer + " selama " + durasiMenginap + " malam.");
            Booking booking = new Booking(kamar, namaCustomer, durasiMenginap);
            kamar.setTersedia(false);

            admin.perlihatkanTotalBayar(booking);
        } else {
            System.out.println("Kamar " + kamar.getNomorKamar() + " tidak tersedia.");
        }
    }

    public void bookKamar(Kamar kamar) {
        throw new UnsupportedOperationException("Operasi ini belum didukung.");
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
