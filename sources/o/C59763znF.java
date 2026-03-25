package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.znF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59763znF {

    @java.lang.Deprecated
    public static final C59763znF EZpvd = new C59763znF();
    public static final C59763znF OLrzqt = new C59763znF();

    public org.apache.http.util.CharArrayBuffer KWHzl(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59517ziY interfaceC59517ziY, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59517ziY, "Header element");
        int iEZpvd = EZpvd(interfaceC59517ziY);
        if (charArrayBuffer == null) {
            charArrayBuffer = new org.apache.http.util.CharArrayBuffer(iEZpvd);
        } else {
            charArrayBuffer.ensureCapacity(iEZpvd);
        }
        charArrayBuffer.append(interfaceC59517ziY.copydefault());
        java.lang.String strKWHzl = interfaceC59517ziY.KWHzl();
        if (strKWHzl != null) {
            charArrayBuffer.append('=');
            EZpvd(charArrayBuffer, strKWHzl, z);
        }
        int iOLrzqt = interfaceC59517ziY.OLrzqt();
        if (iOLrzqt > 0) {
            for (int i = 0; i < iOLrzqt; i++) {
                charArrayBuffer.append("; ");
                EZpvd(charArrayBuffer, interfaceC59517ziY.KWHzl(i), z);
            }
        }
        return charArrayBuffer;
    }

    public int EZpvd(InterfaceC59517ziY interfaceC59517ziY) {
        if (interfaceC59517ziY == null) {
            return 0;
        }
        int length = interfaceC59517ziY.copydefault().length();
        java.lang.String strKWHzl = interfaceC59517ziY.KWHzl();
        if (strKWHzl != null) {
            length += strKWHzl.length() + 3;
        }
        int iOLrzqt = interfaceC59517ziY.OLrzqt();
        if (iOLrzqt > 0) {
            for (int i = 0; i < iOLrzqt; i++) {
                length += AEQbTJ(interfaceC59517ziY.KWHzl(i)) + 2;
            }
        }
        return length;
    }

    public org.apache.http.util.CharArrayBuffer OLrzqt(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59582zjk[] interfaceC59582zjkArr, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59582zjkArr, "Header parameter array");
        int iEZpvd = EZpvd(interfaceC59582zjkArr);
        if (charArrayBuffer == null) {
            charArrayBuffer = new org.apache.http.util.CharArrayBuffer(iEZpvd);
        } else {
            charArrayBuffer.ensureCapacity(iEZpvd);
        }
        for (int i = 0; i < interfaceC59582zjkArr.length; i++) {
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            EZpvd(charArrayBuffer, interfaceC59582zjkArr[i], z);
        }
        return charArrayBuffer;
    }

    public int EZpvd(InterfaceC59582zjk[] interfaceC59582zjkArr) {
        if (interfaceC59582zjkArr == null || interfaceC59582zjkArr.length < 1) {
            return 0;
        }
        int length = (interfaceC59582zjkArr.length - 1) * 2;
        for (InterfaceC59582zjk interfaceC59582zjk : interfaceC59582zjkArr) {
            length += AEQbTJ(interfaceC59582zjk);
        }
        return length;
    }

    public org.apache.http.util.CharArrayBuffer EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59582zjk interfaceC59582zjk, boolean z) {
        C59851zoo.AEQbTJ(interfaceC59582zjk, "Name / value pair");
        int iAEQbTJ = AEQbTJ(interfaceC59582zjk);
        if (charArrayBuffer == null) {
            charArrayBuffer = new org.apache.http.util.CharArrayBuffer(iAEQbTJ);
        } else {
            charArrayBuffer.ensureCapacity(iAEQbTJ);
        }
        charArrayBuffer.append(interfaceC59582zjk.getName());
        java.lang.String value = interfaceC59582zjk.getValue();
        if (value != null) {
            charArrayBuffer.append('=');
            EZpvd(charArrayBuffer, value, z);
        }
        return charArrayBuffer;
    }

    public int AEQbTJ(InterfaceC59582zjk interfaceC59582zjk) {
        if (interfaceC59582zjk == null) {
            return 0;
        }
        int length = interfaceC59582zjk.getName().length();
        java.lang.String value = interfaceC59582zjk.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    public void EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, java.lang.String str, boolean z) {
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
