public class Appex {
    public class passwordManager{

	public static boolean isValidPassword(String passwordInput){

		Boolean result = false;

		if(passwordInput.length() == 8 && passwordInput.matches("[a-zA-Z0-9]+")){
            result = true;
        }
        System.out.println(passwordInput.length());
        System.out.println(result);
		return result;
	
	}    
}

    public static void main(String[] args){

        passwordManager.isValidPassword("boudll2r");
            

        }
}
