package raven.drawer;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import raven.drawer.component.SimpleDrawerBuilder;
import raven.drawer.component.footer.SimpleFooterData;
import raven.drawer.component.header.SimpleHeaderData;
import raven.drawer.component.menu.MenuAction;
import raven.drawer.component.menu.MenuEvent;
import raven.drawer.component.menu.MenuValidation;
import raven.drawer.component.menu.SimpleMenuOption;
import raven.form.TestForm;
import raven.form.TestForm2;
import raven.form.TestForm3;
import raven.main.Main;
import raven.swing.AvatarIcon;
import raven.tabbed.WindowsTabbed;

/**
 *
 * @author RAVEN
 */
public class MyDrawerBuilder extends SimpleDrawerBuilder {

    @Override
    public SimpleHeaderData getSimpleHeaderData() {
        return new SimpleHeaderData()
                .setIcon(new AvatarIcon(getClass().getResource("/raven/image/profileTeam.png"), 90, 90, 999))
                .setTitle("Grupo de putos")
                .setDescription("Mamala java");
    }

    /*
    -solarized light 
    -nord
    -GitHub
    -material desing dark
    -monokai pro
    -Gruvbox Dark Hard
    -Granito Deep Ocean
    
    -Dark Purple
     */

    @Override
    public SimpleMenuOption getSimpleMenuOption() {
        String menus[][] = {
            {"~MAIN~"},
            {"Tamano Array"},
            {"~Funcionalidad~"},
            {"Metodos de Ordenacion"},
            {"Metodos de Busqueda"},
            {"Temas", "Claro", "Oscuro", "Carbon", "Light green", "ligt pink", "Chica Darks Purple", " nordico", "ligth suave", "dark rojo ", "dark amarillo", "Deep Ocean", "Dark Hard"}
        };
        String icons[] = {
            "tam.svg",
            "Ordenamiento.svg",
            "Busqueda.svg",};

        return new SimpleMenuOption()
                .setMenus(menus)
                .setIcons(icons)
                .setBaseIconPath("raven/drawer/icon")
                .setIconScale(1.5f)
                .addMenuEvent(new MenuEvent() {
                    @Override
                    public void selected(MenuAction action, int index, int subIndex) {
                        if (index == 0) {
 //------------------------------------------------------------------------------------0 Tamano de arreglo xd-------------------------------------------------------------------------------------

                            //Crea una ventana para def el tamano del arreglo
                            WindowsTabbed.getInstance().addTab("Tamano Array", new TestForm());
//------------------------------------------------------------------------------------1 Metodos de Ordenacion xd-------------------------------------------------------------------------------------
                  
                        } else if (index == 1) {
                            //crea una ventana para los metodos de ordenacion
                            WindowsTabbed.getInstance().addTab("Metodos de Ordenacion", new TestForm2());
 //------------------------------------------------------------------------------------2 Metodos de Busqueda xd-------------------------------------------------------------------------------------
                           
                        } else if (index == 2) {
                            //crea una ventana para los metodos de Busqueda
                            WindowsTabbed.getInstance().addTab("Metodos de Busqueda", new TestForm3());
//------------------------------------------------------------------------------------3.1-------------------------------------------------------------------------------------
                            
                        } else if (index == 3 && subIndex == 1) {
                            SwingUtilities.invokeLater(() -> {
                                try {
                                    UIManager.setLookAndFeel(new FlatLightLaf());
                                    for (java.awt.Window window : java.awt.Window.getWindows()) {
                                        SwingUtilities.updateComponentTreeUI(window);
                                        window.invalidate();
                                        window.validate();
                                        window.repaint();
                                    }
                                } catch (UnsupportedLookAndFeelException ex) {
                                    Logger.getLogger(MyDrawerBuilder.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            });
//------------------------------------------------------------------------------------3.2-------------------------------------------------------------------------------------
                            
                        } else if (index == 3 && subIndex == 2) {
                            SwingUtilities.invokeLater(() -> {
                                try {
                                    UIManager.setLookAndFeel(new FlatDarkLaf());
                                    for (java.awt.Window window : java.awt.Window.getWindows()) {
                                        SwingUtilities.updateComponentTreeUI(window);
                                        window.invalidate();
                                        window.validate();
                                        window.repaint();
                                    }
                                } catch (UnsupportedLookAndFeelException ex) {
                                    Logger.getLogger(MyDrawerBuilder.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            });
//------------------------------------------------------------------------------------3.3-------------------------------------------------------------------------------------
                           
                        } else if (index == 3 && subIndex == 3) {
                            SwingUtilities.invokeLater(() -> {
                                try {
                                    IntelliJTheme.setup(
                                            MyDrawerBuilder.class.getResourceAsStream(
                                                    "/com/formdev/flatlaf/intellijthemes/themes/Carbon.theme.json"
                                            )
                                    );
                                    for (java.awt.Window window : java.awt.Window.getWindows()) {
                                        SwingUtilities.updateComponentTreeUI(window);
                                        window.invalidate();
                                        window.validate();
                                        window.repaint();
                                    }
                                } catch (Exception ex) {
                                    Logger.getLogger(MyDrawerBuilder.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            });
//------------------------------------------------------------------------------------3.4-------------------------------------------------------------------------------------
                        } else if (index == 3 && subIndex == 4) {
                            SwingUtilities.invokeLater(() -> {
                                try {
                                    IntelliJTheme.setup(
                                            MyDrawerBuilder.class.getResourceAsStream(
                                                    "/com/formdev/flatlaf/intellijthemes/themes/material-theme-ui-lite/GitHub.theme.json"
                                            )
                                    );
                                    for (java.awt.Window window : java.awt.Window.getWindows()) {
                                        SwingUtilities.updateComponentTreeUI(window);
                                        window.invalidate();
                                        window.validate();
                                        window.repaint();
                                    }
                                } catch (Exception ex) {
                                    Logger.getLogger(MyDrawerBuilder.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            });
//------------------------------------------------------------------------------------3.4-------------------------------------------------------------------------------------

                        }else if (index == 3 && subIndex == 5) {
                            SwingUtilities.invokeLater(() -> {
                                try {
                                    IntelliJTheme.setup(
                                            MyDrawerBuilder.class.getResourceAsStream(
                                                    "/com/formdev/flatlaf/intellijthemes/themes/material-theme-ui-lite/Solarized Light.theme.json"
                                            )
                                    );
                                    for (java.awt.Window window : java.awt.Window.getWindows()) {
                                        SwingUtilities.updateComponentTreeUI(window);
                                        window.invalidate();
                                        window.validate();
                                        window.repaint();
                                    }
                                } catch (Exception ex) {
                                    Logger.getLogger(MyDrawerBuilder.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            });
//------------------------------------------------------------------------------------3.4-------------------------------------------------------------------------------------

                        }else if (index == 3 && subIndex == 6) {
                            SwingUtilities.invokeLater(() -> {
                                try {
                                    IntelliJTheme.setup(
                                            MyDrawerBuilder.class.getResourceAsStream(
                                                    "/com/formdev/flatlaf/intellijthemes/themes/material-theme-ui-lite/Solarized Light.theme.json"
                                            )
                                    );
                                    for (java.awt.Window window : java.awt.Window.getWindows()) {
                                        SwingUtilities.updateComponentTreeUI(window);
                                        window.invalidate();
                                        window.validate();
                                        window.repaint();
                                    }
                                } catch (Exception ex) {
                                    Logger.getLogger(MyDrawerBuilder.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            });

                        } else if (index == 9) {
                            Main.main.login();
                        }
                        System.out.println("Menu selected " + index + " " + subIndex);
                    }
                })
                .setMenuValidation(new MenuValidation() {
                    @Override
                    public boolean menuValidation(int index, int subIndex) {
                        // Bloquea "Tamano Array" si ya existe la pestaña
                        if (index == 1) {
                            if (WindowsTabbed.getInstance().isTabOpen("Tam arr")) {
                                return false; // deshabilita la opción
                            }
                        }
                        return true; // todas las demás opciones activas
                    }
                });
    }

    @Override
    public SimpleFooterData getSimpleFooterData() {
        return new SimpleFooterData()
                .setTitle("Disenado por")
                .setDescription("Francisco Ruiz, Chris culo, Jair narvaez");

    }

    @Override
    public int getDrawerWidth() {
        return 320;
    }

}
