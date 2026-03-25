package org.apache.http.message;

import java.io.Serializable;
import o.C59761znD;
import o.C59766znI;
import o.C59851zoo;
import o.InterfaceC59517ziY;
import o.InterfaceC59518ziZ;
import o.InterfaceC59773znP;
import org.apache.http.ParseException;

/* JADX INFO: loaded from: classes13.dex */
public class BasicHeader implements InterfaceC59518ziZ, Cloneable, Serializable {
    private static final InterfaceC59517ziY[] EMPTY_HEADER_ELEMENTS = new InterfaceC59517ziY[0];
    private static final long serialVersionUID = -5427236326487562174L;
    private final String name;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59582zjk
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59582zjk
    public String getValue() {
        return this.value;
    }

    public BasicHeader(String str, String str2) {
        this.name = (String) C59851zoo.AEQbTJ(str, "Name");
        this.value = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // o.InterfaceC59518ziZ
    public InterfaceC59517ziY[] getElements() throws ParseException {
        return getValue() != null ? C59761znD.KWHzl(getValue(), (InterfaceC59773znP) null) : EMPTY_HEADER_ELEMENTS;
    }

    public String toString() {
        return C59766znI.copydefault.AEQbTJ(null, this).toString();
    }
}
