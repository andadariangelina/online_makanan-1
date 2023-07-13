class Restaurant {
    private String nama;
    private String alamat;
    private Map<String, Double> menuMakanan;
    private Map<String, Double> menuMinuman;

    public Restaurant(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.menuMakanan = new HashMap<>();
        this.menuMinuman = new HashMap<>();
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void tambahMenuMakanan(String nama, double harga) {
        menuMakanan.put(nama, harga);
    }

    public void tambahMenuMinuman(String nama, double harga) {
        menuMinuman.put(nama, harga);
    }

    public void hapusMenuMakanan(String nama) {
        menuMakanan.remove(nama);
    }

    public void hapusMenuMinuman(String nama) {
        menuMinuman.remove(nama);
    }

    public Map<String, Double> getMenuMakanan() {
        return menuMakanan;
    }

    public Map<String, Double> getMenuMinuman() {
        return menuMinuman;
    }
}
