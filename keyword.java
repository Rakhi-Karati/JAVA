public class keyword 
{
    String title;
    double price;

    keyword(String title, double price)

    {
        this.title=title;
        this.price=price;
    }

        public static void main(String[] args) 
        {
            keyword k=new keyword("Java Basics",500.0);
            k.main();
        }
        
    void main() 
    {
        System.out.println("Title:" +title);
        System.out.println("Price:" +price);

    }
        

}
