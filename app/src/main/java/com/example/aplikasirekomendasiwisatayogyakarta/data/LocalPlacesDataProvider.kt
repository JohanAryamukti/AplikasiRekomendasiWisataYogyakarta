package com.example.aplikasirekomendasiwisatayogyakarta.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.Forest
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocalCafe
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material.icons.filled.TwoWheeler
import androidx.compose.material.icons.filled.Water
import com.example.aplikasirekomendasiwisatayogyakarta.R
import com.example.aplikasirekomendasiwisatayogyakarta.model.CategoryType
import com.example.aplikasirekomendasiwisatayogyakarta.model.Place

object LocalPlacesDataProvider {

    val allPlaces = listOf(
        // 1. DESTINASI ALAM
        Place(
            id = 1,
            name = "Hutan Pinus Mangunan",
            category = CategoryType.ALAM,
            location = "Sukorame, Mangunan, Dlingo, Bantul",
            openHours = "06.00 - 18.00 WIB",
            ticketPrice = "Rp 7.000 / orang",
            rating = 4.8,
            tags = listOf("Udara Sejuk", "Spot Foto", "Keluarga"),
            visitingTip = "Datang pukul 06.30 - 08.00 WIB untuk menikmati kabut tipis dan cahaya matahari di sela pohon pinus.",
            description = "Kawasan hutan pinus yang sejuk dan asri di perbukitan Dlingo. Cocok untuk bersantai di bawah rindangnya pohon pinus, berfoto di panggung alam terbuka, maupun menikmati udara pagi yang segar.",
            icon = Icons.Default.Forest,
            imageRes = R.drawable.hutan_pinus
        ),
        Place(
            id = 2,
            name = "Tebing Breksi",
            category = CategoryType.ALAM,
            location = "Sambirejo, Prambanan, Sleman",
            openHours = "06.00 - 21.00 WIB",
            ticketPrice = "Rp 10.000 / orang",
            rating = 4.7,
            tags = listOf("Lanskap Kota", "Sunset", "Amphitheater"),
            visitingTip = "Waktu terbaik berkunjung adalah sore hari menjelang matahari terbenam agar tidak terlalu terik.",
            description = "Bekas area tambang batu kapur yang disulap menjadi destinasi wisata eksotis dengan ukiran relief raksasa pada dinding tebing serta pemandangan Candi Prambanan dan Gunung Merapi dari ketinggian.",
            icon = Icons.Default.Landscape,
            imageRes = R.drawable.tebing_breksi
        ),
        Place(
            id = 3,
            name = "Pantai Parangtritis",
            category = CategoryType.ALAM,
            location = "Parangtritis, Kretek, Bantul",
            openHours = "24 Jam",
            ticketPrice = "Rp 15.000 / orang",
            rating = 4.6,
            tags = listOf("Pantai Selatan", "Gumuk Pasir", "Sunset"),
            visitingTip = "Jangan berenang terlalu ke tengah karena ombak pantai selatan cukup kuat; nikmati area tepi pantai atau naik bendi.",
            description = "Pantai ikonik di pesisir selatan Yogyakarta yang terkenal dengan garis pantai luas, gumuk pasir, aktivitas menyusuri pantai dengan bendi, serta panorama matahari terbenam yang memukau.",
            icon = Icons.Default.Water,
            imageRes = R.drawable.pantai_parangtritis
        ),

        // 2. COFFEE SHOP
        Place(
            id = 4,
            name = "Street Coffee Kotabaru",
            category = CategoryType.COFFEE_SHOP,
            location = "Jl. Suroto, Kotabaru, Gondokusuman, Yogyakarta",
            openHours = "16.00 - 00.00 WIB",
            ticketPrice = "Mulai Rp 12.000",
            rating = 4.7,
            tags = listOf("Street Coffee", "Nongkrong Malam", "Ramah Kantong"),
            visitingTip = "Datang setelah pukul 19.30 WIB untuk merasakan suasana malam kawasan heritage Kotabaru yang hidup.",
            description = "Konsep ngopi santai di pinggir jalan kawasan heritage Kotabaru yang rindang. Menawarkan beragam racikan kopi susu gula aren hingga manual brew dengan suasana malam kota Jogja yang hangat.",
            icon = Icons.Default.Storefront,
            imageRes = R.drawable.street_coffee
        ),
        Place(
            id = 5,
            name = "Warung Kopi Klotok",
            category = CategoryType.COFFEE_SHOP,
            location = "Jl. Kaliurang Km. 16, Pakem, Sleman",
            openHours = "07.00 - 21.30 WIB",
            ticketPrice = "Mulai Rp 10.000",
            rating = 4.9,
            tags = listOf("View Sawah", "Kopi Tradisional", "Kuliner"),
            visitingTip = "Hindari jam makan siang akhir pekan jika tidak ingin antre panjang; pagi hari adalah waktu paling nyaman.",
            description = "Tempat ngopi bernuansa pedesaan Jawa dengan pemandangan langsung ke hamparan sawah hijau. Terkenal dengan kopi klotok yang dimasak di atas tungku arang serta pisang goreng hangatnya.",
            icon = Icons.Default.LocalCafe,
            imageRes = R.drawable.kopi_klotok
        ),
        Place(
            id = 6,
            name = "Filosofi Kopi Jogja",
            category = CategoryType.COFFEE_SHOP,
            location = "Jl. Pandhawa, Tegal Rejo, Ngaglik, Sleman",
            openHours = "10.00 - 23.00 WIB",
            ticketPrice = "Mulai Rp 20.000",
            rating = 4.7,
            tags = listOf("Joglo Klasik", "Specialty Coffee", "Outdoor"),
            visitingTip = "Coba menu signature kopi Tiwus atau Perfecto sambil duduk di area halaman joglo bagian belakang.",
            description = "Kedai kopi berkonsep joglo tradisional dengan halaman terbuka yang luas dan teduh. Menyajikan biji kopi nusantara pilihan dengan suasana nyaman untuk nongkrong maupun diskusi santai.",
            icon = Icons.Default.LocalCafe,
            imageRes = R.drawable.filosofi_kopi
        ),

        // 3. DESTINASI REKREASI
        Place(
            id = 7,
            name = "Obelix Hills",
            category = CategoryType.REKREASI,
            location = "Klumprit, Wukirharjo, Prambanan, Sleman",
            openHours = "10.00 - 21.00 WIB",
            ticketPrice = "Rp 20.000 - Rp 25.000",
            rating = 4.7,
            tags = listOf("Spot Instagramable", "Live Music", "City Light"),
            visitingTip = "Gunakan kendaraan dengan kondisi rem dan kopling prima karena akses jalan menuju lokasi cukup menanjak.",
            description = "Destinasi rekreasi modern di atas perbukitan batu purba dengan puluhan spot foto estetik, area bersantai bean bag, live music, dan pemandangan sunset serta city light Yogyakarta dari ketinggian.",
            icon = Icons.Default.Landscape,
            imageRes = R.drawable.obelix_hills
        ),
        Place(
            id = 8,
            name = "ATV Adventure Kaliurang",
            category = CategoryType.REKREASI,
            location = "Hargobinangun, Pakem, Kaliurang, Sleman",
            openHours = "08.00 - 16.30 WIB",
            ticketPrice = "Mulai Rp 150.000 / unit",
            rating = 4.8,
            tags = listOf("Adrenalin", "Off-Road", "Hutan Kaliurang"),
            visitingTip = "Bawa pakaian ganti dan sandal cadangan karena jalur melintasi kubangan lumpur dan sungai dangkal.",
            description = "Wahana petualangan mengendarai motor ATV melintasi jalur off-road lereng Gunung Merapi, melewati jalan berbatu, kubangan lumpur, sungai dangkal, dan rimbunnya hutan pinus Kaliurang.",
            icon = Icons.Default.TwoWheeler,
            imageRes = R.drawable.atv_kaliurang
        ),
        Place(
            id = 9,
            name = "Jeep Lava Tour Merapi Kaliurang",
            category = CategoryType.REKREASI,
            location = "Kaliurang / Cangkringan, Sleman",
            openHours = "04.30 - 16.00 WIB",
            ticketPrice = "Mulai Rp 350.000 / jeep",
            rating = 4.9,
            tags = listOf("Wisata Sejarah", "Sunrise Trip", "Rombongan"),
            visitingTip = "Pilih paket Sunrise Trip (berangkat pukul 04.30 WIB) dan gunakan jaket tebal karena suhu lereng Merapi sangat dingin.",
            description = "Wisata petualangan menggunakan mobil jeep terbuka menyusuri jejak erupsi Gunung Merapi, mengunjungi Museum Sisa Hartaku, Batu Alien, Bunker Kaliadem, dan manuver air di Kalikuning.",
            icon = Icons.Default.DirectionsCar,
            imageRes = R.drawable.jeep_merapi
        )
    )

    val defaultPlace: Place = allPlaces.first()

    fun getPlacesByCategory(category: CategoryType): List<Place> {
        return allPlaces.filter { it.category == category }
    }
}