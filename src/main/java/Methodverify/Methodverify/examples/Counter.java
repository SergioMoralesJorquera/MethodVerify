package Methodverify.Methodverify.examples;

public class Counter {

    private int counter;
    private String message;

    public Counter() {
        this.counter = 0;
    }

    public void increment() {
        this.counter++;
    }

    public int getCount() {
        return this.counter;
    }

    public String getMessage(String message){
        return this.message = message;
    }

}
