package InterfaceTri;


public interface Comparable {
	 /*
    Retourne un nombre n�gatif si l'objet courant est plus
    petit que other, 0 s'ils sont �gaux, et un nombre positif
    l'objet courant est plus grand que other.
   */

  public int compareTo(Comparable other);
}

