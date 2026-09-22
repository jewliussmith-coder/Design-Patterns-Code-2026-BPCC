public class DeleteCommand implements Command {
    private TextEditor editor;
    private int position;
    private int length;
    private String deletedText;

    public DeleteCommand(TextEditor editor, int position, int length) {
        this.editor = editor;
        this.position = position;
        this.length = length;
    }

    @Override
    public void execute() {
        deletedText = editor.getText().substring(position, position + length);
        editor.deleteText(position, length);
    }

    @Override
    public void undo() {
        editor.insertText(position, deletedText);
    }
}