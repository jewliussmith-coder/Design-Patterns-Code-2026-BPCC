public class Main {
    public static void main(String[] args) {

        TextComponent plainText = new PlainText("Hello World");
        System.out.println("Unformatted: " + plainText.getText());


        TextComponent boldText = new BoldDecorator(
                new PlainText("Hello World")
        );
        System.out.println("Bold: " + boldText.getText());


        TextComponent boldItalicText = new ItalicDecorator(
                new BoldDecorator(
                        new PlainText("Hello World")
                )
        );
        System.out.println("Bold + Italic: " + boldItalicText.getText());

      
        TextComponent allDecorators = new UpperCaseDecorator(
                new ItalicDecorator(
                        new BoldDecorator(
                                new PlainText("Hello World")
                        )
                )
        );
        System.out.println("All Decorators: " + allDecorators.getText());
    }
}