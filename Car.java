class Car 
{
    String brand;
    int price;

    Car() 
            {
                brand = "Toyota";
                price = 1500000;
            }
    public static void main(String[] args) 
        {
            Car c1 = new Car();

            System.out.println("Brand: " + c1.brand);
            System.out.println("Price: " + c1.price);
        }
}