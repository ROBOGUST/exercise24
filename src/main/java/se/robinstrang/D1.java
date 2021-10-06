package se.robinstrang;
/*
Skriv ett program som (förevigt) matar in "Skriv in ett namn:" till en strängvariabel
Du ska skriva ut hur många tecken det namnet har. Och dessutom hålla reda på hur många namn som totalt matats in
Skriver man in "EXIT" så skall programmet avslutas och du skriver ut:
Hej då. Du matade in totalt <antal> stycken ord
*/
public class D1 {
    public void EvigInmatning(){
        int antal = 0;
        while (true){
            System.out.println("Skriv EXIT för att avsluta\nEller skriv in ett namn:");
            String word = System.console().readLine();
            String exit = "EXIT";
            if (word.equalsIgnoreCase(exit)){
                System.out.println("Hej då. Du skrev in totalt: "+ antal +" stycken ord.");
                break;
            }
            antal++;
            System.out.println("Namnet har: " + word.length() + " ord i sig.");
        }
    }
}
