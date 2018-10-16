package me.Blen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
	// write your code here
        /*Books book = new Books();
        Author author = new Author();
        book.setAuthor(author);
        author.setFirstName("Blen");
        author.setLastName("Gamini");
        System.out.println(book.getAuthorFullName());*/

        //manually adding authors to an array list
        ArrayList<Author> authorList = new ArrayList<Author>();
        Author authorOne = new Author();
        Books bookOne = new Books();
        bookOne.setTitle("UnQualified");

        authorOne.setFirstName("Steven");
        authorOne.setLastName("Furtrik");
        authorOne.setEmail("stevendfshd@gmail.com");
        authorOne.setPhoneNum(9348938);
        bookOne.setAuthor(authorOne);
        authorOne.getBooksWrote().add(bookOne);
        authorList.add(authorOne);

        Author authorTwo = new Author();
        authorTwo.setFirstName("Lisa");
        authorTwo.setLastName("Bevere");
        authorTwo.setEmail("lisahfhd@yahoo.com");
        authorTwo.setPhoneNum(11223344);
        authorList.add(authorTwo);


        int choice = 0;
        Author author = new Author();
        ArrayList<Books> booksList = new ArrayList<>();


        do{

        //Accept the users choice to do what they want on the app
        System.out.println("What do you want to do today? \n\tTo add a book enter '1', \n \tTo add an author enter '2', \n \tTo add a book to an author, enter '3'. \n \tTo view the lists of Authors the books they wrote, '4', " +
                "\n\t to quit the program enter '5'");
        choice = scan.nextInt();
        scan.nextLine();

        switch(choice){
            case 1:
                System.out.println("Welcome, to adding a Book, start by adding the title");

                //accepting book title
                String bookTitle = scan.nextLine();
                Books book = new Books();
                book.setTitle(bookTitle);

                //accepting book ISBN
                System.out.println("Enter the ISBN number");
                int bookISBN = scan.nextInt();
                scan.nextLine();
                book.setISBN(bookISBN);

                String bookAuthorFName;
                String bookAuthorLName;

                //accepting book's Author if they know the author of the book
                System.out.println("Do you know the author of the book? Y/N");
                String userYN = scan.nextLine();
                if(userYN.equalsIgnoreCase("Y")){
                    for(Author authorEach : authorList){
                        System.out.println(authorEach.getFullNameAuthor());
                    }
                    System.out.println("Enter the author you want to choose?");
                    String authorChoice = scan.nextLine();
                    for(Author authorChoiceSec : authorList){
                        if(authorChoiceSec.getFullNameAuthor().equalsIgnoreCase(authorChoice)){
                            authorChoiceSec.getBooksWrote().add(book);
                            System.out.println("Your book " + book.getTitle() + "has been added to the list of books " + authorChoiceSec.getFullNameAuthor() + " wrote");
                        }
                    }

                }else{
                    booksList.add(book);
                    System.out.println("Your books has been successfully added");
                }
                break;

            case 2:
                System.out.println("Welcome to adding an Author, start by adding the first name of the author");

                //accepting the first name of the author
                bookAuthorFName = scan.nextLine();

                //accepting the last name of the author
                System.out.println("Enter the last name of the author");
                bookAuthorLName = scan.nextLine();

                Author authorNew = new Author();
                authorNew.setFirstName(bookAuthorFName);
                authorNew.setLastName(bookAuthorLName);

                //accepting the email of the author
                System.out.println("Enter the email of the author");
                String authorEmail = scan.nextLine();
                authorNew.setEmail(authorEmail);

                //accepting the Phone number of the author
                System.out.println("Enter the phone number of the author");
                int authorPNum = scan.nextInt();
                scan.nextLine();

                //
                System.out.println("Do you want to add book? Y/N");
                String addBook = scan.nextLine();

                do{
                    Books newBook = addBoook();
                    authorNew.getBooksWrote().add(newBook);
                    System.out.println("Do you want to add another  book? Y/N");
                    addBook = scan.nextLine();

                }while(addBook.equalsIgnoreCase("y"));

                authorList.add(authorNew);

                break;

            case 3:
                System.out.println("Welcome to adding a book to an existing author");
                System.out.println("Please enter the author you would like to add a book for");
                //entering the author the would like to add a user for
                String userAuthorChoice = scan.nextLine();



                for (Author eachAuthor : authorList){
                    if(eachAuthor.getFirstName().equalsIgnoreCase(userAuthorChoice)){
                        Books bookTwo = new Books();

                        //accepting book title
                        System.out.println( "Enter the title of the book");
                        bookTitle = scan.nextLine();
                        bookTwo.setTitle(bookTitle);

                        //accepting book ISBN
                        System.out.println("Enter the ISBN number");
                        bookISBN = scan.nextInt();
                        scan.nextLine();
                        bookTwo.setISBN(bookISBN);

                        eachAuthor.getBooksWrote().add(bookTwo);
//                        book.setAuthor(eachAuthor);
                        break;
                    }else{
                        System.out.println("The author you entered doesn't exist");
                    }
                }
                break;

            case 4:

                System.out.println("Welcome, to view the list of Authors with the books they wrote");

                for(Author eachAuthor : authorList){
                    System.out.println("Name of the author " + eachAuthor.getFullNameAuthor() + " \t" + eachAuthor.getPhoneNum() + " \t" +  eachAuthor.getEmail()  );
                    for(Books eachBook : eachAuthor.getBooksWrote()){
                        System.out.println("The titles of books written by this author are " + "\t" + eachBook.getTitle());
                    }
                }
                break;
        }
        }while(choice != 5);
    }

    public static Books addBoook(){
        //add the books written by  the author
        System.out.println("Enter the books written by this Author");
        Books newBook = new Books();

        System.out.println("Enter the title of the book");
        String newBookTitle = scan.nextLine();
        newBook.setTitle(newBookTitle);

        System.out.println("Enter the ISBN of the book");
        int newBookISBN = scan.nextInt();
        scan.nextLine();
        newBook.setISBN(newBookISBN);
        return newBook;
    }


}
