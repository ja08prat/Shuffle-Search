public class ShuffleSearch {

    public static void main( String[] args ) {
        char[] originalWord1 = args[0].toLowerCase().toCharArray();
        char[] originalWord2 = args[1].toLowerCase().toCharArray();
        char[] shuffle = args[2].toLowerCase().toCharArray();

        int originalWord1CorrectCharacterCount = 0;
        int originalWord2CorrectCharacterCount = 0;
        int originalWord1LastFoundCharacterIndex = -1;
        int originalWord2LastFoundCharacterIndex = -1;

        for (int i = 0; i < shuffle.length; i++) {
            for (int k = 0; k < originalWord1.length; k++) {
                if (shuffle[i] == originalWord1[k] && i > originalWord1LastFoundCharacterIndex) {
                    originalWord1LastFoundCharacterIndex = i;
                    originalWord1CorrectCharacterCount++;
                }
            }
            for (int j = 0; j < originalWord1.length; j++) {
                if (shuffle[i] == originalWord1[j] && i > originalWord2LastFoundCharacterIndex) {
                    originalWord2LastFoundCharacterIndex = i;
                    originalWord2CorrectCharacterCount++;
                }
            }
        }
        if (originalWord1CorrectCharacterCount >= originalWord1.length &&
                originalWord2CorrectCharacterCount >= originalWord2.length) {
            System.out.println("CORRECT");
        } else {
            System.out.println("INCORRECT");
        }

    }
}
