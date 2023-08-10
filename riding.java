class riding {
    void shape()
    {
        System.out.println("shape");
    }
}
 class square extends riding
{
    void shape()
    {
        super.shape(); 
        System.out.println("square");
    }
}
 class hey
{
   public static void main(String[] args) {

    riding c = new square();
    c.shape();
        
    }
}
