# UTS Mobile Programming 1 - Unofficial RetroAchievements for Android

Selamat datang di proyek **Unofficial RetroAchievements for Android**. Aplikasi ini dikembangkan sebagai bagian dari tugas UTS Mobile Programming 1, yang bertujuan untuk menampilkan koleksi game klasik dari platform PS1, PS2, dan PSP. Fokus utama dari proyek ini adalah implementasi arsitektur Android modern, navigasi yang terstruktur, dan desain antarmuka pengguna yang responsif.

## 🚀 Fitur Utama
- **Dashboard Dinamis**: Menampilkan ringkasan game yang sedang populer (*Trending*) serta daftar game yang telah diselesaikan (*Mastered*).
- **Katalog Koleksi**: Daftar lengkap seluruh game yang tersedia dalam sistem dengan tampilan yang rapi.
- **Detail & Achievement**: Informasi mendalam mengenai setiap game, lengkap dengan daftar pencapaian (*achievements*) yang menantang.
- **Desain Dark Mode**: Antarmuka bertema gelap yang modern dengan aksen warna Cyan dan Oranye untuk kenyamanan visual.

## 📂 Struktur Proyek
Kode sumber dalam proyek ini diatur secara modular untuk memudahkan pemeliharaan dan pemahaman alur kerja aplikasi:

```text
com.example.uts_mobile_programming_1/
├── data/
│   ├── model/         # Definisi model data (Game & Achievement) menggunakan Parcelable.
│   └── DummyData.kt   # Sumber data statis yang digunakan untuk keperluan UI.
├── ui/
│   ├── adapter/       # Adapter binding data ke dalam view (RecyclerView).
│   ├── dashboard/     # Dashboard Page.
│   ├── gamelist/      # List Game Page.
│   └── detail/        # Game Detail Page dengan List Achievements.
└── MainActivity.kt    # Aktivitas utama sebagai pengatur Navigasi dan Bottom View.
```

## 🛠️ Teknologi & Library
- **Kotlin**: Bahasa pemrograman utama yang digunakan.
- **View Binding**: Memastikan interaksi dengan layout XML lebih aman dan efisien.
- **Navigation Component**: Mengelola perpindahan antar fragment secara terpusat melalui `nav_graph`.
- **ViewModel & LiveData**: Menerapkan pola reaktif untuk menjaga integritas data saat terjadi perubahan status aplikasi.
- **Material Components**: Menggunakan standar desain Material untuk komponen seperti `CardView`, `BottomNavigation`, dan `Chips`.

## ⚙️ Cara Menjalankan Aplikasi
1. **Clone** repositori ini ke komputer Anda.
2. Buka proyek menggunakan **Android Studio**.
3. Tunggu hingga proses **Gradle Sync** selesai secara otomatis.
4. Hubungkan perangkat Android atau jalankan emulator (Minimal Android 7.0 / API 24).
5. Tekan tombol **Run** untuk memulai instalasi.

---
*Proyek ini dibuat untuk memenuhi kriteria penilaian UTS Mobile Programming 1.*
