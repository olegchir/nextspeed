package ru.nextspeed.organizer.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
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
        EntryRunner runner = new EntryRunner();
        runner.run();
    }

}