package chess;


 */
public class Chess {

    public BoardFrame boardframe;
    public static void main(String[] args) {
        ChessGUI gui = new ChessGUI();
        gui.boardframe = new BoardFrame();
        gui.boardframe.setVisible(true);

    }
}
