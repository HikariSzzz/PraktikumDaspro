#  PRAKTIKUM 14

Berisi hasil percobaan dari praktikum dasar pemrograman minggu ke 14

##  Identitas Mahasiswa

| Keterangan | Data                  |
| ---------- | --------------------- |
| **Nama**   | Varell Nashwa A.w     |
| **Absen**  | 29                    |

##  Jawaban

### Jawaban Percobaan 2.1

1. Tidah harus dikarenakan fungsi dapat diinisialisasi tanpa adanya parameter
2.
3. lebih terstruktur karena dikelompokkan pada blok terpisah sehingga dapat dibaca dengan lebih mudah.
4. ketika program dijalankan maka fungsi menu() akan dipanggil dan kemudian akan menjalankan program yang menampilkan daftar menu.

### Jawaban Percobaan 2.2

1. untuk menerima data dari luar fungsi yang kemudian dapat diolah di dalam fungsi tersebut.
2. Untuk dapat menerima nama pelanggan dan mengecek apakah pelanggan tersebut member atau tidak
3.

- variabel ada yang lokal dan global sedangkan parameter pasti bersifat lokal pada fungsi tersebut
- nilai pada variabel dapat diubah atau lebih dinamis, sedangkan parameter cenderung statis selama satu proses fungsi dan menerima value dari argumen yang diberikan pada saat pemanggilan fungsi tersebut.

4. parameter isMember menerima nilai saat fungsi dipanggil. ketika bernilai true maka akan ditampilkan apa yang ada di dalam blok if, jika bernilai false maka tidak akan ditampilkan apapun dan hanya menampilkan daftar menu.
5. Akan terjadi error dan tidak dapat di compile
6.
7.
8. Iya, karena dengan parameter tersebut nama pelanggan dapat disesuaikan dengan memberi nilai pada saat memanggil fungsi menu() tersebut.

### Jawaban Percobaan 2.3

1. fungsi membutuhkan return ketika tipe data nya tidak void => (public static int hitungTotalHarga(int pilih, int qty)) dan dan tidak perlu karena tipe data nya void => (public static void menu())
2. tipe data kembaliannya adalah int. terdapat 2 parameter yaitu pilih dan qty yang masing - masing digunakan untuk menerima nilai inputan user berupa pilihan menu yang diinginkan dan quantity yang diinginkan.
3.
4.

### Jawaban Percobaan 2.4

1. karena menggunakan parameter vargs yang memungkinkan parameter menyimpan banyak nilai pada saat pemanggilan fungsi dalam bentuk array.
2.
3. tidak bisa, karena dalam satu fungsi parameter vargs hanya bisa satu. jika terdapat parameter lain, parameter vargs harus diletakkan terakhir.

```java
public static void daftarPengunjung(String... namaPengunjung) {
    // statement
}

// Parameter vargs harus diletakkan terakhir jika ada parameter lain
public static void daftarPengunjung(int umur, String... namaPengunjung) {
    // statement
}
```

4. program masih bisa di kompilasi dan di jalankan, namun tidak akan menghasilkan output apapun.

### Jawaban Percobaan 2.5

1. pertama yang dilakukan menginisialisasi variabel scanner untuk menangani inputan, kemudian mendeklarasikan variabel p,l,t,L,vol dengan tipe data int. lalu, user diminta untuk menginputkan nilai p,l dan t. kemudian untuk menghitung luas, fungsi hitungLuas() dipanggil dengan parameter p dan l serta di simpan ke dalam variabel L. untuk menghitung volume, fungsi hitungVolume() dipanggil dengan parameter p, l dan t serta di simpan ke dalam variabel vol. lalu, hasil dari luas dan volume tersebut ditampilkan pada layar.
2. setelah menginputkan p = 4, l = 3 , dan t = 5. prose selanjutnya adalah menghitung luas dengan memanggil fungai hitungLuas() dengan parameter p dan l. lalu hasilnya adalah 12 dan akan disimpan ke dalam variabel L. kemudian, menghitung volume dengan memanggil fungsi hitungVolume() dengan parameter p, l dan t. lalu hasilnya adalah 60 dan akan disimpan ke dalam variabel vol. lalu, hasil dari luas dan volume tersebut ditampilkan pada layar.
3. outputnya adalah angka 1 hingga 7. Pertama yang dijalankan adalah fungsi Jumlah() dengan nilai 1 dan 1. dalam fungsi tersebut kedua parameter disimpan ke dalam int bil1 dan int bil2 kemudian keduanya dan hasil operasi tersebut dikembalikan dan tersimpan ke variabel temp. setelah itu, dipanggillah fungsi TampilJumlah() dengan nilai temp dan 5 yang akan di simpan dalam parameter int bil1 dan int bil2. dalam fungsi ini, memanggil fungsi TampilHinggaKei() dengan argumen nilai return dari fungsi Jumlah() yang argumen nya adalah bil1 dan bil2 dari fungsi TampilJumlah(). kemudian dalam fungsi TampilHinggaKei() akan dijalankan looping for sebanyak parameter i dan akan menampilkan angka 1 hingga i.
4. fungsi kita memerlukan parameter ketika terdapat nilai yang perlu ditentukan sebelumnya. seperti dari inputan user / nilainya dinamis untuk menentukan nilai variabel p dan l dalam fungsi hitungLuas(). kemudian fungsi memerlukan return value jika hasil dari fungsi tersebut ingin dikelola lagi dan jika fungsi kita berguna hanya untuk menampilkan output saja seperti fungsi menu() untuk menampilkan menu pada layar dan sebagainya, maka return value tidak diperlukan.
5. Mengacu pada fungsi hitungLuas() dan hitungVolume(), parameter sangat diperlukan untuk menentukan nilai yang akan diolah dalam fungsi tersebut sehingga fungsi tersebut dapat menghasilkan output yang dinamis sesuai dengan nilai yang diberikan pada saat pemanggilan fungsi tersebut.
6. Seperti pada fungsi hitungLuas() dan hitungVolume(), diperlukannya return value agar hasil dari fungsi tersebut dapat diolah kembali. misalnya menjadi parameter bagi fungsi lain atau untuk menampilkan output pada fungsi main(). jika fungsi yang kita buat hanya untuk menampilkan output saja, maka return value dapat tidak diperlukan