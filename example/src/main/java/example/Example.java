package example;

import java.util.Arrays;
import java.util.Objects;

public class Example {
    public void computeScore(String type, Double score, Double sum) {
//        if (type.equals("type1")) {
//            sum += score * 0.1;
//        } else if (type.equals("type2")) {
//            sum += score * 0.2;
//        } else if (type.equals("type3")) {
//            sum += score * 0.3;
//        } else if (type.equals("type4")) {
//            sum += score * 0.4;
//        } else if (type.equals("type5")) {
//            sum += score * 0.5;
//        } else if (type.equals("type6")) {
//            sum += score * 0.6;
//        } else if (type.equals("type7")) {
//            sum += score * 0.7;
//        }

        double ratio = Type.getRatioByType(type);
        sum += ratio * score;
    }

    enum Type {
        //
        TYPE_1(0.1, "type1"),
        TYPE_2(0.2, "type2"),
        TYPE_3(0.3, "type3"),
        TYPE_4(0.4, "type4"),
        TYPE_5(0.5, "type5"),
        TYPE_6(0.6, "type6"),
        TYPE_7(0.7, "type7");

        private double ratio;
        private String type;

        Type(double ratio, String type) {
            this.ratio = ratio;
            this.type = type;
        }

        public double getRatio() {
            return ratio;
        }

        public String getType() {
            return type;
        }

        public static double getRatioByType(String type) {
            return Arrays.stream(values())
                    .filter(e -> Objects.equals(e.type, type))
                    .findAny()
                    .map(Type::getRatio)
                    .orElse(1D);
        }
    }
}
