package o;

import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.znT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59777znT {
    public static final C59777znT OLrzqt = new C59777znT();

    public static boolean EZpvd(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static BitSet AEQbTJ(int... iArr) {
        BitSet bitSet = new BitSet();
        for (int i : iArr) {
            bitSet.set(i);
        }
        return bitSet;
    }

    public java.lang.String KWHzl(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN, BitSet bitSet) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!c59771znN.copydefault()) {
                char cCharAt = charArrayBuffer.charAt(c59771znN.OLrzqt());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (EZpvd(cCharAt)) {
                    copydefault(charArrayBuffer, c59771znN);
                    z = true;
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    copydefault(charArrayBuffer, c59771znN, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public java.lang.String copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN, BitSet bitSet) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        loop0: while (true) {
            boolean z = false;
            while (!c59771znN.copydefault()) {
                char cCharAt = charArrayBuffer.charAt(c59771znN.OLrzqt());
                if (bitSet != null && bitSet.get(cCharAt)) {
                    break loop0;
                }
                if (EZpvd(cCharAt)) {
                    copydefault(charArrayBuffer, c59771znN);
                    z = true;
                } else if (cCharAt == '\"') {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    copydefault(charArrayBuffer, c59771znN, sb);
                } else {
                    if (z && sb.length() > 0) {
                        sb.append(' ');
                    }
                    EZpvd(charArrayBuffer, c59771znN, bitSet, sb);
                }
            }
            break loop0;
        }
        return sb.toString();
    }

    public void copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        int iOLrzqt = c59771znN.OLrzqt();
        int iAEQbTJ = c59771znN.AEQbTJ();
        for (int iOLrzqt2 = c59771znN.OLrzqt(); iOLrzqt2 < iAEQbTJ && EZpvd(charArrayBuffer.charAt(iOLrzqt2)); iOLrzqt2++) {
            iOLrzqt++;
        }
        c59771znN.EZpvd(iOLrzqt);
    }

    public void copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN, BitSet bitSet, java.lang.StringBuilder sb) {
        int iOLrzqt = c59771znN.OLrzqt();
        int iAEQbTJ = c59771znN.AEQbTJ();
        for (int iOLrzqt2 = c59771znN.OLrzqt(); iOLrzqt2 < iAEQbTJ; iOLrzqt2++) {
            char cCharAt = charArrayBuffer.charAt(iOLrzqt2);
            if ((bitSet != null && bitSet.get(cCharAt)) || EZpvd(cCharAt)) {
                break;
            }
            iOLrzqt++;
            sb.append(cCharAt);
        }
        c59771znN.EZpvd(iOLrzqt);
    }

    public void EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN, BitSet bitSet, java.lang.StringBuilder sb) {
        int iOLrzqt = c59771znN.OLrzqt();
        int iAEQbTJ = c59771znN.AEQbTJ();
        for (int iOLrzqt2 = c59771znN.OLrzqt(); iOLrzqt2 < iAEQbTJ; iOLrzqt2++) {
            char cCharAt = charArrayBuffer.charAt(iOLrzqt2);
            if ((bitSet != null && bitSet.get(cCharAt)) || EZpvd(cCharAt) || cCharAt == '\"') {
                break;
            }
            iOLrzqt++;
            sb.append(cCharAt);
        }
        c59771znN.EZpvd(iOLrzqt);
    }

    public void copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN, java.lang.StringBuilder sb) {
        if (c59771znN.copydefault()) {
            return;
        }
        int iOLrzqt = c59771znN.OLrzqt();
        int iOLrzqt2 = c59771znN.OLrzqt();
        int iAEQbTJ = c59771znN.AEQbTJ();
        if (charArrayBuffer.charAt(iOLrzqt) != '\"') {
            return;
        }
        int i = iOLrzqt + 1;
        int i2 = iOLrzqt2 + 1;
        boolean z = false;
        while (true) {
            if (i2 >= iAEQbTJ) {
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
        c59771znN.EZpvd(i);
    }
}
