public class Book extends LibraryItem {
    // Attributes specific to books
    private String author;      // Author of the book
    private String genre;       // Genre of the book
    private int numPages;       // Total number of pages in the book

    // Constructor that initializes the book's details using provided parameters
    // Calls the parent class constructor to initialize title and year
    public Book()
    public Book(String title, int year, int pages, String author, String genre) {
        super(title, year);     // Calls the constructor of LibraryItem
        this.numPages = pages;
        this.author = author;
        this.genre = genre;
    }

    // Method that returns the total number of pages in the book
    public int getNumPages() {
        return numPages;
    }

    // Checks if the book's genre matches a given genre
    // @param area: the genre to check against
    // @return true if genres match, false otherwise
    public boolean isInGenre(String area) {
        return genre.equalsIgnoreCase(area);
    }

    // toString method that includes book-specific details along with general info
    public String toString() {
        String output = super.toString(); // Calls parent class's toString method
        output += "Pages: " + numPages + "\n" + "Author: " + author + "\nGenre: " + genre + "\n";
        return output;
    }
}