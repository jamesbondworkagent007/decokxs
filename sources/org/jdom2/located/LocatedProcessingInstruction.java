package org.jdom2.located;

import java.util.Map;
import org.jdom2.ProcessingInstruction;

/* JADX INFO: loaded from: classes24.dex */
public class LocatedProcessingInstruction extends ProcessingInstruction {
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

    public LocatedProcessingInstruction(String str) {
        super(str);
    }

    public LocatedProcessingInstruction(String str, Map<String, String> map) {
        super(str, map);
    }

    public LocatedProcessingInstruction(String str, String str2) {
        super(str, str2);
    }
}
