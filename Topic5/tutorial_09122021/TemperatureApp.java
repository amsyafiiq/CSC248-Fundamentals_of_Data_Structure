import java.text.DecimalFormat;
import java.util.Stack;

public class TemperatureApp {

    public static void main(String[] args) {
        Stack<Double> st = new Stack<Double>();
        Stack<Double> temp = new Stack<Double>();

        int i = 0;
        Double avg = 0.0, total = 0.0;
        DecimalFormat df = new DecimalFormat("#0.0°C");

        st.push(26.5);
        st.push(25.6);
        st.push(24.3);
        st.push(30.6);
        st.push(16.0);
        st.push(32.2);
        st.push(28.4);

        System.out.println("Value in stack:- ");
        while (!st.isEmpty()) {
            Double value = st.pop();

            System.out.print(df.format(value) + " ");

            total += value;

            i++;
            temp.push(value);
        }
        avg = total / i;
        System.out.println();
        System.out.println("Average Value in Stack: " + df.format(avg));
        System.out.println();

        System.out.println("Temperature that more than 30 degree celcius");
        while (!temp.isEmpty()) {
            Double value = temp.pop();

            if (value > 30)
                System.out.print(df.format(value) + " ");

            st.push(value);
        }
    }

}