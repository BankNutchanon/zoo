package Lib;

public class Eagle extends Bird implements Flyable{
    public Eagle (String name){
        super(name);
    }
    public String makeSound() {
        return "Screech!";
        }
        @Override
    public String fly() {
       return "The eagle soars through the sky.";
    }
    }
