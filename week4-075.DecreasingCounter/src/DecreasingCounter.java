
public class DecreasingCounter {

    private int value;  // instance variable that remembers the value of the counter
    private int valueInitial;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.valueInitial = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value--;
        if (this.value < 0) {
            this.value = 0;

        }
// write here code to decrease counter value by one
    }

    public void reset() {
        this.value = 0;
    }

    public void setInitial() {
        this.value = this.valueInitial;
    }
}
