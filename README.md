# makananOnline-project
Repository diatas merupakan program Java yang menjelaskan mensimulasikan sistem manajemen restaurant. Ini memiliki login admin yang memungkinkan Anda menambah dan menghapus restoran  dan ID pelanggan yang memungkinkan Anda memesan dan melihat riwayat pesanan Anda. Program menggunakan kategori untuk merepresentasikan restaurant, menu, dan pesanan, dan untuk menyimpan informasi dalam daftar. 

Program diatas menggunakan beberapa class:

Utama: kelas utama yang berisi metode utama dan metode menu admin dan pelanggan. Restoran: kelas yang mewakili restoran dan berisi nama, alamat, dan menu restoran. Menu: kelas yang mewakili menu dan berisi peta makanan dan minuman beserta harganya. Pesan: kelas yang mewakili pesanan dan berisi ID restoran, ID menu, jumlah, jarak, dan biaya pengiriman.

Program ini daftar untuk menyimpan data:

restaurant: dalam semua restaurant dalam sistem. Daftar pesanan:daftar semua pesanan yang dilakukan oleh customer. Makan:memetakan semua item menu. untuk minum:kartu dengan semua minuman di menu. Program menggunakan objek Pemindai untuk membaca input pengguna. Program ini dirancang untuk digunakan pada konsol. 

Berikut merupakan output dari program diatas:

![image](https://user-images.githubusercontent.com/113492364/232665893-6a3d7aa5-f7ee-4df6-b543-8c8347ba5042.png)

Program ini memiliki metode utama yang menampilkan menu dengan dua opsi: masuk sebagai admin atau masuk sebagai customer. Saat opsi admin dipilih, program meminta nama pengguna dan kata sandi, dan jika kredensial yang benar dimasukkan, menampilkan menu admin dengan tiga opsi: lihat restaurant, tambahkan restaurant, dan hapus restaurant. dan juga ketika admin menambahkan restaurant mereka dapat menambahkan menu (makanan/minuman) ke dalam restaurant.

Berikut merupakan output dari program ketika admin melihat informasi restaurant:

![image](https://user-images.githubusercontent.com/113492364/232665963-bc160e5a-13b9-4a61-a9b9-31b32d32ab59.png)

Berikut merupakan output dari program ketika admin menghapus restoran:

![image](https://user-images.githubusercontent.com/113492364/232666004-7d38df09-61b3-494e-900f-786aae221f78.png)

Di menu Login Ketika opsi Customer dipilih, program menampilkan menu Customer dengan tiga opsi: melihat restaurant, pesanan, dan melihat riwayat pesanan:

![image](https://user-images.githubusercontent.com/113492364/232666047-60c57703-6045-4d7a-8b88-2de6131450fc.png)

Customer dapat memesan dengan memilih restaurant mana yang mereka inginkan:

![image](https://user-images.githubusercontent.com/113492364/232666076-f2539c39-fb57-4ea4-8032-b1021c26f583.png)

Customer dapat memilih menu makanan, jumlah makanan yang dikalikan dengan harga satuan makanan tersebut begitupula dengan meniman:

![image](https://user-images.githubusercontent.com/113492364/232666107-34615f12-b3cb-4752-b5ba-b57e80f3f3d0.png)

Customer dapat mebuat pesanan dan melihat pesanan:

![image](https://user-images.githubusercontent.com/113492364/232666133-2c93c06f-4d06-4728-a7fb-0a9a50302ae2.png)

UML (Unified Modelling Language) dari program yang saya jelaskan diatas:

![image](https://user-images.githubusercontent.com/113492364/232701461-54d8b5da-2e00-48e4-a355-9431a39e7cef.png)

