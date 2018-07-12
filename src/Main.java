public class Main {
    public static void main (String [] args){
        //create a new object called 'one' - of the same type as my class Movie
        //other words - creates objects (instances) of the Movie class and uses the dot. operator to set values and methods.
    Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
//create a new object called 'two' - of the same type as my class Movie
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt(); //call the method
//create a new object called 'three' - of the same type as my class Movie
        Movie three = new Movie();
        three.title = "Byte Club";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }

}
