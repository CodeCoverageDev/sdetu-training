package labs;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PhoneNumberApp {
    public static void main(String[] args) {
	// This will read a text file and will retrieve phone number
	Path path = Paths.get("src/files/PhoneNumber.txt");
	String filename = path.toString();
	File file = new File(filename);
	String phoneNum = null;
	String[] phoneNumbers = new String[4];
	try {
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    for (int i = 0; i < phoneNumbers.length; i++) {
		phoneNumbers[i] = br.readLine();
	    }
	    br.close();
	} catch (FileNotFoundException e) {
	    System.out.println("Error: File not found.");
	} catch (IOException e) {
	    System.out.println("Error: Cannot read file");
	}


	// valid phone number:
	// 10 digits long
	// area code cannot start in 0 or 9
	// There can be 911 in the phone
	for (int i = 0; i < phoneNumbers.length; i++) {
	    phoneNum = phoneNumbers[i];

	    try {
		if (phoneNum.length() != 10) {
		    throw new TenDigitsException(phoneNum);
		}
		if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
		    throw new AreaCodeException(phoneNum);
		}
		for (int n = 0; n < phoneNum.length() - 2; n++) {
		    if (phoneNum.substring(n, n + 1).equals("9")) {
			if (phoneNum.substring(n + 1, n + 3).equals("11")) {
			    throw new EmergencyException(phoneNum);
			}
		    }
		}
		System.out.println("Success: " + phoneNum);
	    } catch (
		TenDigitsException e) {
		System.out.println("Error: Phone number is not 10 digits");
		System.out.println(e.toString());
	    } catch (
		AreaCodeException e) {
		System.out.println("Error: Has invalid area code.");
		System.out.println(e.toString());
	    } catch (
		EmergencyException e) {
		System.out.println("Error: Invalid 911 sequence found!");
		System.out.println(e.toString());
	    }
	}

    }
}

class TenDigitsException extends Exception {
    String num;

    TenDigitsException(String num) {
	this.num = num;
    }

    public String toString() {
	return ("TendDigitsException: " + num);
    }
}

class AreaCodeException extends Exception {
    String num;

    AreaCodeException(String num) {
	this.num = num;
    }

    public String toString() {
	return ("AreaCodeException: " + num);
    }
}

class EmergencyException extends Exception {
    String num;

    EmergencyException(String num) {
	this.num = num;
    }

    public String toString() {
	return ("EmergencyException: " + num);
    }
}
