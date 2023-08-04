import java.util.*;

public class Currency { 
    private String name;

    //constructor 
    public Currency(String abbreviation) {
        name = abbreviation;
    }

    //getters and setters
    public String get_name() {
        return name; 
    }

    public void set_name(String newName) {
        this.name = newName;
    }

    //hash map is created through user input of name of currency
   public void set_exchangeRates(HashMap<String,Double> new_currencies) {
        String name = this.name;
        switch (name) {
            case ("USD"): {
                new_currencies.put("USD", 1.00);
                new_currencies.put("EUR", 0.91);
                break;
            }
        
            case ("EUR"): {
                new_currencies.put("USD", 1.09);
                new_currencies.put("EUR", 1.00);
                break;
            }

        }
   }
public static void main (String[] args) {
    //menu
    System.out.println("Currency Converter Program"); 
    System.out.println(" "); 
    System.out.println("Available Currencies"); 
    System.out.println("USD"); 
    System.out.println("EUR"); 
    System.out.println(" "); 
    System.out.print("Please select currency you currently have in hand (type selection exactly as shown): ");
    //scanning input
    Scanner scanner = new Scanner(System.in); //defines scanner input
    String selection = scanner.nextLine(); //scans input

    //Object creation and Hashmap creation
    Currency userCurrency = new Currency(selection); //creates object based on scanner
    HashMap<String, Double> exchangeRates = new HashMap<String, Double>();
    userCurrency.set_exchangeRates(exchangeRates);
    System.out.println(exchangeRates); //test

    System.out.print("Enter how much you have in " + userCurrency.get_name() + ": ");
    Double userAmount = scanner.nextDouble(); //used to read next double
    System.out.println(userAmount); //test

    System.out.print("Please select a currency to convert to: ");
    Scanner newScanner = new Scanner(System.in);
    String updatedCurrency = newScanner.nextLine();
    Currency newCurrency = new Currency(updatedCurrency);
    HashMap<String, Double> newExchangeRates = new HashMap<String, Double>();
    newCurrency.set_exchangeRates(newExchangeRates);
    System.out.println(newExchangeRates); //test
    
    double rate = exchangeRates.get(newCurrency.get_name()); 
    double result = userAmount * rate; 
    System.out.println(userAmount + " " + userCurrency.get_name() + " converts to " + result + " " + newCurrency.get_name());
} //end main
}