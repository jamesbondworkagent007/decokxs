package o;

/* JADX INFO: renamed from: o.adb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7107adb extends C7112adg {
    public java.lang.StringBuilder AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public java.lang.CharSequence DbNXlk;
    public int fetchVPNInfo;
    public final C7069acq valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void AuCTel() {
        if (this.AhwBna > 0) {
            int i = this.AuCTel;
            this.AkhnZx = i;
            this.isConnected = i;
            if (i != this.fetchVPNInfo) {
                this.AhwBna = 0;
                return;
            }
        } else {
            java.lang.CharSequence charSequence = this.fIwbmz;
            java.lang.CharSequence charSequence2 = this.DbNXlk;
            if (charSequence != charSequence2) {
                this.fIwbmz = charSequence2;
                int i2 = this.fetchVPNInfo;
                this.AkhnZx = i2;
                this.isConnected = i2;
                this.AuCTel = i2;
            }
        }
        this.fARcdN = 0;
        this.AhwBna = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void fIwbmz() {
        if (this.AhwBna < 0) {
            int i = this.AuCTel;
            this.fetchVPNInfo = i;
            this.fARcdN = i;
            if (i != this.AkhnZx) {
                this.AhwBna = 0;
                return;
            }
        } else {
            java.lang.CharSequence charSequence = this.fIwbmz;
            java.lang.CharSequence charSequence2 = this.DbNXlk;
            if (charSequence != charSequence2) {
                this.fIwbmz = charSequence2;
                int i2 = this.AkhnZx;
                this.fetchVPNInfo = i2;
                this.fARcdN = i2;
                this.AuCTel = i2;
            }
        }
        this.isConnected = this.values;
        this.AhwBna = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C7112adg, o.AbstractC7052acZ
    public int djBIcL() {
        return (this.AhwBna != 0 || this.fIwbmz == this.DbNXlk) ? this.AuCTel : this.AuCTel == this.fARcdN ? this.fetchVPNInfo : this.AkhnZx;
    }

    @Override // o.C7112adg, o.AbstractC7052acZ
    public int hashCode() {
        return 42;
    }

    public C7107adb(C7048acV c7048acV) {
        super(c7048acV);
        this.valueOf = c7048acV.AYXKKw;
    }

    public C7107adb(C7048acV c7048acV, boolean z, java.lang.CharSequence charSequence, int i) {
        super(c7048acV, z, charSequence, i);
        this.DbNXlk = charSequence;
        this.fetchVPNInfo = i;
        this.values = charSequence.length();
        this.valueOf = c7048acV.AYXKKw;
        this.AhwBna = 1;
    }

    @Override // o.C7112adg, o.AbstractC7052acZ
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AbstractC7052acZ) || !equals(obj) || !(obj instanceof C7107adb)) {
            return false;
        }
        C7107adb c7107adb = (C7107adb) obj;
        int i = this.AhwBna;
        if (i != c7107adb.AhwBna) {
            return false;
        }
        if (i == 0) {
            if ((this.fIwbmz == this.DbNXlk) != (c7107adb.fIwbmz == c7107adb.DbNXlk)) {
                return false;
            }
        }
        return (i != 0 || this.fIwbmz == this.DbNXlk) ? this.AuCTel == c7107adb.AuCTel : this.fetchVPNInfo == c7107adb.fetchVPNInfo && this.AuCTel - this.fARcdN == c7107adb.AuCTel - c7107adb.fARcdN;
    }

    @Override // o.C7112adg
    public void KWHzl(boolean z, java.lang.CharSequence charSequence, int i) {
        super.KWHzl(z, charSequence, i);
        this.DbNXlk = charSequence;
        this.fetchVPNInfo = i;
        int length = charSequence.length();
        this.isConnected = length;
        this.values = length;
        this.AhwBna = 1;
    }

    @Override // o.C7112adg, o.AbstractC7052acZ
    public int fetchVPNInfo() {
        char cCharAt;
        int i;
        int i2;
        int i3;
        while (true) {
            int i4 = this.AhwBna;
            if (i4 <= 0) {
                if (i4 == 0 && (i3 = this.AuCTel) != this.isConnected) {
                    java.lang.CharSequence charSequence = this.fIwbmz;
                    this.AuCTel = i3 + 1;
                    cCharAt = charSequence.charAt(i3);
                    break;
                }
                fIwbmz();
            } else {
                int i5 = this.AuCTel;
                if (i5 == this.isConnected) {
                    return -1;
                }
                java.lang.CharSequence charSequence2 = this.fIwbmz;
                this.AuCTel = i5 + 1;
                cCharAt = charSequence2.charAt(i5);
                if (C7106ada.copydefault(cCharAt) && (C7106ada.AEQbTJ(cCharAt) || ((i = this.AuCTel) != this.isConnected && C7106ada.KWHzl(this.fIwbmz.charAt(i))))) {
                    this.AuCTel--;
                    AkhnZx();
                    java.lang.CharSequence charSequence3 = this.fIwbmz;
                    int i6 = this.AuCTel;
                    this.AuCTel = i6 + 1;
                    cCharAt = charSequence3.charAt(i6);
                }
            }
        }
        if (!java.lang.Character.isHighSurrogate(cCharAt) || (i2 = this.AuCTel) == this.isConnected) {
            return cCharAt;
        }
        char cCharAt2 = this.fIwbmz.charAt(i2);
        if (!java.lang.Character.isLowSurrogate(cCharAt2)) {
            return cCharAt;
        }
        this.AuCTel++;
        return java.lang.Character.toCodePoint(cCharAt, cCharAt2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (java.lang.Character.isLowSurrogate(r0) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        r1 = r3.AuCTel;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r1 == r3.fARcdN) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r1 = r3.fIwbmz.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (java.lang.Character.isHighSurrogate(r1) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r3.AuCTel--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        return java.lang.Character.toCodePoint(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r0;
     */
    @Override // o.C7112adg, o.AbstractC7052acZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int isConnected() {
        char cCharAt;
        int i;
        int i2;
        while (true) {
            int i3 = this.AhwBna;
            if (i3 >= 0) {
                if (i3 == 0 && (i2 = this.AuCTel) != this.fARcdN) {
                    java.lang.CharSequence charSequence = this.fIwbmz;
                    int i4 = i2 - 1;
                    this.AuCTel = i4;
                    cCharAt = charSequence.charAt(i4);
                    break;
                }
                AuCTel();
            } else {
                int i5 = this.AuCTel;
                if (i5 == this.fARcdN) {
                    return -1;
                }
                java.lang.CharSequence charSequence2 = this.fIwbmz;
                int i6 = i5 - 1;
                this.AuCTel = i6;
                cCharAt = charSequence2.charAt(i6);
                if (C7106ada.KWHzl(cCharAt) && (C7106ada.AEQbTJ(cCharAt) || ((i = this.AuCTel) != this.fARcdN && C7106ada.copydefault(this.fIwbmz.charAt(i - 1))))) {
                    this.AuCTel++;
                    ejfBZ();
                    java.lang.CharSequence charSequence3 = this.fIwbmz;
                    int i7 = this.AuCTel - 1;
                    this.AuCTel = i7;
                    cCharAt = charSequence3.charAt(i7);
                }
            }
        }
    }

    @Override // o.C7112adg, o.AbstractC7052acZ
    public long AhwBna() {
        char cCharAt;
        int i;
        int i2;
        while (true) {
            int i3 = this.AhwBna;
            if (i3 <= 0) {
                if (i3 == 0 && (i2 = this.AuCTel) != this.isConnected) {
                    java.lang.CharSequence charSequence = this.fIwbmz;
                    this.AuCTel = i2 + 1;
                    cCharAt = charSequence.charAt(i2);
                    break;
                }
                fIwbmz();
            } else {
                int i4 = this.AuCTel;
                if (i4 == this.isConnected) {
                    return -4294967104L;
                }
                java.lang.CharSequence charSequence2 = this.fIwbmz;
                this.AuCTel = i4 + 1;
                cCharAt = charSequence2.charAt(i4);
                if (C7106ada.copydefault(cCharAt) && (C7106ada.AEQbTJ(cCharAt) || ((i = this.AuCTel) != this.isConnected && C7106ada.KWHzl(this.fIwbmz.charAt(i))))) {
                    this.AuCTel--;
                    AkhnZx();
                    java.lang.CharSequence charSequence3 = this.fIwbmz;
                    int i5 = this.AuCTel;
                    this.AuCTel = i5 + 1;
                    cCharAt = charSequence3.charAt(i5);
                }
            }
        }
        return OLrzqt(cCharAt, this.djBIcL.EZpvd(cCharAt));
    }

    @Override // o.C7112adg, o.AbstractC7052acZ
    public void AYXKKw(int i) {
        while (i > 0 && fetchVPNInfo() >= 0) {
            i--;
        }
    }

    @Override // o.C7112adg, o.AbstractC7052acZ
    public void AEQbTJ(int i) {
        while (i > 0 && isConnected() >= 0) {
            i--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r7.AkhnZx = r4;
        r7.isConnected = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AkhnZx() {
        int iCharCount;
        int i = this.AuCTel;
        int i2 = 0;
        while (true) {
            int iCodePointAt = java.lang.Character.codePointAt(this.fIwbmz, i);
            iCharCount = java.lang.Character.charCount(iCodePointAt) + i;
            int iIsConnected = this.valueOf.isConnected(iCodePointAt);
            int i3 = iIsConnected >> 8;
            if (i3 == 0 && i != this.AuCTel) {
                this.AkhnZx = i;
                this.isConnected = i;
                break;
            } else {
                if (i3 != 0 && (i2 > i3 || C7106ada.EZpvd(iIsConnected))) {
                    break;
                }
                i2 = iIsConnected & 255;
                if (iCharCount == this.values || i2 == 0) {
                    break;
                } else {
                    i = iCharCount;
                }
            }
        }
        while (iCharCount != this.values) {
            int iCodePointAt2 = java.lang.Character.codePointAt(this.fIwbmz, iCharCount);
            int iCharCount2 = java.lang.Character.charCount(iCodePointAt2);
            if (this.valueOf.isConnected(iCodePointAt2) <= 255) {
                break;
            } else {
                iCharCount += iCharCount2;
            }
        }
        copydefault(this.AuCTel, iCharCount);
        this.AuCTel = this.fARcdN;
        this.AhwBna = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r3 <= 255) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r4 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r0 = java.lang.Character.codePointBefore(r7.fIwbmz, r4);
        r2 = java.lang.Character.charCount(r0);
        r3 = r7.valueOf.isConnected(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r3 != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r4 = r4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        copydefault(r4, r7.AuCTel);
        r7.AuCTel = r7.isConnected;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ejfBZ() {
        int iCharCount;
        int i = this.AuCTel;
        int i2 = 0;
        while (true) {
            int iCodePointBefore = java.lang.Character.codePointBefore(this.fIwbmz, i);
            iCharCount = i - java.lang.Character.charCount(iCodePointBefore);
            int iIsConnected = this.valueOf.isConnected(iCodePointBefore);
            int i3 = iIsConnected & 255;
            if (i3 == 0 && i != this.AuCTel) {
                this.fetchVPNInfo = i;
                this.fARcdN = i;
                break;
            } else {
                if (i3 != 0 && ((i2 != 0 && i3 > i2) || C7106ada.EZpvd(iIsConnected))) {
                    break;
                }
                i2 = iIsConnected >> 8;
                if (iCharCount == 0 || i2 == 0) {
                    break;
                } else {
                    i = iCharCount;
                }
            }
        }
        this.fetchVPNInfo = iCharCount;
        this.fARcdN = iCharCount;
        this.AhwBna = 0;
    }

    public final void copydefault(int i, int i2) {
        if (this.AYXKKw == null) {
            this.AYXKKw = new java.lang.StringBuilder();
        }
        this.valueOf.OLrzqt(this.DbNXlk, i, i2, this.AYXKKw, i2 - i);
        this.fetchVPNInfo = i;
        this.AkhnZx = i2;
        java.lang.StringBuilder sb = this.AYXKKw;
        this.fIwbmz = sb;
        this.fARcdN = 0;
        this.isConnected = sb.length();
    }
}
