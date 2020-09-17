
public class Decalage extends Cipher {

    private int key = 0;

    @Override
    public String encrypt(String m) {
        String encryptedText = "";
        m = m.toUpperCase();
        for (int i = 0; i < m.length(); i++) {
            if (!alphabet.contains("" + m.charAt(i))) {
                encryptedText += " ";
            } else {
                encryptedText += alphabet.charAt(((m.charAt(i) - 65) + key) % alphabet.length());
            }
        }
        return encryptedText;
    }

    @Override
    public String decrypt(String c) {
        String deCryptedText = "";
        c = c.toUpperCase();
        for (int i = 0; i < c.length(); i++) {
            if (!alphabet.contains("" + c.charAt(i))) {
                deCryptedText += " ";
            } else {
                int idx = (c.charAt(i) - 65) - key;
                idx = idx < 0 ? idx + alphabet.length() : idx;
                deCryptedText += alphabet.charAt((idx) % alphabet.length());
            }
        }
        return deCryptedText;
    }

    public String encrypt(String m, int key) {
        this.key = key;
        return encrypt(m);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {

        this.key = key % alphabet.length();
    }

}
