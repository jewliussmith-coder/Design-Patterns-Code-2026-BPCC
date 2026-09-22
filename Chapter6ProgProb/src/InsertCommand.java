public class InsertCommand implements Command {
    private TextEditor editor;
    private String text;
    private int position;

    public InsertCommand(TextEditor editor, String text, int position) {
        this.editor = editor;
        this.text = text;
        this.position = position;
    }

    @Override
    public void execute() {
        editor.insertText(position, text);
    }
}
