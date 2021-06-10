import java.security.SecureRandom

class RobotName {

    private static RAND = new SecureRandom()
    // Static need to track unique name across all robot name across class instance
    private static Set<String> usedNames = new HashSet<> ()
    private Integer maxNames = 26 * 26 * 1000

    String name

    RobotName() {
        reset()
    }

    def reset() {
        if (usedNames.size() > maxNames)
            throw new ArithmeticException("Maxing out name limit $usedNames")
        def name = new StringBuilder()
        // userNames.add() returns false if name already exists
        do {
            name.setLength(0) // reset StringBuilder
            name << letter() << letter() << digit() << digit() << digit()
        } while (!usedNames.add(name as String))

        this.name = name as String
    }

    private char letter() { (65 + RAND.nextInt(26)) as char }
    private int digit() { RAND.nextInt(10) }


}