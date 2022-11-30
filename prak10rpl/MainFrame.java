import java.awt.*;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.BorderUIResource;

public class MainFrame extends JFrame {
    private Container container;
    private JPanel panelMenu;
    private JPanel panelContent;
    private JInternalFrame iFrame;
    private JButton btnCustomer;
    private JButton btnJenisBarang;
    private JButton btnSatuan;
    private JButton btnBarang;
    private JButton btExit;

    private Statement statement;

    private MainFrameController mainFrameController;

    public MainFrame(Statement statement){
        super("I Made Novandy Asardi - 064002100030");

        setStatement(statement);
        initView();
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

    public void setPanelMenu(JPanel panelMenu) {
        this.panelMenu = panelMenu;
    }

    public JPanel getPanelContent() {
        return panelContent;
    }

    public void setPanelContent(JPanel panelContent) {
        this.panelContent = panelContent;
    }

    public JInternalFrame getiFrame() {
        return iFrame;
    }

    public void setiFrame(JInternalFrame iFrame) {
        this.iFrame = iFrame;
    }

    public JButton getBtnCustomer() {
        return btnCustomer;
    }

    public void setBtnCustomer(JButton btnCustomer) {
        this.btnCustomer = btnCustomer;
    }

    public JButton getBtnJenisBarang() {
        return btnJenisBarang;
    }

    public void setBtnJenisBarang(JButton btnJenisBarang) {
        this.btnJenisBarang = btnJenisBarang;
    }

    public JButton getBtnSatuan() {
        return btnSatuan;
    }

    public void setBtnSatuan(JButton btnSatuan) {
        this.btnSatuan = btnSatuan;
    }

    public JButton getBtnBarang() {
        return btnBarang;
    }

    public void setBtnBarang(JButton btnBarang) {
        this.btnBarang = btnBarang;
    }

    public JButton getBtExit() {
        return btExit;
    }

    public void setBtExit(JButton btExit) {
        this.btExit = btExit;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public MainFrameController getMainFrameController() {
        return mainFrameController;
    }

    public void setMainFrameController(MainFrameController mainFrameController) {
        this.mainFrameController = mainFrameController;
    }

    void initView(){
        mainFrameController = new MainFrameController(getStatement());

        setContainer(getContentPane());
        getContainer().setLayout(null);

        setPanelMenu(new JPanel());
        getPanelMenu().setLocation(5,5);
        getPanelMenu().setSize( 200, 600 );
        getPanelMenu().setLayout(null);
        getPanelMenu().setBorder(new BorderUIResource.LineBorderUIResource(Color.BLACK));
        getContainer().add(getPanelMenu());

        setPanelContent(new JPanel());
        getPanelContent().setLocation(215,5);
        getPanelContent().setSize( 900, 600 );
        getPanelContent().setLayout(null);
        getPanelContent().setBorder(new EtchedBorder());
        getContainer().add(getPanelContent());

        initBtnCustomer();
        initBtnJenisBarang();
        initBtnSatuan();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(20,20);
        setSize( 1135, 650 );
        setVisible(true);
        show();
    }

    void initBtnCustomer(){
        setBtnCustomer(new JButton("Customer"));
        getBtnCustomer().setForeground(Color.BLACK);
        getBtnCustomer().setBackground(Color.CYAN);
        getBtnCustomer().setFont(new Font( "Serif", Font.BOLD, 15));
        getBtnCustomer().setLocation(10,10);
        getBtnCustomer().setSize(180,30);
        getBtnCustomer().setVisible(true);
        getBtnCustomer().setMnemonic('C');
        mainFrameController.setController(getBtnCustomer(), "btnCustomer", getPanelContent());
        getPanelMenu().add(getBtnCustomer());
    }

    void initBtnJenisBarang(){
        setBtnJenisBarang(new JButton("Jenis Barang"));
        getBtnJenisBarang().setForeground(Color.WHITE);
        getBtnJenisBarang().setBackground(Color.BLUE);
        getBtnJenisBarang().setFont(new Font( "Serif", Font.BOLD, 15));
        getBtnJenisBarang().setLocation(getBtnCustomer().getX(),getBtnCustomer().getY() + getBtnCustomer().getHeight() + 30);
        getBtnJenisBarang().setSize(180,30);
        getBtnJenisBarang().setVisible(true);
        getBtnJenisBarang().setMnemonic('J');
        mainFrameController.setController(getBtnJenisBarang(), "btnJenisBarang", getPanelContent());
        getPanelMenu().add(getBtnJenisBarang());
    }

    void initBtnSatuan(){
        setBtnSatuan(new JButton("Satuan"));
        getBtnSatuan().setForeground(Color.WHITE);
        getBtnSatuan().setBackground(Color.BLUE);
        getBtnSatuan().setFont(new Font( "Serif", Font.BOLD, 15));
        getBtnSatuan().setLocation(getBtnJenisBarang().getX(),getBtnJenisBarang().getY() + getBtnJenisBarang().getHeight() + 10);
        getBtnSatuan().setSize(180,30);
        getBtnSatuan().setVisible(true);
        getBtnSatuan().setMnemonic('S');
        mainFrameController.setController(getBtnSatuan(), "btnSatuan", getPanelContent());
        getPanelMenu().add(getBtnSatuan());
    }
}
