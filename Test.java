import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("- Enter your name:");
		
		Scanner enterName = new Scanner(System.in);
		String name = "";
		name = enterName.nextLine();
	
		System.out.println("* First Roll:");
		Dice dice = new Dice();
		
		int[] firstRoll = { dice.throwDice1(0, dice.theNum1), dice.throwDice2(0, dice.theNum2),
				dice.throwDice3(0, dice.theNum3), dice.throwDice4(0, dice.theNum4), dice.throwDice5(0, dice.theNum5) };

		System.out.println("- If you want to keep them all press num  0." + "\n" + "\n"
				+ "- Fot the first re-rollEnter dices number(1-2-3-4-5)." + "\n"
				+ "- Fot the first re-rollEnter dices number(11-22-33-44-55)." + "\n"
				+ "***  NOTE YOU CAN RE-ROLL 2 DICE MAX IN EACH TIME!!!");
		int stopRollingSecondRoll = 1;
		int stopRollingThirdRoll = 1;
		while (true & (stopRollingSecondRoll <= 2 & stopRollingThirdRoll <= 2)) {

			int reRoll = enterName.nextInt();
			int[] secondRoll = { dice.throwDice11(0, dice.theNum11), dice.throwDice22(0, dice.theNum22),
					dice.throwDice33(0, dice.theNum33), dice.throwDice44(0, dice.theNum44),
					dice.throwDice55(0, dice.theNum55), };
			int[] thirdRoll = { dice.throwDice111(0, dice.theNum111), dice.throwDice222(0, dice.theNum222),
					dice.throwDice333(0, dice.theNum333), dice.throwDice444(0, dice.theNum444),
					dice.throwDice555(0, dice.theNum555), };
// first roll result
			switch (reRoll) {
			case 0://show the result of the first roll
				break;
// second roll
			case 1:
				stopRollingSecondRoll++;
				if (reRoll == 1) {
					System.out.println("* Second Roll:");
					firstRoll[0] = secondRoll[0];
					firstRoll[1] = firstRoll[1];
					firstRoll[2] = firstRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = firstRoll[4];
					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);

				}

				break;

			case 2:
				stopRollingSecondRoll++;
				if (reRoll == 2) {
					System.out.println("* Second Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[1] = secondRoll[1];
					firstRoll[2] = firstRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = firstRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);
				}
				break;

			case 3:
				stopRollingSecondRoll++;
				if (reRoll == 3) {
					System.out.println("* Second Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[1] = firstRoll[1];
					firstRoll[2] = secondRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = firstRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);
					;
				}
				break;

			case 4:
				stopRollingSecondRoll++;
				if (reRoll == 4) {
					System.out.println("* Second Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[4] = firstRoll[1];
					firstRoll[4] = firstRoll[2];
					firstRoll[3] = secondRoll[3];
					firstRoll[4] = firstRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);
				}
				break;

			case 5:
				stopRollingSecondRoll++;
				if (reRoll == 5) {
					System.out.println("* Second Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[4] = firstRoll[1];
					firstRoll[4] = firstRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = secondRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);
				}
				break;

// third roll
			case 11:
				stopRollingThirdRoll++;

				if (reRoll == 11) {
					System.out.println("* Third Roll:");
					firstRoll[0] = thirdRoll[0];
					firstRoll[1] = firstRoll[1];
					firstRoll[2] = firstRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = firstRoll[4];
					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);

				}

				break;

			case 22:
				stopRollingThirdRoll++;

				if (reRoll == 22) {
					System.out.println("* Third Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[1] = thirdRoll[1];
					firstRoll[2] = firstRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = firstRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);
				}
				break;

			case 33:
				stopRollingThirdRoll++;

				if (reRoll == 33) {
					System.out.println("* Third Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[1] = firstRoll[1];
					firstRoll[2] = thirdRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = firstRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);

				}
				break;

			case 44:
				stopRollingThirdRoll++;

				if (reRoll == 44) {
					System.out.println("* Third Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[4] = firstRoll[1];
					firstRoll[4] = firstRoll[2];
					firstRoll[3] = thirdRoll[3];
					firstRoll[4] = firstRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);
				}
				break;

			case 55:
				stopRollingThirdRoll++;

				if (reRoll == 55) {
					System.out.println("* Third Roll:");
					firstRoll[0] = firstRoll[0];
					firstRoll[4] = firstRoll[1];
					firstRoll[4] = firstRoll[2];
					firstRoll[3] = firstRoll[3];
					firstRoll[4] = thirdRoll[4];

					System.out.println("\t" + "1 dice: " + firstRoll[0] + "\n" + "\t" + "2 dice: " + firstRoll[1] + "\n"
							+ "\t" + "3 dice: " + firstRoll[2] + "\t" + "\n" + "\t" + "4 dice: " + firstRoll[3] + "\n"
							+ "\t" + "5 dice: " + firstRoll[4]);
				} else {
					System.out.println(firstRoll);
				}
				break;

			default:
				System.out.println("Enter a valid number:");
			}
			if (stopRollingSecondRoll <= 3) {
				System.out.println(firstRoll[0] + " + " + firstRoll[1] + " + " + firstRoll[2] + " + " + firstRoll[3]
						+ " + " + firstRoll[4] + " =" + ""
						+ (firstRoll[0] + firstRoll[1] + firstRoll[2] + firstRoll[3] + firstRoll[4]));
			}

		}

	}

}
