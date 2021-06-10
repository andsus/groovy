import groovy.transform.TailRecursive

class BinarySearch {

    private List data

    // You may assume for this exercise that the input data is sorted in ascending order.
    BinarySearch(List data) {
        this.data = data
    }


    def indexOf(target) {
        if (!data)
            return -1 
        
        search(target, 0, data.size() - 1)
    }

    @TailRecursive
    def search(target, low, high ) {
        if (high >= low) {
            int pivot = (low + high) / 2
            int pivotValue = data[pivot]

            if (pivotValue == target) 
                return pivot
            if (pivotValue > target)
                return search(target, low, pivot - 1)
            else 
                return search(target, pivot + 1, high)
            
        }
        return -1
    }


}
