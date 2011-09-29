package ru.nextspeed.organizer.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

/**
 * Created by IntelliJ IDEA.
 * User: olegchir
 * Date: 9/30/11
 * Time: 1:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class EntryRunner {
    public static final String BRAND_NAME = "nextspeed";
    Display display;
    Shell shell;

    public void run() {
               display = new Display();
        shell = new Shell(display);
        shell.setText(BRAND_NAME);
        shell.setSize(480, 640);

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


        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }

        class MenuItemListener extends SelectionAdapter {
        public void widgetSelected(SelectionEvent event) {
            if (((MenuItem) event.widget).getText().equals("Exit")) {
                shell.close();
            }
        }
    }
}
