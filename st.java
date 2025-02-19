public interface Ducks{
    public void display();
}

public class cityducks implements Ducks{
    @overide
    public void display()
    {
        System.out.println("This is a city duck");
    }
}

public class lakeducks implements Ducks{
    @overide
    public void display()
    {
        System.out.println("This is a lake duck");
    }
}

public interface Ducksize{
    public void size();
}

public class smallduck implements Ducksize{
    @overide
    public void size()
    {
        System.out.println("This is a small sized duck");
    }
}

public class mediumduck implements Ducksize{
    @overide
    public void size()
    {
        System.out.println("This is a medium sized duck");
    }
}

public class largeduck implements Ducksize{
    @overide
    public void size()
    {
        System.out.println("This is a large sized duck");
    }
}

public class DuckContext
{
    private Ducks dk;
    private Ducksize dks;
    public DuckContext(Ducks dk, Ducksize dks){
        this.dk=dk;
        this.dks=dks;
    }
    public void features()
    {
        dk.display();
        dk.size();
    }
}

public class st{
    public static void main(String args[])
    {
        Ducks ctd=new cityducks();
        Ducksize md=new mediumduck();

        DuckContext context=new DuckContext(ctd,md);
        context.features()
    }
}