package org.jdom2.located;

import org.jdom2.CDATA;

/* JADX INFO: loaded from: classes24.dex */
public class LocatedCDATA extends CDATA {
    private static final long serialVersionUID = 200;
    private int col;
    private int line;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getColumn() {
        return this.col;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLine() {
        return this.line;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setColumn(int i) {
        this.col = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setLine(int i) {
        this.line = i;
    }

    public LocatedCDATA(String str) {
        super(str);
    }
}
