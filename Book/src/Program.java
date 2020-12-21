import java.util.Scanner;

public class Program {
    ProgramingBook programingBook = new ProgramingBook();
    FictionBook fictionBook = new FictionBook();
    ProgramingBook[] programingBooks = new ProgramingBook[5];
    FictionBook[] fictionBooks = new FictionBook[5];
    Scanner scanner = new Scanner(System.in);

    public void addNewBook() {
        ProgramingBook java1 = new ProgramingBook(01, "Java core1", 100000, "TG1", "js", "frame1");
        programingBooks[0] = java1;
        ProgramingBook java2 = new ProgramingBook(02, "Java core2", 300000, "TG2", "java", "frame2");
        programingBooks[1] = java2;
        ProgramingBook java3 = new ProgramingBook(03, "Java core3", 200000, "TG3", "js", "frame3");
        programingBooks[2] = java3;
        ProgramingBook java4 = new ProgramingBook(04, "Java core4", 700000, "TG4", "java", "frame4");
        programingBooks[3] = java4;
        ProgramingBook java5 = new ProgramingBook(05, "Java core5", 1200000, "TG5", "java", "frame5");
        programingBooks[4] = java5;


        FictionBook sach1 = new FictionBook(001, "sách 1", 10000, "Tác giả 1", "essy", 5000);
        fictionBooks[0] = sach1;
        FictionBook sach2 = new FictionBook(002, "sách 2", 20000, "Tác giả 2", "essy", 10000);
        fictionBooks[1] = sach2;
        FictionBook sach3 = new FictionBook(003, "sách 3", 30000, "Tác giả 3", "hard", 15000);
        fictionBooks[2] = sach3;
        FictionBook sach4 = new FictionBook(004, "sách 4", 40000, "Tác giả 4", "hard", 20000);
        fictionBooks[3] = sach4;
        FictionBook sach5 = new FictionBook(005, "sách 5", 50000, "Tác giả 5", "hard", 25000);
        fictionBooks[4] = sach5;

        System.out.println("Congratulation!!!");
    }

    public void getSumPrice() {
        double getSumPrograming = 0;
        double getSumFiction = 0;
        double Sum = 0;
        for (int i = 0; i < programingBooks.length; i++) {
            getSumPrograming += programingBooks[i].getPrice();
        }
        for (int i = 0; i < fictionBooks.length; i++) {
            getSumFiction += fictionBooks[i].getPrice();
        }

        Sum = getSumPrograming + getSumFiction;
        System.out.println("Tổng tiền là " + Sum + "vnd");

        for (ProgramingBook value : programingBooks) {
            if (value.getLanguage().equals("java")) {
                int i = 1;
                System.out.println(i++ + value.toString());
            }
        }
    }

}

