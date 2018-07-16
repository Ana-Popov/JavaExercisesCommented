
public class BookTestDrive {
    public static void main (String [] args){
        //declare a books array variable - this will be the remote control to the books object;
        Books [] myBooks;
        //create a new book array and with the length of 3 and assign it to the previously declared array;
        myBooks = new Books[3];

        //or - Books [] myBooks = new Books [3];
        int x = 0;
        //create new myBooks and assign them to the array of elements(references to the variable); -  make the books object
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        //access the title variable ;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";

        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x+1;
        }
    }

}
