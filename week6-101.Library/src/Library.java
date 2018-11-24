/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafal
 */
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> booksList;

    public Library() {
        this.booksList = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.booksList.add(newBook);

    }

    public void printBooks() {
        for (Book printing : this.booksList) {
            System.out.println(printing);
        }
    }

}
