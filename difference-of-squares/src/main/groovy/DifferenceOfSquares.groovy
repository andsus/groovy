class DifferenceOfSquares {
    private final int number

    @Lazy private int _sumOfSquares = sumOfSquares()
    @Lazy private int _squareOfSum = squareOfSum()
    
    DifferenceOfSquares(num) {
        this.number = num
    }

    def squareOfSum() {
        (1..number).iterator().sum()**2
    }

    def sumOfSquares() {
        (1..number).iterator().sum{ it**2 }
    }

    def difference() {
        _squareOfSum - _sumOfSquares
    }

}
