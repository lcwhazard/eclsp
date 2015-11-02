package AbsClass;

public abstract class Animal
{
	private String nom;
	private String cri;
	public abstract String getCri();
	
	public void setNom(String nom){
		this.nom=nom;
	}
	public String getNom(){
    	return (this.nom);
    }
	 public String parle(){
	    	return (getNom() + getCri());
	    }
    
    public static void main(String[] args)
    {
	Chat a = new Chat("Ronron");
	Chien b = new Chien("Médor");
	Vache c = new Vache("Huguette");
	System.out.println(a.parle());
	System.out.println(b.parle());
	System.out.println(c.parle());
    }
}

class Chat extends Animal
{
	public String getCri(){
		return(" fait Miaou");
	}
	public Chat(String nom){
		setNom(nom);
	}
}

class Chien extends Animal
{
	public String getCri(){
		return(" fait Wouf");
	}
	public Chien(String nom){
		setNom(nom);
	}
}

class Vache extends Animal
{
	public String getCri(){
		return(" fait Meuh");
	}
	public Vache(String nom){
		setNom(nom);
	}
}