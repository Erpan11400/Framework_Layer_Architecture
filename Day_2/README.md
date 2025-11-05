# Day 2
Pada pertemuan ke-2 kita sudah mulai mempelajari macam-macam _Desing Pettern_  

Di pertemuan ini berisikan tentang materi **Factory dan Singleton**  
- Factory (Pabrik) --> Creational Pettern  
    Kasus yang ingin di-solve adalah ketika pengguna ingin membuat sebuah object baru untuk menampung data, tidak mungkin pengguna langsung melakukan akses ke database yang kita miliki dan membuat sebuah object baru. Maka kita perlu sebuah class yang menangani pembuatan object baru, class inilah yang akan diakses oleh pengguna untuk membuat object baru dan mengembalikan object tersebut.  
    
    > Kesimpulan : Design yang menangani pembuatan sebuah model  
    Contoh kode : [Factory](src/factoryMethod/)


-   Singleton --> Creational Pettern  
    Contoh kasusnya adalah saat menggunakan class yang menangani koneksi dengan Database. Jika tanpa _Singleton_, class harus membuat object database baru setiap kali class tersebut ingin melakukan operasi CRUD ke Database. Maka dapat dibanyangkan jika terdapat 100 class ingin melakukan operasi CRUD berarti juga akan terdapat 100 object database yang dibuat, jelas jelek dan dapat menyebabkan lemot jika harus menangani banyak object.  
    Maka kita perlu sebuah _Singleton_ untuk membuat sebuah object satu kali dan dapat digunakan berkali-kali.  

    > Kesimpulan : Kita ingin membuat sebuah object yang dapat digunakan berkali-kali  
    Contoh kode : [Singleton](src/singleton/)

## Navigation
- Day 1 : [Basic OOP](../Day_1/)
- Day 3 : [Builder & Prototype](../Day_3/)
- Day 4 : [Abstract Factory](../Day_4/)
- Day 5 : [Adapter](../Day_5/)
- Day 5 : [Facade](../Day_6/)
- Latihan Quiz : [Contoh Latihan](../Latihan-Quiz/)