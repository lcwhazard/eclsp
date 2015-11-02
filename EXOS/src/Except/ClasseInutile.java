package Except;

public class ClasseInutile {
	public void nePasInvoquer() throws ExceptionInutile{
			throw new ExceptionInutile();
		} 
	public static void main(String[] args){
		ClasseInutile test = new ClasseInutile();
		try {
			test.nePasInvoquer();
		} catch (ExceptionInutile e) {
			
			System.out.println(e);
		}
	}
}

class ExceptionInutile extends Exception{
	
	public String toString(){
		return ("Je vous avais dit de ne pas appeler cette méthode");
	}
}