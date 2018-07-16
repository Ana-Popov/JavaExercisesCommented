public class HobbitsTestDrive {
    public static void main(String[] args) {
        //make the hobbits array - length of 3
        Hobbits[] h = new Hobbits[3];
        int z = -1; //array always start with index 0
        while (z < 2) {
            z = z + 1;
            //put some z hobbits in it
            h[z] = new Hobbits();
            //access the hobbits using the array references
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "froddo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
        }

    }
}
