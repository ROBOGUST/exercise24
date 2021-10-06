package se.robinstrang;
/*
Du har en sträng med texten ”Detta är en sträng som du skall ändra”.
Ersätt via kod alla blanktecken i strängen med tecknet * .
Räkna sedan ut via kod hur många förekomster det finns av tecknet * i strängen.
*/
public class D2 {
    public void ReplaceAndCount(){
        String text = "Detta är en sträng som du skall ändra";
        System.out.println(text.replace(' ','*'));
        String charText = text.replace(' ','*');
        int count = 0;
            for (int i = 0; i < charText.length(); i++){
                char charLoop = charText.charAt(i); 
                char charTarget = '*';
                if (charLoop == charTarget){
                    count++;
                }
            }
        System.out.println("Antal * tecken är: " + count);
    }
}