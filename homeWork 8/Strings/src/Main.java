public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = someString(3, 56);
        System.out.println(stringBuilder);

        modSomeString(stringBuilder);
        System.out.println(stringBuilder);
    }

    private static StringBuilder someString(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
                .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
    }

    private static StringBuilder modSomeString(StringBuilder stringBuilder) {
        int pos;
        while ((pos = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.replace(pos, pos + 1, "равно");
        }
        return stringBuilder;
    }
}
