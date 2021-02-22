import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {
    private static long gigaSeconds = 1_000_000_000

    def static LocalDateTime add(LocalDate date) {
        add(date.atStartOfDay())
    }

    def static LocalDateTime add(LocalDateTime dateTime) {
        dateTime + gigaSeconds
    }
}
