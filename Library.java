import java.util.ArrayList;

public class Library
{
    //instance variables
    private ArrayList<Book>   books;
    private ArrayList<Member> members;
    private String            name;

    //constructor
    public Library(String name)
    {
        this.name = name;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    //methods
    public void addBook(Book book)
    {
        books.add(book);
    }
    public void addMember(Member member)
    {
        members.add(member);
    }
    public void removeBook(Book book)
    {
        books.remove(book);
    }
    public void removeMember(Member member)
    {
        members.remove(member);
    }

    //getters
    public ArrayList<Book> getCatalog()
    {
        return new ArrayList<>(books);
    }
    public ArrayList<Member> getMembers()
    {
        return new ArrayList<>(members);
    }
    public Book getBookByTitle(String title)
    {
        for(Book book : books)
        {
            if(book.getTitle().equalsIgnoreCase(title))
            {
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }
    public Book getBookByIsbn(String isbn)
    {
        for(Book book : books)
        {
            if(book.getIsbn().equalsIgnoreCase(isbn))
            {
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }
    public ArrayList<Book> getBooksByAuthor(String author)
    {
        ArrayList<Book> authorOfBooks = new ArrayList<>();
        for(Book book : books)
        {
            if(book.getAuthor().equalsIgnoreCase(author))
            {
                authorOfBooks.add(book);
            }
        }
        if(authorOfBooks.isEmpty())
        {
            System.out.println("No books found");
            return new ArrayList<>();
        }
        return authorOfBooks;
    }

    @Override
    public String toString()
    {
        return "Library: " + name + ", Books: " + books.size() + ", Members: " + members.size();
    }
}