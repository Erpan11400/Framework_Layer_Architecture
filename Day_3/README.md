# Day 3
Pada pertemuan ke-3, kita akan membahas materi tentang **Builder dan Prototype**
- Builder (Kontraktor) --> Creational Pettern  
    Pada saat kita ingin membuat sebuah object, maka kita juga harus mengirimkan data yang ingin kita isi ke dalam object tersebut. Bila data yang ingin kita isi sedikit, tidak menjadi masalah, namun bagaimana jika data yang ingin diisi banyak dan kita tidak ingin mengisi semua data dan kita biarkan kosong (NULL). Contoh :  

    ```
    PizzaNoBuilder pizza = new PizzaNoBuilder("Pepperoni", "Small", null, null, null, null);
    ```  

    Dari pada harus mengisi _null_ secara manual, kita panggil saja method yang akan mengisi data sesuai keinginan kita. Maka kita perlu builder, dan pembuatan akan menjadi lebih mudah. Contoh :  

    ```
    PizzaBuilder builder = new PizzaBuilder();
	PizzaWithBuilder p1 = builder.addTopping("Pepperoni").addSize("Large").build();
    ```

    > Kesimpulan : jika ingin membuat sebuah object yang customable dalam pengisian data, gunakanlah builder  
    Contoh kode : [Builder](src/builder/)



- Prototype (Salinan atau contoh) --> Creational Pettern  
    Kasus yang ingin di-solve adalah kita ingin melakukan copas dari sebuah object ke object yang baru. Tetapi jika tanpa menerapkan prototype hanya akan menghasilkan sebuah class baru yang mengarah ke class lama bukan sebuah class baru yang independent. Contoh :  

    ```
    Cat cat = new Cat("Riki", "Shorthair", 1);
	Cat cat2 = cat;
    cat.setName("Kety");
    cat.printDetail();
    cat2.printDetail();
    ```
    pada kasus ini, maka nama cat2 akan ikut berubah menjadi "Kety". Untuk melakukan copas velue dan menjadikannya object independent adalah dengan menggunakan method clone dalam konsep prototype  
    ```
    Cat cat3 = (Cat) cat.clone();
	cat.setName("Bronie"); 
	cat3.printDetail();
    ```
    Maka cat3 akan tetap tetap memiliki nama "Kety"

    > Kesimpulan : jika ingin membuat object yang memiliki value sama tetapi independent  
    Contoh kode : [Prototype](src/prototype/)

## Navigation
- Day 1 : [Basic OOP](../Day_1/)
- Day 2 : [Factory & Singleton](../Day_2/)
- Day 4 : [Abstract Factory](../Day_4/)
- Day 5 : [Adapter](../Day_5/)
- Day 5 : [Facade](../Day_6/)
- Latihan Quiz : [Contoh Latihan](../Latihan-Quiz/)