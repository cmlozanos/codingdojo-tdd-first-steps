package cmls.spring.codingdojotddfirststeps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodingdojoTddFirstStepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingdojoTddFirstStepsApplication.class, args);
		
		DiamondService diamondService = new DiamondService();
		Diamond diamond = diamondService.createDiamond("C");
		String diamondString = diamondService.getDiamondString(diamond);
		diamondService.printDiamondString(diamondString);
	}
}
