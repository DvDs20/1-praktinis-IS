package backEnd;

public class cesearCipher {

    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else if (Character.isWhitespace(text.charAt(i))) {
                char ch = ' ';
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static StringBuffer decrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) -
                        s - 65) % 26 + 65);
                result.append(ch);
            }
            else if (Character.isWhitespace(text.charAt(i))) {
                char ch = ' ';
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) -
                        s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static String encryptusingASCII(String text, int shift) {
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            int c = text.charAt(i) + shift;
            if (c > 126) {
                c -= 95;
            } else if (c < 32) {
                c += 95;
            }
            encryptedText += (char) c;
        }
        return encryptedText;
    }
}
