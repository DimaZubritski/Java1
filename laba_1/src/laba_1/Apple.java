package rfe.bsu.laba1;

public class Apple extends Food implements Nutritious {
    private String size;
    public Apple(String size){
        super("Apple", " ");
        this.parameter = size;
        this.size = size;
    }
    public void consume(){
        System.out.println(this + " has been eatean");
    }

    public String getParameter(){
        return parameter;
    }
    public void setParameter(String size){
        this.parameter = size;
        this.size = size;
    }

    public boolean equals(Object arg0){
        if (super.equals(arg0)){
            if (!(arg0 instanceof Apple)) return false;
            return parameter.equals(((Apple)arg0).parameter);
        } else
            return false;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "size='" + size + '\'' +
                '}';
    }

    public int calculateCalories() {
        return 40 * size.length();
    }
}
