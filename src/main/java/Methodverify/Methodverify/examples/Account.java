package Methodverify.Methodverify.examples;

public class Account {
    private Counter counter;
    private String msg;

    public Account(Counter counter){
        this.counter = counter;
    }

    public void incrementCounter(){
        this.counter.increment();
    }

    public void getMsg(String message){
        this.counter.getMessage(message);
    }



}
