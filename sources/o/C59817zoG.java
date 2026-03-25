package o;

import com.fasterxml.jackson.core.JsonPointer;
import org.apache.httpcore.ProtocolVersion;

/* JADX INFO: renamed from: o.zoG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59817zoG {

    @java.lang.Deprecated
    public static final C59817zoG KWHzl = new C59817zoG();
    public static final C59817zoG copydefault = new C59817zoG();

    public org.apache.httpcore.util.CharArrayBuffer AEQbTJ(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            charArrayBuffer.clear();
            return charArrayBuffer;
        }
        return new org.apache.httpcore.util.CharArrayBuffer(64);
    }

    public org.apache.httpcore.util.CharArrayBuffer copydefault(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        C59825zoO.copydefault(protocolVersion, "Protocol version");
        int iEZpvd = EZpvd(protocolVersion);
        if (charArrayBuffer == null) {
            charArrayBuffer = new org.apache.httpcore.util.CharArrayBuffer(iEZpvd);
        } else {
            charArrayBuffer.ensureCapacity(iEZpvd);
        }
        charArrayBuffer.append(protocolVersion.getProtocol());
        charArrayBuffer.append(JsonPointer.SEPARATOR);
        charArrayBuffer.append(java.lang.Integer.toString(protocolVersion.getMajor()));
        charArrayBuffer.append('.');
        charArrayBuffer.append(java.lang.Integer.toString(protocolVersion.getMinor()));
        return charArrayBuffer;
    }

    public int EZpvd(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    public org.apache.httpcore.util.CharArrayBuffer copydefault(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59814zoD interfaceC59814zoD) {
        C59825zoO.copydefault(interfaceC59814zoD, "Request line");
        org.apache.httpcore.util.CharArrayBuffer charArrayBufferAEQbTJ = AEQbTJ(charArrayBuffer);
        OLrzqt(charArrayBufferAEQbTJ, interfaceC59814zoD);
        return charArrayBufferAEQbTJ;
    }

    public void OLrzqt(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59814zoD interfaceC59814zoD) {
        java.lang.String method = interfaceC59814zoD.getMethod();
        java.lang.String uri = interfaceC59814zoD.getUri();
        int length = method.length();
        charArrayBuffer.ensureCapacity(length + 1 + uri.length() + 1 + EZpvd(interfaceC59814zoD.getProtocolVersion()));
        charArrayBuffer.append(method);
        charArrayBuffer.append(' ');
        charArrayBuffer.append(uri);
        charArrayBuffer.append(' ');
        copydefault(charArrayBuffer, interfaceC59814zoD.getProtocolVersion());
    }

    public org.apache.httpcore.util.CharArrayBuffer AEQbTJ(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59811zoA interfaceC59811zoA) {
        C59825zoO.copydefault(interfaceC59811zoA, "Status line");
        org.apache.httpcore.util.CharArrayBuffer charArrayBufferAEQbTJ = AEQbTJ(charArrayBuffer);
        KWHzl(charArrayBufferAEQbTJ, interfaceC59811zoA);
        return charArrayBufferAEQbTJ;
    }

    public void KWHzl(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59811zoA interfaceC59811zoA) {
        int iEZpvd = EZpvd(interfaceC59811zoA.getProtocolVersion()) + 5;
        java.lang.String reasonPhrase = interfaceC59811zoA.getReasonPhrase();
        if (reasonPhrase != null) {
            iEZpvd += reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(iEZpvd);
        copydefault(charArrayBuffer, interfaceC59811zoA.getProtocolVersion());
        charArrayBuffer.append(' ');
        charArrayBuffer.append(java.lang.Integer.toString(interfaceC59811zoA.getStatusCode()));
        charArrayBuffer.append(' ');
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    public org.apache.httpcore.util.CharArrayBuffer KWHzl(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59858zov interfaceC59858zov) {
        C59825zoO.copydefault(interfaceC59858zov, "Header");
        if (interfaceC59858zov instanceof InterfaceC59860zox) {
            return ((InterfaceC59860zox) interfaceC59858zov).getBuffer();
        }
        org.apache.httpcore.util.CharArrayBuffer charArrayBufferAEQbTJ = AEQbTJ(charArrayBuffer);
        copydefault(charArrayBufferAEQbTJ, interfaceC59858zov);
        return charArrayBufferAEQbTJ;
    }

    public void copydefault(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59858zov interfaceC59858zov) {
        java.lang.String name = interfaceC59858zov.getName();
        java.lang.String value = interfaceC59858zov.getValue();
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
