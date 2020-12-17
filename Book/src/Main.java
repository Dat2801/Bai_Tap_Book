
public class Main {
    public static void main(String[] args) {
        ProgramingBook programingBook = new ProgramingBook();
        Book[] books = new Book[10];
        books[0] = new FictionBook(1, "sách 1", 5000, "TG1", "viễn tưởng");
        books[1] = new FictionBook(2, "sách 2", 10000, "TG2", "viễn tưởng");
        books[2] = new FictionBook(3, "sách 3", 15000, "TG3", "viễn tưởng");
        books[3] = new FictionBook(4, "sách 4", 20000, "TG4", "viễn tưởng");
        books[4] = new FictionBook(5, "sách 5", 25000, "TG5", "viễn tưởng");

        books[5] = new ProgramingBook(0, "sách 1", 10000, "TG0", "java", "framework");
        books[6] = new ProgramingBook(1, "sách 2", 20000, "TG1", "java", "framework");
        books[7] = new ProgramingBook(2, "sách 3", 30000, "TG2", "java", "framework");
        books[8] = new ProgramingBook(3, "sách 4", 40000, "TG3", "java", "");
        books[9] = new ProgramingBook(4, "sách 5", 50000, "TG4", "java", "");

        for (Book book : books) {
            System.out.println(book.toString());
        }
        int sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        System.out.println("Tổng số tiền là: " + sum + "vnd");
    }
}
