public class item_details 
{
    private String name;
    private int price;
    private int quantity;
    public item_details(String name,int price,int quantity)
    {
        super();
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    @Override
    public String toString()
    {
        return name+"\t\t"+price+"\t\t"+quantity;
    }

}
