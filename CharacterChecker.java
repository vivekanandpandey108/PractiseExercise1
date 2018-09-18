public class CharacterChecker {
    public static String checkCharacter(char inputCharacter) {

        if (Character.isUpperCase(inputCharacter)) {
            return "Capital Letter";

        } else if (Character.isLowerCase(inputCharacter)) {

            return "Small Letter";

        } else if (Character.isDigit(inputCharacter)) {

            return "Digit";

        } else {

            return "Special Character";

        }
    }
}