public class Exercici3_5 {
    public static void main(String[] args) {
        char character = 'B';
        Character.isLetter(character);
        Character.isDigit(character);
        Character.isUpperCase(character);
        Character.isLowerCase(character);
        System.out.println("És " + character + " una lletra? " + Character.isLetter(character));
        System.out.println("És " + character + " una número? " + Character.isDigit(character));
        System.out.println("És " + character + " una lletra Majúscula? " + Character.isUpperCase(character));
        System.out.println("És " + character + " una lletra Minúscula? " + Character.isLowerCase(character));
    }
}
