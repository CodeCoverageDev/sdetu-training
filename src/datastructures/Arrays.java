package datastructures;

public class Arrays {
    public static void main(String[] args) {
	String[] alphabet = {"a", "b", "c", "d", "e", "f"};

	for (int i = 0; i < 5; i++) {
	    System.out.print(alphabet[i] + " ");
	}

	System.out.println("\n------- Using the length variable -------");
	for (int i = 0; i < alphabet.length; i++) {
	    System.out.print(alphabet[i] + " ");
	}

	System.out.println("\n\n------- Using the for each method -------");
	for (String letter : alphabet) {
	    System.out.print(letter + " ");
	}

	System.out.println("\n\n------- Using the Multi Dimensional Arrays -------");
	String[][] users = {
	    {"John", "Williams", "john@email.com", "123456789"},
	    {"Sarah", "Jackson", "sarah@email.com", "547899999"},
	    {"Rachel", "Wallace", "rachel@email.com", "99998877412"},
	};

	// Get the size of the array
	int numOfUsers = users.length;
	int numOfField = users[0].length;
	System.out.println("Number of users: " + numOfUsers);
	System.out.println("Numbers of fields: " + numOfField);

	// Traverse the double array
	for (int i = 0; i < numOfUsers; i++) {
	    String firstName = users[i][0];
	    String lastName = users[i][1];
	    String email = users[i][2];
	    String phone = users[i][3];
	    System.out.println(firstName + " " + lastName + " " + email + " " + phone + " ");
	}

	System.out.println("\n\n------- Using for each -------");
	for (String[] user: users) {
	    System.out.print("[ ");
	    for(String field: user) {
		System.out.print(field + " ");
	    }
	    System.out.print(" ]");
	}

	System.out.println("\n\n------- Using the old way -------");
	for (int i = 0; i < numOfUsers; i++) {
	    System.out.print("[ ");
	    for (int j = 0; j < numOfField; j++){
		System.out.print(users[i][j] + " ");
	    }
	    System.out.print(" ]");
	}
    }

}
