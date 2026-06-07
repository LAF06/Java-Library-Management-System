import java.util.ArrayList;

public class Member
{
    //static field
    private static int nextId = 1;

    //instance variables
    private String          name;
    private int             memberId;
    private ArrayList<Book> checkedOutBooks;

    //constructor
    public Member(String name)
    {
        this.name = name;
        this.memberId = nextId++;
        this.checkedOutBooks = new ArrayList<>();
    }

    //methods
    public void checkOutBook(Book book)
    {
        if(book.getIsAvailable())
        {
            book.checkOut(this.name);
            checkedOutBooks.add(book);
        }
        else
        {
            System.out.println("Book is not available for checkout.");
        }
    }
    public void returnBook(Book book)
    {
        book.returnBook();
        checkedOutBooks.remove(book);
    }

    //getters
    public String getName()
    {
        return name;
    }
    public int getMemberId()
    {
        return memberId;
    }
    public ArrayList<Book> getCheckedOutBooks()
    {
        return new ArrayList<>(checkedOutBooks);
    }
    public int getCheckedOutBooksCount()
    {
        return checkedOutBooks.size();
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    @Override
    public String toString()
    {
        return "Member: " + name + ", ID: " + memberId + ", Checked out books: " + checkedOutBooks.size();
    }
}