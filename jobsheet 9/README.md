# 🧪 PRAKTIKUM 9

Berisi hasil percobaan dari praktikum dasar pemrograman miinggu ke 9

## 👤 Identitas Mahasiswa

| Keterangan | Data                  |
| ---------- | --------------------- |
| **Nama**   | Varel Nashwa alifio.w |
| **Absen**  | 29                    |

## ✏️ Jawaban

### Jawaban Percobaan 2.1

1. Perulangan akan dijalankan sebanyak n + 1, karena iterasi dimulai dari 0 dan berakhir sesuai dengan value n
2. Perulangan akan berhenti jika i sama dengan value n. Output nya akan mencetak \* sebanyak 4. Karena perulangan akan dijalankan ketika i kurang dari value n sehingga ketika i sama dengan value n kondisi tidak terpenuhi atau false
3. Perulangan tidak akan dijalankan karena value n tidak melebihi i. jika value n adalah 0 maka perulangan akan dijalankan secara terus menerus (infinity looping)
4. Perulangan akan terus dijalankan (infinity looping) karena kondisi akan terus terpenuhi dimana i akan selalu kurang dari value n
5. Output nya akan mencetak bintang sebanyak 3x. Karena setiap iterasi value i akan ditambah dua
   (1) => Iterasi 0
   (1+2=3) => Iterasi 1
   (3+2=5) => Iterasi 2
   (5+2=7) => Iterasi 3 (perulangan berhenti)

### Jawaban Percobaan 2.2

1. Output akan menghasilkan jumlah baris sebanyak n + 1. karena iterasi dimulai dari 0 dan berakhir sesuai value n
2. Output akan mencetak bintang sebanyak n + 1. karena iterasi dimulai dari 0 dan berakhir sesuai value n
3. Perulangan luar digunakan untuk menentukan banyak baris yang diinginkan, perulangan di dalamnya untuk menentukan banyak bintang yang ingin ditampilkan
4. Untuk membuat baris baru setelah perulangan mencetak bintang selesai dilakukan. Outputnya akan menghasilkan bintang dalam satu baris

### Jawaban Percobaan 2.3

1. tidak sesuai
2. penambahan System.out.println(); untuk membuat baris baru setelah increment variabel i
3. Variabel i digunakan untuk baris yang akan dicetak, j digunakan untuk mencetak bintang. jika j tidak di reset maka bintang hanya ditampilkan 1 kali tiap barisnya.

### Jawaban Percobaan 2.4

1. Variabel totalNilai digunakan untuk menyimpan total nilai dari setiap anggota pada 1 kelompok yang nantinya digunakan dalam perhitungan rata-rata. variabel ini di inisialisasi di dalam outer loop untuk menyimpan total nilai dari setiap kelompok.