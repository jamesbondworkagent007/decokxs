package o;

import com.ibm.icu.text.UnicodeSet;

/* JADX INFO: renamed from: o.acE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7031acE implements java.lang.CharSequence {
    public boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public int KWHzl = 0;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.KWHzl += i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.copydefault = this.KWHzl + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.CharSequence
    public int length() {
        return this.copydefault - this.KWHzl;
    }

    public C7031acE(java.lang.String str, boolean z) {
        this.EZpvd = str;
        this.copydefault = str.length();
        this.AEQbTJ = z;
    }

    public void EZpvd() {
        this.KWHzl += java.lang.Character.charCount(copydefault());
    }

    public void OLrzqt() {
        this.copydefault = this.EZpvd.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.EZpvd.charAt(i + this.KWHzl);
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        java.lang.String str = this.EZpvd;
        int i3 = this.KWHzl;
        return str.subSequence(i + i3, i2 + i3);
    }

    public int copydefault() {
        int i;
        char cCharAt = this.EZpvd.charAt(this.KWHzl);
        if (!java.lang.Character.isHighSurrogate(cCharAt) || (i = this.KWHzl + 1) >= this.copydefault) {
            return cCharAt;
        }
        char cCharAt2 = this.EZpvd.charAt(i);
        return java.lang.Character.isLowSurrogate(cCharAt2) ? java.lang.Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    public int KWHzl(int i) {
        return this.EZpvd.codePointAt(this.KWHzl + i);
    }

    public boolean copydefault(int i) {
        return AEQbTJ(copydefault(), i, this.AEQbTJ);
    }

    public boolean copydefault(UnicodeSet unicodeSet) {
        int iCopydefault = copydefault();
        if (iCopydefault == -1) {
            return false;
        }
        return unicodeSet.AEQbTJ(iCopydefault);
    }

    public boolean AEQbTJ(java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || length() == 0) {
            return false;
        }
        return AEQbTJ(java.lang.Character.codePointAt(this, 0), java.lang.Character.codePointAt(charSequence, 0), this.AEQbTJ);
    }

    public int EZpvd(java.lang.CharSequence charSequence) {
        return EZpvd(charSequence, this.AEQbTJ);
    }

    public int OLrzqt(java.lang.CharSequence charSequence) {
        return EZpvd(charSequence, false);
    }

    public final int EZpvd(java.lang.CharSequence charSequence, boolean z) {
        int iCharCount = 0;
        while (iCharCount < java.lang.Math.min(length(), charSequence.length())) {
            int iCodePointAt = java.lang.Character.codePointAt(this, iCharCount);
            if (!AEQbTJ(iCodePointAt, java.lang.Character.codePointAt(charSequence, iCharCount), z)) {
                break;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        return iCharCount;
    }

    public static final boolean AEQbTJ(int i, int i2, boolean z) {
        if (i == i2) {
            return true;
        }
        return z && C7223afl.OLrzqt(i, true) == C7223afl.OLrzqt(i2, true);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.lang.CharSequence) {
            return C7045acS.KWHzl(this, (java.lang.CharSequence) obj);
        }
        return false;
    }

    public int hashCode() {
        return C7045acS.EZpvd(this);
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
        return this.EZpvd.substring(0, this.KWHzl) + "[" + this.EZpvd.substring(this.KWHzl, this.copydefault) + "]" + this.EZpvd.substring(this.copydefault);
    }

    public java.lang.String KWHzl() {
        return this.EZpvd.substring(this.KWHzl, this.copydefault);
    }
}
