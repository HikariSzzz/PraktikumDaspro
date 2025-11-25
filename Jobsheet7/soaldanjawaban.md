1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!


2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?

    jawaban: tertinggi = 0: Karena nilai mahasiswa tidak mungkin lebih kecil dari 0, jadi setiap nilai baru yang dimasukkan pasti lebih besar dari 0 —> langsung menggantikan nilai tertinggi.

    terendah = 100: Karena nilai mahasiswa tidak mungkin lebih besar dari 100, jadi nilai pertama yang lebih kecil dari 100 akan menjadi nilai terendah.


3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!


4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!


Pertanyaan 2.2.3

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:

    A. nilai < 0 || nilai > 100

    jawaban A: Maksud code diatas adalah nilai yang lebih besar dari 0 bisa di input dan jika nilai lebih besar dari 100 maka akan FALSE

    b. continue

    Jawaban B: Kegunaan sintaks continue adalah jika nilai dari kondisi sebelumnnya FALSE maka output akan mengulang kembali hingga sesuai dengan variabel yang ditentukan


2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE?

    Jawaban: Karena diakhir sintaks maka akan tetap mengurutkan dari mahasiswa 1, 2, 3 dst.
    Jika ditulis di awal sintaks maka nilai i akan diproses terlebih dahulu dan akan dihitung 1


3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE akan berjalan?

    Jika jumlah yang dimasukkan 19 maka perulangan WHILE yang diperoleh output adalah sama dengan jumlahnya yaitu 19


4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!


Pertanyaan 2.3.3

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali adalah “batal”, maka berapa kali perulangan dilakukan? 

    Jawaban: Tidak akan ada perulangan jika pada nama pelanggan yang dimaskukkan "batal" jadi untuk output langsung end karena ada sintaks break untuk menghentikan hasil output.


2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!

    Jawaban: if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Pesanan dibatalkan.");
                break;
            }


3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?

    Jawaban: Jika kondisi bernilai TRUE maka program akan terus diproses sampai kita sebagai user memasukkan kondisi "batal"

4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen inisialisasi dan update?
    Perulangan tersebut tetap berjalan tanpa inialisasi dan update karena
    1. kondisi membuatnnya akan selalu benar 
    2. tidak memerlukan variabel kontrol seperti i
    3. Penghentian dihentikan secara manual dengan break, bukan berdasarkan perubahan variabel
