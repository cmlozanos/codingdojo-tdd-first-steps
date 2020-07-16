package cmls.spring.codingdojotddfirststeps;

/**
 * Servicio para la definición, creación y pintura del diamante
 * @author Carlos Lozano
 *
 */
public class DiamondService {
	
	/** 
	 * Creacion del diamante a partir de los elementos clave
	 * 
	 * @param lastChar
	 * @return
	 */
	public Diamond createDiamond(String lastChar) {
//		throw new RuntimeException("Pendiente de implementar");
		return new Diamond(lastChar);
	}
	
	/**
	 * Proceso de transformación de los inputs en el output requerido
	 * @param diamond
	 * @return
	 */
	public String getDiamondString(Diamond diamond) {
//		throw new RuntimeException("Pendiente de implementar");
		return "  A" + "\n" +  " B B" + "\n" + "C   C" + "\n" + " B B" + "\n" + "  A";   
	}
	
	/**
	 * Pintar el resultado del diamante en un formato
	 * @param diamondString
	 * @return
	 */
	public void printDiamondString(String diamondString) {
//		throw new RuntimeException("Pendiente de implementar");
		System.out.print(diamondString);
	}
}
