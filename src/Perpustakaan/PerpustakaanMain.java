package Perpustakaan;

public class PerpustakaanMain {
    public static void main(String[] args) {
        Kategori teknologi = new Kategori("Teknologi", "Koleksi buku ilmu komputer, rekayasa perangkat lunak, dan kecerdasan buatan");
        teknologi.tambahBuku(new Buku("TKN-01", "Clean Code", 2008, "Prentice Hall", new Penulis[]{new Penulis("Robert C. Martin", "Amerika Serikat")}));
        teknologi.tambahBuku(new Buku("TKN-02", "The Pragmatic Programmer", 1999, "Addison-Wesley", new Penulis[]{new Penulis("Andrew Hunt", "Amerika Serikat"), new Penulis("David Thomas", "Inggris")}));
        teknologi.tambahBuku(new Buku("TKN-03", "Design Patterns", 1994, "Addison-Wesley", new Penulis[]{new Penulis("Erich Gamma", "Swiss"), new Penulis("Richard Helm", "Australia"), new Penulis("Ralph Johnson", "Amerika Serikat"), new Penulis("John Vlissides", "Amerika Serikat")}));
        teknologi.tambahBuku(new Buku("TKN-04", "Introduction to Algorithms", 2009, "MIT Press", new Penulis[]{new Penulis("Thomas H. Cormen", "Amerika Serikat"), new Penulis("Charles E. Leiserson", "Amerika Serikat"), new Penulis("Ronald L. Rivest", "Amerika Serikat"), new Penulis("Clifford Stein", "Amerika Serikat")}));
        teknologi.tambahBuku(new Buku("TKN-05", "Artificial Intelligence: A Modern Approach", 2020, "Pearson", new Penulis[]{new Penulis("Stuart Russell", "Inggris"), new Penulis("Peter Norvig", "Amerika Serikat")}));

        Kategori filsafat = new Kategori("Filsafat", "Koleksi buku pemikiran mendasar mengenai eksistensi, etika, dan logika");
        filsafat.tambahBuku(new Buku("FLS-01", "Republik", 1992, "Penguin Classics", new Penulis[]{new Penulis("Plato", "Yunani")}));
        filsafat.tambahBuku(new Buku("FLS-02", "Etika Nikomakea", 1999, "Hackett Publishing", new Penulis[]{new Penulis("Aristoteles", "Yunani")}));
        filsafat.tambahBuku(new Buku("FLS-03", "Meditations", 2002, "Modern Library", new Penulis[]{new Penulis("Marcus Aurelius", "Romawi")}));
        filsafat.tambahBuku(new Buku("FLS-04", "Critique of Pure Reason", 1998, "Cambridge University Press", new Penulis[]{new Penulis("Immanuel Kant", "Jerman")}));
        filsafat.tambahBuku(new Buku("FLS-05", "Dialectic of Enlightenment", 2002, "Stanford University Press", new Penulis[]{new Penulis("Max Horkheimer", "Jerman"), new Penulis("Theodor W. Adorno", "Jerman")}));

        Kategori sejarah = new Kategori("Sejarah", "Koleksi buku peristiwa masa lalu dan perkembangan peradaban manusia");
        sejarah.tambahBuku(new Buku("SJR-01", "Sapiens: Riwayat Singkat Umat Manusia", 2017, "Kepustakaan Populer Gramedia", new Penulis[]{new Penulis("Yuval Noah Harari", "Israel")}));
        sejarah.tambahBuku(new Buku("SJR-02", "Guns, Germs, and Steel", 1997, "W. W. Norton", new Penulis[]{new Penulis("Jared Diamond", "Amerika Serikat")}));
        sejarah.tambahBuku(new Buku("SJR-03", "Sejarah Nasional Indonesia Jilid I", 2008, "Balai Pustaka", new Penulis[]{new Penulis("Marwati Djoened Poesponegoro", "Indonesia"), new Penulis("Nugroho Notosusanto", "Indonesia")}));
        sejarah.tambahBuku(new Buku("SJR-04", "Nusantara: Sejarah Indonesia", 2010, "Kepustakaan Populer Gramedia", new Penulis[]{new Penulis("Bernard H. M. Vlekke", "Belanda")}));
        sejarah.tambahBuku(new Buku("SJR-05", "The Silk Roads: A New History of the World", 2015, "Bloomsbury", new Penulis[]{new Penulis("Peter Frankopan", "Inggris")}));

        Kategori agama = new Kategori("Agama", "Koleksi buku kajian teologi, spiritualitas, dan studi keagamaan");
        agama.tambahBuku(new Buku("AGM-01", "Ihya Ulumuddin", 2011, "Republika Penerbit", new Penulis[]{new Penulis("Imam Al-Ghazali", "Persia")}));
        agama.tambahBuku(new Buku("AGM-02", "Wawasan Al-Quran", 1996, "Mizan", new Penulis[]{new Penulis("M. Quraish Shihab", "Indonesia")}));
        agama.tambahBuku(new Buku("AGM-03", "Sejarah Tuhan", 2001, "Mizan", new Penulis[]{new Penulis("Karen Armstrong", "Inggris")}));
        agama.tambahBuku(new Buku("AGM-04", "The World's Religions", 1991, "HarperOne", new Penulis[]{new Penulis("Huston Smith", "Amerika Serikat")}));
        agama.tambahBuku(new Buku("AGM-05", "Studi Islam: Pendekatan Interdisipliner", 2018, "Rajawali Pers", new Penulis[]{new Penulis("Amin Abdullah", "Indonesia"), new Penulis("Komaruddin Hidayat", "Indonesia")}));

        Kategori psikologi = new Kategori("Psikologi", "Koleksi buku perilaku manusia, kognisi, dan kesehatan mental");
        psikologi.tambahBuku(new Buku("PSK-01", "Thinking, Fast and Slow", 2011, "Farrar, Straus and Giroux", new Penulis[]{new Penulis("Daniel Kahneman", "Israel")}));
        psikologi.tambahBuku(new Buku("PSK-02", "Man's Search for Meaning", 1946, "Beacon Press", new Penulis[]{new Penulis("Viktor E. Frankl", "Austria")}));
        psikologi.tambahBuku(new Buku("PSK-03", "Emotional Intelligence", 1995, "Bantam Books", new Penulis[]{new Penulis("Daniel Goleman", "Amerika Serikat")}));
        psikologi.tambahBuku(new Buku("PSK-04", "The Social Animal", 2018, "Worth Publishers", new Penulis[]{new Penulis("Elliot Aronson", "Amerika Serikat"), new Penulis("Joshua Aronson", "Amerika Serikat")}));
        psikologi.tambahBuku(new Buku("PSK-05", "Psikologi Perkembangan", 2015, "Erlangga", new Penulis[]{new Penulis("Elizabeth B. Hurlock", "Amerika Serikat")}));

        Kategori politik = new Kategori("Politik", "Koleksi buku sistem pemerintahan, kekuasaan, dan kebijakan publik");
        politik.tambahBuku(new Buku("PLT-01", "Ilmu Politik", 2008, "Gramedia Pustaka Utama", new Penulis[]{new Penulis("Miriam Budiardjo", "Indonesia")}));
        politik.tambahBuku(new Buku("PLT-02", "The Prince", 2003, "Penguin Classics", new Penulis[]{new Penulis("Niccolo Machiavelli", "Italia")}));
        politik.tambahBuku(new Buku("PLT-03", "The Origins of Political Order", 2011, "Farrar, Straus and Giroux", new Penulis[]{new Penulis("Francis Fukuyama", "Amerika Serikat")}));
        politik.tambahBuku(new Buku("PLT-04", "Why Nations Fail", 2012, "Crown Business", new Penulis[]{new Penulis("Daron Acemoglu", "Turki"), new Penulis("James A. Robinson", "Inggris")}));
        politik.tambahBuku(new Buku("PLT-05", "Demokrasi dan Konstitusi di Indonesia", 2000, "Rineka Cipta", new Penulis[]{new Penulis("Mahfud MD", "Indonesia")}));

        Kategori fiksi = new Kategori("Fiksi", "Koleksi buku karya sastra, novel, dan cerita imajinatif");
        fiksi.tambahBuku(new Buku("FKS-01", "Laskar Pelangi", 2005, "Bentang Pustaka", new Penulis[]{new Penulis("Andrea Hirata", "Indonesia")}));
        fiksi.tambahBuku(new Buku("FKS-02", "Bumi Manusia", 1980, "Hasta Mitra", new Penulis[]{new Penulis("Pramoedya Ananta Toer", "Indonesia")}));
        fiksi.tambahBuku(new Buku("FKS-03", "Negeri 5 Menara", 2009, "Gramedia Pustaka Utama", new Penulis[]{new Penulis("Ahmad Fuadi", "Indonesia")}));
        fiksi.tambahBuku(new Buku("FKS-04", "Good Omens", 1990, "Gollancz", new Penulis[]{new Penulis("Terry Pratchett", "Inggris"), new Penulis("Neil Gaiman", "Inggris")}));
        fiksi.tambahBuku(new Buku("FKS-05", "Laut Bercerita", 2017, "Kepustakaan Populer Gramedia", new Penulis[]{new Penulis("Leila S. Chudori", "Indonesia")}));

        Kategori[] daftarKategori = {teknologi, filsafat, sejarah, agama, psikologi, politik, fiksi};
        for (Kategori kategori : daftarKategori) {
            kategori.tampilkanKoleksi();
        }
    }
}