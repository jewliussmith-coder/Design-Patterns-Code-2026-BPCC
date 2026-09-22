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

        Command command1 = new InsertCommand(editor, "Hello ", 0);
        Command command2 = new InsertCommand(editor, "World", 6);
        Command command3 = new InsertCommand(editor, "!", 11);

        app.executeCommand(command1);
        System.out.println("After first insert: " + editor.getText());

        app.executeCommand(command2);
        System.out.println("After second insert: " + editor.getText());

        app.executeCommand(command3);
        System.out.println("After third insert: " + editor.getText());

        app.undo();
        System.out.println("After first undo: " + editor.getText());

        app.undo();
        System.out.println("After second undo: " + editor.getText());

        app.undo();
        System.out.println("After third undo: " + editor.getText());
    }
}
