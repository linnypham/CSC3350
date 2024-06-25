public class BoldText extends TextDecorator{
    public BoldText(Text text) {
        super(text);
    }
    @Override
    public String getContent() {
        return "<b>" + super.getContent() + "</b>";
    }
}
