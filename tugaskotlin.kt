// Latihan 1
// fun main() {
//     print("Masukkan nilai: ")
//    val input = readLine()
// val nilai = input?.toIntOrNull() ?: 82  // kalau input null atau gagal konversi, nilai default 82


//     if (nilai == null) {
//         println("Nilai tidak valid! Harap masukkan angka.")
//         return
//     }

//     val grade = when {
//         nilai >= 90 -> "A"
//         nilai >= 80 -> "B"
//         nilai >= 70 -> "C"
//         nilai >= 60 -> "D"
//         else -> "E"
//     }

//     println("Nilai kamu adalah: $nilai")
//     println("Grade kamu adalah: $grade")
// }

// Latihan 2
// fun main () {
// val buku = 12000
// val pensil = 8500
// val mobil = 20000
// val total = buku + pensil + mobil
// println("total dari pembelian buku seharga $buku pensil seharga $pensil mobil seharga $mobil = totalnya $total")
// }

// latihan 3
// fun main () {
// val angka = listOf(2,7,10,13,18,21)
// val angkaGenap = angka.filter {it%2==0}
// println("angka genap: $angkaGenap")
// }

// latihan 4
// fun main () {
//     val nama = listOf("ana","bambang","christina","iya")
//     val namaTerpanjang = nama.maxByOrNull {it.length}
//     println("nama dengan karakter terpanjang:$namaTerpanjang")
// }

// latihan 5
// fun main () {
//     val stok = listOf(10,5,20,7,12)
//     val total = stok.sum()
//     println("$total")
// }

// latihan 6
// fun main() {
//     // Data survei: nama siswa -> [Kebersihan, Fasilitas, Pelayanan, Administrasi, Keamanan]
//     val survei: Map<String, List<Int>> = mapOf(
//         "Andi" to listOf(5, 4, 4, 5, 5),
//         "Budi" to listOf(3, 3, 2, 4, 3),
//         "Citra" to listOf(4, 4, 4, 4, 4),
//         "Dewi" to listOf(2, 3, 2, 3, 2),
//         "Eka" to listOf(5, 5, 5, 4, 5)
//     )

//     val kategori = listOf("Kebersihan", "Fasilitas", "Pelayanan", "Administrasi", "Keamanan")

//     println("=== 1. Rata-rata & Status Kepuasan ===")
//     val rataSiswa = survei.mapValues { (_, skor) ->
//         skor.average()
//     }
//     rataSiswa.forEach { (nama, rata) ->
//         val status = when {
//             rata >= 4.0 -> "Sangat Puas"
//             rata >= 3.0 -> "Puas"
//             else -> "Tidak Puas"
//         }
//         println("$nama: rata-rata = ${"%.2f".format(rata)}, status = $status")
//     }

//     println("\n=== 2. Siswa dengan Rata-rata Tertinggi ===")
//     val maxEntry = rataSiswa.maxByOrNull { it.value }
//     if (maxEntry != null) {
//         println("${maxEntry.key} dengan rata-rata ${"%.2f".format(maxEntry.value)}")
//     }

//     println("\n=== 3. Rata-rata Tiap Kategori ===")
//     kategori.forEachIndexed { index, namaKategori ->
//         val rataKategori = survei.values.map { it[index] }.average()
//         println("$namaKategori: ${"%.2f".format(rataKategori)}")
//     }

//     println("\n=== 4. Siswa dengan Skor < 3 pada 'Pelayanan' ===")
//     val pelayananIndex = kategori.indexOf("Pelayanan")
//     survei.filter { (_, skor) -> skor[pelayananIndex] < 3 }
//         .keys
//         .forEach { println(it) }
// }

// Latihan 7
// fun main() {
//     // 1. Data peminjaman minimal 5 siswa
//     data class Peminjaman(
//         val namaSiswa: String,
//         val daftarBuku: List<String>,
//         val sudahDikembalikan: Boolean
//     )

//     val dataPeminjaman = listOf(
//         Peminjaman("Andi", listOf("Kotlin Dasar", "Pemrograman Java"), false),
//         Peminjaman("Budi", listOf("Algoritma dan Struktur Data", "Kotlin Dasar", "Desain Database"), true),
//         Peminjaman("Citra", listOf("Fisika Dasar", "Matematika Lanjut"), false),
//         Peminjaman("Dewi", listOf("Kotlin Dasar"), false),
//         Peminjaman("Eka", listOf("Pemrograman Python", "Machine Learning", "AI Dasar", "Big Data"), true)
//     )

