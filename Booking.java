package reservasihotel;

public class Booking {
    private double totalJumlah;
    
    public Booking (Kamar kamar, String namaCustomer, int durasiMenginap) {
        // rumus untuk meghitung harga berdasarkan lama menginap
        this.totalJumlah = kamar.getHarga() * durasiMenginap;
        System.out.println ("Kamar ini dipesan atas nama " + namaCustomer + " di kamar nomor " + kamar.getNomorKamar() + " untuk " + durasiMenginap + " malam.");
    }
    
    public double getTotalJumlah (){
        return totalJumlah;
    }
}
