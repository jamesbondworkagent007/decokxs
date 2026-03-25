package org.apache.httpcore.message;

import java.io.Serializable;
import o.C59818zoH;
import o.C59822zoL;
import o.C59825zoO;
import o.InterfaceC59857zou;
import o.InterfaceC59860zox;
import org.apache.httpcore.ParseException;
import org.apache.httpcore.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes24.dex */
public class BufferedHeader implements InterfaceC59860zox, Cloneable, Serializable {
    private static final long serialVersionUID = -2768352615787625448L;
    private final CharArrayBuffer buffer;
    private final String name;
    private final int valuePos;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59860zox
    public CharArrayBuffer getBuffer() {
        return this.buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59862zoz
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getValuePos() {
        return this.valuePos;
    }

    public BufferedHeader(CharArrayBuffer charArrayBuffer) throws ParseException {
        C59825zoO.copydefault(charArrayBuffer, "Char array buffer");
        int iIndexOf = charArrayBuffer.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid header: " + charArrayBuffer.toString());
        }
        String strSubstringTrimmed = charArrayBuffer.substringTrimmed(0, iIndexOf);
        if (strSubstringTrimmed.isEmpty()) {
            throw new ParseException("Invalid header: " + charArrayBuffer.toString());
        }
        this.buffer = charArrayBuffer;
        this.name = strSubstringTrimmed;
        this.valuePos = iIndexOf + 1;
    }

    @Override // o.InterfaceC59862zoz
    public String getValue() {
        CharArrayBuffer charArrayBuffer = this.buffer;
        return charArrayBuffer.substringTrimmed(this.valuePos, charArrayBuffer.length());
    }

    @Override // o.InterfaceC59858zov
    public InterfaceC59857zou[] getElements() throws ParseException {
        C59822zoL c59822zoL = new C59822zoL(0, this.buffer.length());
        c59822zoL.EZpvd(this.valuePos);
        return C59818zoH.copydefault.AEQbTJ(this.buffer, c59822zoL);
    }

    public String toString() {
        return this.buffer.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