//     println("=== 2. Siswa yang belum mengembalikan buku ===")
//     dataPeminjaman
//         .filter { !it.sudahDikembalikan }
//         .forEach { println(it.namaSiswa) }

//     println("\n=== 3. Semua judul buku unik yang pernah dipinjam ===")
//     val semuaBukuUnik = dataPeminjaman
//         .flatMap { it.daftarBuku }
//         .map { it.trim() }
//         .toSet()
//     semuaBukuUnik.forEach { println(it) }

//     println("\n=== 4. Siswa yang meminjam lebih dari 2 buku ===")
//     dataPeminjaman
//         .filter { it.daftarBuku.size > 2 }
//         .forEach { println("${it.namaSiswa} (${it.daftarBuku.size} buku)") }

//     println("\n=== 5. Siswa yang meminjam 'Kotlin Dasar' (case-insensitive) ===")
//     dataPeminjaman
//         .filter { peminjaman ->
//             peminjaman.daftarBuku.any { it.equals("Kotlin Dasar", ignoreCase = true) }
//         }
//         .forEach { println(it.namaSiswa) }

//     println("\n=== 6. Total seluruh buku yang dipinjam ===")
//     val totalBuku = dataPeminjaman.sumOf { it.daftarBuku.size }
//     println("Total buku dipinjam: $totalBuku")
// }

// Latihan 8
// fun main() {
//     // Data kehadiran: nama siswa -> daftar hadir (true) / tidak hadir (false)
//     val kehadiran: Map<String, List<Boolean>> = mapOf(
//         "Andi" to listOf(true, true, false, true, true, true, true, true),
//         "Budi" to listOf(true, false, false, true, true, false, true, false),
//         "Citra" to listOf(true, true, true, true, true, true, true, true),
//         "Dewi" to listOf(false, true, false, false, true, false, true, false),
//         "Eka" to listOf(true, true, true, false, true, true, true, false),
//         "Fajar" to listOf(true, false, true, true, false, true, true, true),
//         "Gina" to listOf(true, true, false, true, false, true, false, true),
//         "Hadi" to listOf(true, false, true, false, true, false, true, false),
//         "Ika" to listOf(true, true, true, true, false, false, true, true),
//         "Joko" to listOf(false, false, false, false, true, true, false, true)
//     )

//     val totalPertemuan = 8

//     println("=== 1. Jumlah Kehadiran Tiap Siswa ===")
//     val hadirCount = kehadiran.mapValues { entry -> entry.value.count { it } }
//     hadirCount.forEach { (nama, jumlah) ->
//         println("$nama: $jumlah kali hadir")
//     }

//     println("\n=== 2. Siswa dengan Kehadiran < 6 ===")
//     hadirCount.filter { it.value < 6 }
//         .forEach { (nama, jumlah) -> println("$nama: $jumlah kali hadir") }

//     println("\n=== 3. Kehadiran Tertinggi & Terendah ===")
//     val maxHadir = hadirCount.maxByOrNull { it.value }
//     val minHadir = hadirCount.minByOrNull { it.value }
//     if (maxHadir != null) println("Tertinggi: ${maxHadir.key} (${maxHadir.value} kali)")
//     if (minHadir != null) println("Terendah: ${minHadir.key} (${minHadir.value} kali)")

//     println("\n=== 4. Persentase Rata-rata Kehadiran Kelas ===")
//     val totalHadirKelas = hadirCount.values.sum()
//     val totalKehadiranMaks = kehadiran.size * totalPertemuan
//     val rataPersen = (totalHadirKelas.toDouble() / totalKehadiranMaks) * 100
//     println("Rata-rata kehadiran kelas: %.2f%%".format(rataPersen))

//     println("\n=== 5. Pesan Tidak Layak Ikut Ujian (< 75% Kehadiran) ===")
//     hadirCount.forEach { (nama, jumlah) ->
//         val persen = (jumlah.toDouble() / totalPertemuan) * 100
//         if (persen < 75) {
//             println("$nama: $persen% -> Tidak layak ikut ujian")
//         }
//     }
// }

// LATIHAN 9
// fun main() {
//     // Data class untuk menyimpan pemesanan
//     data class Pemesanan(
//         val namaSiswa: String,
//         val hari: String,
//         val jam: String,
//         val lab: String,
//         val disetujui: Boolean
//     )

