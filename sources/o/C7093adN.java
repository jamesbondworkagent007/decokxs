package o;

import java.util.Objects;

/* JADX INFO: renamed from: o.adN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7093adN {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;

    public C7093adN(java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
        this.KWHzl = AEQbTJ(str3);
        this.copydefault = i;
    }

    public static final int AEQbTJ(java.lang.String str) {
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        if (str.length() == 2) {
            int iCharAt5 = str.charAt(0) - 'A';
            if (iCharAt5 < 0 || 25 < iCharAt5 || str.charAt(1) - 'A' < 0 || 25 < iCharAt4) {
                return 0;
            }
            return (iCharAt5 * 26) + iCharAt4 + 1001;
        }
        if (str.length() != 3 || str.charAt(0) - '0' < 0 || 9 < iCharAt || str.charAt(1) - '0' < 0 || 9 < iCharAt2 || str.charAt(2) - '0' < 0 || 9 < iCharAt3) {
            return 0;
        }
        return (((iCharAt * 10) + iCharAt2) * 10) + iCharAt3 + 1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.EZpvd);
        if (!this.OLrzqt.isEmpty()) {
            sb.append('-');
            sb.append(this.OLrzqt);
        }
        if (!this.AEQbTJ.isEmpty()) {
            sb.append('-');
            sb.append(this.AEQbTJ);
        }
        return sb.toString();
    }

    public boolean KWHzl(C7093adN c7093adN) {
        return this.EZpvd.equals(c7093adN.EZpvd) && this.OLrzqt.equals(c7093adN.OLrzqt) && this.AEQbTJ.equals(c7093adN.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == C7093adN.class) {
                C7093adN c7093adN = (C7093adN) obj;
                if (!this.EZpvd.equals(c7093adN.EZpvd) || !this.OLrzqt.equals(c7093adN.OLrzqt) || !this.AEQbTJ.equals(c7093adN.AEQbTJ) || this.copydefault != c7093adN.copydefault) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.EZpvd, this.OLrzqt, this.AEQbTJ, java.lang.Integer.valueOf(this.copydefault));
    }
}
