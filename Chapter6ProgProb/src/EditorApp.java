import java.util.ArrayList;
import java.util.List;
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

        Command header = new InsertCommand(editor, "=== HEADER ===", 0);
        Command newline = new InsertCommand(editor, "\n", 14);
        Command footer = new InsertCommand(editor, "=== FOOTER ===", 15);

        List<Command> templateCommands = new ArrayList<>();
        templateCommands.add(header);
        templateCommands.add(newline);
        templateCommands.add(footer);

        Command template = new MacroCommand(templateCommands);

        app.executeCommand(template);

        System.out.println("After template:");
        System.out.println(editor.getText());

        app.undo();

        System.out.println("After undo:");
        System.out.println(editor.getText());
    }
}
