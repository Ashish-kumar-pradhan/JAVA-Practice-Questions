package nsutTest;

public class test2 {
	
	static String superReducedString(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean passNeeded = true;
 
        while (passNeeded) {
            passNeeded = false;
            for (int i = 0; i < str.length() - 1; ++i) {
 
                if (str.charAt(i) == str.charAt(i + 1)) {
                    str.delete(i, i + 2);
                    passNeeded = true;
 
                }
            }
        }
 
        if (str.length() == 0) {
            return "Empty String";
        } else {
            return str.toString();

        }
    }
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = bufferedReader.readLine();

	        String result = superReducedString(s);

	        bufferedWriter.write(result);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	        
	        int[] array = new int[5];
	        
	        int x = array.length;
	    }

}
