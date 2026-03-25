package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes8.dex */
public class oUD {
    public java.lang.String[] EZpvd;
    public java.lang.String[] KWHzl;

    public oUD(java.lang.String str) {
        KWHzl(str);
    }

    public void KWHzl(java.lang.String str) {
        java.lang.String[] strArrSplit = str.split("\\.");
        this.KWHzl = strArrSplit;
        java.lang.String[] strArr = new java.lang.String[strArrSplit.length];
        this.EZpvd = strArr;
        strArr[0] = strArrSplit[0];
        int i = 1;
        while (true) {
            java.lang.String[] strArr2 = this.EZpvd;
            if (i >= strArr2.length) {
                return;
            }
            strArr2[i] = this.EZpvd[i - 1] + JwtUtilsKt.JWT_DELIMITER + this.KWHzl[i];
            i++;
        }
    }

    public final java.lang.String KWHzl(int i) {
        if (i < 0) {
            return null;
        }
        java.lang.String[] strArr = this.KWHzl;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public final java.lang.String OLrzqt(int i) {
        if (i < 0) {
            return null;
        }
        java.lang.String[] strArr = this.EZpvd;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public final java.lang.String copydefault() {
        return this.EZpvd[r0.length - 1];
    }

    public void copydefault(int i, java.lang.String str) {
        if (i >= 0) {
            java.lang.String[] strArr = this.KWHzl;
            if (i < strArr.length) {
                strArr[i] = str;
                java.lang.String str2 = strArr[0];
                for (int i2 = 1; i2 < this.KWHzl.length; i2++) {
                    str2 = str2 + JwtUtilsKt.JWT_DELIMITER + this.KWHzl[i2];
                }
                KWHzl(str2);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException();
    }
}
