package proj6;

public class SwapFirst{

        int num1, num2, a, b;

        SwapFirst(int a, int b) {
            num1 = a;
            num2 = b;
        }
    }

    class SwapSecode {
        void swap(SwapFirst s) {
            int output = s.num1;
            s.num1 = s.num2;
            s.num2 = output;
        }
    }

    class callref {
        public static void main(String args[]) {
            SwapFirst s1 = new SwapFirst(20, 10);
            System.out.println("Before Swapping :" + s1.num1 + "\t" + s1.num2);
            SwapSecode s2 = new SwapSecode();
            s2.swap(s1);
            System.out.println("After Swapping :" + s1.num1 + "\t" + s1.num2);
        }
    }

