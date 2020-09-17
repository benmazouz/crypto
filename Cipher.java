
public abstract class Cipher {

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public abstract String encrypt(String m);

    public abstract String decrypt(String m);

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

}