//     // 1. Simpan minimal 6 data pemesanan
//     val dataPemesanan = listOf(
//         Pemesanan("Andi", "Senin", "08.00–10.00", "Lab AI", true),
//         Pemesanan("Budi", "Kamis", "08.00–10.00", "Lab AI", false),
//         Pemesanan("Citra", "Jumat", "10.00–12.00", "Lab Kimia", true),
//         Pemesanan("Dewi", "Jumat", "13.00–15.00", "Lab AI", false),
//         Pemesanan("Eka", "Rabu", "08.00–10.00", "Lab Fisika", true),
//         Pemesanan("Fajar", "Senin", "10.00–12.00", "Lab AI", true),
//         Pemesanan("Gina", "Jumat", "08.00–10.00", "Lab Komputer", true)
//     )

//     println("=== 2. Pemesanan yang Belum Disetujui ===")
//     dataPemesanan.filter { !it.disetujui }
//         .forEach { println("${it.namaSiswa} - ${it.lab} (${it.hari} ${it.jam})") }

//     println("\n=== 3. Total Pemesanan per Laboratorium ===")
//     dataPemesanan.groupingBy { it.lab }
//         .eachCount()
//         .forEach { (lab, jumlah) -> println("$lab: $jumlah pemesanan") }

//     println("\n=== 4. Siswa yang Memesan pada Hari Jumat ===")
//     dataPemesanan.filter { it.hari.equals("Jumat", ignoreCase = true) }
//         .forEach { println(it.namaSiswa) }

//     println("\n=== 5. Cek apakah 'Lab AI' digunakan di jam tertentu ===")
//     fun cekLabDigunakan(hari: String, jam: String): Boolean {
//         return dataPemesanan.any {
//             it.lab.equals("Lab AI", ignoreCase = true) &&
//             it.hari.equals(hari, ignoreCase = true) &&
//             it.jam.equals(jam, ignoreCase = true)
//         }
//     }
//     val hariCek = "Kamis"
//     val jamCek = "08.00–10.00"
//     println("Lab AI pada $hariCek $jamCek digunakan? ${cekLabDigunakan(hariCek, jamCek)}")

//     println("\n=== 6. Siswa yang Memesan Lebih dari Satu Kali ===")
//     dataPemesanan.groupingBy { it.namaSiswa }
//         .eachCount()
//         .filter { it.value > 1 }
//         .forEach { (nama, jumlah) -> println("$nama: $jumlah kali") }
// }

// // Latihan 10
// fun main() {
//     val siswaPilihan: Map<String, List<String>> = mapOf(
//         "Aiko" to listOf("Kotlin", "Java", "Python"),
//         "Budi" to listOf("C++", "Python", "Java"),
//         "Citra" to listOf("Python", "C#", "Kotlin"),
//         "Doni" to listOf("Java", "C++", "C"),
//         "Eka" to listOf("C#", "Kotlin", "Java")
//     )

//     println("=== Mulai Misi Bahasa Pemrograman ===")

//     // 1. Semua bahasa pemrograman yang pernah dipilih
//     val semuaBahasa = siswaPilihan.values.flatten().toSet()
//     println("\n[1] Semua Bahasa yang Dipilih: $semuaBahasa")

//     // 2. Hitung jumlah pemilih setiap bahasa, urutkan dari yang paling banyak
//     val jumlahPemilih = siswaPilihan.values.flatten()
//         .groupingBy { it }
//         .eachCount()
//         .toList()
//         .sortedByDescending { it.second }
//         .toMap()
//     println("\n[2] Jumlah Pemilih per Bahasa:")
//     jumlahPemilih.forEach { (bahasa, jumlah) ->
//         println("- $bahasa : $jumlah pemilih")
//     }

//     // 3. Siswa yang memilih "Kotlin" sebagai pilihan pertama
//     val siswaPilihKotlinPertama = siswaPilihan.filter { it.value.isNotEmpty() && it.value[0] == "Kotlin" }.keys
//     println("\n[3] Siswa dengan Pilihan Pertama Kotlin: $siswaPilihKotlinPertama")

//     // 4. Hitung siswa yang memilih "Python" di posisi manapun
//     val jumlahPilihPython = siswaPilihan.count { it.value.contains("Python") }
//     println("\n[4] Jumlah Siswa Pilih Python di Posisi Manapun: $jumlahPilihPython")

//     // 5. Bahasa yang tidak dipilih sama sekali dari list yang diberikan
//     val daftarBahasa = listOf("Kotlin", "Java", "C++", "Python", "C", "C#")
//     val bahasaTidakDipilih = daftarBahasa.filter { it !in semuaBahasa }
//     println("\n[5] Bahasa yang Tidak Dipilih Sama Sekali: $bahasaTidakDipilih")

//     println("\n=== Misi Selesai! Semua Data Telah Terbuka! ===")
// }
