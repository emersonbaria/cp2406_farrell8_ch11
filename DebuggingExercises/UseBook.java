/**
 * Created by jc317912 on 29/09/17.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction();
        NonFiction nonFictionBook = new NonFiction();
        fictionBook.setTitle("I am Fiction");
        fictionBook.setPrice(25.5);
        nonFictionBook.setTitle("I am Non-Fiction");
        nonFictionBook.setPrice(35.5);
        fictionBook.display();
        nonFictionBook.display();

    }
}
