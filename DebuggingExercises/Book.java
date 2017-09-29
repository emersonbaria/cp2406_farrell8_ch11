/**
 * Created by jc317912 on 29/09/17.
 */
public abstract class Book {
    private String title;
    public double price;

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String bookTitle){
        title=bookTitle;
    }
    public abstract void setPrice(double price);

    public void display(){
        System.out.println(title+" "+price);
    }


}



