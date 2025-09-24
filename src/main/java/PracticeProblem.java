public class PracticeProblem {
public static final int MAXIMUM = 10;
	public static void main(String args[]) {

	}
//Question 1
public static int calculate(int integer1, int integer2, char char1) {
int result = 0;
			switch(char1) {
			case '+':
				result = integer1 + integer2;
				break;
			case '-':
				result = integer1 - integer2;
				break;
			case '*':
				result = integer1 * integer2;
				break;
			case '/':
				result = integer1 / integer2;
				break;
			case '%':
				result = integer1 % integer2;
				break;
			case '^':
				result = (int) Math.pow(integer1, integer2);
				break;
			default: //else statement
				return result;
			}
			return result;
		}
	//Question 2
public static boolean totalWordsChecker(String string1) {
String[] words = string1.split("[^A-Za-z'_]+");
	if (words.length <= MAXIMUM) {
		return(true); }
	else {
		return(false); }
	}
//Question 3
public static String minString(String string1, String string2, String string3) {
	if ((string1.compareToIgnoreCase(string2) <= 0) && (string1.compareToIgnoreCase(string3) <= 0)) {
	return string1; }
	if ((string2.compareToIgnoreCase(string1) <= 0) && (string2.compareToIgnoreCase(string3)) <= 0) {
	return string2; }
	if ((string3.compareToIgnoreCase(string1) <= 0) && (string3.compareToIgnoreCase(string1)) <= 0) {
	return string3; }
	return string3;
}
}


	



