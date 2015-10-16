public class SumList {



public static void main(String[] args) {

    // ##Problem 1

// Write three functions that compute the sum of the numbers in a given
// list using a for-loop, a while-loop, and recursion.

    //List testlist = new ArrayList(); <--- WRONG - what you did
    //List<String> myList = new ArrayList<String>(); <------ what you should do
    //list.add(1,4,2,5,2,5,7,2,3,4,1,3); <------- what you did

    //primitives should use lists (except maybe possibly char[])
    //this program will use a primitive, and is only an example - use a list
    //int [] testlist = [1,6,3,6,9,2,34,51,1,0,3]; // <------WRONG - what you did
    int [] testlist = {1,6,3,6,9,2,34,51,1,0,3};
    System.out.println("for loop sum: " + forsum(testlist));
    System.out.println("while loop sum: " + whilesum(testlist));
    System.out.println("recursive sum: " + recursivesum(testlist, testlist.length));
}

public static int forsum (int [] list) {
    int sum = 0;

    for (int i = 0; i < list.length; i ++) {
        sum += list[i];
    }
    return sum;
}

public static int whilesum (int [] list) {
    int sum = 0;
    int i = 0;
    while (i < list.length ) {
        sum += list[i];
        i++;
    }
    return sum;
}

public static int recursivesum (int [] list, int n) { //n is size of array, passed by the caller
    if (n == 0) {
        return 0;
    }
    return list[n - 1] + recursivesum(list, n - 1);
}

}