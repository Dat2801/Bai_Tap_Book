import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("----Menu-----");
            System.out.println("1. Thêm danh sách");
            System.out.println("2. Tổng tiền sách");
            System.out.println("3. Tìm kiếm sách");
            System.out.println("4. Sắp xếp sách");
            System.out.println("5. Thoát");
            System.out.println("Mời chọn chức năng");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    program.addNewBook();
                    break;
                case 2:
                    program.getSumPrice();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
            }
        } while (true);
    }

}

