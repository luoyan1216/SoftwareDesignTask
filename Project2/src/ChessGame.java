

import javax.swing.JFrame;

public class ChessGame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();//����ͬ������
		frame.setTitle("������");
		frame.setSize(500,510);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		ChessPanel panel = new ChessPanel();
		panel.addMouseListener(panel);
		frame.add(panel);
		
		frame.setVisible(true);
	}
}
