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

Oke, bener. Kita rapihin **sesuai kondisi real pertama kali buka aplikasi** (belum ada data). Ini versi yang runtut dan masuk akal. Tinggal copas.

---

## 📸 Penjelasan UI

### Dashboard (Awal)
Halaman utama saat aplikasi dibuka. Pada kondisi awal, daftar tagihan masih kosong karena belum ada data yang diinput. Menampilkan total tagihan = 0 dan tombol navigasi ke halaman scan/input.

<img width="720" height="1600" alt="Screenshot_20260418-052107" src="https://github.com/user-attachments/assets/71bca579-509c-4f59-a87b-ab4932b5a274" />


### Scan / Input Tagihan
Halaman untuk memasukkan nominal tagihan secara manual. User mengisi jumlah, lalu menekan tombol simpan. Data akan divalidasi (tidak boleh kosong) dan dikirim untuk disimpan ke Firebase.

<img width="720" height="1600" alt="Screenshot_20260418-052207" src="https://github.com/user-attachments/assets/75633385-716d-4839-9386-4d41497cbad9" />


### Detail Tagihan (Bill Page)
Setelah data disimpan, aplikasi menampilkan detail tagihan yang baru saja diinput, berupa nama pengguna dan jumlah tagihan. Data dikirim dari halaman sebelumnya menggunakan Intent.

<img width="720" height="1600" alt="Screenshot_20260418-052251" src="https://github.com/user-attachments/assets/afb92175-22b2-493b-a5f1-8db6d424d3dd" />


### Payment Success
Halaman konfirmasi bahwa pembayaran berhasil dilakukan (simulasi). Dari sini user bisa kembali ke dashboard.

<img width="720" height="1600" alt="Screenshot_20260418-052256" src="https://github.com/user-attachments/assets/ca3fc71b-5388-4d7d-9fce-14528ad10106" />


### Dashboard (Setelah Ada Data)
Kembali ke dashboard setelah proses input/pembayaran. Daftar tagihan sudah muncul (tidak kosong), ditampilkan dalam bentuk list. Total tagihan dihitung otomatis dari seluruh data yang ada di Firebase.

<img width="720" height="1600" alt="Screenshot_20260418-052259" src="https://github.com/user-attachments/assets/cb935316-6761-41de-a771-16a088d74bfe" />


---

## 📌 Catatan

* Data tersimpan secara online (Firebase)
* Aplikasi masih tahap pengembangan (tanpa autentikasi & OCR)
