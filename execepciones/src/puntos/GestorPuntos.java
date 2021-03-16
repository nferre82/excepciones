package puntos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class GestorPuntos {

	
	private static void pasarFichArray(String nomFich, Punto[] puntos) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader(nomFich));
		int i=0;
		
		try {
			String linea =br.readLine();
			while(linea!=null) {
				
				String[]coords=linea.split(",");
				try {
					float x=Float.parseFloat(coords[0]);
					float y=Float.parseFloat(coords[1]);
					Punto p=new Punto(x,y);
					puntos[i]=p;
					i++;
				}
				catch(NumberFormatException e) {
					System.out.println("Punto ilegible"+linea);
				}
				
				linea =br.readLine();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No caben todos los puntos del fichero");
		}
		
		
		
		br.close();
		
		
		
		
	}
	public static void verArrayPuntos(Punto[] puntos) {
		for(int i=0;i<puntos.length;i++) {
			try {
				System.out.println("Punto"+(i+1)+":"+puntos[i].toString());
			}
			catch(NullPointerException e){
				System.out.println("Punto sin definir");
			}
			
		}
		
	}
	public static HashMap <Character,Integer> mapaLetras(String nomFich){
		//mapa con letras que aparecen en el fichero
		//captura todas las posibles excepciones
		HashMap <Character,Integer> mapaL = null;
		mapaL.
		
		return mapaL;
	}
	public static void main(String[] args) {
		

			
		Punto[] puntos=new Punto[40];
		try {
			pasarFichArray("puntos.txt",puntos);
			verArrayPuntos(puntos);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero puntos.txt no existe");
		} catch(IOException e) {
			System.out.println("Error de lectura de fichero");
		}
	}

	

	

}
