public class LibraryItem {
    // Attributes
    private String title;
    private int year;
    protected boolean signedOut;
    protected double overdueRate = 0.25;

    // Constructor
    public LibraryItem()
    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
        this.signedOut = false;
    }

    // Signs out the item
    public void signOutItem() {
        this.signedOut = true;
    }

    // Returns the item to the library, calculates fine if overdue
    public void bringBackItem(int numDaysLate) {
        this.signedOut = false;
        if (numDaysLate > 0) {
            System.out.println("Fine: $" + numDaysLate * overdueRate);
        }
    }

    // Returns the fine per day for overdue items
    public double getDayFine() {
        return overdueRate;
    }

    // Returns a string with item information
    public String toString() {
        String output = "Title: " + title + "\nYear: " + year + "\n";
        output += (signedOut ? "Checked Out" : "Available") + "\n";
        return output;
    }
}