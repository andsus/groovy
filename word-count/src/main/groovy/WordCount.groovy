class WordCount {

    def utterances

    WordCount(s) {
        this.utterances = s    
    }

    def countWords() {
        this.utterances.toLowerCase()
            .findAll("\\p{Alnum}+('\\p{Alnum}+)?")
            .countBy { it }
    }
}