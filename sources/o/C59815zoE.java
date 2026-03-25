package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zoE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59815zoE {

    @java.lang.Deprecated
    public static final C59815zoE copydefault = new C59815zoE();
    public static final C59815zoE EZpvd = new C59815zoE();

    public org.apache.httpcore.util.CharArrayBuffer AEQbTJ(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59862zoz[] interfaceC59862zozArr, boolean z) {
        C59825zoO.copydefault(interfaceC59862zozArr, "Header parameter array");
        int iEZpvd = EZpvd(interfaceC59862zozArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new org.apache.httpcore.util.CharArrayBuffer(iEZpvd);
        } else {
            charArrayBuffer.ensureCapacity(iEZpvd);
        }
        for (int i = 0; i < interfaceC59862zozArr.length; i++) {
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            copydefault(charArrayBuffer, interfaceC59862zozArr[i], z);
        }
        return charArrayBuffer;
    }

    public int EZpvd(InterfaceC59862zoz[] interfaceC59862zozArr) {
        if (interfaceC59862zozArr == null || interfaceC59862zozArr.length < 1) {
            return 0;
        }
        int length = (interfaceC59862zozArr.length - 1) * 2;
        for (InterfaceC59862zoz interfaceC59862zoz : interfaceC59862zozArr) {
            length += EZpvd(interfaceC59862zoz);
        }
        return length;
    }

    public org.apache.httpcore.util.CharArrayBuffer copydefault(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, InterfaceC59862zoz interfaceC59862zoz, boolean z) {
        C59825zoO.copydefault(interfaceC59862zoz, "Name / value pair");
        int iEZpvd = EZpvd(interfaceC59862zoz);
        if (charArrayBuffer == null) {
            charArrayBuffer = new org.apache.httpcore.util.CharArrayBuffer(iEZpvd);
        } else {
            charArrayBuffer.ensureCapacity(iEZpvd);
        }
        charArrayBuffer.append(interfaceC59862zoz.getName());
        java.lang.String value = interfaceC59862zoz.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            EZpvd(charArrayBuffer, value, z);
        }
        return charArrayBuffer;
    }

    public int EZpvd(InterfaceC59862zoz interfaceC59862zoz) {
        if (interfaceC59862zoz == null) {
            return 0;
        }
        int length = interfaceC59862zoz.getName().length();
        java.lang.String value = interfaceC59862zoz.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    public void EZpvd(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, java.lang.String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = copydefault(str.charAt(i));
            }
        }
        if (z) {
            charArrayBuffer.append('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (EZpvd(cCharAt)) {
                charArrayBuffer.append(AbstractJsonLexerKt.STRING_ESC);
            }
            charArrayBuffer.append(cCharAt);
        }
        if (z) {
            charArrayBuffer.append('\"');
        }
    }

    public boolean copydefault(char c) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c) >= 0;
    }

    public boolean EZpvd(char c) {
        return "\"\\".indexOf(c) >= 0;
    }
}
