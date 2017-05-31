import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class StudentGUI {

	private JFrame frmstudentGrades;
	private JTextField txtstudentNumber;
	private JTextField txtstudentName;
	private JTextField txtsubjectMark1;
	private JTextField txtsubjectGrade1;
	private JTextField txtsubjectMark2;
	private JTextField txtsubjectGrade2;
	private JTextField txtsubjectMark3;
	private JTextField txtsubjectMark4;
	private JTextField txtsubjectGrade3;
	private JTextField txtsubjectGrade4;
	private JTextField txtsubjectMark5;
	private JTextField txtsubjectGrade5;
	private JTextField txtoverallMark;
	private JTextField txtoverallGrade;
	private static Grade ActiveStudentGrade = new Grade();
	private static ArrayList<Grade> StudentGrades = new ArrayList<Grade>();
	
	private boolean verifyMarks() {

		int studentNumber;
		String studentName;
		float subjectMark1;
		float subjectMark2;
		float subjectMark3;
		float subjectMark4;
		float subjectMark5;

		try {
			studentNumber = Integer.parseInt(txtstudentNumber.getText());
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "Invalid Student Used", "Invalid Student Number",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		try {
			studentName = txtstudentName.getText();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "Invalid Student Name", "Invalid Student Name",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}

		try {
			subjectMark1 = Float.parseFloat(txtsubjectMark1.getText());
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "Invalid Subject 1 Mark Entered", "Invalid Mark Entered",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}		
		try {
			subjectMark2 = Float.parseFloat(txtsubjectMark2.getText());
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "Invalid Subject 2 Mark Entered", "Invalid Mark Entered",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		try {
			subjectMark3 = Float.parseFloat(txtsubjectMark3.getText());
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "Invalid Subject 3 Mark Entered", "Invalid Mark Entered",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		try {
			subjectMark4 = Float.parseFloat(txtsubjectMark4.getText());
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "Invalid Subject 4 Mark Entered", "Invalid Mark Entered",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		try {
			subjectMark5 = Float.parseFloat(txtsubjectMark5.getText());
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "Invalid Subject 5 Mark Entered", "Invalid Mark Entered",
					JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		ActiveStudentGrade = new Grade();
		ActiveStudentGrade.setStudentNumber(studentNumber);
		ActiveStudentGrade.setStudentName(studentName);
		ActiveStudentGrade.setSubjectMark1(subjectMark1);
		ActiveStudentGrade.setSubjectMark2(subjectMark2);
		ActiveStudentGrade.setSubjectMark3(subjectMark3);
		ActiveStudentGrade.setSubjectMark4(subjectMark4);
		ActiveStudentGrade.setSubjectMark5(subjectMark5);

		ActiveStudentGrade.calculateGrade();

		txtsubjectGrade1.setText(ActiveStudentGrade.getSubjectGrade1());
		txtsubjectGrade2.setText(ActiveStudentGrade.getSubjectGrade2());
		txtsubjectGrade3.setText(ActiveStudentGrade.getSubjectGrade3());
		txtsubjectGrade4.setText(ActiveStudentGrade.getSubjectGrade4());
		txtsubjectGrade5.setText(ActiveStudentGrade.getSubjectGrade5());

		txtoverallMark.setText(String.format("%-6.2f", ActiveStudentGrade.getOverallMark()));

		txtoverallGrade.setText(ActiveStudentGrade.getOverallGrade());

		return true;

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentGUI window = new StudentGUI();
					window.frmstudentGrades.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentGUI() {
		initialize();
	}

	private void initialize() {
		frmstudentGrades = new JFrame();
		frmstudentGrades.setTitle("Student Grades");
		frmstudentGrades.setBounds(100, 100, 450, 360);
		frmstudentGrades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmstudentGrades.getContentPane().setLayout(null);
		
		JLabel lblstudentNumber = new JLabel("Student Number");
		lblstudentNumber.setBounds(30, 30, 110, 25);
		frmstudentGrades.getContentPane().add(lblstudentNumber);
		
		JLabel lblstudentName = new JLabel("Student Name");
		lblstudentName.setBounds(30, 60, 110, 25);
		frmstudentGrades.getContentPane().add(lblstudentName);
		
		JLabel lblmarkHeading = new JLabel("Mark");
		lblmarkHeading.setBounds(175, 90, 40, 25);
		frmstudentGrades.getContentPane().add(lblmarkHeading);
		
		JLabel lblgradeHeading = new JLabel("Grade");
		lblgradeHeading.setBounds(235, 90, 40, 25);
		frmstudentGrades.getContentPane().add(lblgradeHeading);
		
		JLabel lblsubjectTitle1 = new JLabel("Java");
		lblsubjectTitle1.setBounds(30, 120, 50, 25);
		frmstudentGrades.getContentPane().add(lblsubjectTitle1);
		
		JLabel lblsubjectTitle2 = new JLabel("C++");
		lblsubjectTitle2.setBounds(30, 150, 50, 25);
		frmstudentGrades.getContentPane().add(lblsubjectTitle2);
		
		JLabel lblsubjectTitle3 = new JLabel("PHP");
		lblsubjectTitle3.setBounds(30, 180, 50, 25);
		frmstudentGrades.getContentPane().add(lblsubjectTitle3);
		
		JLabel lblsubjectTitle4 = new JLabel("C#");
		lblsubjectTitle4.setBounds(30, 210, 50, 25);
		frmstudentGrades.getContentPane().add(lblsubjectTitle4);
		
		JLabel lblsubjectTitle5 = new JLabel("Python");
		lblsubjectTitle5.setBounds(30, 240, 50, 25);
		frmstudentGrades.getContentPane().add(lblsubjectTitle5);
		
		JLabel lbloverallMark = new JLabel("Overall Mark");
		lbloverallMark.setBounds(30, 270, 90, 25);
		frmstudentGrades.getContentPane().add(lbloverallMark);
		
		JLabel lbloverallGrade = new JLabel("Overall Grade");
		lbloverallGrade.setBounds(30, 300, 90, 25);
		frmstudentGrades.getContentPane().add(lbloverallGrade);
		
		txtstudentNumber = new JTextField();
		txtstudentNumber.setBounds(170, 30, 110, 25);
		frmstudentGrades.getContentPane().add(txtstudentNumber);
		txtstudentNumber.setColumns(10);
		
		txtstudentName = new JTextField();
		txtstudentName.setBounds(170, 60, 220, 25);
		frmstudentGrades.getContentPane().add(txtstudentName);
		txtstudentName.setColumns(10);
		
		txtsubjectMark1 = new JTextField();
		txtsubjectMark1.setBounds(170, 120, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectMark1);
		txtsubjectMark1.setColumns(10);
		
		txtsubjectGrade1 = new JTextField();
		txtsubjectGrade1.setEditable(false);
		txtsubjectGrade1.setBounds(230, 120, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectGrade1);
		txtsubjectGrade1.setColumns(10);
		
		txtsubjectMark2 = new JTextField();
		txtsubjectMark2.setBounds(170, 150, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectMark2);
		txtsubjectMark2.setColumns(10);
		
		txtsubjectGrade2 = new JTextField();
		txtsubjectGrade2.setEditable(false);
		txtsubjectGrade2.setBounds(230, 150, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectGrade2);
		txtsubjectGrade2.setColumns(10);
		
		txtsubjectMark3 = new JTextField();
		txtsubjectMark3.setBounds(170, 180, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectMark3);
		txtsubjectMark3.setColumns(10);
		
		txtsubjectGrade3 = new JTextField();
		txtsubjectGrade3.setEditable(false);
		txtsubjectGrade3.setBounds(230, 180, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectGrade3);
		txtsubjectGrade3.setColumns(10);
		
		txtsubjectMark4 = new JTextField();
		txtsubjectMark4.setBounds(170, 210, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectMark4);
		txtsubjectMark4.setColumns(10);
		
		txtsubjectGrade4 = new JTextField();
		txtsubjectGrade4.setEditable(false);
		txtsubjectGrade4.setBounds(230, 210, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectGrade4);
		txtsubjectGrade4.setColumns(10);
		
		txtsubjectMark5 = new JTextField();
		txtsubjectMark5.setBounds(170, 240, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectMark5);
		txtsubjectMark5.setColumns(10);
		
		txtsubjectGrade5 = new JTextField();
		txtsubjectGrade5.setEditable(false);
		txtsubjectGrade5.setBounds(230, 240, 50, 25);
		frmstudentGrades.getContentPane().add(txtsubjectGrade5);
		txtsubjectGrade5.setColumns(10);
		
		txtoverallMark = new JTextField();
		txtoverallMark.setEditable(false);
		txtoverallMark.setBounds(170, 270, 110, 25);
		frmstudentGrades.getContentPane().add(txtoverallMark);
		txtoverallMark.setColumns(10);
		
		txtoverallGrade = new JTextField();
		txtoverallGrade.setEditable(false);
		txtoverallGrade.setBounds(170, 300, 110, 25);
		frmstudentGrades.getContentPane().add(txtoverallGrade);
		txtoverallGrade.setColumns(10);
		
		JButton btnewStudent = new JButton("New Student");
		btnewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int studentNumber = ActiveStudentGrade.getNewStudentNumber();
				
				txtstudentNumber.setText(String.format("%d", studentNumber));

				txtstudentName.setText("");

				txtsubjectMark1.setText("");
				txtsubjectMark2.setText("");
				txtsubjectMark3.setText("");
				txtsubjectMark4.setText("");
				txtsubjectMark5.setText("");

				txtsubjectGrade1.setText("");
				txtsubjectGrade2.setText("");
				txtsubjectGrade3.setText("");
				txtsubjectGrade4.setText("");
				txtsubjectGrade5.setText("");

				txtoverallMark.setText("");
				txtoverallGrade.setText("");
			}
		});
		
		btnewStudent.setBounds(327, 120, 120, 25);
		frmstudentGrades.getContentPane().add(btnewStudent);
		
		JButton btnsaveStudent = new JButton("Save Student");
		btnsaveStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (verifyMarks() == false)
					return;

				StudentGrades.add(ActiveStudentGrade);

				btnewStudent.doClick();

			}
		});
		
		btnsaveStudent.setBounds(327, 150, 120, 25);
		frmstudentGrades.getContentPane().add(btnsaveStudent);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (verifyMarks() == false)
					return;
				
			}
		});
		
		btnCalculate.setBounds(327, 210, 120, 25);
		frmstudentGrades.getContentPane().add(btnCalculate);
		
		JButton btnshowallGrades = new JButton("Show All");
		btnshowallGrades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Grade myStudentGrades = new Grade();

				StringBuilder recordStudentGrade = new StringBuilder();

				for (int i = 0; i < StudentGrades.size(); i++) {

					myStudentGrades = StudentGrades.get(i);

					recordStudentGrade.append("Student Number: ").append(myStudentGrades.getStudentNumber())
							.append("\n").append("Student Name: ").append("\t").append(myStudentGrades.getStudentName())
							.append("\n").append("------------------------------------------").append("\n")
							.append(myStudentGrades.subjectTitle1).append("\t")
							.append(String.format("%.2f", myStudentGrades.getSubjectMark1())).append("\t")
							.append(myStudentGrades.getSubjectGrade1()).append("\n")
							.append(myStudentGrades.subjectTitle2).append("\t")
							.append(String.format("%.2f", myStudentGrades.getSubjectMark2())).append("\t")
							.append(myStudentGrades.getSubjectGrade2()).append("\n")
							.append(myStudentGrades.subjectTitle3).append("\t")
							.append(String.format("%.2f", myStudentGrades.getSubjectMark3())).append("\t")
							.append(myStudentGrades.getSubjectGrade3()).append("\n")
							.append(myStudentGrades.subjectTitle4).append("\t")
							.append(String.format("%.2f", myStudentGrades.getSubjectMark4())).append("\t")
							.append(myStudentGrades.getSubjectGrade4()).append("\n")
							.append(myStudentGrades.subjectTitle5).append("\t")
							.append(String.format("%.2f", myStudentGrades.getSubjectMark5())).append("\t")
							.append(myStudentGrades.getSubjectGrade5()).append("\n")
							.append("------------------------------------------").append("\n")
							.append("Overall Mark: ")
							.append(String.format("%.2f", myStudentGrades.getOverallMark())).append("\n")
							.append("Overall Grade: ")
							.append(myStudentGrades.getOverallGrade()).append("\n")
							.append("==================================").append("\n\n");

				}

				JFrame frame = new JFrame("Show All Grades");
				JTextArea textArea = new JTextArea(recordStudentGrade.toString());

				JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
						JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

				frame.setSize(500, 300);
				frame.getContentPane().add(scroll);
				frame.setVisible(true);

			}
		});
		
		btnshowallGrades.setBounds(327, 240, 120, 25);
		frmstudentGrades.getContentPane().add(btnshowallGrades);
	}
}