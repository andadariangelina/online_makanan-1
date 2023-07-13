class Admin {
    private String username;
    private String password;
    private List<Restaurant> restaurants;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
        this.restaurants = new ArrayList<>();
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void tambahRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public void hapusRestaurant(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
