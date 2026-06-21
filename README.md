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

### Pembaruan Dashboard: Pilihan Scan Otomatis dan Input Manual
<img width="720" height="1022" alt="WhatsApp Image 2026-06-17 at 09 39 09" src="https://github.com/user-attachments/assets/0bcb2b2d-1830-4ee1-a318-c6a5bbf018ad" />

Dashboard kini menyediakan dua metode input tagihan:

* **Scan Otomatis** (alur OCR/AI sedang dalam tahap pengembangan)
* **Input Manual** (sudah berfungsi penuh)

Alur input manual telah berhasil terhubung hingga:

* Input Tagihan
* Detail Tagihan
* Payment Success

Penyimpanan data ke Firebase Realtime Database juga telah berhasil berjalan dengan normal.

### Keterangan Screenshot

> Tampilan Dashboard terbaru dengan dua pilihan metode input tagihan: Scan Otomatis dan Input Manual.

### Estimasi Progress
**≈ 92%**

Alasannya:

✅ Flow aplikasi utama sudah jalan dari awal sampai akhir.

✅ Firebase sudah berhasil menyimpan data.

✅ Navigasi antar halaman sudah berfungsi.

✅ Input manual sudah selesai dan dapat digunakan.

✅ UI utama sudah jadi.

❌ Riwayat tagihan di Dashboard masih belum sinkron dengan Firebase.

❌ Fitur Scan Otomatis OCR/AI belum dibuat.

❌ Belum ada proses pembacaan nominal dari kamera.


---

### Pengembangan Fitur Scan Otomatis (CameraX)
<img width="691" height="1536" alt="Screenshot_2026-06-19_082957 027" src="https://github.com/user-attachments/assets/da03a12c-9136-48ed-ba9f-3e709161c29a" />

* Berhasil mengintegrasikan kamera menggunakan CameraX.
* Preview kamera sudah tampil di Dashboard2.
* Tombol "Ambil Foto Tagihan" sudah berfungsi.
* Saat ini masih menggunakan data simulasi (Rp 50.000).
* OCR/AI pembaca teks tagihan belum diimplementasikan.

Status Progres: **94%**

### Alasan
Yang sudah selesai:

✅ Login

✅ Dashboard

✅ Input Manual

✅ Firebase Realtime Database

✅ Riwayat Tagihan

✅ Total Tagihan Otomatis

✅ Navigasi Aplikasi

✅ Kamera (Preview CameraX)


Yang belum:

⏳ OCR / AI pembaca teks tagihan otomatis

⏳ Ekstraksi nominal dari foto

⏳ Validasi hasil scan


---

## Update Progress - CameraX & OCR Preparation

<img width="720" height="1600" alt="Screenshot_2026-06-20_053655 371" src="https://github.com/user-attachments/assets/0b9ea678-7b2b-4748-a3af-4fe9b8536be7" />

Fitur scan otomatis memasuki tahap persiapan OCR. Kamera berhasil ditampilkan menggunakan CameraX dan telah terintegrasi dengan ML Kit Text Recognition. Permission kamera, preview kamera, dan tombol OCR berjalan normal tanpa mengganggu fitur Firebase maupun input manual yang sudah stabil sebelumnya.

Tahap berikutnya adalah implementasi pengambilan foto (ImageCapture), pembacaan teks dari gambar, serta ekstraksi nominal tagihan secara otomatis sebelum diteruskan ke halaman detail tagihan.

Progress Proyek Saat Ini: 95,4%


---

## 📌 UPDATE PROYEK GITHUB – BILLSCANNER (OCR + CAMERAX)

---

### 📸 Hasil Pengujian (Screenshot / Skenario)

1. **Skenario 1 – Gambar tanpa teks jelas**
<img width="720" height="1600" alt="Screenshot_2026-06-21_080701 558" src="https://github.com/user-attachments/assets/6185211c-8cfb-485c-bdb9-29456d5d5b08" />

   * Kamera berhasil mengambil gambar
   * OCR tidak menemukan teks
   * Output aplikasi:

     > “Foto jelas, tapi tidak ada teks”

2. **Skenario 2 – Gambar berisi teks nominal**
<img width="720" height="1600" alt="Screenshot_2026-06-21_081101 386 1" src="https://github.com/user-attachments/assets/119e8412-9962-4ed1-b320-1c6c1983947b" />

   * OCR berhasil membaca angka dari gambar
   * Sistem parsing berhasil mengekstrak nominal
   * Output:

     > “Nominal ditemukan: Rp 119”

3. **Skenario 3 – Setelah scan langsung masuk detail**
<img width="720" height="1600" alt="Screenshot_2026-06-21_083548 896 1" src="https://github.com/user-attachments/assets/e0e8e266-5920-45f3-b2e9-d3465bc5db55" />

   * Kamera + OCR tetap berjalan
   * Data sempat diproses, tetapi belum sepenuhnya dikirim ke halaman detail dengan benar
   * Output di Bill Detail masih default:

     > “Rp 0” (data belum tersinkron penuh dari OCR)

---

### ⚙️ Fitur yang Sudah Berhasil

* CameraX preview aktif dan stabil
* Tombol ambil gambar berfungsi
* ML Kit OCR berhasil membaca teks
* Fungsi parsing angka (`extractAmount`) sudah aktif
* Tidak ada error merah di Android Studio

### 🚧 Masalah Tersisa (Final Stage)

* Data hasil OCR belum konsisten masuk ke `BillPageActivity`
* Riwayat dashboard belum menerima data dari hasil scan otomatis
* Masih ada mismatch antara:

  * hasil OCR → intent → detail halaman

---

### 🎯 Target Berikutnya

* Menyambungkan hasil OCR (`nominalDitemukan`)
  ke `BillPageActivity`
* Menampilkan otomatis di UI detail (bukan Rp 0 lagi)
* Menyimpan hasil scan ke riwayat dashboard

---

### 📊 Progress Keseluruhan

Estimasi progres: **97.2% – 97.8%**

Sisa 2–3% fokus ke:

* Data flow OCR → Detail Page → Dashboard History
