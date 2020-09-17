
public class Decalage extends Cipher {

    private int key = 0;

    @Override
    public String encrypt(String m) {
        String encryptedText = "";
        m = m.toUpperCase();
        for (int i = 0; i <           ; i++) {
            
            
            
            
            
        }
        return encryptedText;
    }

    @Override
    public String decrypt(String c) {
        String deCryptedText = "";
        c = c.toUpperCase();
        for (int i = 0; i <         ; i++) {
            
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
