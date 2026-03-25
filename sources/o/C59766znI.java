package o;

import com.fasterxml.jackson.core.JsonPointer;
import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.znI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59766znI implements InterfaceC59770znM {

    @java.lang.Deprecated
    public static final C59766znI KWHzl = new C59766znI();
    public static final C59766znI copydefault = new C59766znI();

    public org.apache.http.util.CharArrayBuffer EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            charArrayBuffer.clear();
            return charArrayBuffer;
        }
        return new org.apache.http.util.CharArrayBuffer(64);
    }

    public org.apache.http.util.CharArrayBuffer copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        C59851zoo.AEQbTJ(protocolVersion, "Protocol version");
        int iCopydefault = copydefault(protocolVersion);
        if (charArrayBuffer == null) {
            charArrayBuffer = new org.apache.http.util.CharArrayBuffer(iCopydefault);
        } else {
            charArrayBuffer.ensureCapacity(iCopydefault);
        }
        charArrayBuffer.append(protocolVersion.getProtocol());
        charArrayBuffer.append(JsonPointer.SEPARATOR);
        charArrayBuffer.append(java.lang.Integer.toString(protocolVersion.getMajor()));
        charArrayBuffer.append('.');
        charArrayBuffer.append(java.lang.Integer.toString(protocolVersion.getMinor()));
        return charArrayBuffer;
    }

    public int copydefault(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    @Override // o.InterfaceC59770znM
    public org.apache.http.util.CharArrayBuffer copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59591zjt interfaceC59591zjt) {
        C59851zoo.AEQbTJ(interfaceC59591zjt, "Request line");
        org.apache.http.util.CharArrayBuffer charArrayBufferEZpvd = EZpvd(charArrayBuffer);
        EZpvd(charArrayBufferEZpvd, interfaceC59591zjt);
        return charArrayBufferEZpvd;
    }

    public void EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59591zjt interfaceC59591zjt) {
        java.lang.String method = interfaceC59591zjt.getMethod();
        java.lang.String uri = interfaceC59591zjt.getUri();
        int length = method.length();
        charArrayBuffer.ensureCapacity(length + 1 + uri.length() + 1 + copydefault(interfaceC59591zjt.getProtocolVersion()));
        charArrayBuffer.append(method);
        charArrayBuffer.append(' ');
        charArrayBuffer.append(uri);
        charArrayBuffer.append(' ');
        copydefault(charArrayBuffer, interfaceC59591zjt.getProtocolVersion());
    }

    public org.apache.http.util.CharArrayBuffer OLrzqt(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59587zjp interfaceC59587zjp) {
        C59851zoo.AEQbTJ(interfaceC59587zjp, "Status line");
        org.apache.http.util.CharArrayBuffer charArrayBufferEZpvd = EZpvd(charArrayBuffer);
        KWHzl(charArrayBufferEZpvd, interfaceC59587zjp);
        return charArrayBufferEZpvd;
    }

    public void KWHzl(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59587zjp interfaceC59587zjp) {
        int iCopydefault = copydefault(interfaceC59587zjp.getProtocolVersion()) + 5;
        java.lang.String reasonPhrase = interfaceC59587zjp.getReasonPhrase();
        if (reasonPhrase != null) {
            iCopydefault += reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(iCopydefault);
        copydefault(charArrayBuffer, interfaceC59587zjp.getProtocolVersion());
        charArrayBuffer.append(' ');
        charArrayBuffer.append(java.lang.Integer.toString(interfaceC59587zjp.getStatusCode()));
        charArrayBuffer.append(' ');
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    @Override // o.InterfaceC59770znM
    public org.apache.http.util.CharArrayBuffer AEQbTJ(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59518ziZ interfaceC59518ziZ) {
        C59851zoo.AEQbTJ(interfaceC59518ziZ, "Header");
        if (interfaceC59518ziZ instanceof InterfaceC59516ziX) {
            return ((InterfaceC59516ziX) interfaceC59518ziZ).getBuffer();
        }
        org.apache.http.util.CharArrayBuffer charArrayBufferEZpvd = EZpvd(charArrayBuffer);
        EZpvd(charArrayBufferEZpvd, interfaceC59518ziZ);
        return charArrayBufferEZpvd;
    }

    public void EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59518ziZ interfaceC59518ziZ) {
        java.lang.String name = interfaceC59518ziZ.getName();
        java.lang.String value = interfaceC59518ziZ.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        charArrayBuffer.ensureCapacity(length);
        charArrayBuffer.append(name);
        charArrayBuffer.append(": ");
        if (value != null) {
            charArrayBuffer.ensureCapacity(charArrayBuffer.length() + value.length());
            for (int i = 0; i < value.length(); i++) {
                char cCharAt = value.charAt(i);
                if (cCharAt == '\r' || cCharAt == '\n' || cCharAt == '\f' || cCharAt == 11) {
                    cCharAt = ' ';
                }
                charArrayBuffer.append(cCharAt);
            }
        }
    }
}
