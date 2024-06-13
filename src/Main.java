public class Main {
    public static void main(String[] args) {
        int x = 10;
        boolean z = true;
        short myShort = 32_000;
        long myLong = 4_000_000_000L;
        int dick = (100 < x) ? 20 : 6;
        System.out.println("disc " + dick);
        String state = "Texas";
        if (state.equals("California") | state.equals("Texas")) {
            System.out.println("* ");
        }
        String txt = """
                Re,
                qw
                er
                ty
                """;
        String text = "Re,\n" + "qw\n" + "er\n" + "ty\n";
        String text2 = "Re,\nqw\ner\nty\n";
        System.out.println(txt);
        System.out.println(text);
        System.out.println(text.equals(txt));
        System.out.println(text.equals(text2));
    }
}
