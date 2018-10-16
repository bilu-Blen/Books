package me.Blen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

        authorOne.setFirstName("Steven");
        authorOne.setLastName("Furtrik");
        authorOne.setEmail("stevendfshd@gmail.com");
        authorOne.setPhoneNum(9348938);
        authorList.add(authorOne);

        Author authorTwo = new Author();
        authorTwo.setFirstName("Lisa");
        authorTwo.setLastName("Bevere");
        authorTwo.setEmail("lisahfhd@yahoo.com");
        authorTwo.setPhoneNum(11223344);
        authorList.add(authorTwo);

        int choice = 0;
        do{

        //Accept the users choice to do what they want on the app
        System.out.println("What do you want to do today? \n\tTo add a book enter '1', \n \tTo add an author enter '2', \n \tTo add a book to an author, enter '3'. \n \tTo view the lists of Authors the books they wrote, '4', " +
                "\n\t to quit the program enter '5'");
        Scanner scan = new Scanner(System.in);
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

                //accepting book's Author
                System.out.println("Enter the first name of the author of the book");
                String bookAuthorFName = scan.nextLine();
                System.out.println("Enter the last name of the author");
                String bookAuthorLName = scan.nextLine();

                Author author = new Author();

                author.setFirstName(bookAuthorFName);
                author.setLastName(bookAuthorLName);
                book.setAuthor(author);
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
                break;

            case 3:
                System.out.println("Welcome to adding a book to an existing author");
                System.out.println("Please enter the author you would like to add a book for");
                //entering the author the would like to add a user for
                String userAuthorChoice = scan.nextLine();

                author = new Author();


                for (Author eachAuthor : authorList){
                    if(eachAuthor.getFirstName().equalsIgnoreCase(userAuthorChoice)){
                        book = new Books();

                        //accepting book title
                        System.out.println( "Enter the title of the book");
                        bookTitle = scan.nextLine();
                        book.setTitle(bookTitle);

                        //accepting book ISBN
                        System.out.println("Enter the ISBN number");
                        bookISBN = scan.nextInt();
                        scan.nextLine();
                        book.setISBN(bookISBN);

                        author.getBooksWrote().add(book);
//                        book.setAuthor(eachAuthor);

                    }
                }
                break;

            case 4:

                System.out.println("Welcome, to view the list of Authors with the books they wrote");

                for(Author eachAuthor : authorList){
                    System.out.println(eachAuthor.getFullNameAuthor() + " \t" + eachAuthor.getPhoneNum() + " \t" +  eachAuthor.getEmail()  );
                    for(Books eachBook : booksWrote){
                        System.out.println(eachBook);
                    }
                }
                break;
        }
        }while(choice != 5);
    }
}
