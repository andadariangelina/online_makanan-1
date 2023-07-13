public class Main {
    private static List<Admin> admins = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();
    private static List<Restaurant> restaurants = new ArrayList<>();

    public static void main(String[] args) {
        Admin admin = new Admin("admin", "admin");
        admins.add(admin);

        Restaurant restaurant1 = new Restaurant("GOGOBALI", "jimbaran");
        restaurant1.tambahMenuMakanan("Nasi Goreng", 15000);
        restaurant1.tambahMenuMakanan("Mie Goreng    ", 15000);
        restaurant1.tambahMenuMinuman("Es Teh", 5000);
        restaurants.add(restaurant1);

        Restaurant restaurant2 = new Restaurant("Babi GulingHaram", "Denpasar");
        restaurant2.tambahMenuMakanan("Ayam Goreng", 20000);
        restaurant2.tambahMenuMakanan("Ayam Bakar", 25000);
        restaurant2.tambahMenuMinuman("Es Jeruk", 7000);
        restaurants.add(restaurant2);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                System.out.print("Username: ");
                String username = scanner.next();
                System.out.print("Password: ");
                String password = scanner.next();

                boolean loginSukses = false;
                Admin adminAktif = null;
                for (Admin a : admins) {
                    if (a.login(username, password)) {
                        loginSukses = true;
                        adminAktif = a;
                        break;
                    }
                }

                if (loginSukses) {
                    while (true) {
                        System.out.println("Menu:");
                        System.out.println("1. Lihat Informasi Restaurant");
                        System.out.println("2. Tambah Restaurant");
                        System.out.println("3. Hapus Restaurant");
                        System.out.println("4. Kembali ke Login");
                        System.out.print("Pilihan: ");
                        pilihan = scanner.nextInt();

                        if (pilihan == 1) {
                            System.out.println("Daftar Restaurant:");
                            for (Restaurant r : restaurants) {
                                System.out.println("- " + r.getNama() + " (" + r.getAlamat() + ")");
                                System.out.println("  Menu Makanan:");
                                for (Map.Entry<String, Double> entry : r.getMenuMakanan().entrySet()) {
                                    System.out.println("  - " + entry.getKey() + " (" + entry.getValue() + ")");
                                }
                                System.out.println("  Menu Minuman:");
                                for (Map.Entry<String, Double> entry : r.getMenuMinuman().entrySet()) {
                                    System.out.println("  - " + entry.getKey() + " (" + entry.getValue() + ")");
                                }
                            }
                        } else if (pilihan == 2) {
                            System.out.print("Nama Restaurant: ");
                            String namaRestaurant = scanner.next();
                            System.out.print("Alamat Restaurant: ");
                            String alamatRestaurant = scanner.next();

                            Restaurant restaurant = new Restaurant(namaRestaurant, alamatRestaurant);
                            restaurants.add(restaurant);

                            while (true) {
                                System.out.println("Menu:");
                                System.out.println("1. Tambah Menu Makanan");
                                System.out.println("2. Tambah Menu Minuman");
                                System.out.println("3. Selesai");
                                System.out.print("Pilihan: ");
                                pilihan = scanner.nextInt();

                                if (pilihan == 1) {
                                    System.out.print("Nama Menu: ");
                                    String namaMenu = scanner.next();
                                    System.out.print("Harga: ");
                                    double harga = scanner.nextDouble();
                                    restaurant.tambahMenuMakanan(namaMenu, harga);
                                } else if (pilihan == 2) {
                                    System.out.print("Nama Menu: ");
                                    String namaMenu = scanner.next();
                                    System.out.print("Harga: ");
                                    double harga = scanner.nextDouble();
                                    restaurant.tambahMenuMinuman(namaMenu, harga);
                                } else if (pilihan == 3) {
                                    break;
                                } else {
                                    System.out.println("Pilihan tidak valid!");
                                }
                            }
                        } else if (pilihan == 3) {
                            System.out.print("Nama Restaurant yang ingin dihapus: ");
                            String namaRestaurant = scanner.next();
                            Restaurant restaurantDihapus = null;
                            for (Restaurant r : restaurants) {
                                if (r.getNama().equals(namaRestaurant)) {
                                    restaurantDihapus = r;
                                    break;
                                }
                            }
                            if (restaurantDihapus != null) {
                                restaurants.remove(restaurantDihapus);
                                System.out.println("Restaurant berhasil dihapus.");
                            } else {
                                System.out.println("Restaurant tidak ditemukan.");
                            }
                        } else if (pilihan == 4) {
                            break;
                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }
                    }
                } else {
                    System.out.println("Username atau password salah!");
                }
            } else if (pilihan == 2) {
                System.out.println("Daftar Restaurant:");
                for (Restaurant r : restaurants) {
                    System.out.println("- " + r.getNama() + " (" + r.getAlamat() + ")");
                }

                System.out.print("Pilih Restaurant: ");
                String namaRestaurant = scanner.next();
                Restaurant restaurantPilihan = null;
                for (Restaurant r : restaurants) {
                    if (r.getNama().equals(namaRestaurant)) {
                        restaurantPilihan = r;
                        break;
                    }
                }

                if (restaurantPilihan != null) {
                    List<Pesanan> pesananList = new ArrayList<>();

                    while (true) {
                        System.out.println("Menu:");
                        System.out.println("1. Buat Pesanan");
                        System.out.println("2. Lihat Pesanan");
                        System.out.println("3. Kembali ke Login");
                        System.out.print("Pilihan: ");
                        pilihan = scanner.nextInt();

                        if (pilihan == 1) {
                            System.out.println("Daftar Menu Makanan:");
                            for (Map.Entry<String, Double> entry : restaurantPilihan.getMenuMakanan().entrySet()) {
                                System.out.println("- " + entry.getKey() + " (" + entry.getValue() + ")");
                            }
                            System.out.print("Pilih Menu Makanan: ");
                            String namaMenuMakanan = scanner.next();
                            System.out.print("Jumlah: ");
                            int jumlahMakanan = scanner.nextInt();

                            System.out.println("Daftar Menu Minuman:");
                            for (Map.Entry<String, Double> entry : restaurantPilihan.getMenuMinuman().entrySet()) {
                                System.out.println("- " + entry.getKey() + " (" + entry.getValue() + ")");
                            }
                            System.out.print("Pilih Menu Minuman: ");
                            String namaMenuMinuman = scanner.next();
                            System.out.print("Jumlah: ");
                            int jumlahMinuman = scanner.nextInt();

                            System.out.print("Jarak ke lokasi antar (km): ");
                            double jarak = scanner.nextDouble();

                            double totalHarga = (jumlahMakanan * restaurantPilihan.getMenuMakanan().get(namaMenuMakanan))
                                    + (jumlahMinuman * restaurantPilihan.getMenuMinuman().get(namaMenuMinuman));

                            Pesanan pesanan = new Pesanan(restaurantPilihan, namaMenuMakanan, jumlahMakanan,
                                    namaMenuMinuman, jumlahMinuman, jarak, totalHarga);
                            pesananList.add(pesanan);
                            System.out.println("Pesanan berhasil dibuat!");
                        } else if (pilihan == 2) {
                            if (pesananList.size() > 0) {
                                System.out.println("Daftar Pesanan:");
                                for (int i = 0; i < pesananList.size(); i++) {
                                    Pesanan pesanan = pesananList.get(i);
                                    System.out.println("Pesanan " + (i+1));
                                    System.out.println("Nama Restaurant: " + pesanan.getRestaurant().getNama());
                                    System.out.println("Menu Makanan: " + pesanan.getNamaMenuMakanan() + " x " + pesanan.getJumlahMakanan());
                                    System.out.println("Menu Minuman: " + pesanan.getNamaMenuMinuman() + " x " + pesanan.getJumlahMinuman());
                                    System.out.println("Jarak ke lokasi antar: " + pesanan.getJarak() + " km");
                                    System.out.println("Total Harga: " + pesanan.getTotalHarga());
                                }
                            } else {
                                System.out.println("Belum ada pesanan.");
                            }
                        } else if (pilihan == 3) {
                            break;
                        } else {
                            System.out.println("Pilihan tidak valid!");
                        }
                    }
                } else {
                    System.out.println("Restaurant tidak ditemukan.");
                }
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
