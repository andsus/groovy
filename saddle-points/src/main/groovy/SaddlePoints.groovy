class SaddlePoints {

    static Collection<Collection<Integer>> getSaddlePoints(List<List<Integer>> matrix) {

        def maxInRows = matrix.collect { it.max() }
        def minInCols = matrix.transpose().collect{ it.min() } 

        matrix.indexed()
            .collectMany { i, row ->
                row.indexed()
                    .collect { j, v ->
                        if (v == maxInRows.get(i) && v == minInCols.get(j)) {
                            [i,j]
                        }                     
                    } - null
            }
    }
}