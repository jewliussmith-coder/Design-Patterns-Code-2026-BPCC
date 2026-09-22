public class TextEditor {
    private StringBuilder text;

    public TextEditor() {
        text = new StringBuilder();
    }

    public void insertText(int position, String newText) {
        text.insert(position, newText);
    }

    public void deleteText(int position, int length) {
        text.delete(position, position + length);
    }

    public String getText() {
        return text.toString();
    }
}
