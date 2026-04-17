
package com.pluralsight;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Book[] books = {
                new Book(false, "", "The Search for Modern China", "9780143126745", 1),
                new Book(false, "", "China: A History", "9780674019919", 2),
                new Book(false, "", "The Early Chinese Empires: Qin and Han", "9780143038610", 3),
                new Book(false, "", "The Cambridge Illustrated History of China", "9780300170269", 4),
                new Book(false, "", "Records of the Grand Historian", "9780140440992", 5),
                new Book(false, "", "China: A New History", "9780143120552", 6),
                new Book(false, "", "Wild Swans: Three Daughters of China", "9780300141942", 7),
                new Book(false, "", "The Oxford History of Historical Writing: Chinese History", "9780195142747", 8),
                new Book(false, "", "Mao: The Unknown Story", "9780300186023", 9),
                new Book(false, "", "The Cultural Revolution: A People's History, 1962–1976", "9780520242207", 10),
                new Book(false, "", "The Opium War: Drugs, Dreams and the Making of China", "9780300116872", 11),
                new Book(false, "", "The Open Empire: A History of China to 1600", "9780679720201", 12),
                new Book(false, "", "Sources of Chinese Tradition, Vol. 1", "9780140442361", 13),
                new Book(false, "", "Autumn in the Heavenly Kingdom: China, the West, and the Epic Story of the Taiping Civil War", "9780300111709", 14),
                new Book(false, "", "The Boxer Rebellion and the Great Game in China", "9780300181172", 15),
                new Book(false, "", "The Search for Ancient China", "9780300117206", 16),
                new Book(false, "", "Emperor of China: Self-Portrait of K'ang-hsi", "9780300103295", 17),
                new Book(false, "", "The Origins of the Modern Chinese State", "9780674073276", 18),
                new Book(false, "", "China's Last Empire: The Great Qing", "9780300119484", 19),
                new Book(false, "", "China in World History", "9780143127841", 20)
        };


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the library management tool!");
        System.out.println("\t1) Show Available Books");
        System.out.println("\t2) Show Checked Out Books");
        System.out.println("\t0) Exit");
        System.out.println("Please choose an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> {
                // showAvailableBooks(books);
            }
            case 2 -> {

            }
            case 0 -> {
                System.out.println("Goodbye");
            }
        }

        System.out.println("What book would you like to check out? ");

        }


    public static void showAvailableBooks (Book[]books){
        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut()) {
                System.out.println(books[i]);
            }
        }
    }

    public static void showCheckedOutBooks (Book[]books){
        for (int i = 0; i < books.length; i++) {
            if (books[i].isCheckedOut()) {
                System.out.println(books[i]);
            }
        }

    }


}


