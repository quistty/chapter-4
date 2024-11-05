public class Journal extends LibraryItem {
    // Instance variables are now public
    public String month;               // Publication month of the journal
    public String[] articleTitles;     // Array of article titles in the journal
    public int[] articleLengths;       // Array of page lengths for each article

    // Constructor to initialize the journal details and set default values for articles
    public Journal()
    public Journal(String title, String month, int year, int numArticles) {
        super(title, year);             // Calls the constructor of LibraryItem
        this.month = month;
        this.articleTitles = new String[numArticles];
        this.articleLengths = new int[numArticles];
        // Initialize all articles with empty titles and 0 pages
        for (int i = 0; i < numArticles; i++) {
            articleTitles[i] = "";
            articleLengths[i] = 0;
        }
    }

    // Method to set details for a specific article in the journal
    public void setArticle(int articleNumber, String title, int numOfPages) {
        articleTitles[articleNumber - 1] = title; // sets the index as one less than the article number due to indexing
        articleLengths[articleNumber - 1] = numOfPages;
    }

    // Returns the publication month of the journal
    public String getMonth() {
        return month;
    }

    // Calculates the fine for overdue journals, which is a fixed rate of $1.00 per day
    public void calcDayFine(int daysLate) {
        if (daysLate > 0){ //checks if the fine is there and displays
            System.out.println("Fine: $" + daysLate * 1.00);
        } else {
            System.out.println("No fine");
        }
    }

    // Calculates the total number of pages across all articles in the journal
    public int getNumPages() {
        int totalPages = 0;
        for (int pages : articleLengths) { // for each element in the articlelengths array, add the value of the element to the sum
            totalPages += pages;
        }
        return totalPages;
    }

    // toString method that includes journal-specific details along with general info
    // Each article is listed with its starting and ending page numbers
    public String toString() {
        String output = super.toString(); // Calls parent class's toString method
        output += "Month: " + month + "\n"; 
        int startPage = 1; // Variable that stores the current startpage for each journal
        for (int i = 0; i < articleTitles.length; i++) { //concatenates the start and end length of each journal
            int endPage = startPage + articleLengths[i] - 1; 
            output += (i + 1) + ". " + articleTitles[i] + " (" + startPage + "-" + endPage + ")\n";
            startPage = endPage + 1; // Next article starts after the end of the current one
        }
        return output;
    }
}