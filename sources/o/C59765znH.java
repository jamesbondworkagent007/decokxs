package o;

import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.message.BufferedHeader;

/* JADX INFO: renamed from: o.znH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59765znH implements InterfaceC59769znL {

    @java.lang.Deprecated
    public static final C59765znH EZpvd = new C59765znH();
    public static final C59765znH OLrzqt = new C59765znH();
    public final ProtocolVersion AEQbTJ;

    public C59765znH(ProtocolVersion protocolVersion) {
        this.AEQbTJ = protocolVersion == null ? HttpVersion.HTTP_1_1 : protocolVersion;
    }

    public C59765znH() {
        this(null);
    }

    public ProtocolVersion EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) throws org.apache.http.ParseException {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        java.lang.String protocol = this.AEQbTJ.getProtocol();
        int length = protocol.length();
        int iOLrzqt = c59771znN.OLrzqt();
        int iAEQbTJ = c59771znN.AEQbTJ();
        copydefault(charArrayBuffer, c59771znN);
        int iOLrzqt2 = c59771znN.OLrzqt();
        int i = iOLrzqt2 + length;
        if (i + 4 > iAEQbTJ) {
            throw new org.apache.http.ParseException("Not a valid protocol version: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
        }
        boolean z = true;
        for (int i2 = 0; z && i2 < length; i2++) {
            z = charArrayBuffer.charAt(iOLrzqt2 + i2) == protocol.charAt(i2);
        }
        if (!z ? !z : charArrayBuffer.charAt(i) != '/') {
            throw new org.apache.http.ParseException("Not a valid protocol version: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
        }
        int i3 = iOLrzqt2 + length + 1;
        int iIndexOf = charArrayBuffer.indexOf(46, i3, iAEQbTJ);
        if (iIndexOf == -1) {
            throw new org.apache.http.ParseException("Invalid protocol version number: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
        }
        try {
            int i4 = java.lang.Integer.parseInt(charArrayBuffer.substringTrimmed(i3, iIndexOf));
            int i5 = iIndexOf + 1;
            int iIndexOf2 = charArrayBuffer.indexOf(32, i5, iAEQbTJ);
            if (iIndexOf2 == -1) {
                iIndexOf2 = iAEQbTJ;
            }
            try {
                int i6 = java.lang.Integer.parseInt(charArrayBuffer.substringTrimmed(i5, iIndexOf2));
                c59771znN.EZpvd(iIndexOf2);
                return copydefault(i4, i6);
            } catch (java.lang.NumberFormatException unused) {
                throw new org.apache.http.ParseException("Invalid protocol minor version number: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
            }
        } catch (java.lang.NumberFormatException unused2) {
            throw new org.apache.http.ParseException("Invalid protocol major version number: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
        }
    }

    public ProtocolVersion copydefault(int i, int i2) {
        return this.AEQbTJ.forVersion(i, i2);
    }

    @Override // o.InterfaceC59769znL
    public boolean OLrzqt(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        int iOLrzqt = c59771znN.OLrzqt();
        java.lang.String protocol = this.AEQbTJ.getProtocol();
        int length = protocol.length();
        if (charArrayBuffer.length() < length + 4) {
            return false;
        }
        if (iOLrzqt < 0) {
            iOLrzqt = (charArrayBuffer.length() - 4) - length;
        } else if (iOLrzqt == 0) {
            while (iOLrzqt < charArrayBuffer.length() && C59841zoe.copydefault(charArrayBuffer.charAt(iOLrzqt))) {
                iOLrzqt++;
            }
        }
        int i = iOLrzqt + length;
        if (i + 4 > charArrayBuffer.length()) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; z && i2 < length; i2++) {
            z = charArrayBuffer.charAt(iOLrzqt + i2) == protocol.charAt(i2);
        }
        if (z) {
            return charArrayBuffer.charAt(i) == '/';
        }
        return z;
    }

    @Override // o.InterfaceC59769znL
    public InterfaceC59587zjp AEQbTJ(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) throws org.apache.http.ParseException {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        int iOLrzqt = c59771znN.OLrzqt();
        int iAEQbTJ = c59771znN.AEQbTJ();
        try {
            ProtocolVersion protocolVersionEZpvd = EZpvd(charArrayBuffer, c59771znN);
            copydefault(charArrayBuffer, c59771znN);
            int iOLrzqt2 = c59771znN.OLrzqt();
            int iIndexOf = charArrayBuffer.indexOf(32, iOLrzqt2, iAEQbTJ);
            if (iIndexOf < 0) {
                iIndexOf = iAEQbTJ;
            }
            java.lang.String strSubstringTrimmed = charArrayBuffer.substringTrimmed(iOLrzqt2, iIndexOf);
            for (int i = 0; i < strSubstringTrimmed.length(); i++) {
                if (!java.lang.Character.isDigit(strSubstringTrimmed.charAt(i))) {
                    throw new org.apache.http.ParseException("Status line contains invalid status code: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
                }
            }
            try {
                return copydefault(protocolVersionEZpvd, java.lang.Integer.parseInt(strSubstringTrimmed), iIndexOf < iAEQbTJ ? charArrayBuffer.substringTrimmed(iIndexOf, iAEQbTJ) : "");
            } catch (java.lang.NumberFormatException unused) {
                throw new org.apache.http.ParseException("Status line contains invalid status code: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
            }
        } catch (java.lang.IndexOutOfBoundsException unused2) {
            throw new org.apache.http.ParseException("Invalid status line: " + charArrayBuffer.substring(iOLrzqt, iAEQbTJ));
        }
    }

    public InterfaceC59587zjp copydefault(ProtocolVersion protocolVersion, int i, java.lang.String str) {
        return new BasicStatusLine(protocolVersion, i, str);
    }

    @Override // o.InterfaceC59769znL
    public InterfaceC59518ziZ KWHzl(org.apache.http.util.CharArrayBuffer charArrayBuffer) throws org.apache.http.ParseException {
        return new BufferedHeader(charArrayBuffer);
    }

    public void copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        int iOLrzqt = c59771znN.OLrzqt();
        int iAEQbTJ = c59771znN.AEQbTJ();
        while (iOLrzqt < iAEQbTJ && C59841zoe.copydefault(charArrayBuffer.charAt(iOLrzqt))) {
            iOLrzqt++;
        }
        c59771znN.EZpvd(iOLrzqt);
    }
}
