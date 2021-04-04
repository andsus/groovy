import groovy.transform.Memoized

class DifferenceOfSquares {
    private final int number

    // @Lazy private int sumOfSquares = (1..number).sum{ it**2 }
    // @Lazy private int squareOfSum = (1..number).sum()**2
    
    DifferenceOfSquares(num) {
        this.number = num
    }

    @Memoized
    def squareOfSum() {
        // squareOfSum
        (1..number).sum()**2
    }
    @Memoized
    def sumOfSquares() {
        // sumOfSquares
        (1..number).sum{ it**2 }
    }

    def difference() {
        // squareOfSum - sumOfSquares
        squareOfSum() - sumOfSquares()
    }

}
