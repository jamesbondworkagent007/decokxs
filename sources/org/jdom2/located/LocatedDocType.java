package org.jdom2.located;

import org.jdom2.DocType;

/* JADX INFO: loaded from: classes24.dex */
public class LocatedDocType extends DocType {
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

    public LocatedDocType(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public LocatedDocType(String str, String str2) {
        super(str, str2);
    }

    public LocatedDocType(String str) {
        super(str);
    }
}
