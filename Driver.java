public class Driver {
    public static void main(String[] args) {
        // Params in order: type, breed, name, weight, age
        // Note weight and age must be ints
        // Instianiate Corgi object called corgi
        Corgi corgi = new Corgi("cattle herding", "Pembroke Welsh Corgi", "Java", 38, 5);

        // Setting trick
        corgi.setTopTrick("ringing the bell to go outside");

        System.out.println(corgi);
    }
}

/*
 * Running main() will return this in console:
 * 
 * DOG DATA 
 * Java is a Pembroke Welsh Corgi, a cattle herding dog. 
 * The top trick is : ringing the bell to go outside. 
 * The Corgi is 5 years old and weighs 38 pounds.
 * 
 */