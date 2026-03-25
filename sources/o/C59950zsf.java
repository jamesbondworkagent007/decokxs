package o;

/* JADX INFO: renamed from: o.zsf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59950zsf {
    public final char[] EZpvd;
    public final int OLrzqt;
    public int AEQbTJ = 0;
    public int copydefault = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AhwBna() {
        return this.AEQbTJ >= this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AkhnZx() {
        this.AEQbTJ = this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        this.AEQbTJ++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void djBIcL() {
        this.copydefault = this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int fetchVPNInfo() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void values() {
        this.AEQbTJ--;
    }

    public C59950zsf(java.lang.String str) {
        C59912zrU.KWHzl((java.lang.Object) str);
        char[] charArray = str.toCharArray();
        this.EZpvd = charArray;
        this.OLrzqt = charArray.length;
    }

    public char valueOf() {
        if (AhwBna()) {
            return (char) 65535;
        }
        return this.EZpvd[this.AEQbTJ];
    }

    public char AEQbTJ() {
        char c = AhwBna() ? (char) 65535 : this.EZpvd[this.AEQbTJ];
        this.AEQbTJ++;
        return c;
    }

    public int EZpvd(char c) {
        for (int i = this.AEQbTJ; i < this.OLrzqt; i++) {
            if (c == this.EZpvd[i]) {
                return i - this.AEQbTJ;
            }
        }
        return -1;
    }

    public int AEQbTJ(java.lang.CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        int i = this.AEQbTJ;
        while (i < this.OLrzqt) {
            if (cCharAt != this.EZpvd[i]) {
                do {
                    i++;
                    if (i >= this.OLrzqt) {
                        break;
                    }
                } while (cCharAt != this.EZpvd[i]);
            }
            if (i < this.OLrzqt) {
                int i2 = i + 1;
                int length = (charSequence.length() + i2) - 1;
                for (int i3 = 1; i2 < length && charSequence.charAt(i3) == this.EZpvd[i2]; i3++) {
                    i2++;
                }
                if (i2 == length) {
                    return i - this.AEQbTJ;
                }
            }
            i++;
        }
        return -1;
    }

    public java.lang.String copydefault(char c) {
        int iEZpvd = EZpvd(c);
        if (iEZpvd != -1) {
            java.lang.String str = new java.lang.String(this.EZpvd, this.AEQbTJ, iEZpvd);
            this.AEQbTJ += iEZpvd;
            return str;
        }
        return AYXKKw();
    }

    public java.lang.String KWHzl(java.lang.String str) {
        int iAEQbTJ = AEQbTJ((java.lang.CharSequence) str);
        if (iAEQbTJ != -1) {
            java.lang.String str2 = new java.lang.String(this.EZpvd, this.AEQbTJ, iAEQbTJ);
            this.AEQbTJ += iAEQbTJ;
            return str2;
        }
        return AYXKKw();
    }

    public java.lang.String EZpvd(char... cArr) {
        int i = this.AEQbTJ;
        loop0: while (this.AEQbTJ < this.OLrzqt) {
            for (char c : cArr) {
                if (this.EZpvd[this.AEQbTJ] == c) {
                    break loop0;
                }
            }
            this.AEQbTJ++;
        }
        int i2 = this.AEQbTJ;
        return i2 > i ? new java.lang.String(this.EZpvd, i, i2 - i) : "";
    }

    public java.lang.String AYXKKw() {
        char[] cArr = this.EZpvd;
        int i = this.AEQbTJ;
        java.lang.String str = new java.lang.String(cArr, i, this.OLrzqt - i);
        this.AEQbTJ = this.OLrzqt;
        return str;
    }

    public java.lang.String OLrzqt() {
        int i;
        char c;
        int i2 = this.AEQbTJ;
        while (true) {
            i = this.AEQbTJ;
            if (i >= this.OLrzqt || (((c = this.EZpvd[i]) < 'A' || c > 'Z') && (c < 'a' || c > 'z'))) {
                break;
            }
            this.AEQbTJ = i + 1;
        }
        return new java.lang.String(this.EZpvd, i2, i - i2);
    }

    public java.lang.String gEmmrt() {
        char c;
        int i = this.AEQbTJ;
        while (true) {
            int i2 = this.AEQbTJ;
            if (i2 >= this.OLrzqt || (((c = this.EZpvd[i2]) < 'A' || c > 'Z') && (c < 'a' || c > 'z'))) {
                break;
            }
            this.AEQbTJ = i2 + 1;
        }
        while (!AhwBna()) {
            char[] cArr = this.EZpvd;
            int i3 = this.AEQbTJ;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.AEQbTJ = i3 + 1;
        }
        return new java.lang.String(this.EZpvd, i, this.AEQbTJ - i);
    }

    public java.lang.String KWHzl() {
        int i;
        char c;
        int i2 = this.AEQbTJ;
        while (true) {
            i = this.AEQbTJ;
            if (i >= this.OLrzqt || (((c = this.EZpvd[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.AEQbTJ = i + 1;
        }
        return new java.lang.String(this.EZpvd, i2, i - i2);
    }

    public java.lang.String EZpvd() {
        int i;
        char c;
        int i2 = this.AEQbTJ;
        while (true) {
            i = this.AEQbTJ;
            if (i >= this.OLrzqt || (c = this.EZpvd[i]) < '0' || c > '9') {
                break;
            }
            this.AEQbTJ = i + 1;
        }
        return new java.lang.String(this.EZpvd, i2, i - i2);
    }

    public boolean AEQbTJ(char c) {
        return !AhwBna() && this.EZpvd[this.AEQbTJ] == c;
    }

    public boolean AEQbTJ(java.lang.String str) {
        int length = str.length();
        if (length > this.OLrzqt - this.AEQbTJ) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.EZpvd[this.AEQbTJ + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean djBIcL(java.lang.String str) {
        int length = str.length();
        if (length > this.OLrzqt - this.AEQbTJ) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (java.lang.Character.toUpperCase(str.charAt(i)) != java.lang.Character.toUpperCase(this.EZpvd[this.AEQbTJ + i])) {
                return false;
            }
        }
        return true;
    }

    public boolean copydefault(char... cArr) {
        if (AhwBna()) {
            return false;
        }
        char c = this.EZpvd[this.AEQbTJ];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public boolean DbNXlk() {
        if (AhwBna()) {
            return false;
        }
        char c = this.EZpvd[this.AEQbTJ];
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public boolean isConnected() {
        char c;
        return !AhwBna() && (c = this.EZpvd[this.AEQbTJ]) >= '0' && c <= '9';
    }

    public boolean OLrzqt(java.lang.String str) {
        if (!AEQbTJ(str)) {
            return false;
        }
        this.AEQbTJ += str.length();
        return true;
    }

    public boolean copydefault(java.lang.String str) {
        if (!djBIcL(str)) {
            return false;
        }
        this.AEQbTJ += str.length();
        return true;
    }

    public boolean EZpvd(java.lang.String str) {
        java.util.Locale locale = java.util.Locale.ENGLISH;
        return AEQbTJ((java.lang.CharSequence) str.toLowerCase(locale)) > -1 || AEQbTJ((java.lang.CharSequence) str.toUpperCase(locale)) > -1;
    }

    public java.lang.String toString() {
        char[] cArr = this.EZpvd;
        int i = this.AEQbTJ;
        return new java.lang.String(cArr, i, this.OLrzqt - i);
    }
}
