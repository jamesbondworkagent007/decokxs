package o;

import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes2.dex */
public class SK {
    public long AEQbTJ;
    public int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return (int) this.AEQbTJ;
    }

    public SK(long j, int i) {
        this.AEQbTJ = j;
        this.EZpvd = i;
    }

    public static SK AEQbTJ(java.lang.String str, int i, int i2, boolean z) {
        if (i >= i2) {
            return null;
        }
        boolean z2 = false;
        if (z) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '+') {
                i++;
            } else if (cCharAt == '-') {
                z2 = true;
                i++;
            }
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                break;
            }
            long j2 = j * 10;
            long j3 = cCharAt2 - '0';
            if (z2) {
                j = j2 - j3;
                if (j < -2147483648L) {
                    return null;
                }
            } else {
                j = j2 + j3;
                if (j > 2147483647L) {
                    return null;
                }
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new SK(j, i3);
    }

    public static SK KWHzl(java.lang.String str, int i, int i2) {
        long j;
        int i3;
        long j2;
        long j3;
        if (i >= i2) {
            return null;
        }
        long j4 = 0;
        int i4 = i;
        while (i4 < i2) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < '0' || cCharAt > '9') {
                if (cCharAt >= 'A' && cCharAt <= 'F') {
                    j = j4 * 16;
                    i3 = cCharAt - 'A';
                } else {
                    if (cCharAt < 'a' || cCharAt > 'f') {
                        break;
                    }
                    j = j4 * 16;
                    i3 = cCharAt - 'a';
                }
                j2 = j + ((long) i3);
                j3 = 10;
            } else {
                j2 = j4 * 16;
                j3 = cCharAt - '0';
            }
            j4 = j2 + j3;
            if (j4 > BodyPartID.bodyIdMax) {
                return null;
            }
            i4++;
        }
        if (i4 == i) {
            return null;
        }
        return new SK(j4, i4);
    }
}
