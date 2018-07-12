public class RandomQuote {
    public static void main (String [] args){
        //random words

        String [] firstWord = {"words","day", "home", "group", "question", "love", "right", "life", "book", "books", "you", "they", "I", "time", "when", "more", "work", "the", "the most", "not", "come", "I love", "Do this","slow","make love","don't"};

        String [] secondWord = {"can be", "can", "beer", "could be", "don't be","thought", "intelligent", "sunny","today", "crime", "pedestal", "are", "not to be", "judge", "by all means", "believe", "don't believe", "in me", "interested", "you've been", "doesn't matter how", "remember"};

        String [] thirdWord = {"a", "the", "or", "unusual", "is","do", "of", "was", "for", "on", "other", "although", "agree", "also" };

        String [] forthWord ={"lover", "hater", "cry", "list", "bubble", "do", "paradise", "choose", "positive", "negative", "created", "master", "you are going", "relax", "just relax", "every day", "sometimes", "plant", "i am with you"};

        //find out how many words are in a list

        int oneLength = firstWord.length;
        int secondLength = secondWord.length;
        int thirdLength = thirdWord.length;
        int forthLength = forthWord.length;


        //generate three random numbers;

        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * secondLength);
        int random3 = (int) (Math.random() * thirdLength);
        int random4 = (int) (Math.random() * forthLength);

        //build a phrase

        String randomQuote = firstWord[random1] +  " " + secondWord[random2] + " " + thirdWord[random3] + " " + forthWord[random4];

        //print out the phrase
        System.out.println("Your horoscope says... " + randomQuote);
    }
}
