# Day 1
Day 1 berisi tentang macam-macam konsep dasar dalam OOP
- Abstraction  
    Dalam praktek kodingnya, proses abstraction adalah proses untuk membuat suatu tamplate yang bisa digunakan oleh class lain dalam implementasi yang berbeda

    ```  
    public abstract class Shape {
        abstract double area();
        
        void display() {
            System.out.println("This is a shape");
        }
    }

    public class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            super();
            this.radius = radius;
        }
        
        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    public class Rectangle extends Shape {
        private double length;
        private double width;
        
        public Rectangle(double length, double width) {
            super();
            this.length = length;
            this.width = width;
        }
        
        @Override
        double area() {
            return length * width;
        }
    }
    ```
    Dapat diliat pada <mark>method area()</mark>, class shape mendeklarasi sebagai abstract method dan pada implementasi class yang meng-extends class shape me-return hasil yang berbeda.  

    > Contoh kode : [Abstraction](src/abstaction/)


- Encapsulation  
    Konsep ini biasa digunakan untuk membatasi akses ke sebuah atribut class, biasanya saat melakukan initialize sebuah class attribute di deklarasi secara public yang menandakan class lain dapat menggunakannya langsung. Tapi berbeda halnya jika menggunakan konsep encapsulation  
     
    ```
    public class Main {

        public Main() {
            Student student = new Student();
            student.setName("Ervan");
            student.setAge(20);
            
            System.out.println("Name : " + student.getName());
            System.out.println("Age : " + student.getAge());
        }
        
        public static void main(String[] args) {
            new Main();

        }
    }

    public class Student {
        private String name;
        private int age;
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }	
    }
    ```
    terdapat sebuah method yang menjadi jembatan untuk melakukan operasi ke sebuah data. Class lain tidak bisa langsung mengakses attribute tersebut

    > Contoh kode : [Encapsulation](src/ecapsulation/)


- Inheritance  
    Terdapat juga sebuah konsep yang memungkinkan setiap class yang melakukan extends dapat mewarisi method yang berada di dalamnya, konsep ini disebut Inheritance  

    ```
    public class Animal {
        protected String name;
        protected int age;
        
        public void slepp() {
            System.out.println("Slepps");
        }
    }

    public class Cat extends Animal {
        String color;
        
        void said() {
            System.out.println(name + ", says : Moew");
        }
    }

    public class Main {
        
        public Main() {
            Cat cat = new Cat();
            
            cat.name = "Ciko";
            cat.age = 10;
            cat.color = "Brown";
            
            cat.said(); // method milik class Cat
            
            cat.slepp(); // method yang berada di class Animal
            
            System.out.println("\nName : " + cat.name);
            System.out.println("Age : " + cat.age);
            System.out.println("Color : " + cat.color);
        }
        
        public static void main(String[] args) {
            new Main();
        }
    }
    ```
    pada kode diatas dapat dilihat, sebuah class Cat yang melakukan extends ke class Animal class Cat dapat melakukan akses ke attribute yang menjadi attribute Animal dan juga dapat menggunakan method yang menjadi milik class Animal.

    > Contoh kode : [Inheritance](src/inheritance/)


- Polymorphism  
    Lalu ada sebuah konsep yang memiliki kemampuan melakukan implementasi yang berbeda  

    ```
    public class Pet {
        void eat() {
            System.out.println("Pet is eating...");
        }
    }

    public class Dog extends Pet {
        @Override
        void eat() {
            System.out.println("Dog is eating...");
        }
    }

    public class Main {

        Main() {
            Pet pet = new Pet();
            pet.eat();
            
            Dog dog = new Dog();
            dog.eat();
            
        }

        public static void main(String[] args) {
            new Main();
        }
    }
    ```
    ini mirip dengan konsep abstraction yang membedakan hanya pada deklarasi 'abstract', jika method di deklarasi tanpa menggunakan abstract dan pada class yang melakukan extends memiliki method dengan nama dan parameter yang sama berarti itu adalah sebuah polymorphism.

    > Contoh kode : [Polymorphism](src/polymorphism/)


## Navigation
- Day 2 : [Factory & Singleton](../Day_2/)
- Day 3 : [Builder & Prototype](../Day_3/)
- Day 4 : [Abstract Factory](../Day_4/)
- Day 5 : [Adapter](../Day_5/)
- Day 5 : [Facade](../Day_6/)
- Latihan Quiz : [Contoh Latihan](../Latihan-Quiz/)