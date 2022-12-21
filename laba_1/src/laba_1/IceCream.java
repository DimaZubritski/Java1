package rfe.bsu.laba1;

public class IceCream extends Food implements Nutritious {
    private String sirup;
    public IceCream(String sirup){
        super("IceCream", " ");
        parameter = sirup;
        this.sirup = sirup;
    }
    public void consume(){
        System.out.println(this + " has been eatean");
    }

    public String getParameter(){
        return sirup;
    }
    public void setSirup(String size){

        this.sirup = sirup;
    }

    public boolean equals(Object arg0){
        if (super.equals(arg0)){
            if (!(arg0 instanceof IceCream)) return false;
            return sirup.equals(((IceCream)arg0).sirup);
        } else
            return false;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "sirup='" + sirup + '\'' +
                '}';
    }

    public int calculateCalories() {
        return sirup.length() * 13;
    }
}
