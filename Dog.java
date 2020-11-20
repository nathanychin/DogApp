public class Dog {

    // instance variables
    private String type;
    private String breed;
    private String name;
    private String topTrick;

    // constructor
    /* Create a constructor that incorporates the type, breed, and name variables
     * Error thrown in Corgi class with parameter-less constructor. By using
     * "this" keyword, the constructor will automatically initialize itself.
     * Otherwise, Dog() will be undefined when other classes use "super" keyword
     */
    public Dog(String type, String breed, String name){
        this.type = type;
        this.breed = breed;
        this.name = name;
    }
    
    // methods
    // Create the setTopTrick() mutator method
    public void setTopTrick(String trick){
        topTrick = trick;
    }

    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
