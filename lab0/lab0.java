class Book {
    String title;
    String author;
    String publisher;
    String publication_date;

    Book(String title, String author, String publisher, String publication_date) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publication_date = publication_date;
    }

    void print_info() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Publication Date: " + publication_date);
    }
}

class Encyclopedia extends Book {
    private String edition;
    private int num_Pages;

    Encyclopedia(String title, String author, String publisher, String publication_date, String edition, int num_Pages) {
        super(title, author, publisher, publication_date);
        this.edition = edition;
        this.num_Pages = num_Pages;
    }

    @Override
    void print_info() {
        super.print_info();
        System.out.println("Edition: " + edition);
        System.out.println("Number of Pages: " + num_Pages);
    }

    public static void main(String[] args) {
        Encyclopedia encyclopedia = new Encyclopedia("Encyclopedia Book", "John Doe", "Encyclopedia Publishers", "2024-01-01", "2nd", 1969);
        encyclopedia.print_info();
    }
}
