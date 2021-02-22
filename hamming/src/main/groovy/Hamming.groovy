class Hamming {

    static def distance(strand1, strand2) {
        if (strand1.length() != strand2.length()) {
            throw new ArithmeticException("left and right strands must be of equal length")
        }
        // use spread operator and transpose (zip in other language)
        [strand1, strand2]
            *.toList()
            .transpose()
            .count { left, right -> left != right}

    }

}