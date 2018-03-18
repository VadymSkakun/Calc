public class RangeException extends Exception {
    String range;

    public RangeException(String range) {
        this.range = range;
    }
}
