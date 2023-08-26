import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ChatRoom2 extends JFrame {
    private JTextField txtUserName;
    private JLabel lbl;
    private JLabel lbl1;
    private JPanel pnlBtn;
    private JPanel pnlName;
    private String userName;
    private JButton btnFinish;
    private JButton btnBack1;
    private String Name;
    private String ID;

    ChatRoom2() {
        initComponents();
    }

    void initComponents() {
        setSize(400, 300);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl = new JLabel("WELCOME TO ENGINE ENVIRONMENTAL SETUP WIZARD");
        lbl1 = new JLabel("Your installation requirements has been fulfilled.Click FINISH to complete the installation process",JLabel.RIGHT);
        //lbl1.setPreferredSize(new Dimension(250, 100));


        pnlBtn = new JPanel();
        pnlName = new JPanel();

        pnlName.add(lbl,BorderLayout.PAGE_START);
        pnlName.add(lbl1,BorderLayout.CENTER);

        txtUserName = new JTextField(25);
        btnFinish = new JButton("Finish");
        btnBack1 = new JButton("Back");

        btnFinish.addActionListener((event) -> {

            setVisible(false);
        });

        btnBack1.addActionListener((event) -> {
            ChatRoom1 c2 = new ChatRoom1();
            c2.txtUserName.setText(Name);
            if(!c2.txtUserName.getText().equals(" ")){
                c2.btnNext1.setEnabled(true);
            }
            c2.settext1(ID);
            c2.setVisible(true);
            setVisible(false);

        });




        pnlBtn.add(btnBack1);
        pnlBtn.add(btnFinish);


        add(pnlName, BorderLayout.CENTER);
        add(pnlBtn, BorderLayout.PAGE_END);

    }
    public void settext(String Name){
        this.Name = Name;

    }
    public void settext1(String ID){
        this.ID = ID;

    }
}



class ChatRoom1 extends JFrame {
    static JTextField txtUserName;
    private JLabel lbl;
    private JLabel lbl1;
    private JLabel lbl2;
    private JPanel pnlBtn;
    private JPanel pnlName;
    private String userName;
    JButton btnNext1;
    private JButton btnCancel1;
    private JButton btnBack1;
    private String ID;
    private JPanel pnl;

    ChatRoom1() {
        initComponents();
    }

    void initComponents() {
        setSize(400, 300);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlBtn = new JPanel();
        pnlName = new JPanel();
        pnl = new JPanel();

        lbl = new JLabel("WELCOME TO ENGINE ENVIRONMENTAL SETUP WIZARD");
        lbl1 = new JLabel("Fill in the following requirements to continue the installation process",JLabel.LEFT);
        lbl2 = new JLabel("Enter Your Name :",JLabel.LEFT);


        txtUserName = new JTextField(25);
        btnCancel1 = new JButton("Cancel");
        btnNext1 = new JButton("Next");
        btnBack1 = new JButton("Back");
        btnNext1.setEnabled(false);
        btnNext1.setCursor(new Cursor(Cursor.HAND_CURSOR));



        btnNext1.addActionListener((event) -> {

            ChatRoom2 c1 = new ChatRoom2();
            String Name =txtUserName.getText();
            c1.settext1(ID);
            c1.settext(Name);
            c1.setVisible(true);
            setVisible(false);
        });

        btnBack1.addActionListener((event) -> {

            ChatRoom c2 = new ChatRoom();
            c2.txtUserName.setText(ID);
            if(!c2.txtUserName.getText().equals(" ")){
                c2.btnNext1.setEnabled(true);
            }
            c2.setVisible(true);
            setVisible(false);
        });

        btnCancel1.addActionListener((event) -> {


            setVisible(false);
        });

        txtUserName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                btnNext1.setEnabled(true);
                if(txtUserName.getText().equals("")){
                    btnNext1.setEnabled(false);

                }
            }
        });



        txtUserName.addActionListener((event) -> {
            btnNext1.doClick();
        });

        pnl.add(lbl,BorderLayout.PAGE_START);
        pnl.add(lbl1,BorderLayout.CENTER);
        pnlName.add(lbl2,BorderLayout.PAGE_START);
        pnlName.add(txtUserName,BorderLayout.CENTER);
        pnlBtn.add(btnNext1);
        pnlBtn.add(btnCancel1);
        pnlBtn.add(btnBack1);

        add(pnl,BorderLayout.PAGE_START);

        add(pnlName, BorderLayout.CENTER);
        add(pnlBtn, BorderLayout.PAGE_END);

    }
    public void settest(String ID){
        this.ID = ID;


    }

    public void settext1(String ID){
        this.ID =ID;

    }
}


