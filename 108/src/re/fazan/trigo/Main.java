package re.fazan.trigo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1 && args[0].equals("-h")) {
	        printHelp();
	        System.exit(0);
	    }
		if (args.length < 2) {
			printErr();
			System.exit(84);
		}
		inits(args);
	}
	
	public static void printHelp() {
	    System.out.println("USAGE");
	    System.out.println("    ./108trigo fun a0 a1 a2 ...");
	    System.out.println();
	    System.out.println("DESCRIPTION");
	    System.out.println("    fun\tfunction to be applied, among at least \"EXP\", \"COS\", \"SIN\", \"COSH\"");
	    System.out.println("       \tand \"SINH\"");
	    System.out.println("    ai\tcoeficients of the matrix");
	}
	
	public static void printErr() {
		System.out.println("Wrong arguments.");
		System.out.println("Try './108trigo -h' to have more information.");
	}
	
	public static void inits(String[] args) {
		if(args.length == 1) {
			System.exit(0);
		}
		if(args.length > 2) {
			if (!args[0].equals("EXP") || !args[0].equals("COS") || !args[0].equals("SIN") || !args[0].equals("COSH") || !args[0].equals("SINH")) {
				System.exit(84);
			}
		}
		for (int i = 1; i < args.length; i++) {
			try {
				Integer.parseInt(args[i]);
			} catch (Exception e) {
				System.out.println("NAN");
				System.exit(84);
			}
		}
		if (args.length - 1 != 1 || args.length - 1 != 4 || args.length - 1 != 9 || args.length - 1 != 16 || args.length - 1 != 25) {
			System.out.println("Is not allow");
			System.exit(84);
		}
		if (Math.sqrt(args.length - 1) != (int) Math.sqrt(args.length - 1)) {
			System.exit(84);
		}
	}
}
