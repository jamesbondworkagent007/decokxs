package org.apache.httpcore.message;

import java.io.Serializable;
import o.C59817zoG;
import o.C59818zoH;
import o.C59825zoO;
import o.InterfaceC59857zou;
import o.InterfaceC59858zov;
import org.apache.httpcore.ParseException;
import org.apache.httpcore.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes24.dex */
public class BasicHeader implements InterfaceC59858zov, Cloneable, Serializable {
    private static final InterfaceC59857zou[] EMPTY_HEADER_ELEMENTS = new InterfaceC59857zou[0];
    private static final long serialVersionUID = -5427236326487562174L;
    private final String name;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59862zoz
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59862zoz
    public String getValue() {
        return this.value;
    }

    public BasicHeader(String str, String str2) {
        this.name = (String) C59825zoO.copydefault(str, "Name");
        this.value = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // o.InterfaceC59858zov
    public InterfaceC59857zou[] getElements() throws ParseException {
        return getValue() != null ? C59818zoH.KWHzl(getValue(), null) : EMPTY_HEADER_ELEMENTS;
    }

    public String toString() {
        return C59817zoG.copydefault.KWHzl((CharArrayBuffer) null, this).toString();
    }
}
