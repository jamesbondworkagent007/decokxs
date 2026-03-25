package o;

import java.text.ParsePosition;

/* JADX INFO: renamed from: o.acw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7075acw {
    public boolean AEQbTJ;
    public int EZpvd;
    public InterfaceC7290agz KWHzl;
    public ParsePosition OLrzqt;
    public char[] copydefault;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.copydefault != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.AEQbTJ;
    }

    public C7075acw(java.lang.String str, InterfaceC7290agz interfaceC7290agz, ParsePosition parsePosition) {
        if (str == null || parsePosition.getIndex() > str.length()) {
            throw new java.lang.IllegalArgumentException();
        }
        this.valueOf = str;
        this.KWHzl = interfaceC7290agz;
        this.OLrzqt = parsePosition;
        this.copydefault = null;
    }

    public boolean OLrzqt() {
        return this.copydefault == null && this.OLrzqt.getIndex() == this.valueOf.length();
    }

    public int KWHzl(int i) {
        int iEZpvd;
        InterfaceC7290agz interfaceC7290agz;
        this.AEQbTJ = false;
        while (true) {
            iEZpvd = EZpvd();
            AEQbTJ(C7242agD.copydefault(iEZpvd));
            if (iEZpvd == 36 && this.copydefault == null && (i & 1) != 0 && (interfaceC7290agz = this.KWHzl) != null) {
                java.lang.String str = this.valueOf;
                java.lang.String strOLrzqt = interfaceC7290agz.OLrzqt(str, this.OLrzqt, str.length());
                if (strOLrzqt == null) {
                    break;
                }
                this.EZpvd = 0;
                char[] cArrOLrzqt = this.KWHzl.OLrzqt(strOLrzqt);
                this.copydefault = cArrOLrzqt;
                if (cArrOLrzqt == null) {
                    throw new java.lang.IllegalArgumentException("Undefined variable: " + strOLrzqt);
                }
                if (cArrOLrzqt.length == 0) {
                    this.copydefault = null;
                }
            } else if ((i & 4) == 0 || !C7070acr.AEQbTJ(iEZpvd)) {
                break;
            }
        }
        if (iEZpvd == 92 && (i & 2) != 0) {
            int[] iArr = {0};
            iEZpvd = C7045acS.copydefault(copydefault(), iArr);
            EZpvd(iArr[0]);
            this.AEQbTJ = true;
            if (iEZpvd < 0) {
                throw new java.lang.IllegalArgumentException("Invalid escape");
            }
        }
        return iEZpvd;
    }

    public java.lang.Object KWHzl(java.lang.Object obj) {
        if (obj == null) {
            return new java.lang.Object[]{this.copydefault, new int[]{this.OLrzqt.getIndex(), this.EZpvd}};
        }
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        objArr[0] = this.copydefault;
        int[] iArr = (int[]) objArr[1];
        iArr[0] = this.OLrzqt.getIndex();
        iArr[1] = this.EZpvd;
        return obj;
    }

    public void copydefault(java.lang.Object obj) {
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        this.copydefault = (char[]) objArr[0];
        int[] iArr = (int[]) objArr[1];
        this.OLrzqt.setIndex(iArr[0]);
        this.EZpvd = iArr[1];
    }

    public void copydefault(int i) {
        if ((i & 4) == 0) {
            return;
        }
        while (true) {
            int iEZpvd = EZpvd();
            if (!C7070acr.AEQbTJ(iEZpvd)) {
                return;
            } else {
                AEQbTJ(C7242agD.copydefault(iEZpvd));
            }
        }
    }

    public java.lang.String copydefault() {
        char[] cArr = this.copydefault;
        if (cArr != null) {
            int i = this.EZpvd;
            return new java.lang.String(cArr, i, cArr.length - i);
        }
        return this.valueOf.substring(this.OLrzqt.getIndex());
    }

    public void EZpvd(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        char[] cArr = this.copydefault;
        if (cArr != null) {
            int i2 = this.EZpvd + i;
            this.EZpvd = i2;
            if (i2 > cArr.length) {
                throw new java.lang.IllegalArgumentException();
            }
            if (i2 == cArr.length) {
                this.copydefault = null;
                return;
            }
            return;
        }
        int index = this.OLrzqt.getIndex() + i;
        this.OLrzqt.setIndex(index);
        if (index > this.valueOf.length()) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public java.lang.String toString() {
        int index = this.OLrzqt.getIndex();
        return this.valueOf.substring(0, index) + '|' + this.valueOf.substring(index);
    }

    public final int EZpvd() {
        char[] cArr = this.copydefault;
        if (cArr != null) {
            return C7242agD.KWHzl(cArr, 0, cArr.length, this.EZpvd);
        }
        int index = this.OLrzqt.getIndex();
        if (index < this.valueOf.length()) {
            return C7242agD.AEQbTJ(this.valueOf, index);
        }
        return -1;
    }

    public final void AEQbTJ(int i) {
        char[] cArr = this.copydefault;
        if (cArr != null) {
            int i2 = this.EZpvd + i;
            this.EZpvd = i2;
            if (i2 == cArr.length) {
                this.copydefault = null;
                return;
            }
            return;
        }
        ParsePosition parsePosition = this.OLrzqt;
        parsePosition.setIndex(parsePosition.getIndex() + i);
        if (this.OLrzqt.getIndex() > this.valueOf.length()) {
            this.OLrzqt.setIndex(this.valueOf.length());
        }
    }
}
