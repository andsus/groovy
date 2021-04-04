class Matrix {
    private String input
    @Lazy private int[][] matrix = input
            .readLines()
            *.split("\\s+")
            *.collect{ it as int }

    Matrix(String asString) {
        this.input = asString
    }

    int[] row(int rowNumber) {
        matrix[rowNumber]
    }

    int[] column(int columnNumber) {
        matrix[0..matrix.length - 1]*.getAt(columnNumber)
    }
}
