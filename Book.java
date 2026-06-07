public class Book
{
    //static field
    private static int totalBooks = 0;

    //instance variables
    private String  title;
    private String  author;
    private String  isbn;
    private boolean isAvailable;
    private String  checkedOutBy;

    //constructors
    public Book(String title, String author, String isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        this.checkedOutBy = null;
        totalBooks++;
    }

    //methods
    public void checkOut(String memberName)
    {
        if(isAvailable)
        {
            this.checkedOutBy = memberName;
            this.isAvailable = false;
        }
        else
        {
            System.out.println("Book is not available for checkout.");
        }
    }
    public void returnBook()
    {
        this.isAvailable = true;
        this.checkedOutBy = null;
    }

    //getters
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public boolean getIsAvailable()
    {
        return isAvailable;
    }
    public String getCheckedOutBy()
    {
        return checkedOutBy;
    }
    public static int getTotalBooks()
    {
        return totalBooks;
    }

    //setters
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public void setIsAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    public void setCheckedOutBy(String name)
    {
        this.checkedOutBy = name;
    }

    @Override
    public String toString()
    {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + isAvailable;
    }
}
