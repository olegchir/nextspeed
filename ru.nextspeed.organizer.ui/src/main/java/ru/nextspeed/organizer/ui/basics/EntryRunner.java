package ru.nextspeed.organizer.ui.basics;

import ru.nextspeed.organizer.ui.basics.shell.MainShell;

/**
 * Created by IntelliJ IDEA.
 * User: olegchir
 * Date: 9/30/11
 * Time: 1:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class EntryRunner {
    public void run() {
        MainShell mainShell = new MainShell();
        UIUtil.disposeDisplayAfterShellClosed(mainShell);
    }

}
