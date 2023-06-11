class Solution {
    

    static void printNos(int N) {
        if (N <= 0)
    {
        return;
    }
    else
    {
        System.out.print(N + " ");
 
        // Recursive call of the function
        printNos(N - 1);
    }
}
        // code here
}  
