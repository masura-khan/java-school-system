import java.util.ArrayList;

// TeachingMaterial interface representing materials used by teachers
interface TeachingMaterial {
    void use();
}

// Student class
class Student {
    private String name;
    private ArrayList<String> textbooks; // Student uses textbooks

    public Student(String name) {
        this.name = name;
        textbooks = new ArrayList<>();
    }

    public void addTextbook(String textbook) {
        textbooks.add(textbook);
    }

    public void study() {
        System.out.println(name + " is studying with " + textbooks.size() + " textbooks.");
    }
}

// Teacher class
class Teacher {
    private String name;
    private ArrayList<TeachingMaterial> teachingMaterials; // Teacher uses teaching materials

    public Teacher(String name) {
        this.name = name;
        teachingMaterials = new ArrayList<>();
    }

    public void addTeachingMaterial(TeachingMaterial material) {
        teachingMaterials.add(material);
    }

    public void teach() {
        System.out.println(name + " is teaching with " + teachingMaterials.size() + " teaching materials.");
    }
}

class Book implements TeachingMaterial {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void use() {
        System.out.println("Using book: " + title);
    }
}
class Whiteboard implements TeachingMaterial {
    @Override
    public void use() {
        System.out.println("Using whiteboard.");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        Teacher mrSmith = new Teacher("Mr. Smith");
        Teacher msJohnson = new Teacher("Ms. Johnson");

        Book mathBook = new Book("Mathematics");
        Book historyBook = new Book("History");
        Whiteboard physicsWhiteboard = new Whiteboard();

        
        mrSmith.addTeachingMaterial(mathBook);
        mrSmith.addTeachingMaterial(physicsWhiteboard);
        msJohnson.addTeachingMaterial(historyBook);

  
        alice.addTextbook("Science");
        bob.addTextbook("Literature");
        bob.addTextbook("Art");


        mrSmith.teach();
        msJohnson.teach();

        alice.study();
        bob.study();
    }
}

