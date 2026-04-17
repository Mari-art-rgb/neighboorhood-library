
package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "9780143126745", "The Search for Modern China", false, 0),
                new Book(2, "9780674019919", "China: A History", false, 0),
                new Book(3, "9780143038610", "The Early Chinese Empires: Qin and Han", false, 0),
                new Book(4, "9780300170269", "The Cambridge Illustrated History of China", false, 0),
                new Book(5, "9780140440992", "Records of the Grand Historian", false, 0),
                new Book(6, "9780143120552", "China: A New History", false, 0),
                new Book(7, "9780300141942", "Wild Swans: Three Daughters of China", false, 0),
                new Book(8, "9780195142747", "The Oxford History of Historical Writing: Chinese History", false, 0),
                new Book(9, "9780300186023", "Mao: The Unknown Story", false, 0),
                new Book(10, "9780520242207", "The Cultural Revolution: A People's History, 1962–1976", false, 0),
                new Book(11, "9780300116872", "The Opium War: Drugs, Dreams and the Making of China", false, 0),
                new Book(12, "9780679720201", "The Open Empire: A History of China to 1600", false, 0),
                new Book(13, "9780140442361", "Sources of Chinese Tradition, Vol. 1", false, 0),
                new Book(14, "9780300111709", "Autumn in the Heavenly Kingdom: China, the West, and the Epic Story of the Taiping Civil War", false, 0),
                new Book(15, "9780300181172", "The Boxer Rebellion and the Great Game in China", false, 0),
                new Book(16, "9780300117206", "The Search for Ancient China", false, 0),
                new Book(17, "9780300103295", "Emperor of China: Self-Portrait of K'ang-hsi", false, 0),
                new Book(18, "9780674073276", "The Origins of the Modern Chinese State", false, 0),
                new Book(19, "9780300119484", "China's Last Empire: The Great Qing", false, 0),
                new Book(20, "9780143127841", "China in World History", false, 0)

        };

        for (int i = 0, i <books.length; i++;) {
            System.out.println(books[i]);
        }
    }
