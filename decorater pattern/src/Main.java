public class Main {
    public static void main(String[] args) {
        Text simpleText = new SimpleText("Hello, World!");
        Text boldText = new BoldText(simpleText);
        Text italicBoldText = new ItalicText(boldText);
        System.out.println(simpleText.getContent()); // Output: Hello, World!
        System.out.println(boldText.getContent()); // Output: <b>Hello,World!</b>
        System.out.println(italicBoldText.getContent()); // Output: <i><b>Hello,World!</b></i>
    }
}
