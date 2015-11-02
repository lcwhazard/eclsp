package InterfaceTri;

import java.util.Random;

public class TableauComparable 
{
    private static Comparable[] t;

    /*-----------------------------------------------*/

    public TableauComparable(int taille)
    {
        t = new Comparable[taille];
    }

    /*-----------------------------------------------*/

    public TableauComparable(TableauComparable other)
    {
        t = new Comparable[other.t.length];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = other.t[i];
    }

    /*-----------------------------------------------*/

    public TableauComparable copie()
    {
        return new TableauComparable(this);
    }

    /*-----------------------------------------------*/

    public String toString()
    {
        String res = "[";
        if (t.length >= 1)
            res += t[0];
        for (int i = 1 ; i < t.length ; i++)
            res += ", " + t[i];
        res += "]";
        return res;
    }

    /*-----------------------------------------------*/

    public Comparable get(int index)
    {
        return t[index];
    }

    /*-----------------------------------------------*/

    public static void set(int index, Comparable value)
    {
        t[index] = value;
    }

    /*-----------------------------------------------*/

    public void echange(int i, int j)
    {
        Comparable temp = t[i];
        t[i] = t[j];
        t[j] = temp;
    }

    /*-----------------------------------------------*/

    public void triSelection()
    {
        for (int i = 0 ; i < t.length - 1 ; i++)
            {
                
        	int indiceMin = i;
        	while (t[indiceMin] == null)
                	indiceMin++;
            for (int j = indiceMin + 1 ; j < t.length; j++)
                	if ((t[j]!= null)&&(t[indiceMin].compareTo(t[j]))>0)
                        indiceMin = j;
            echange(i, indiceMin);
            }
    }

    /*-----------------------------------------------*/

    public abstract class Animal implements Comparable
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
        
        @Override
        public int compareTo(Comparable other){
    		return (this.nom.compareTo(((Animal)other).nom));
        }
    }
    
    public static void main(String[] args)
    {
    	Chat a = new Chat("Ronron");
    	Chien b = new Chien("Médor");
    	Vache c = new Vache("Huguette");
    	System.out.println(a.parle());
    	System.out.println(b.parle());
    	System.out.println(c.parle());
    	int n = 10;
        Random r = new Random();
        TableauComparable t = new TableauComparable(n);
        set(0, a);
        set(1, b);
        set(2, c);
        t.triSelection();
        System.out.println(t);
    }

}

