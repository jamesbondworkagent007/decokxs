package org.apache.http.message;

import java.io.Serializable;
import o.C59761znD;
import o.C59771znN;
import o.C59851zoo;
import o.InterfaceC59516ziX;
import o.InterfaceC59517ziY;
import org.apache.http.ParseException;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class BufferedHeader implements InterfaceC59516ziX, Cloneable, Serializable {
    private static final long serialVersionUID = -2768352615787625448L;
    private final CharArrayBuffer buffer;
    private final String name;
    private final int valuePos;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59516ziX
    public CharArrayBuffer getBuffer() {
        return this.buffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59582zjk
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59516ziX
    public int getValuePos() {
        return this.valuePos;
    }

    public BufferedHeader(CharArrayBuffer charArrayBuffer) throws ParseException {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        int iIndexOf = charArrayBuffer.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid header: " + charArrayBuffer.toString());
        }
        String strSubstringTrimmed = charArrayBuffer.substringTrimmed(0, iIndexOf);
        if (strSubstringTrimmed.length() != 0) {
            this.buffer = charArrayBuffer;
            this.name = strSubstringTrimmed;
            this.valuePos = iIndexOf + 1;
        } else {
            throw new ParseException("Invalid header: " + charArrayBuffer.toString());
        }
    }

    @Override // o.InterfaceC59582zjk
    public String getValue() {
        CharArrayBuffer charArrayBuffer = this.buffer;
        return charArrayBuffer.substringTrimmed(this.valuePos, charArrayBuffer.length());
    }

    @Override // o.InterfaceC59518ziZ
    public InterfaceC59517ziY[] getElements() throws ParseException {
        C59771znN c59771znN = new C59771znN(0, this.buffer.length());
        c59771znN.EZpvd(this.valuePos);
        return C59761znD.EZpvd.OLrzqt(this.buffer, c59771znN);
    }

    public String toString() {
        return this.buffer.toString();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
