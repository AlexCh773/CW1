public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Война и мир", "Л.Н. Толстой");
        books[1] = new Book("Чайка", "А.П. Чехов");
        books[2] = new Book("Братья Карамазовы", "Ф.М. Достоевский");

        for (Book book : books) {
            System.out.println(book.getName().trim() + " - " + book.getAuthor().trim());
        }
    }
}