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
  //pretty simple alg
  private static void pushUp(int[] data, int index){
    if (data[(index - 1) / 2] >= data[index]){
      return;
    }
    else if (index == 0) {
      return;
    }
    swap(data, index, (index - 1) / 2);
    pushUp(data, (index - 1) / 2);
  }
  public static void heapify(int[] data){
    // loop thru
    for (int x = data.length - 1; x > -1; x--) {
            pushDown(data, data.length, x);// push the elements down.
    }
  }
  public static void heapsort(int[] data){
    //first heapify.
    heapify(data);
    for(int i = data.length - 1; i >= 0; i--) {
            swap(data, 0, i);
            pushDown(data, i ,0);
    }
  }
}
