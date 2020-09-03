package enumii;

public class BlogPost {

 private String txt;
 private Category ct;
 private Author aut;

    public void setContent(String text){

        txt = text;
    }

    public void setCategory(Category category){

        ct = category;
    }

    public void setAuthor(Author author){

        aut = author;
    }

    public void Post(){

        System.out.println("----- ATTENTION: New Post available! ----- ");
        System.out.println("Author: " + aut);
        System.out.println("Category: " + ct);
        System.out.println("Post: " + txt);

    }


}

