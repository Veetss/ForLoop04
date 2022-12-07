public class CustomNumber {
    public int number;

    public CustomNumber() {
        this.number = (int) (Math.floor(Math.random() * (12 - 1) + 1) + 1);
    }

    public void getMultiplicationTable() {
        for (int i = number; i >= 1; i--) {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}