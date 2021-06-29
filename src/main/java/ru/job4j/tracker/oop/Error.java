package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

        public void printInfo() {
            System.out.println("The presence of error: " + active);
            System.out.println("Error status: " + status);
            System.out.println("Error: " + message);
        }

    public static void main(String[] args) {
        Error error = new Error(true, 2, "Find the error");
        Error start = new Error();
        error.printInfo();
        start.printInfo();
    }
}
