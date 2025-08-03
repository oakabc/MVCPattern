public class ValueModel {
    private int value;
    private final int min;
    private final int max;

    public ValueModel(int min, int max, int initial) {
        this.min = min;
        this.max = max;
        this.value = initial;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= min && value <= max) {
            this.value = value;
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
