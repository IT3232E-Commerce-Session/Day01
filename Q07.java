// 7) implement classes for a Library
// There are diffrent type of books are available in the
// library like Printed books, E books, and Audio books

// You must use inhertance, polymorphism, encapuslation...

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("Printed Book - ");
        super.display();
    }
}

class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("E-Book - ");
        super.display();
    }
}

class AudioBook extends Book {
    public AudioBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void display() {
        System.out.println("Audio Book - ");
        super.display();
    }
}

public class Q07 {
    public static void main(String[] args) {
        Book[] books = {
            new PrintedBook("Printed Book 1", "Author1"),
            new EBook("E-Book 1", "Author2"),
            new AudioBook("Audio Book 1", "Author3"),
            new PrintedBook("Printed Book 2", "Author4"),
            new EBook("E-Book 2", "Author5"),
        };

        for (Book book : books) {
            book.display();
        }
    }
}

// output
// @T-Lanojika ➜ /workspaces/Day01 (main) $ javac Q07.java
// @T-Lanojika ➜ /workspaces/Day01 (main) $ java Q07
// Printed Book - 
// Title: Printed Book 1, Author: Author1
// E-Book - 
// Title: E-Book 1, Author: Author2
// Audio Book - 
// Title: Audio Book 1, Author: Author3
// Printed Book - 
// Title: Printed Book 2, Author: Author4
// E-Book - 
// Title: E-Book 2, Author: Author5