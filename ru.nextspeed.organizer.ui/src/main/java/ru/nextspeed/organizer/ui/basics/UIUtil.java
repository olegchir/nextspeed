package ru.nextspeed.organizer.ui.basics;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import ru.nextspeed.organizer.ui.basics.shell.INSShell;

/**
 * User: olegchir
 */
public class UIUtil {
    public static void disposeDisplayAfterShellClosed(Display display, Shell shell) {
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }

    public static void disposeDisplayAfterShellClosed(INSShell shellHandle) {
        Shell shell = shellHandle.getShell();
        Display display = shell.getDisplay();

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }

        display.dispose();
    }
}
