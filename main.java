
//Meenakshi Dhruv
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;

	public class main {

	    public static void main(String[] args) {

	        long start = System.currentTimeMillis();

	        try {
	            // Input files
	            Path book1 = Path.of("Alice.txt");
	            Path book2 = Path.of("Frankenstien.txt");

	            // Output files
	            Path out1 = Path.of("Alice_modified2.txt");
	            Path out2 = Path.of("Frankenstien_modified2.txt");

	            // Read two books
	            String text1 = Files.readString(book1);
	            String text2 = Files.readString(book2);

	            // Modify (capitalize words)
	            String modified1 = capitalizeWords(text1);
	            String modified2 = capitalizeWords(text2);

	            // Save to new output files
	            Files.writeString(out1, modified1);
	            Files.writeString(out2, modified2);

	            long end = System.currentTimeMillis();
	            System.out.println("Finished processing both books!");
	            System.out.println("Time taken: " + (end - start) + " ms");

	        } catch (IOException e) {
	            System.out.println("File error: " + e.getMessage());
	        }
	    }

	    private static String capitalizeWords(String text) {
	        String[] words = text.split("\\s+");
	        StringBuilder sb = new StringBuilder();

	        for (String w : words) {
	            if (w.length() > 0) {
	                sb.append(Character.toUpperCase(w.charAt(0)))
	                        .append(w.substring(1).toLowerCase())
	                        .append(" ");
	            }
	        }
	        return sb.toString();
	    }
	}
