class Triangle {

    boolean equilateral, isosceles, scalene = false 
    Triangle(a, b, c) {
        def sides = [a, b, c]
        if (valid(sides)) {
            def unique = sides.unique().size()
            switch (unique) {
                case 3: scalene = true; break
                case 1: equilateral = true
                default: isosceles = true
            }
        } 
    }

    private static boolean valid(List sides) {
        if (sides.any { it < 0 }) throw new IllegalArgumentException()
        def sorted = sides.sort()
        sorted[0] + sorted[1] > sorted[2]
    }

}
