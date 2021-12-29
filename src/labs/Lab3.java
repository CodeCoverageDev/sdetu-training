package labs;

import java.io.*;

public class Lab3 {
    public static void main(String[] args) {
	// Read a file of passwords
	String filename = "src/files/Passwords.txt";
	String[] passwords = new String[5];
	File file = new File(filename);

	try {
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    for (int i = 0; i < passwords.length; i++) {
		passwords[i] = br.readLine();
	    }
	    br.close();
	} catch (FileNotFoundException e) {
	    System.out.println("Error: File not found.");
	} catch (IOException e) {
	    System.out.println("Error: Cannot read file");
	}

	for (String password : passwords) {
	    System.out.println("******\nPassword Status:");
	    boolean hasNumber = false;
	    boolean hasLetter = false;
	    boolean hasSpecialChar = false;

	    for (int n = 0; n < password.length(); n++) {
		// Condition 1: contains number
		if ("0123456789".contains(password.substring(n, n + 1))) {
		    hasNumber = true;
		} else if ("abcdeghijklmnopqrstuvwxyz".contains(password.substring(n, n + 1).toLowerCase())) {
		    // Condition 2: contains letter
		    hasLetter = true;
		} else if ("[]/.#$!@".contains(password.substring(n, n + 1))) {
		    // Condition 3: contains special char, !@#
		    hasSpecialChar = true;
		} else {
		    try {
			throw new InvalidCharacterException(password.substring(n, n + 1));
		    } catch (InvalidCharacterException e) {
			e.toString();
			break;
		    }
		}

	    }
	    // Test & Exception Handling
	    try {
		if (!hasNumber) {
		    // Throw Criteria Error
		    throw new NumberCriteriaException(password);
		} else if (!hasLetter) {
		    // Throw Criteria Error
		    throw new LetterCriteriaException(password);

		} else if (!hasSpecialChar) {
		    // Throw Criteria Error
		    throw new SpecialCharCriteriaException(password);
		} else {
		    System.out.println("Valid Password: " + password);
		}
	    } catch (NumberCriteriaException | LetterCriteriaException | SpecialCharCriteriaException e) {
		System.out.println("Invalid Password");
		System.out.println(e.toString());
	    }
	}

    }
}

class InvalidCharacterException extends Exception {
    String ch;

    public InvalidCharacterException(String ch) {
	this.ch = ch;
    }

    public String toString() {
	return ("InvalidCharacterException: " + ch);
    }
}

class NumberCriteriaException extends Exception {
    String password;

    public NumberCriteriaException(String password) {
	this.password = password;
    }

    public String toString() {
	return ("NumberCriteriaException: " + password);
    }
}

class LetterCriteriaException extends Exception {
    String password;

    public LetterCriteriaException(String password) {
	this.password = password;
    }

    public String toString() {
	return ("LetterCriteriaException: " + password);
    }
}

class SpecialCharCriteriaException extends Exception {
    String password;

    public SpecialCharCriteriaException(String password) {
	this.password = password;
    }

    public String toString() {
	return ("SpecialCharCriteriaException: " + password);
    }
}