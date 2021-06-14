package assignment2.ex37.base;

public class Password {

    public static void scrambler(int[] info){
      //  String password = "0";

        String[] letters = new String[26];
        letters[0] = "a"; letters[1] = "b"; letters[2] = "c"; letters[3] = "d"; letters[4] = "e"; letters[5] = "f";
        letters[6] = "g"; letters[7] = "h"; letters[8] = "i"; letters[9] = "j"; letters[10] = "k"; letters[11] = "l";
        letters[12] = "m"; letters[13] = "n"; letters[14] = "o"; letters[15] = "p"; letters[16] = "q"; letters[17] = "r";
        letters[18] = "s"; letters[19] = "t"; letters[20] = "u"; letters[21] = "v"; letters[22] = "w"; letters[23] = "x";
        letters[24] = "y"; letters[25] = "z";

        String[] numbers = new String[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = String.valueOf(i);
        }

        String[] special = new String[32];
        special[0] = "."; special[1] = ","; special[2] = "<"; special[3] = ">"; special[4] = "/"; special[5] = "\\";
        special[6] = "?"; special[7] = "|"; special[8] = "!"; special[9] = "@"; special[10] = "#"; special[11] = "$";
        special[12] = "%"; special[13] = "^"; special[14] = "&"; special[15] = "*"; special[16] = "("; special[17] = ")";
        special[18] = "-"; special[19] = "_"; special[20] = "="; special[21] = "+"; special[22] = "`"; special[23] = "~";
        special[24] = ";"; special[25] = "{"; special[26] = "}"; special[27] = "]"; special[28] = "["; special[29] = "'";
        special[30] = ":"; special[31] = "\"";

        int minLength = info[0];
        int numSpecial = info[1];
        int numNumbers = info[2];

        //ensuring password contains at least as many number as letters and special characters
        int length;
        if(minLength >= (2 * (numNumbers + numSpecial))){
            length = minLength;
        }
        else{
            length = (2 * (numNumbers + numSpecial));
        }

        int numLetters = length - (numSpecial + numNumbers);

        System.out.print("\nYour password is: ");

        for (int i = 0; i < length; i++) {
            int random;
            random = (int)Math.floor(Math.random()*(3-1+1)+1);

            if (random == 1){
                if(numLetters > 0){
                    numLetters = numLetters - 1;

                    random = (int)Math.floor(Math.random()*(26-1+1)+1);
                    System.out.print(letters[random]);
                    continue;
                }
                else{
                    i = i - 1;
                    continue;
                }
            }

            if (random == 2) {
                if(numSpecial > 0){
                    numSpecial = numSpecial - 1;

                    random = (int)Math.floor(Math.random()*(32-1+1)+1);
                    System.out.print(special[random]);
                    continue;
                }
                else{
                    i = i - 1;
                    continue;
                }
            }

            if (random == 3) {
                if(numNumbers > 0){
                    numNumbers = numNumbers - 1;

                    random = (int)Math.floor(Math.random()*(10-1+1)+1);
                    System.out.print(numbers[random]);
                }
                else{
                    i = i - 1;
                }
            }
        }


      //  return password;
    }
}
