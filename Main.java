public class Main
{
    //formatting helpers
    static void header(String title)
    {
        System.out.println("\n===============================================================================");
        System.out.println("  " + title);
        System.out.println("===============================================================================");
    }

    static void subHeader(String title)
    {
        System.out.println("\n  ── " + title + " ──");
    }

    static void divider()
    {
        System.out.println("-------------------------------------------------------------------------------");
    }

    //main method
    public static void main(String[] args)
    {
        System.out.println("===============================================================================");
        System.out.println("                  Welcome to the Library Management System!");
        System.out.println("===============================================================================");

        //Create library
        header("1. Creating the Library");
        Library library = new Library("City Central Library");
        System.out.println("  " + library);

        //Create & register 5 members
        header("2. Registering Members");
        Member alice = new Member("Alice");
        Member bob   = new Member("Bob");
        Member carol = new Member("Carol");
        Member david = new Member("David");
        Member elena = new Member("Elena");

        library.addMember(alice);
        library.addMember(bob);
        library.addMember(carol);
        library.addMember(david);
        library.addMember(elena);

        for (Member m : library.getMembers())
            System.out.println("  Registered: " + m);

        //Create & add 50 books
        header("3. Adding 50 Books to the Catalog");

        Book b01 = new Book("The Great Gatsby",              "F. Scott Fitzgerald",     "978-0743273565");
        Book b02 = new Book("To Kill a Mockingbird",         "Harper Lee",              "978-0061120084");
        Book b03 = new Book("1984",                          "George Orwell",           "978-0451524935");
        Book b04 = new Book("Pride and Prejudice",           "Jane Austen",             "978-1503290563");
        Book b05 = new Book("The Catcher in the Rye",       "J.D. Salinger",           "978-0316769488");
        Book b06 = new Book("The Hobbit",                    "J.R.R. Tolkien",          "978-0547928227");
        Book b07 = new Book("The Lord of the Rings",         "J.R.R. Tolkien",          "978-0544003415");
        Book b08 = new Book("Moby Dick",                     "Herman Melville",         "978-1503280786");
        Book b09 = new Book("War and Peace",                 "Leo Tolstoy",             "978-1400079988");
        Book b10 = new Book("The Odyssey",                   "Homer",                   "978-0140268867");
        Book b11 = new Book("The Iliad",                     "Homer",                   "978-0140275360");
        Book b12 = new Book("Crime and Punishment",          "Fyodor Dostoevsky",       "978-0486415871");
        Book b13 = new Book("The Brothers Karamazov",        "Fyodor Dostoevsky",       "978-0374528379");
        Book b14 = new Book("The Divine Comedy",             "Dante Alighieri",         "978-0140448955");
        Book b15 = new Book("The Count of Monte Cristo",    "Alexandre Dumas",         "978-0140449266");
        Book b16 = new Book("The Grapes of Wrath",          "John Steinbeck",          "978-0143039433");
        Book b17 = new Book("Of Mice and Men",               "John Steinbeck",          "978-0140177398");
        Book b18 = new Book("East of Eden",                  "John Steinbeck",          "978-0140186390");
        Book b19 = new Book("The Alchemist",                 "Paulo Coelho",            "978-0061122415");
        Book b20 = new Book("The Little Prince",             "Antoine de Saint-Exupery","978-0156012195");
        Book b21 = new Book("The Picture of Dorian Gray",    "Oscar Wilde",             "978-0141439570");
        Book b22 = new Book("The Stranger",                  "Albert Camus",            "978-0679720201");
        Book b23 = new Book("Brave New World",               "Aldous Huxley",           "978-0060850524");
        Book b24 = new Book("Fahrenheit 451",                "Ray Bradbury",            "978-1451673319");
        Book b25 = new Book("Animal Farm",                   "George Orwell",           "978-0451526342");
        Book b26 = new Book("Don Quixote",                   "Miguel de Cervantes",     "978-0060934347");
        Book b27 = new Book("Jane Eyre",                     "Charlotte Bronte",        "978-0142437209");
        Book b28 = new Book("Wuthering Heights",             "Emily Bronte",            "978-0141439556");
        Book b29 = new Book("Great Expectations",            "Charles Dickens",         "978-0141439563");
        Book b30 = new Book("A Tale of Two Cities",          "Charles Dickens",         "978-0486406510");
        Book b31 = new Book("Dune",                          "Frank Herbert",           "978-0441013593");
        Book b32 = new Book("Foundation",                    "Isaac Asimov",            "978-0553293357");
        Book b33 = new Book("The Hitchhikers Guide",         "Douglas Adams",           "978-0345391803");
        Book b34 = new Book("Enders Game",                   "Orson Scott Card",        "978-0812550702");
        Book b35 = new Book("Neuromancer",                   "William Gibson",          "978-0441569595");
        Book b36 = new Book("The Road",                      "Cormac McCarthy",         "978-0307387899");
        Book b37 = new Book("Blood Meridian",                "Cormac McCarthy",         "978-0679728757");
        Book b38 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez",  "978-0060883287");
        Book b39 = new Book("Love in the Time of Cholera",   "Gabriel Garcia Marquez",  "978-0307389732");
        Book b40 = new Book("Beloved",                       "Toni Morrison",           "978-1400033416");
        Book b41 = new Book("Sapiens",                       "Yuval Noah Harari",       "978-0062316097");
        Book b42 = new Book("Homo Deus",                     "Yuval Noah Harari",       "978-0062464316");
        Book b43 = new Book("Thinking Fast and Slow",        "Daniel Kahneman",         "978-0374533557");
        Book b44 = new Book("The Selfish Gene",              "Richard Dawkins",         "978-0199291151");
        Book b45 = new Book("A Brief History of Time",       "Stephen Hawking",         "978-0553380163");
        Book b46 = new Book("Meditations",                   "Marcus Aurelius",         "978-0140449334");
        Book b47 = new Book("The Republic",                  "Plato",                   "978-0872201361");
        Book b48 = new Book("Hamlet",                        "William Shakespeare",     "978-0743477123");
        Book b49 = new Book("Macbeth",                       "William Shakespeare",     "978-0743477109");
        Book b50 = new Book("The Tempest",                   "William Shakespeare",     "978-0743482851");

        library.addBook(b01);  library.addBook(b02);  library.addBook(b03);
        library.addBook(b04);  library.addBook(b05);  library.addBook(b06);
        library.addBook(b07);  library.addBook(b08);  library.addBook(b09);
        library.addBook(b10);  library.addBook(b11);  library.addBook(b12);
        library.addBook(b13);  library.addBook(b14);  library.addBook(b15);
        library.addBook(b16);  library.addBook(b17);  library.addBook(b18);
        library.addBook(b19);  library.addBook(b20);  library.addBook(b21);
        library.addBook(b22);  library.addBook(b23);  library.addBook(b24);
        library.addBook(b25);  library.addBook(b26);  library.addBook(b27);
        library.addBook(b28);  library.addBook(b29);  library.addBook(b30);
        library.addBook(b31);  library.addBook(b32);  library.addBook(b33);
        library.addBook(b34);  library.addBook(b35);  library.addBook(b36);
        library.addBook(b37);  library.addBook(b38);  library.addBook(b39);
        library.addBook(b40);  library.addBook(b41);  library.addBook(b42);
        library.addBook(b43);  library.addBook(b44);  library.addBook(b45);
        library.addBook(b46);  library.addBook(b47);  library.addBook(b48);
        library.addBook(b49);  library.addBook(b50);

        System.out.println("  Books added. Static counter -> Book.getTotalBooks() = " + Book.getTotalBooks());
        System.out.println("  " + library);

        //Full catalog before any checkouts
        header("4. Full Catalog (all available)");
        for (Book b : library.getCatalog())
            System.out.println("  " + b);
        divider();
        System.out.println("  " + library);

        //getBookByTitle
        header("5. getBookByTitle()");
        subHeader("Successful lookups");
        System.out.println("  " + library.getBookByTitle("1984"));
        System.out.println("  " + library.getBookByTitle("Dune"));
        System.out.println("  " + library.getBookByTitle("hamlet"));   // tests case-insensitive
        subHeader("Book that does not exist");
        library.getBookByTitle("Invisible Man");                        // prints "Book not found"

        //getBookByIsbn
        header("6. getBookByIsbn()");
        subHeader("Successful lookups");
        System.out.println("  " + library.getBookByIsbn("978-0441013593")); // Dune
        System.out.println("  " + library.getBookByIsbn("978-0451524935")); // 1984
        subHeader("ISBN that does not exist");
        library.getBookByIsbn("000-0000000000");                            // prints "Book not found"

        //getBooksByAuthor
        header("7. getBooksByAuthor()");
        subHeader("Authors with multiple books");
        System.out.println("  George Orwell:          " + library.getBooksByAuthor("George Orwell"));
        System.out.println("  John Steinbeck:         " + library.getBooksByAuthor("John Steinbeck"));
        System.out.println("  J.R.R. Tolkien:         " + library.getBooksByAuthor("J.R.R. Tolkien"));
        System.out.println("  Fyodor Dostoevsky:      " + library.getBooksByAuthor("Fyodor Dostoevsky"));
        System.out.println("  William Shakespeare:    " + library.getBooksByAuthor("William Shakespeare"));
        System.out.println("  Homer:                  " + library.getBooksByAuthor("Homer"));
        System.out.println("  Cormac McCarthy:        " + library.getBooksByAuthor("Cormac McCarthy"));
        System.out.println("  Gabriel Garcia Marquez: " + library.getBooksByAuthor("Gabriel Garcia Marquez"));
        System.out.println("  Yuval Noah Harari:      " + library.getBooksByAuthor("Yuval Noah Harari"));
        System.out.println("  Charles Dickens:        " + library.getBooksByAuthor("Charles Dickens"));
        subHeader("Author that does not exist");
        library.getBooksByAuthor("Unknown Author");                     // prints "No books found"

        //Checkouts
        header("8. Member.checkOutBook()");
        subHeader("Alice checks out 3 books");
        alice.checkOutBook(b03);   // 1984
        alice.checkOutBook(b31);   // Dune
        alice.checkOutBook(b40);   // Beloved
        subHeader("Bob checks out 3 books");
        bob.checkOutBook(b01);     // The Great Gatsby
        bob.checkOutBook(b08);     // Moby Dick
        bob.checkOutBook(b48);     // Hamlet
        subHeader("Carol checks out 4 books");
        carol.checkOutBook(b04);   // Pride and Prejudice
        carol.checkOutBook(b27);   // Jane Eyre
        carol.checkOutBook(b28);   // Wuthering Heights
        carol.checkOutBook(b29);   // Great Expectations
        subHeader("David checks out 3 books");
        david.checkOutBook(b41);   // Sapiens
        david.checkOutBook(b42);   // Homo Deus
        david.checkOutBook(b43);   // Thinking Fast and Slow
        subHeader("Elena checks out 4 books");
        elena.checkOutBook(b32);   // Foundation
        elena.checkOutBook(b35);   // Neuromancer
        elena.checkOutBook(b34);   // Enders Game
        elena.checkOutBook(b33);   // The Hitchhikers Guide

        //Attempt checkout of unavailable book
        header("9. Attempting to check out an already-checked-out book");
        System.out.println("  Bob tries to check out 1984 (Alice has it):");
        System.out.println("  1984 available? " + b03.getIsAvailable());
        System.out.println("  Checked out by: " + b03.getCheckedOutBy());
        System.out.println("  -> Bob calls checkOutBook anyway to show Book.checkOut() guard:");
        bob.checkOutBook(b03);     // Book.checkOut() prints "Book is not available for checkout."

        //getIsAvailable & getCheckedOutBy spot checks
        header("10. Book.getIsAvailable() and getCheckedOutBy()");
        divider();
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b03.getTitle(), b03.getIsAvailable(), b03.getCheckedOutBy());
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b31.getTitle(), b31.getIsAvailable(), b31.getCheckedOutBy());
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b25.getTitle(), b25.getIsAvailable(), b25.getCheckedOutBy());
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b01.getTitle(), b01.getIsAvailable(), b01.getCheckedOutBy());
        divider();

        //getCheckedOutBooks & getCheckedOutBooksCount
        header("11. Member.getCheckedOutBooks() and getCheckedOutBooksCount()");
        System.out.println("  Alice  (" + alice.getCheckedOutBooksCount() + "): " + alice.getCheckedOutBooks());
        System.out.println("  Bob    (" + bob.getCheckedOutBooksCount()   + "): " + bob.getCheckedOutBooks());
        System.out.println("  Carol  (" + carol.getCheckedOutBooksCount() + "): " + carol.getCheckedOutBooks());
        System.out.println("  David  (" + david.getCheckedOutBooksCount() + "): " + david.getCheckedOutBooks());
        System.out.println("  Elena  (" + elena.getCheckedOutBooksCount() + "): " + elena.getCheckedOutBooks());

        //Mid-point catalog
        header("12. Catalog Mid-Point (mix of available and checked out)");
        for (Book b : library.getCatalog())
            System.out.println("  " + b);
        divider();
        System.out.println("  " + library);

        //Returns
        header("13. Member.returnBook()");
        subHeader("Alice returns 2 books");
        alice.returnBook(b03);    // return 1984
        alice.returnBook(b31);    // return Dune
        subHeader("Bob returns 1 book");
        bob.returnBook(b48);      // return Hamlet
        subHeader("Carol returns 2 books");
        carol.returnBook(b27);    // return Jane Eyre
        carol.returnBook(b29);    // return Great Expectations
        subHeader("David returns 1 book");
        david.returnBook(b41);    // return Sapiens
        subHeader("Elena returns 2 books");
        elena.returnBook(b32);    // return Foundation
        elena.returnBook(b33);    // return The Hitchhikers Guide

        //getCheckedOutBooks after returns
        header("14. Member Holdings After Returns");
        System.out.println("  Alice  (" + alice.getCheckedOutBooksCount() + "): " + alice.getCheckedOutBooks());
        System.out.println("  Bob    (" + bob.getCheckedOutBooksCount()   + "): " + bob.getCheckedOutBooks());
        System.out.println("  Carol  (" + carol.getCheckedOutBooksCount() + "): " + carol.getCheckedOutBooks());
        System.out.println("  David  (" + david.getCheckedOutBooksCount() + "): " + david.getCheckedOutBooks());
        System.out.println("  Elena  (" + elena.getCheckedOutBooksCount() + "): " + elena.getCheckedOutBooks());

        //Re-checkout a returned book
        header("15. Re-Checking Out a Returned Book");
        System.out.println("  David grabs 1984 now that Alice returned it:");
        System.out.println("  1984 available? " + b03.getIsAvailable());
        david.checkOutBook(b03);
        System.out.println("  David  (" + david.getCheckedOutBooksCount() + "): " + david.getCheckedOutBooks());

        //getIsAvailable after returns
        header("16. getIsAvailable() After Returns");
        divider();
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b03.getTitle(), b03.getIsAvailable(), b03.getCheckedOutBy());
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b31.getTitle(), b31.getIsAvailable(), b31.getCheckedOutBy());
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b32.getTitle(), b32.getIsAvailable(), b32.getCheckedOutBy());
        System.out.printf("  %-35s available: %-5s  checked out by: %s%n", b48.getTitle(), b48.getIsAvailable(), b48.getCheckedOutBy());
        divider();

        //Setters
        header("17. Book Setters");
        subHeader("Before");
        System.out.println("  " + b47);   // The Republic by Plato
        b47.setTitle("The Republic - Revised Edition");
        b47.setAuthor("Plato (trans. Jowett)");
        b47.setIsbn("978-0000000000");
        subHeader("After setTitle / setAuthor / setIsbn");
        System.out.println("  " + b47);
        b47.setTitle("The Republic");
        b47.setAuthor("Plato");
        b47.setIsbn("978-0872201361");

        subHeader("Member setName / setMemberId");
        System.out.println("  Before: " + elena);
        elena.setName("Elena M.");
        elena.setMemberId(99);
        System.out.println("  After:  " + elena);
        elena.setName("Elena");
        elena.setMemberId(5);

        //Static field getTotalBooks
        header("18. Book.getTotalBooks() Static Field");
        System.out.println("  Total Book objects constructed so far: " + Book.getTotalBooks());
        Book extra = new Book("Extra Book", "Test Author", "000-0000000000");
        System.out.println("  After creating one extra Book:         " + Book.getTotalBooks());

        //Member getters
        header("19. Member Getters — getName() and getMemberId()");
        for (Member m : library.getMembers())
            System.out.println("  Name: " + m.getName() + "  |  ID: " + m.getMemberId() + "  |  " + m);

        //removeBook & removeMember
        header("20. removeBook() and removeMember()");
        System.out.println("  Before: " + library);
        library.removeBook(b50);
        library.removeMember(elena);
        System.out.println("  Removed: The Tempest + member Elena");
        System.out.println("  After:  " + library);
        System.out.println("  Members remaining: " + library.getMembers());

        //Final catalog
        header("21. Final Catalog");
        for (Book b : library.getCatalog())
            System.out.println("  " + b);
        divider();
        System.out.println("  " + library);

        System.out.println("\n===============================================================================");
        System.out.println("                        End of Demonstration");
        System.out.println("===============================================================================");
    }
}


