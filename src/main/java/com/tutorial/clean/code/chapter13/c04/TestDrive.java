package com.tutorial.clean.code.chapter13.c04;

public class TestDrive {

    public static void main(String[] args) {

        /*

        Bound Resources: Best practise 8 connection
            - 8 az değil mi?
        Mutual Exclusion: Konuştuk
        Starvation: -> Reader Writer
        Deadlock: Kilitlenme
            - 2 yada daha fazla eylemin devam etmek için birbirlerinin
            bitmesini beklemesi sonuçta 2 sinin de devam edememesi durumu
        Livelock:
            Livelock'un en kolay örneği, bir koridorda yüz yüze karşılaşan ve
            ikisi de diğerinin geçmesine izin vermek için kenara çekilen iki kişi olabilir.
            O sırada aynı şekilde hareket ettikleri için herhangi bir ilerleme kaydetmeden
            bir yandan diğer yana hareket ediyorlar..

        producer consumer: producer üretir buffer veya queue ya koyuyo. consumer da okuyor. Queue mantığı.
            koymadan önce yer var mı yok mu? Consumer okunacak en az 1 şey var mı vs

        Reader writers: yazma işlemi blocklandığında throughput problemi olabilir.
            - Writer datayı güncellemeden önce datayı okuyan biri var mı?
                - Devamlı okuyan biri varsa açlıktan ölebilir
            - Çok fazla writer varsa bu sefer throughput patlar.

        Dining philospers: (Video)
            - Her filozofun solunda 1 çatal var ortada bi spagethi var
            - çatal -> resource (connection pool)
            - filozoflar -> threadler

        Synchronized block küçük tut.



         */


    }

}
