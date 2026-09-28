class Static 
{
    String name;                         
    static String companyName = "ABC Ltd"; 
    Static(String name) 
    {
        this.name = name;
    }
    void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Company: " + companyName);
    }
    public static void main(String[] args) 
    {
        Static s1 = new Static("Rahul");
        Static s2 = new Static("Priya");
        s1.display();
        s2.display();
        System.out.println("Shared Company: " + Static.companyName);
    }
}