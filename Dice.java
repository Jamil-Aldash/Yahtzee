import java.util.Random;
import java.util.Scanner;

class Dice {
	int diceNum = 0;
	Random random = new Random();

	int theNum = random.nextInt(7);
	int theNum1 = random.nextInt(7);int theNum11 = random.nextInt(7);int theNum111 = random.nextInt(7);
	
	int theNum2 = random.nextInt(7);int theNum22 = random.nextInt(7);int theNum222 = random.nextInt(7);
	
	int theNum3 = random.nextInt(7);int theNum33 = random.nextInt(7);int theNum333 = random.nextInt(7);
	
	int theNum4 = random.nextInt(7);int theNum44 = random.nextInt(7);int theNum444 = random.nextInt(7);
	
	int theNum5 = random.nextInt(7);int theNum55 = random.nextInt(7);int theNum555 = random.nextInt(7);
	
	
//first roll-first dice
	int throwDice1(int diceNum, int theNum) {

		if (theNum1 > 0)
			System.out.println("\t" + diceNum + 1 + " Dice :" + this.theNum1);
		else {
			System.out.println("\t" + diceNum + 1 + " Dice :" + (this.theNum1 + 1));
			return this.theNum1+1;
		}
		return this.theNum1;
	}

//first roll-second dice
	int throwDice2(int diceNum, int theNum) {
		if (theNum2 > 0)
			System.out.println("\t" + diceNum + 2 + " Dice :" + this.theNum2);
		else {
			System.out.println("\t" + diceNum + 2 + " Dice :" + (this.theNum2 + 1));
			return this.theNum2+1;
		}
		return this.theNum2;
	}

//first roll-third dice	
	int throwDice3(int diceNum, int theNum) {
		if (theNum3 > 0)
			System.out.println("\t" + diceNum + 3 + " Dice :" + this.theNum3);
		else {
			System.out.println("\t" + diceNum + 3 + " Dice :" + (this.theNum3 + 1));
			return this.theNum3+1;
		}
		return this.theNum3;
	}

//first roll-fourth dice
	int throwDice4(int diceNum, int theNum) {
		if (theNum4 > 0)
			System.out.println("\t" + diceNum + 4 + " Dice :" + this.theNum4);
		else {
			System.out.println("\t" + diceNum + 4 + " Dice :" + (this.theNum4 + 1));
			return this.theNum4+1;
			
		}
		return this.theNum4;
	}
//first roll-fifth dice
	int throwDice5(int diceNum, int theNum) {
		if (theNum5 > 0)
			System.out.println("\t" + diceNum + 5 + " Dice :" + this.theNum5);
		else {
			System.out.println("\t" + diceNum + 5 + " Dice :" + (this.theNum5 + 1));
			return this.theNum5+1;
		}
		return this.theNum5;
	}
//second roll-first dice
		int throwDice11(int diceNum, int theNum) {

			if (theNum11 > 0)
				return this.theNum11;
			else {
				return this.theNum11+1;
			}
		}

//second roll-second dice
		int throwDice22(int diceNum, int theNum) {
			if (theNum22 > 0)
				return this.theNum22;
			else {
				return this.theNum22+1;
			}
		}

//second roll-third dice	
		int throwDice33(int diceNum, int theNum) {
			if (theNum33 > 0) 
				return  this.theNum33;
			else {
			
				return this.theNum33+1;
			}
			
		}

//second roll-fourth dice
		int throwDice44(int diceNum, int theNum) {
			if (theNum44 > 0)
				return this.theNum44;
			else {
				return this.theNum44+1;	
			}
		}
//second roll-fifth dice
		int throwDice55(int diceNum, int theNum) {
			if (theNum55 > 0)
				return this.theNum55;
			else {
				return this.theNum55+1;
			}
		}
//third roll-first dice
		int throwDice111(int diceNum, int theNum) {

			if (theNum111 > 0)
				return this.theNum111;
			else {
				return this.theNum111+1;
			}
		}
		
//third roll-second dice
		int throwDice222(int diceNum, int theNum) {

			if (theNum222> 0)
				return this.theNum222;
			else {
				return this.theNum222+1;
			}
		}
//third roll-third dice
		int throwDice333(int diceNum, int theNum) {

			if (theNum333 > 0)
				return this.theNum333;
			else {
				return this.theNum333+1;
			}
		}
//third roll-fourth dice
		int throwDice444(int diceNum, int theNum) {

			if (theNum444 > 0)
				return this.theNum444;
			else {
				return this.theNum444+1;
			}
		}
//third roll-fifth dice
		int throwDice555(int diceNum, int theNum) {

			if (theNum555 > 0)
				return this.theNum555;
			else {
				return this.theNum555+1;
			}
		}
}