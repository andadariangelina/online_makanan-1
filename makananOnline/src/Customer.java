class Customer {
    private String username;
    private String password;
    private List<Restaurant> favorit;
    private Map<Restaurant, Map<String, Integer>> pesanan;

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
        this.favorit = new ArrayList<>();
        this.pesanan = new HashMap<>();
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void tambahFavorit(Restaurant restaurant) {
        favorit.add(restaurant);
    }

    public void buatPesanan(Restaurant restaurant, String menu, int kuantitas) {
        if (!pesanan.containsKey(restaurant)) {
            pesanan.put(restaurant, new HashMap<>());
        }
        Map<String, Integer> menuKuantitas = pesanan.get(restaurant);
        menuKuantitas.put(menu, kuantitas);
    }

    public Map<Restaurant, Map<String, Integer>> getPesanan() {
        return pesanan;
    }
}
