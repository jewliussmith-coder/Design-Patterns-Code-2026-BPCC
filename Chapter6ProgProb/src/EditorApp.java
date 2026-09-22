import java.util.Stack;

public class EditorApp {
    private Stack<Command> history;

    public EditorApp() {
        history = new Stack<>();
    }

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.empty()) {
            Command command = history.pop();
            command.undo();
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command insertCommand = new InsertCommand(editor, "Hello World!", 0);
        app.executeCommand(insertCommand);

        System.out.println("After insert: " + editor.getText());

        Command deleteCommand = new DeleteCommand(editor, 6, 5);
        app.executeCommand(deleteCommand);

        System.out.println("After delete: " + editor.getText());

        app.undo();

        System.out.println("After undo: " + editor.getText());
    }
}
