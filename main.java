
//Meenakshi Dhruv
	import java.io.*;
	import java.nio.file.*;
	import java.util.Locale;

	public class main {
	    public static void main(String[] args) throws IOException {

	        long start = System.currentTimeMillis();

	        // CHANGE THIS to your downloaded Gutenberg file
	        Path input = Paths.get("Alice.txt");
	        Path output = Paths.get("Frankenstien.txt");

	        String text = Files.readString(input);

	        StringBuilder sb = new StringBuilder(text.length());
	        boolean newWord = true;

	        for (int i = 0; i < text.length(); i++) {
	            char c = text.charAt(i);

	            if (Character.isLetter(c)) {
	                if (newWord) {
	                    sb.append(Character.toUpperCase(c));
	                    newWord = false;
	                } else {
	                    sb.append(c);
	                }
	            } else {
	                sb.append(c);
	                newWord = true;
	            }
	        }

	        Files.writeString(output, sb.toString());

	        long end = System.currentTimeMillis();

	        System.out.println("Finished capitalizing words.");
	        System.out.println("Time taken: " + (end - start) + " ms");
	        System.out.println("Output saved to: " + output);
	    }
}
