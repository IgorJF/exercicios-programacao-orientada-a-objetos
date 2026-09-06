import java.util.ArrayList;
import java.util.HashSet;;

public class Main
{
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Ana");
		lista.add("Pedro");
		lista.add("Lucas");
		lista.add("Ana");
		lista.add("Marzio");
		lista.add("Pedro");
		lista.add("Julia");
		lista.add("Lucas");
        
        System.out.println("ArrayList: " + lista.size());
        for(String a : lista){
            System.out.println(a);
        }
        
        HashSet<String> conjunto = new HashSet<>(lista);
        
        System.out.println("HashSet: " + conjunto.size());
        for(String a : conjunto){
            System.out.println(a);
        }
         
	}
}
