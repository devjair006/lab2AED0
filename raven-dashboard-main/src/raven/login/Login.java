
package raven.login;

import com.formdev.flatlaf.FlatClientProperties;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import raven.form.TestForm;
import raven.main.Main;
import raven.tabbed.WindowsTabbed;

public class Login extends JPanel {

    public Login() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));

        // Panel principal con estilo
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 35 45", "center", ""));
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:20;"
                + "[light]background:darken(@background,3%);"
                + "[dark]background:lighten(@background,3%)");

        // Título
        JLabel lbTitle = new JLabel("Bienvenido");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "font:bold +10");
        panel.add(lbTitle, "gapy 10");

        // Aquí van las 3 imágenes (puedes ajustar tamaños con "w 80!, h 80!" por ejemplo)
        JLabel img1 = new JLabel(new ImageIcon(getClass().getResource("")));
        JLabel img2 = new JLabel(new ImageIcon(getClass().getResource("")));
        JLabel img3 = new JLabel(new ImageIcon(getClass().getResource("")));

        JPanel imagesPanel = new JPanel(new MigLayout("center", "[]20[]20[]"));
        imagesPanel.setOpaque(false); // Para que el fondo siga igual al del panel padre
        imagesPanel.add(img1);
        imagesPanel.add(img2);
        imagesPanel.add(img3);

        panel.add(imagesPanel, "gapy 20");

        // Botón Siguiente (misma lógica que el login original)
        JButton cmdNext = new JButton("Siguiente");
        cmdNext.putClientProperty(FlatClientProperties.STYLE, ""
                + "[light]background:darken(@background,10%);"
                + "[dark]background:lighten(@background,10%);"
                + "margin:4,6,4,6;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0");

        cmdNext.addActionListener((e) -> {
            // Misma acción que tenía el login original
            Main.main.showMainForm();
            WindowsTabbed.getInstance().addTab("Tamano Array", new TestForm());
        });

        panel.add(cmdNext, "gapy 20, center");

        add(panel);
    }
}