package webform;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class test {

	public static void main(String[] args) {
		JFrame f = new JFrame();//Tạo một thể hiện đối tượng của lớp
		f.setTitle("Ví dụ JFrame");//Tiêu đề cửa số
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300, 300);//kích thước cửa sổ
		
		//Tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi đi");
		JButton btnOK1 = new JButton("Nhấn em đi");
		//Gắn lên form
		f.add(btnOK);
		f.add(btnOK1);
		f.show();//hiện cửa sổ
	}

}