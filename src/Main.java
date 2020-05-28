
public class Main {

    public static void main(String[] args) {
	    // Creating variables and assigning values
    	int itemPrice = 400;
	    int moneyInWallet = 528;
	    int numbersOfFriends = 3;
	    int age = 30;
	    String firstName = "John";
	    String lastName = "Smith";
	    char middleInitial = 'D';

	    // Combining the variables
	    int amountRemaining = moneyInWallet - itemPrice;
	    int totalAmountOfFriends = age * numbersOfFriends;
	    String fullName = firstName + " " + middleInitial + " " + lastName;

	    // Calling out variables along with adding Strings
        System.out.println(fullName + " has " + "$" + moneyInWallet + ", he went to purchase a PS4 from Gamestop that " + "cost " + "$" + itemPrice + "," + " afterwards he had "
        + "$" + amountRemaining + " left. He can now play with " + totalAmountOfFriends + " of his friends online, that he accumulated over " + age + " years of his life." );
    }
}
