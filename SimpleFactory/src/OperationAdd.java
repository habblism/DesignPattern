public class OperationAdd extends Operation {

    @Override
    String getResult(double a, double b) {
        return String.valueOf(a + b);
    }
}
