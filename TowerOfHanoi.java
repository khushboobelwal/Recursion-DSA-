class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N==1){
            System.out.println("move disk "+1+" from rod "+from+" to rod "+to);
            return 1;
        }
        
        long a = toh(N-1,from,aux,to);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        long b = toh(N-1,aux,to,from);
        
        return 1+a+b;
        
        
    }
}
