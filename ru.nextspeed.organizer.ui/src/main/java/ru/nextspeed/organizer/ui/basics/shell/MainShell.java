package ru.nextspeed.organizer.ui.basics.shell;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import ru.nextspeed.organizer.ui.basics.branding.Branding;

/**
 * User: olegchir
 */
public class MainShell implements INSShell {
    private Shell shell;
    private NSDisplay displayUtil;

    public MainShell() {
        this.displayUtil = new NSDisplay();

        shell = new Shell(displayUtil.getSWTDisplay());
        shell.setText(Branding.BRAND_NAME);
        shell.setSize(480, 640);

    }

    public void createMenu() {
        Menu menu = new Menu(shell, SWT.BAR);

        MenuItem fileItem = new MenuItem(menu, SWT.CASCADE);
        fileItem.setText("File");
        MenuItem editItem = new MenuItem(menu, SWT.CASCADE);
        editItem.setText("Edit");
        MenuItem viewItem = new MenuItem(menu, SWT.CASCADE);
        viewItem.setText("View");
        MenuItem toolsItem = new MenuItem(menu, SWT.CASCADE);
        toolsItem.setText("Tools");
        MenuItem helpItem = new MenuItem(menu, SWT.CASCADE);
        helpItem.setText("Help");

        Menu fileMenu = new Menu(menu);
        fileItem.setMenu(fileMenu);
        new MenuItem(fileMenu, SWT.SEPARATOR);
        MenuItem exitItem = new MenuItem(fileMenu, SWT.NONE);
        exitItem.setText("Exit");


        exitItem.addSelectionListener(new MenuItemListener());

        shell.setMenuBar(menu);
    }

    class MenuItemListener extends SelectionAdapter {

        public void widgetSelected(SelectionEvent event) {
            if (((MenuItem) event.widget).getText().equals("Exit")) {
                shell.close();
            }
        }
    }

    public Shell getShell() {
        return shell;
    }

    public void setShell(Shell shell) {
        this.shell = shell;
    }
}