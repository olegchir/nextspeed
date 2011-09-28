package ru.nextspeed.organizer.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Created by IntelliJ IDEA.
 * User: olegchir
 * Date: 9/29/11
 * Time: 12:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class EntryPoint {
    public static void main(String[] args) {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
}
