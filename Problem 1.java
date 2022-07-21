class Solution {

    public static void printPath(int target){
        StringBuilder str = new StringBuilder();
        int current = 0;
        int operation = 1;
        int add = 1;
        int sum = 0; 
        int difference =  Math.abs(current - target);

        while(current != target){
            sum += add;
            add *= 2;
            str.append('A');
            if(sum >= difference){
                sum *= operation;
                current += sum;
                operation *= -1;
                add = 1;
                sum = 0;
                difference =  Math.abs(current - target);
                if(current == target)
                    break;
                str.append('R');
            }
        }
        System.out.println(str.toString());
    }

    public static void main(String[] args){
        printPath(1);
        printPath(2);
        printPath(3);
        printPath(4);
        printPath(5);
        printPath(6);
        printPath(7);
    }
}