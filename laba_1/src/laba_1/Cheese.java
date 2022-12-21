package rfe.bsu.laba1;

public class Cheese extends Food implements Nutritious {
    private boolean eaten = false;
    public Cheese() {
        super("Cheese", " ");
    }
    public void consume(){
        System.out.println(this + " has been eaten");
        eaten = true;
    }

    @Override
    public String toString() {
        return "Cheese";
    }

    public int calculateCalories() {
        int resultCalories = 0;
        if (eaten == true) {
            resultCalories = 100;
        }
        return resultCalories;
    }
}

