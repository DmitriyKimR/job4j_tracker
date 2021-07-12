package encapsulation;

public class Library {
    public static void main(String[] args) {
        Book entry = new Book("Java entry.", 600);
        Book thinking = new Book("Java thinking.", 560);
        Book philosophy = new Book("Java philosophy.", 650);
        Book code = new Book("Java code.",830);
        Book[] cleaCode = new Book[4];
        cleaCode[0] = entry;
        cleaCode[1] = thinking;
        cleaCode[2] = philosophy;
        cleaCode[3] = code;
        for (Book index : cleaCode) {
            System.out.println(index.getName() + " with number of pages " + index.getNumber());
        }
        Book temp = cleaCode[0];
        cleaCode[0] = cleaCode[3];
        cleaCode[3] = temp;
        for (Book index : cleaCode) {
            System.out.println(index.getName() + " with number of pages " + index.getNumber() + " Clean code");
        }
    }
}
