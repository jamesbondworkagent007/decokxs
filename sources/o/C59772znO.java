package o;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.znO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59772znO implements InterfaceC59589zjr {
    public int EZpvd = EZpvd(-1);
    public final InterfaceC59574zjc KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    public boolean AEQbTJ(char c) {
        return c == ',';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59589zjr, java.util.Iterator
    public boolean hasNext() {
        return this.copydefault != null;
    }

    public C59772znO(InterfaceC59574zjc interfaceC59574zjc) {
        this.KWHzl = (InterfaceC59574zjc) C59851zoo.AEQbTJ(interfaceC59574zjc, "Header iterator");
    }

    @Override // o.InterfaceC59589zjr
    public java.lang.String EZpvd() throws org.apache.http.ParseException, NoSuchElementException {
        java.lang.String str = this.copydefault;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.EZpvd = EZpvd(this.EZpvd);
        return str;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws org.apache.http.ParseException, NoSuchElementException {
        return EZpvd();
    }

    @Override // java.util.Iterator
    public final void remove() throws java.lang.UnsupportedOperationException {
        throw new java.lang.UnsupportedOperationException("Removing tokens is not supported.");
    }

    public int EZpvd(int i) throws org.apache.http.ParseException {
        int iKWHzl;
        if (i < 0) {
            if (!this.KWHzl.hasNext()) {
                return -1;
            }
            this.OLrzqt = this.KWHzl.OLrzqt().getValue();
            iKWHzl = 0;
        } else {
            iKWHzl = KWHzl(i);
        }
        int iOLrzqt = OLrzqt(iKWHzl);
        if (iOLrzqt < 0) {
            this.copydefault = null;
            return -1;
        }
        int iCopydefault = copydefault(iOLrzqt);
        this.copydefault = AEQbTJ(this.OLrzqt, iOLrzqt, iCopydefault);
        return iCopydefault;
    }

    public java.lang.String AEQbTJ(java.lang.String str, int i, int i2) {
        return str.substring(i, i2);
    }

    public int OLrzqt(int i) {
        int iKWHzl = C59851zoo.KWHzl(i, "Search position");
        boolean z = false;
        while (!z) {
            java.lang.String str = this.OLrzqt;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z && iKWHzl < length) {
                char cCharAt = this.OLrzqt.charAt(iKWHzl);
                if (AEQbTJ(cCharAt) || copydefault(cCharAt)) {
                    iKWHzl++;
                } else {
                    if (!KWHzl(this.OLrzqt.charAt(iKWHzl))) {
                        throw new org.apache.http.ParseException("Invalid character before token (pos " + iKWHzl + "): " + this.OLrzqt);
                    }
                    z = true;
                }
            }
            if (!z) {
                if (this.KWHzl.hasNext()) {
                    this.OLrzqt = this.KWHzl.OLrzqt().getValue();
                    iKWHzl = 0;
                } else {
                    this.OLrzqt = null;
                }
            }
        }
        if (z) {
            return iKWHzl;
        }
        return -1;
    }

    public int KWHzl(int i) {
        int iKWHzl = C59851zoo.KWHzl(i, "Search position");
        int length = this.OLrzqt.length();
        boolean z = false;
        while (!z && iKWHzl < length) {
            char cCharAt = this.OLrzqt.charAt(iKWHzl);
            if (AEQbTJ(cCharAt)) {
                z = true;
            } else {
                if (!copydefault(cCharAt)) {
                    if (KWHzl(cCharAt)) {
                        throw new org.apache.http.ParseException("Tokens without separator (pos " + iKWHzl + "): " + this.OLrzqt);
                    }
                    throw new org.apache.http.ParseException("Invalid character after token (pos " + iKWHzl + "): " + this.OLrzqt);
                }
                iKWHzl++;
            }
        }
        return iKWHzl;
    }

    public int copydefault(int i) {
        C59851zoo.KWHzl(i, "Search position");
        int length = this.OLrzqt.length();
        do {
            i++;
            if (i >= length) {
                break;
            }
        } while (KWHzl(this.OLrzqt.charAt(i)));
        return i;
    }

    public boolean copydefault(char c) {
        return c == '\t' || java.lang.Character.isSpaceChar(c);
    }

    public boolean KWHzl(char c) {
        if (java.lang.Character.isLetterOrDigit(c)) {
            return true;
        }
        return (java.lang.Character.isISOControl(c) || EZpvd(c)) ? false : true;
    }

    public boolean EZpvd(char c) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c) >= 0;
    }
}
