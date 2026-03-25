package o;

/* JADX INFO: renamed from: o.adg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7112adg extends AbstractC7052acZ {
    public int AuCTel;
    public int fARcdN;
    public java.lang.CharSequence fIwbmz;
    public int isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7052acZ
    public int djBIcL() {
        return this.AuCTel - this.fARcdN;
    }

    @Override // o.AbstractC7052acZ
    public int hashCode() {
        return 42;
    }

    public C7112adg(C7048acV c7048acV) {
        super(c7048acV);
    }

    public C7112adg(C7048acV c7048acV, boolean z, java.lang.CharSequence charSequence, int i) {
        super(c7048acV, z);
        this.fIwbmz = charSequence;
        this.fARcdN = 0;
        this.AuCTel = i;
        this.isConnected = charSequence.length();
    }

    @Override // o.AbstractC7052acZ
    public boolean equals(java.lang.Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C7112adg c7112adg = (C7112adg) obj;
        return this.AuCTel - this.fARcdN == c7112adg.AuCTel - c7112adg.fARcdN;
    }

    public void KWHzl(boolean z, java.lang.CharSequence charSequence, int i) {
        copydefault(z);
        this.fIwbmz = charSequence;
        this.fARcdN = 0;
        this.AuCTel = i;
        this.isConnected = charSequence.length();
    }

    @Override // o.AbstractC7052acZ
    public int fetchVPNInfo() {
        int i;
        int i2 = this.AuCTel;
        if (i2 == this.isConnected) {
            return -1;
        }
        java.lang.CharSequence charSequence = this.fIwbmz;
        this.AuCTel = i2 + 1;
        char cCharAt = charSequence.charAt(i2);
        if (!java.lang.Character.isHighSurrogate(cCharAt) || (i = this.AuCTel) == this.isConnected) {
            return cCharAt;
        }
        char cCharAt2 = this.fIwbmz.charAt(i);
        if (!java.lang.Character.isLowSurrogate(cCharAt2)) {
            return cCharAt;
        }
        this.AuCTel++;
        return java.lang.Character.toCodePoint(cCharAt, cCharAt2);
    }

    @Override // o.AbstractC7052acZ
    public int isConnected() {
        int i;
        int i2 = this.AuCTel;
        if (i2 == this.fARcdN) {
            return -1;
        }
        java.lang.CharSequence charSequence = this.fIwbmz;
        int i3 = i2 - 1;
        this.AuCTel = i3;
        char cCharAt = charSequence.charAt(i3);
        if (!java.lang.Character.isLowSurrogate(cCharAt) || (i = this.AuCTel) == this.fARcdN) {
            return cCharAt;
        }
        char cCharAt2 = this.fIwbmz.charAt(i - 1);
        if (!java.lang.Character.isHighSurrogate(cCharAt2)) {
            return cCharAt;
        }
        this.AuCTel--;
        return java.lang.Character.toCodePoint(cCharAt2, cCharAt);
    }

    @Override // o.AbstractC7052acZ
    public long AhwBna() {
        int i = this.AuCTel;
        if (i == this.isConnected) {
            return -4294967104L;
        }
        java.lang.CharSequence charSequence = this.fIwbmz;
        this.AuCTel = i + 1;
        char cCharAt = charSequence.charAt(i);
        return OLrzqt(cCharAt, this.djBIcL.EZpvd(cCharAt));
    }

    @Override // o.AbstractC7052acZ
    public char valueOf() {
        int i = this.AuCTel;
        if (i == this.isConnected) {
            return (char) 0;
        }
        char cCharAt = this.fIwbmz.charAt(i);
        if (java.lang.Character.isLowSurrogate(cCharAt)) {
            this.AuCTel++;
        }
        return cCharAt;
    }

    @Override // o.AbstractC7052acZ
    public void AYXKKw(int i) {
        int i2;
        while (i > 0) {
            int i3 = this.AuCTel;
            if (i3 == this.isConnected) {
                return;
            }
            java.lang.CharSequence charSequence = this.fIwbmz;
            this.AuCTel = i3 + 1;
            i--;
            if (java.lang.Character.isHighSurrogate(charSequence.charAt(i3)) && (i2 = this.AuCTel) != this.isConnected && java.lang.Character.isLowSurrogate(this.fIwbmz.charAt(i2))) {
                this.AuCTel++;
            }
        }
    }

    @Override // o.AbstractC7052acZ
    public void AEQbTJ(int i) {
        int i2;
        while (i > 0) {
            int i3 = this.AuCTel;
            if (i3 == this.fARcdN) {
                return;
            }
            java.lang.CharSequence charSequence = this.fIwbmz;
            int i4 = i3 - 1;
            this.AuCTel = i4;
            i--;
            if (java.lang.Character.isLowSurrogate(charSequence.charAt(i4)) && (i2 = this.AuCTel) != this.fARcdN && java.lang.Character.isHighSurrogate(this.fIwbmz.charAt(i2 - 1))) {
                this.AuCTel--;
            }
        }
    }
}
