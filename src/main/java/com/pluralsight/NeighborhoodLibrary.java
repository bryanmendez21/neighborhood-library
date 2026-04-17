package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // Books
        Book book1 = new Book(1, "978-0-7432-7356-5", "The Great Gatsby", null, false);
        Book book2 = new Book(2, "978-0-06-112008-4", "To Kill a Mockingbird", "Alice Johnson", true);
        Book book3 = new Book(3, "978-0-14-028329-7", "Of Mice and Men", null, false);
        Book book4 = new Book(4, "978-0-7432-7357-2", "1984", "Bob Smith", true);
        Book book5 = new Book(5, "978-0-7432-7358-9", "Brave New World", null, false);
        Book book6 = new Book(6, "978-0-06-093546-9", "The Hobbit", "Carol White", true);
        Book book7 = new Book(7, "978-0-14-303943-3", "The Catcher in the Rye", null, false);
        Book book8 = new Book(8, "978-0-7432-7359-6", "Lord of the Flies", "David Brown", true);
        Book book9 = new Book(9, "978-0-14-028330-3", "Animal Farm", null, false);
        Book book10 = new Book(10, "978-0-7432-7360-2", "Fahrenheit 451", "Eve Davis", true);
        Book book11 = new Book(11, "978-0-7432-7361-9", "The Alchemist", null, false);
        Book book12 = new Book(12, "978-0-14-028331-0", "Moby Dick", "Frank Miller", true);
        Book book13 = new Book(13, "978-0-7432-7362-6", "Pride and Prejudice", null, false);
        Book book14 = new Book(14, "978-0-06-093547-6", "The Odyssey", "Grace Lee", true);
        Book book15 = new Book(15, "978-0-7432-7363-3", "Crime and Punishment", null, false);
        Book book16 = new Book(16, "978-0-14-028332-7", "Don Quixote", "Henry Wilson", true);
        Book book17 = new Book(17, "978-0-7432-7364-0", "The Divine Comedy", null, false);
        Book book18 = new Book(18, "978-0-06-093548-3", "Jane Eyre", "Isabella Moore", true);
        Book book19 = new Book(19, "978-0-7432-7365-7", "War and Peace", null, false);
        Book book20 = new Book(20, "978-0-14-028333-4", "The Count of Monte Cristo", "Jack Taylor", true);

        Book[] allBook = {book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11,book12,book13,book14,book15,book16,book17,book18,book19,book20};
        int lengthOfBook = allBook.length;

        System.out.println("(1) Show Available Books");
        System.out.println("(2) Show Checked Out Books");
        System.out.println("(3) Close Application");
        System.out.print("Pick an option: ");
        int option = userInput.nextInt();

        switch (option) {
            case 1 -> {
                System.out.println("Available books");
                for(int i = 0; i < lengthOfBook; i++ ){
                    if(!allBook[i].isCheckedOut()){
                        System.out.println("ID:" + allBook[i].getId()+ "\tIsdn: " + allBook[i].getIsbn()  + "\tTitle: " + allBook[i].getTitle() );
                    }
                }
            }
            case 2 -> {
                System.out.println("Checked Out Books");
                for(int i = 0; i < lengthOfBook; i++ ){
                    if(allBook[i].isCheckedOut()) {
                        System.out.println("ID:" + allBook[i].getId() + "\tIsdn: " + allBook[i].getIsbn() + "\tTitle: " + allBook[i].getTitle() + "\tChecked Out To: " + allBook[i].getCheckedOutTo());
                    }
                }
            }
            case 3 -> {
                System.out.println("Close Application");
                break;
            }
            default -> {
                System.out.println("pick from 1-3");


            }
        }
    }
}
