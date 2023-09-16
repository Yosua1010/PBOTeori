// class Dependency
class Printer {
    // Fungsi ini mencetak dokumen ke layar
    public void print(String document) {
        System.out.println("Mencetak dokumen: " + document);
    }
}

class Document {
    private final String content; //class menjadi konstan dengan adanya final 
    //atau nilainya tidak akan diubah

    // Konstruktor untuk inisialisasi isi dokumen
    public Document(String content) {
        this.content = content;
    }

    // Getter untuk mendapatkan isi dokumen
    public String getContent() {
        return content;
    }
}

class DocumentProcessor {
    private final Printer printer;//class menjadi konstan dengan adanya final 
    //atau nilainya tidak akan diubah

    // Konstruktor yang menerima objek Printer sebagai ketergantungan
    public DocumentProcessor(Printer printer) {
        this.printer = printer;
    }

    // Fungsi ini memproses dokumen dengan mencetaknya menggunakan printer
    public void processDocument(Document document) {
        String content = document.getContent();
        printer.print(content);
    }
}

// class Aggregation
class Engine {
    private final String type; // //class menjadi konstan dengan adanya final 
    //atau nilainya tidak akan diubah

    // Konstruktor untuk inisialisasi tipe mesin
    public Engine(String type) {
        this.type = type;
    }

    // Getter untuk mendapatkan tipe mesin
    public String getType() {
        return type;
    }
}

class Car {
    private final String brand; //class menjadi konstan dengan adanya final 
    //atau nilainya tidak akan diubah
    private final Engine engine;//class menjadi konstan dengan adanya final 
    //atau nilainya tidak akan diubah

    // Konstruktor yang menerima merek mobil dan objek Engine sebagai agregasi
    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    // Fungsi ini menyalakan mobil dan menampilkan merek dan tipe mesin
    public void start() {
        System.out.println("Mobil " + brand + " dengan mesin " +
                engine.getType() + " dinyalakan.");
    }
}

// class Inheritance
class Animal {
    protected String name;

    // Konstruktor untuk inisialisasi nama hewan
    public Animal(String name) {
        this.name = name;
    }

    // Fungsi ini membuat hewan bersuara
    public void speak() {
        System.out.println(name + " bersuara.");
    }
}

class Dog extends Animal {
    // Konstruktor yang menerima nama hewan dan menggunakan konstruktor superclass
    public Dog(String name) {
        super(name);
    }

    // Fungsi ini membuat anjing menggonggong
    public void bark() {
        System.out.println(name + " menggonggong.");
    }
}

public class Relationship{
    public static void main(String[] args) {
        //  Dependency
        Printer printer = new Printer();
        Document document = new Document("Ini adalah  dokumen");
        DocumentProcessor documentProcessor = new DocumentProcessor(printer);
        documentProcessor.processDocument(document);

        //  Aggregation
        Engine engine = new Engine("Bensin");
        Car car = new Car("BMW", engine);
        car.start();

        //   Inheritance
        Dog dog = new Dog("Black");
        dog.speak();
        dog.bark();
    }
}
