package chap01;

class Max3m {
    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3,2,1));
        System.out.println("max3(1,2,3) = " + max3(1,2,3));
        System.out.println("max3(1,3,2) = " + max3(1,3,2));
        System.out.println("max4(3,2,1,4) = " + max4(3,2,1,4));
    }

    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        
        return max;
    }

    static int max4(int a, int b, int c, int d) {
        int max = max3(a, b, c);
        if (d > max) max = d;

        return max;
    }
}