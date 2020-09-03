package enumii;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Directions d = Directions.NORTH; // D

        BlogPost newPost = new BlogPost();

        newPost.setContent("This is my first Post! I love writing useful posts!");
        newPost.setCategory(Category.LEARNING);
        newPost.setAuthor(Author.JACK);
        newPost.Post();

        /*
        4. 1
           2
           3
           4
           5-ig
           kirírja és mivel vizsgálat előtt hozzáad egyet, már nem 0-ról indul.
         */

       CharCounter ch = new CharCounter();
       ch.Count("rollercoaster");
    }
}
