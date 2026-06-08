package javaclass;
import java.util.Scanner;

class Library{
    Scanner sc = new Scanner(System.in);
    String[] avBook = new String[500];
    String[] isBook = new String[500];
    int i = 0;
    int p = 0;

    public void addBook() {
        System.out.print("Enter the book you want to add: ");
        avBook[i] = sc.nextLine();
        i++;
    }
    public void issueBook(){
        System.out.print("Enter the book you want to be issued: ");
        boolean idk = true;
        String issuedbook = sc.nextLine();
        for (int y=0; y<i; y++){
            if (avBook[y] != null && issuedbook.equalsIgnoreCase(avBook[y])){
                isBook[p] = issuedbook;
                System.out.println("Done");
                idk = false;
                break;
            }
        }
        if (idk){
            System.out.println("Sorry book not available");
        }
        for (int a = 0; a < avBook.length; a++){
            if (avBook[a] != null && issuedbook.equalsIgnoreCase(avBook[a])){
                avBook[a] = null;
            }
        }
        p++;
    }
    public void returnBook(){
        System.out.print("Enter the book you want to return: ");
        String retbook = sc.nextLine();
        avBook[i] = retbook ;
        for (int a = 0; a < isBook.length; a++){
            if (isBook[a] != null && retbook.equalsIgnoreCase(isBook[a])){
                isBook[a] = null;
            }
        }
        i++;
    }
    public void showAvailableBooks(){
        for (int g=0; g<i; g++){
            if (avBook[g] != null){
            System.out.println(avBook[g]);
            }
        }
    }
    public void showIssuedBooks(){
        boolean idk1 = true;
        for (int h=0; h<p; h++){
            if (isBook[h] != null){
            System.out.println(isBook[h]);
            idk1 = false;
            }
        }
        if (idk1) {
            System.out.println("No book issued");
        }
    }
}

public class onlineLibrary {
    static void main() {
        Library myLibrary = new Library();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== ONLINE LIBRARY MENU ===");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Show Available Books");
            System.out.println("5. Show Issued Books");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = input.nextInt();


            switch (choice) {
                case 1 -> myLibrary.addBook();
                case 2 -> myLibrary.issueBook();
                case 3 -> myLibrary.returnBook();
                case 4 -> myLibrary.showAvailableBooks();
                case 5 -> myLibrary.showIssuedBooks();
                case 6 -> running = false;
                default -> System.out.println("Invalid option!");
            }
        }
        System.out.println("Goodbye!");

    }
}
