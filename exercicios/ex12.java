import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("Jorge");
		lista.add("Francis");
		lista.add("Samba");
		lista.add("Linguica");
		lista.add("Joao");
		lista.add("Lua");
		lista.add("Sandro");
		lista.add("Sapato");
		lista.add("Cardoso");
		lista.add("Ana");
		
		for(String s : lista){
		    System.out.println(s);
		}
		
		System.out.println("Total: "+ lista.size());
		
		if(lista.contains("Joao")){
		    System.out.println("Joao esta na lista");
		}
		else{
		    System.out.println("Joao nao esta na lista");
		}
		
	}
}
