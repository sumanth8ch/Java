/*Max heap is implemented.
  For min heap, reverse the heapify function. */

import java.util.ArrayList;

public class Heap {
    void heapify(ArrayList<Integer> ar, int i){
        int l = ar.size();
        int largest = i;
        int lc = 2*i+1;
        int rc = 2*i+2;
        if(lc<l && ar.get(lc)>ar.get(largest))
            largest = lc;
        if(rc<l && ar.get(rc)>ar.get(largest))
            largest = rc;

        if (largest!= i){
            int temp = ar.get(largest);
            ar.set(largest,ar.get(i));
            ar.set(i,temp);

            heapify(ar,largest);
        }
    }

    void insert(ArrayList<Integer> ar, int value) {
        int l = ar.size();
        if (l == 0) {
          ar.add(value);
        } else {
          ar.add(value);
          for (int i = l / 2 - 1; i >= 0; i--) {
            heapify(ar, i);
          }
        }
    }

    void deleteNode(ArrayList<Integer> ar, int val)
    {
        int l = ar.size();
        int i;
        for (i = 0; i < l; i++)
        {
        if (val == ar.get(i))
            break;
        }

        int temp = ar.get(i);
        ar.set(i, ar.get(l-1));
        ar.set(l-1, temp);

        ar.remove(l-1);
        for (int j = l / 2 - 1; j >= 0; j--)
        {
        heapify(ar, j);
        }
    }

    void printArray(ArrayList<Integer> array) {
        for (Integer i : array) {
          System.out.print(i + " ");
        }
        System.out.println();
      }

      public static void main(String args[]){
          ArrayList<Integer> ar = new ArrayList<Integer>();
          Heap h = new Heap();
          h.insert(ar,5);
          h.insert(ar,8);
          h.insert(ar,3);
          h.printArray(ar);
          h.deleteNode(ar, 8);
          h.printArray(ar);
      }

}
