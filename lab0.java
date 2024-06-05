class Book {
    protected String title;
    protected String author;
    protected String publisher;
    protected String publication_date;

    public Book(String title, String author, String publisher, String publication_date){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publication_date = publication_date;
    }
    
    public void print_info(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Publisher: "+publisher);
        System.out.println("Publication Date: "+publication_date);
    }
}

class Encyclopedia extends Book{
    private String edition;
    private int num_Pages;
    
    public Encyclopedia(String title, String author, String publisher, String publication_date, String edition, int num_Pages){
        super(title, author, publisher, publication_date);
        this.edition = edition;
        this.num_Pages = num_Pages;
        super.print_info();
        this.print_info();
    }
    public void print_info(){
        super.print_info();
        System.out.println("Edition: "+edition);
        System.out.println("Number of Pages: "+num_Pages);
    }
    public static void main(String[] args){
        Encyclopedia encyclopedia = new Encyclopedia("Encyclopedia of Science", "John Doe", "Science Publishers", "2024-06-01","2nd Edition", 1200);
    }
}