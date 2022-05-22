package com.tutorial.clean.code.chapter13.c05;

public class TestDrive {

    public static void main(String[] args) {

        /*
            - threadleri shutdown etmeyi unutmayın ve bu senaryoları düşünün.
            producer üretmeyi bırakabilir ve shutdown olur ama consumerin
            bundan haberi olması lazım bu tarz sorunlara dikkat etmemiz gerekir.

            - Env variableları kullanın kodun içinde statik ayarlamalar
            yapmamak gerekir. (kod geçiş maliyeti, test maliyeti vs..)

            - threadleri daha iyi analiz edebilmek adına sleep, wait vs gibi
            methodlar kullanılabilir. (test ortamı ve local için tabiki prod değil)

            Özet:
            - SRP uy
            - synchronized blocklarını ufak tut.
            - libraryleri doğru ve efektif kullan
            - threadlerin ortak data paylaşımlarına dikkat et
            - YÜK TESTI
         */
    }
}
