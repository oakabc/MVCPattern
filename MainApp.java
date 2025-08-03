public class MainApp {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            ValueModel model = new ValueModel(0, 100, 50);
            ValueView view = new ValueView(model.getMin(), model.getMax(), model.getValue());
            new ValueController(model, view);
        });
    }
}
