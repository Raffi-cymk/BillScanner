# BillScanner

## 📱 BillScanner App
Aplikasi Android berbasis **Kotlin + XML** untuk simulasi pencatatan dan pembayaran tagihan.

---

## 🚀 Fitur Utama

* Input tagihan manual
* Penyimpanan data ke **Firebase Realtime Database**
* Menampilkan daftar tagihan (RecyclerView)
* Perhitungan total otomatis
* Detail tagihan per item
* Simulasi pembayaran

---

## 🔄 Alur Aplikasi

Dashboard → Scan/Input → Simpan → Detail Tagihan → Pembayaran → Kembali ke Dashboard

---

## 🧠 Teknologi

* Kotlin
* XML Layout
* Firebase Realtime Database
* Android SDK

---

## 💾 Penyimpanan Data

Data tagihan disimpan ke Firebase dalam struktur sederhana:

```json
bills: {
  id_1: {
    nama: "Pengguna",
    jumlah: "Rp 35000"
  }
}
```

---

## ⚙️ Cara Menjalankan

1. Clone repository
2. Buka di Android Studio
3. Pastikan file `google-services.json` ada di folder `/app`
4. Sync Gradle
5. Jalankan aplikasi di emulator / device

---

## 📌 Catatan

* Data tersimpan secara online (Firebase)
* Aplikasi masih tahap pengembangan (tanpa autentikasi & OCR)

---

