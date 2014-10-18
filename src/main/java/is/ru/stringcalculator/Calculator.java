package is.ru.stringcalculator;
//Hér fer inn kóði
public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;

		}
     
       		 else{
       		 return splittastreng(text);
       		 }
	}
   	private static int splittastreng(String text){
                String[] strengur;
                String a = text;
                if(a.contains("//")){
                        String skipta = Character.toString(a.charAt(2));
                        a = a.replace(skipta, ",").trim();
                        a = a.replace("/", ",").trim();
                        a = a.replace(",", " ").trim();
                        a = a.replace(" ", ",").trim();
               		 }
                a = a.replace("\n", ",");
                strengur = a.split(",");
        
                int summa = 0;
                for(int i = 0; i < strengur.length; i++){
                        summa += Integer.parseInt(strengur[i].trim());
                }
                return summa;
        }

}
