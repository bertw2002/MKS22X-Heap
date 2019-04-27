public class MyHeap{
  //private helper that swaps the given positions.
  private static void swap(int[] data, int first, int second){
    int newvar = data[first];
    data[first] = data[second];
    data[second] = newvar;
  }
  private static void pushDown(int[] data, int size, int index){
    if (2 * index + 2 < size && (data[index] < data[2 * index + 1] || data[index] < data[2 * index + 2])) {
      if (data[2 * index + 1] <= data[2 * index + 2]) {
        swap(data, index, 2 * index + 2);
        //recursive
        pushDown(data, size, 2 * index + 2);
      }
      else {
        swap(data, index, 2 * index + 1);
        //recursive part
        pushDown(data, size, 2 * index + 1);
      }
    }
    else if (2 * index + 1 == size - 1 && size % 2 == 0) {
      if (data[index] < data[2 * index + 1]) {
        //no recursive, just swap
        swap(data, index, 2 * index + 1);
      }
    }
  }
  private static void pushUp(int[]data, int index){

  }
  public static void heapify(int[] arr){

  }
  public static void heapsort(int[] arr){

  }
}
