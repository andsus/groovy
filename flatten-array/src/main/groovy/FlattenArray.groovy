class FlattenArray {
    static List flatten(List l) {
        l.flatten().findResults { it } 
    }
}
