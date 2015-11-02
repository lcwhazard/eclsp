package INTERFACE;

interface Saluer
{
    public void saluer();
}

class Bonjour implements Saluer
{
    public void saluer()
    {
	System.out.println("Bonjour");
    }
}

class Hello implements Saluer
{
    public void saluer()
    {
	System.out.println("Hello");
    }
}

class BuenosDias implements Saluer
{
    public void saluer()
    {
	System.out.println("Bueno Dias");
    }
}

class GutenTag implements Saluer
{
    public void saluer()
    {
	System.out.println("Guten tag");
    }
}

public class ExempleInterface
{
    public static void main(String[] args)
    {
	Saluer s = new Bonjour();
	s.saluer();
	s = new Hello();
	s.saluer();
	s = new BuenosDias();
	s.saluer();
	Saluer [] t = new Saluer[]
	    {new Bonjour(), new Hello(), new GutenTag(), new BuenosDias()};
	for (int i = 0 ; i < 4 ; i++)
	    t[i].saluer();
    }
}