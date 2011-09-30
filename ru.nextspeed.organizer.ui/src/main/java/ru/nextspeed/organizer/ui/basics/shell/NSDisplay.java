package ru.nextspeed.organizer.ui.basics.shell;

import org.eclipse.swt.widgets.Display;

/**
 * User: olegchir
 */
public class NSDisplay {
    private Display SWTDisplay;

    public NSDisplay() {
        SWTDisplay = new Display();
    }

    public org.eclipse.swt.widgets.Display getSWTDisplay() {
        return SWTDisplay;
    }

    public void setSWTDisplay(Display SWTDisplay) {
        this.SWTDisplay = SWTDisplay;
    }
}
