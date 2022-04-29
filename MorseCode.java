import java.util.*;


public class MorseCode {
    public static Scanner sc;

    public static void main(String args[])
    {
        int option = 0;
        String sentence = "", answer = "", answer1 = "";
        char[] english = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?'};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};
        sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to MorseCode Software");

        option = sc.nextInt();
        switch (option) {
            case 1: {
                System.out.println("");
                System.out.println("Enter the Sentence that you want to Transmit Using the Morse Code ");
                sentence = scanner.nextLine();
                sentence = sentence.toLowerCase();
                char[] morsec = sentence.toCharArray();
                for (int i = 0; i < morsec.length; i++)
                {
                    for (int j = 0; j < english.length; j++)
                    {
                        if (english[j] == morsec[i])
                        {
                            answer = answer + morse[j] + " ";
                        }
                    }
                }
                System.out.println("-->The Morse Code Translation is:- ");
                System.out.println(answer);
                break;
            }
            case 2: {
                System.out.println("Enter the Morse Code and After Every Letter add Space in Between ");
                sentence = scanner.nextLine();
                System.out.println("");
                String[] morsec = sentence.split(" ");
                for (int i = 0; i < morsec.length; i++) {
                    for (int j = 0; j < morse.length; j++) {
                        if (morse[j].equals(morsec[i]))
                        {
                            answer1 = answer1 + english[j];
                        }
                    }
                }

            }

        }
    }
}
