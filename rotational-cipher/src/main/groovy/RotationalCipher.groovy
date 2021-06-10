class RotationalCipher {
    private static final ALPHABET_SIZE = 26
    private int key

    RotationalCipher(int key) {
        this.key = key
    }

    private Closure<char> encode = {
        def aCode = (it.isUpperCase() ? 'A' : 'a') as char
        (char) (aCode + (it - aCode + key) % ALPHABET_SIZE)
    }

    String rotate(String cipherText) {
        cipherText
            .chars
            .collect { it.isLetter() ? encode(it) : it }
            .join()
    }
}
