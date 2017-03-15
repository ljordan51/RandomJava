/**
* The IfStatement program implements an application that prints out the speed limit
* and then randomly generates a vehicle speed and either prints
* "[vehicleSpeed]??? You're making great time!" if the vehicle speed is greater than the speed limit
* or "[vehicleSpeed]??? You'll never get anywhere at this rate." if it's equal too or less than the speed limit.
* It runs this sequence 10 times before terminating the while loop.
*
* @author  Lakhvinder Jordan
* @version 1.0
* @since   2016-11-22
*/

public class IfStatement {
	
	public static void main (String[] args) {
		int speedLimit = 35;
		System.out.println("The speed limit is: " + speedLimit);
		int i = 1;
		while (i < 11) {
			int vehicleSpeed = 30 + (int)(Math.random() * 20);
			if (vehicleSpeed > speedLimit) {
				System.out.println(vehicleSpeed + "??? You're making great time!");
			} else {
				System.out.println(vehicleSpeed + "??? You'll never get anywhere at this rate.");
			}
			i = i+1;
		}
	}
}	