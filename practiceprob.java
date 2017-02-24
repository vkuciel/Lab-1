/*
 * Lampert, Jake(33%), Kuciel, Victor(33%), Martel, Lorna(33%); 
 */

import java.util.Scanner;
import oi.ss.formula.functions.FinanceLib; 
public class practiceprob {

	public static void main(String[] args) {


			
			System.out.println("Enter your Annual Return after retirement (0-3%): ");
			Scanner scanner = new Scanner(System.in);
			Double a_r = scanner.nextDouble();
			
			System.out.println("Enter your years you plan to be retired: ");
			Scanner scanner1 = new Scanner(System.in);
			int y_r = scanner.nextInt();
			
			System.out.println("Enter your years you plan on working: ");
			Scanner scanner2 = new Scanner(System.in);
			int y_w = scanner.nextInt();
			
			System.out.println("Enter your Annual Return while working (0-20%): ");
			Scanner scanner3 = new Scanner(System.in);
			Double a_r_w = scanner.nextDouble();
			
			System.out.println("Total monthly retirement income: ");
			Scanner scanner4 = new Scanner(System.in);
			Double m_i = scanner.nextDouble();
			
			System.out.println("Monthly social security income: ");
			Scanner scanner5 = new Scanner(System.in);
			Double SSI = scanner.nextDouble();
			
			double totalSavings;
			double monthlySaving;
			//calculations
			totalSavings = ((m_i-SSI)*(1-(1/Math.pow((1+(a_r/100)/12),(12*y_r))))/((a_r/100)/12));
			monthlySaving = totalSavings*((a_r/100)/12)/(Math.pow((1+(a_r/100)/12),(y_w*12))-1);
			System.out.println("what you will need to save total: " + totalSavings + "$");
			System.out.println("what you need to save each month: " + "$" + monthlySaving);
		}

	}

