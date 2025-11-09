# pbo-thread-database

Tugas ini merupakan **sistem restoran yang berbasis Java Thread** yang terhubung ke **database MYSQL**. Setiap pelayan (waiter) dijalankan sebagai *thread* yang bekerja secara paralel untuk mencatat pesanan pelanggan ke dalam tabel database.

## Fitur Utama
- Menggunakan **multi-threading (Thread class)** untuk menjalankan beberapa pelayan sekaligus.
- Menghubungkan program **Java ke database MySQL** menggunakan JDBC.
- Setiap pelayan secara acak membuat pesanan dan menyimpannya ke database setiap beberapa detik.
- Struktur kode rapi dan terpisah menjadi beberapa kelas: `DBUtil`, `Order`, `OrderDAO`, `WaiterThread`, dan `Main`.

## Konsep Thread yang di implementasikan 
- Setiap WaiterThread berjalan secara paralel.
- Tiap thread membuat data pesanan secara acak.
- Kelas OrderDAO mengatur penyimpanan ke database menggunakan PreparedStatement.
- Thread akan terus berjalan hingga program dihentikan.
---

## Struktur Folder 
restaurant-thread/
│
├── src/
│ ├── DBUtil.java → Koneksi ke database MySQL
│ ├── Order.java → Representasi data pesanan
│ ├── OrderDAO.java → Kelas untuk menyimpan pesanan ke database
│ ├── WaiterThread.java → Thread untuk simulasi pelayan restoran
│ └── Main.java → Program utama (entry point)
│
└── README.md