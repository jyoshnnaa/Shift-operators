public class ShiftOp {
    public static void main(String[] args) {
        int num = 8;
        int leftshift = num << 2;
        int rightshift = num >> 2;
        System.out.println("The original number : " + num +"\n"+ "The number after left shift:"+Integer.toBinaryString(leftshift));
        System.out.println("The original number : " + num +"\n"+ "The number after right shift:"+Integer.toBinaryString(rightshift));
    }
}
