class Pesanan {
    private Restaurant restaurant;
    private String namaMenuMakanan;
    private int jumlahMakanan;
    private String namaMenuMinuman;
    private int jumlahMinuman;
    private double jarak;
    private double totalHarga;

    public Pesanan(Restaurant restaurant, String namaMenuMakanan, int jumlahMakanan, String namaMenuMinuman,
                   int jumlahMinuman, double jarak, double totalHarga) {
        this.restaurant = restaurant;
        this.namaMenuMakanan = namaMenuMakanan;
        this.jumlahMakanan = jumlahMakanan;
        this.namaMenuMinuman = namaMenuMinuman;
        this.jumlahMinuman = jumlahMinuman;
        this.jarak = jarak;
        this.totalHarga = totalHarga;
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getNamaMenuMakanan() {
        return namaMenuMakanan;
    }

    public int getJumlahMakanan() {
        return jumlahMakanan;
    }

    public String getNamaMenuMinuman() {
        return namaMenuMinuman;
    }

    public int getJumlahMinuman() {
        return jumlahMinuman;
    }

    public double getJarak() {
        return jarak;
    }

    public double getTotalHarga() {
        return totalHarga;
    }
}
