public class Experiment {
    private Sorter sorter;
    private Searcher searcher;
    public Experiment(Sorter sorter, Searcher searcher){
        this.sorter = sorter;
        this.searcher = searcher;
    }
    public long measureSortTime(int[] arr, String type){
        int[] copy = arr.clone();
        long start = System.nanoTime();
        if(type.equals("basic")){
            sorter.basicSort(copy);
        } else{
            sorter.advancedSort(copy);
        }
        long end = System.nanoTime();
        return end - start;
    }
    public long measureSearchTime(int[] arr, int target){
        long start = System.nanoTime();
        searcher.search(arr, target);
        long end = System.nanoTime();
        return end-start;
    }
    public void runAllExperiments(){
        int[] sizes = {10,100,1000};
        for(int size : sizes){
            int[] arr = sorter.generateRandomArray(size);
            long bubbleTime = measureSortTime(arr, "basic");
            long mergeTime = measureSortTime(arr, "advanced");
            long searchTime = measureSearchTime(arr, arr[size / 2]);

            System.out.println("\nArray size: " + size);
            System.out.println("Bubble Sort time: " + bubbleTime + "ns");
            System.out.println("Merge Sort time: "+ mergeTime + "ns");
            System.out.println("Linear Search time: " + searchTime + "ns");
        }
    }
}