class ChatRoom extends JFrame {
    static JTextField txtUserName;
    static JLabel lbl;
    static JLabel lbl1;
    static JLabel lbl2;
    private JPanel pnlBtn;
    private JPanel pnlName;
    private String userName;
    JButton btnNext1;
    private JButton btnCancel1;
    private JButton btnBack1;
    private JPanel pnl;
    private JLabel pnl1;

    ChatRoom() {
        initComponents();
    }

    void initComponents() {
        setSize(400, 300);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlBtn = new JPanel();
        pnlName = new JPanel();
        pnl = new JPanel();

        lbl = new JLabel("WELCOME TO ENGINE ENVIRONMENTAL SETUP WIZARD");
        lbl1 = new JLabel("This Engenies environment setup wizard will install the Engenies software on your computer.");
        lbl2 = new JLabel("Enter Your NIC numberm:");

        pnl.add(lbl,BorderLayout.PAGE_START);
        pnl.add(lbl1,BorderLayout.PAGE_END);


        txtUserName = new JTextField(25);
        btnCancel1 = new JButton("Cancel");
        btnNext1 = new JButton("Next");
        btnBack1 = new JButton("Back");
        btnNext1.setEnabled(false);
        btnNext1.setCursor(new Cursor(Cursor.HAND_CURSOR));



        btnNext1.addActionListener((event) -> {

            ChatRoom1 c1 = new ChatRoom1();
            String ID = txtUserName.getText();
            c1.settest(ID);
            c1.setVisible(true);
            setVisible(false);
        });

        btnBack1.addActionListener((event) -> {

            MainWindow c2 = new MainWindow();

            c2.setVisible(true);
            setVisible(false);
        });


        btnCancel1.addActionListener((event) -> {

            setVisible(false);
        });

        txtUserName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                btnNext1.setEnabled(true);
                if(txtUserName.getText().equals("")){
                    btnNext1.setEnabled(false);

                }
            }
        });




        txtUserName.addActionListener((event) -> {
            btnNext1.doClick();
        });
        pnlName.add(lbl2,BorderLayout.PAGE_START);
        pnlName.add(txtUserName,BorderLayout.CENTER);
        pnlBtn.add(btnNext1);
        pnlBtn.add(btnCancel1);
        pnlBtn.add(btnBack1);

        add(pnl,BorderLayout.PAGE_START);

        add(pnlName, BorderLayout.CENTER);
        add(pnlBtn, BorderLayout.PAGE_END);

    }
}
class MainWindow extends JFrame {
    private JButton btnNext;
    private JButton btnCancel;
    private JPanel pnlName;
    private JPanel pnlBtn;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JPanel pnl1;

    static ChatRoom[] chatRooms;

    MainWindow() {
        initComponents();
    }

    void extendsArray() {
        ChatRoom[] temp = new ChatRoom[chatRooms.length + 1];
        for (int i = 0; i < chatRooms.length; i++) {
            temp[i] = chatRooms[i];
        }
        chatRooms = temp;

    }

    void initComponents() {
        setSize(400, 300);
        setTitle("Setup Wizard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lbl1 = new JLabel("WELCOME TO ENGINE ENVIRONMENTAL SETUP WIZARD");
        lbl2 = new JLabel("the wizard will guide you through the installation of the ENGENIES software");
        lbl3 = new JLabel("click NEXT to continue .......");

        pnlName = new JPanel(new FlowLayout());

        pnlName.add(lbl1,BorderLayout.PAGE_START);
        pnlName.add(lbl2,BorderLayout.CENTER);

        chatRooms = new ChatRoom[0];

        //pnlName = new JPanel();
        pnlBtn = new JPanel();

        btnCancel = new JButton("Cancel");
        btnNext = new JButton("Next");
        btnNext.setCursor(new Cursor(Cursor.HAND_CURSOR));





        btnNext.addActionListener((event) -> {

            extendsArray();
            btnNext.setEnabled(false);
            System.out.println(chatRooms.length);


            ChatRoom c1 = new ChatRoom();
            chatRooms[chatRooms.length - 1] = c1;

            System.out.println(chatRooms.length);

            c1.setVisible(true);
            setVisible(false);
        });

        btnCancel.addActionListener((event) -> {


            setVisible(false);
        });
        pnlBtn.add(btnNext);
        pnlBtn.add(btnCancel);

        add(pnlName, BorderLayout.PAGE_START);
        add(lbl3,BorderLayout.CENTER);
        add(pnlBtn, BorderLayout.PAGE_END);

    }
}

class Main {
    public static void main(String args[]) {
        new MainWindow().setVisible(true);
    }
}
