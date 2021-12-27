package basics;

public class Strings {
    public static void main(String[] arg) {
        String bookTitle;
        String wordChoice = "Ring";
        bookTitle = "The Lord of the Rings";

        if(bookTitle.contains(wordChoice)) {
	    System.out.println("The book contains the word Ring");
	}

        String browser = "Chrome";
//        if (browser == "chrome")
            if (browser.equalsIgnoreCase("chrome")){
		System.out.println("This browser is chrome");
	    }

            String firstName = "Chris";
            String lastName = "Lim";
            String SSN = "022334444";

            // Print the initial plus last 4 digit of SSN
	System.out.println(firstName.substring(0,1));
	System.out.println(lastName.substring(0,1));
	System.out.println(SSN.substring(5));
    }
}
