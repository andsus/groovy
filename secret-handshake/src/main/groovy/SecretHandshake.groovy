class SecretHandshake {
    private static Map<Integer, Closure> HANDSHAKES= [
            0b1:  { it << 'wink' },
            0b10: { it << 'double blink' },
            0b100: { it << 'close your eyes' },
            0b1000: { it << 'jump' },
            0b10000: { it.reverse() },
    ]


    static List<String> commands(int number) {
        HANDSHAKES
            .findAll { it.key & number }
            .inject ([]) { seq, m -> m.value(seq) }
    }
}
