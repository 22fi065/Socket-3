//package sorce;
//package netpro2024.mid_exam.q2;

public class SevenTeenOdd {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 1; i <= 800; i++) {
            /* ↓下記を埋める。 */
            if (i % 17 == 0) {
                // System.out.print(i + " , ");
                result.append(i + ",");
                // result.insert(, ",");
                count++;
            }
        }
        result.delete(46, 46);

        System.out.println(result.toString());

    }
}