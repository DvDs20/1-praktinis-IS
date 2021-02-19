package backEnd;

public class cesearCipher {

    public static  String encrypt(String text, int shift) throws Exception {
        String encrypted = "";
        if (!String.valueOf(shift).isBlank() || !String.valueOf(shift).isEmpty()){
            if (shift < 189) {
                for (int i = 0; i < text.length(); i++) {
                    int c = text.charAt(i) + shift;
                    if (c > 126) {
                        c -= 95;
                    } else if (c < 32) {
                        c += 95;
                    }
                    encrypted += (char) c;
                }
            }
            else {
                throw new Exception("Bad shift! Type another!!");
            }
        }
        else {
            throw new Exception("Bad shift! Type another!");
        }
        return encrypted;
    }

    public static String decrypt (String encrypted, int shift) throws Exception {
        return encrypt(encrypted, -shift);
    }
}
