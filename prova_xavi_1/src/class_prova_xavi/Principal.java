package class_prova_xavi;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public int comptarVocals(String s){
		int contador=0;
		int z;
		
		for(z=0;z<s.length();z++){
			if(s.charAt(z)=='a'||s.charAt(z)=='e'|| s.charAt(z)=='i'||s.charAt(z)=='o'
				||	s.charAt(z)=='u' || s.charAt(z)=='A'||s.charAt(z)=='E'|| 
				s.charAt(z)=='I'||s.charAt(z)=='O'||	s.charAt(z)=='U'){
				contador++;
			}
		}
		return contador;
	}
	
	public char inicial(String s){
		return s.charAt(0);
	}
	
	
	public String invertir(String s){
		
		String resultat="";
		
		for(int i=s.length();i>0; i++){
			
			resultat = resultat + s.charAt(i-1);
			
		}

		return s;
	}
	
}
