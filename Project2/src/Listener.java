

//д��ʱ��ȱɶ�ͼ�ɶ
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Listener {

	public static void main(String[] args) {
		JFrame frame = new JFrame();//ʵ����jframe������һ����ʼʱ���ɼ����´���
		frame.setTitle("Listener");//���ô������
		frame.setSize(400,400);//���ô����С
		frame.setLocationRelativeTo(null);//ʹ������ʾ����Ļ����
		frame.setDefaultCloseOperation(3);
		//DISPOSE_ON_CLOSE��������رմ���ʱ,��������رձ����ڣ��������Ӧ�ó����´������������ڲ���Ӱ�졣
		
		MyPanel panel = new MyPanel();//newһ����壬Ϊ�˻����̡�
		
		panel.addMouseListener(panel);//Ϊ�������������Ϊ��ʹ��һЩ����
		
		frame.add(panel);//�������봰����
		
		frame.setVisible(true);
		//����ģ���ѹ���ã�����JVM���Ը�������ģ��ִ��paint������ʼ��ͼ����ʾ����Ļ����
	}
}
class MyPanel extends JPanel implements MouseListener{
//�����ҵ���壬����һЩ������
//�̳���JPanel���MouseListener�ӿڣ�����ķ��������ڶ���
	@Override
	public void mouseClicked(MouseEvent e) {     //������ɿ��¼�
		
	}

	@Override
	public void mousePressed(MouseEvent e) {     //������ɿ��¼�
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {     //�ͷ�����¼�
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {     //�����������ù���
		
	}

	@Override
	public void mouseExited(MouseEvent e) {     //
		
	}
	
}
