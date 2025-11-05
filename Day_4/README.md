# Day 4
Pada sesi pertemuan ke-4 hanya membahas satu jenis pettern, yaitu **Abstraction Factory**  
- Abstract Factory (Templete untuk Factory) --> Creational Pettern  
    Contoh kasus, misalnya kita memiliki abstract class mobil dan motor yang setiap abstract nya memiliki 3 model yang berbeda maka akan menjadi seperti berikut :  
    
    Mobil
    - HondaCar
    - ToyotaCar
    - HyundaiCar  

    Motor
    - HondaMotorcycle
    - ToyotaMotorcycle
    - HyundaiMotorcycle  

    Jika pada factory pettern biasa, kita membuat class factory di setiap model yang ingin dibuat. Apa yang terjadi bila model yang kita miliki ada banyak, maka jumlah class akan menjadi 2x lipat karena mengikuti jumlah model. Pada approaches kali ini kita membuat abstrasi pada factory.

    > Kesimpulan : bila terdapat banyak model dalam satu classification, kita perlu melakukan abstraction juga pada factory  
    Contoh kode : [Abstract Factory](src/abstractFactory/)

## Navigation
- Day 1 : [Basic OOP](../Day_1/)
- Day 2 : [Factory & Singleton](../Day_2/)
- Day 3 : [Builder & Prototype](../Day_3/)
- Day 5 : [Adapter](../Day_5/)
- Day 5 : [Facade](../Day_6/)
- Latihan Quiz : [Contoh Latihan](../Latihan-Quiz/)