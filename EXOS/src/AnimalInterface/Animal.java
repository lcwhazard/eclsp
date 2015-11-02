package AnimalInterface;

public interface Animal
{
    public void setNom(String nom);
    public String getNom();
    public String parle();

// TODO Décommentez le code ci-dessous pour le compléter
    
    public static void main(String[] args)
    {
	Animal a = new Chat("Ronron");
	Animal b = new Chien("Médor");
	Animal c = new Vache("Huguette");
	a.setNom("Th�ophile");
	System.out.println(a.parle());
	System.out.println(b.parle());
	System.out.println(c.parle());
    }
}

class Chat implements Animal
{
	private String nom;
	private String cri=" fait Miaou";
	public Chat(String nom){
		this.nom=nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
    public String getNom(){
    	return (this.nom);
    }
    public String parle(){
    	return (nom + cri);
    }
}

class Chien implements Animal
{
	private String nom;
	private String cri=" fait Wouf";
	public Chien(String nom){
		this.nom=nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
    public String getNom(){
    	return (this.nom);
    }
    public String parle(){
    	return (nom + cri);
    }
}

class Vache implements Animal
{
	private String nom;
	private String cri=" fait Meuh";
	public Vache(String nom){
		this.nom=nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
    public String getNom(){
    	return (this.nom);
    }
    public String parle(){
    	return (nom + cri);
    }
}