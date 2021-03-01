class ScrabbleScore {


    private static Map<String, Integer> valueOfLetter = [
            1 : 'AEIOULNRST',
            2 : 'DG',
            3 : 'BCMP',
            4 : 'FHVWY',
            5 : 'K',
            8 : 'JX',
            10: 'QZ',
        ].collectMany { v, ls -> ls.collect { l -> [l, v] } }.collectEntries()

    static scoreWord(String word) {
        word.toUpperCase().inject (0, {v,c -> valueOfLetter[c] + v })
    }


}
