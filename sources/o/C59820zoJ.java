package o;

import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zoJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59820zoJ {
    public static final C59820zoJ OLrzqt = new C59820zoJ();

    public static boolean OLrzqt(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static BitSet copydefault(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public java.lang.String OLrzqt(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL, BitSet bitSet) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!c59822zoL.EZpvd()) {
                char cCharAt = charArrayBuffer.charAt(c59822zoL.copydefault());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (OLrzqt(cCharAt)) {
                    copydefault(charArrayBuffer, c59822zoL);
                    z = true;
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    AEQbTJ(charArrayBuffer, c59822zoL, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public java.lang.String KWHzl(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL, BitSet bitSet) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!c59822zoL.EZpvd()) {
                char cCharAt = charArrayBuffer.charAt(c59822zoL.copydefault());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (OLrzqt(cCharAt)) {
                    copydefault(charArrayBuffer, c59822zoL);
                    z = true;
                } else if (cCharAt == '\"') {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    OLrzqt(charArrayBuffer, c59822zoL, sb);
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    KWHzl(charArrayBuffer, c59822zoL, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public void copydefault(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL) {
        int iCopydefault = c59822zoL.copydefault();
        int iOLrzqt = c59822zoL.OLrzqt();
        for (int iCopydefault2 = c59822zoL.copydefault(); iCopydefault2 < iOLrzqt && OLrzqt(charArrayBuffer.charAt(iCopydefault2)); iCopydefault2++) {
            iCopydefault++;
        }
        c59822zoL.EZpvd(iCopydefault);
    }

    public void AEQbTJ(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL, BitSet bitSet, java.lang.StringBuilder sb) {
        int iCopydefault = c59822zoL.copydefault();
        int iOLrzqt = c59822zoL.OLrzqt();
        for (int iCopydefault2 = c59822zoL.copydefault(); iCopydefault2 < iOLrzqt; iCopydefault2++) {
            char cCharAt = charArrayBuffer.charAt(iCopydefault2);
            if ((bitSet != null && bitSet.get(cCharAt)) || OLrzqt(cCharAt)) {
                break;
            }
            iCopydefault++;
            sb.append(cCharAt);
        }
        c59822zoL.EZpvd(iCopydefault);
    }

    public void KWHzl(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL, BitSet bitSet, java.lang.StringBuilder sb) {
        int iCopydefault = c59822zoL.copydefault();
        int iOLrzqt = c59822zoL.OLrzqt();
        for (int iCopydefault2 = c59822zoL.copydefault(); iCopydefault2 < iOLrzqt; iCopydefault2++) {
            char cCharAt = charArrayBuffer.charAt(iCopydefault2);
            if ((bitSet != null && bitSet.get(cCharAt)) || OLrzqt(cCharAt) || cCharAt == '\"') {
                break;
            }
            iCopydefault++;
            sb.append(cCharAt);
        }
        c59822zoL.EZpvd(iCopydefault);
    }

    public void OLrzqt(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL, java.lang.StringBuilder sb) {
        if (c59822zoL.EZpvd()) {
            return;
        }
        int iCopydefault = c59822zoL.copydefault();
        int iCopydefault2 = c59822zoL.copydefault();
        int iOLrzqt = c59822zoL.OLrzqt();
        if (charArrayBuffer.charAt(iCopydefault) != '\"') {
            return;
        }
        int i = iCopydefault + 1;
        int i2 = iCopydefault2 + 1;
        boolean z = false;
        while (true) {
            if (i2 >= iOLrzqt) {
                break;
            }
            char cCharAt = charArrayBuffer.charAt(i2);
            if (z) {
                if (cCharAt != '\"' && cCharAt != '\\') {
                    sb.append(AbstractJsonLexerKt.STRING_ESC);
                }
                sb.append(cCharAt);
                z = false;
            } else if (cCharAt == '\"') {
                i++;
                break;
            } else if (cCharAt == '\\') {
                z = true;
            } else if (cCharAt != '\r' && cCharAt != '\n') {
                sb.append(cCharAt);
            }
            i2++;
            i++;
        }
        c59822zoL.EZpvd(i);
    }
}
