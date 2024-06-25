public class ItalicText extends TextDecorator{
    public ItalicText(Text text) {
        super(text);
    }
    @Override
    public String getContent() {
        return "<i>" + super.getContent() + "</i>";
    }
}
