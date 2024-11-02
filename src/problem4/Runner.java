package problem4;

class Text {
    private boolean raven;

    public boolean ravenstvo(StringBuilder str1, StringBuilder str2) {
        String s1 = new String(str1);
        String s2 = new String(str2);

        if (s1.equals(s2)) {
            raven = true;
        } else {
            raven = false;
        }
        return raven;
    }
}

class Ranner {
    public static void main(String[] args) {
        Text text = new Text();
        StringBuilder stringBuilder = new StringBuilder("123");
        StringBuilder stringBuilder2 = new StringBuilder("123");
        System.out.println(text.ravenstvo(stringBuilder, stringBuilder2));
    }
}