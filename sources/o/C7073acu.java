package o;

/* JADX INFO: renamed from: o.acu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7073acu extends AbstractC7239agA {
    public InterfaceC7284agt KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC7239agA
    public int EZpvd() {
        return this.OLrzqt;
    }

    public C7073acu(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.KWHzl = new C7289agy(str);
        this.OLrzqt = 0;
    }

    @Override // o.AbstractC7239agA
    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // o.AbstractC7239agA
    public int OLrzqt() {
        if (this.OLrzqt < this.KWHzl.KWHzl()) {
            return this.KWHzl.EZpvd(this.OLrzqt);
        }
        return -1;
    }

    @Override // o.AbstractC7239agA
    public int AEQbTJ() {
        return this.KWHzl.KWHzl();
    }

    @Override // o.AbstractC7239agA
    public int KWHzl() {
        if (this.OLrzqt >= this.KWHzl.KWHzl()) {
            return -1;
        }
        InterfaceC7284agt interfaceC7284agt = this.KWHzl;
        int i = this.OLrzqt;
        this.OLrzqt = i + 1;
        return interfaceC7284agt.EZpvd(i);
    }

    @Override // o.AbstractC7239agA
    public int copydefault() {
        int i = this.OLrzqt;
        if (i <= 0) {
            return -1;
        }
        InterfaceC7284agt interfaceC7284agt = this.KWHzl;
        int i2 = i - 1;
        this.OLrzqt = i2;
        return interfaceC7284agt.EZpvd(i2);
    }

    @Override // o.AbstractC7239agA
    public void copydefault(int i) throws java.lang.IndexOutOfBoundsException {
        if (i < 0 || i > this.KWHzl.KWHzl()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        this.OLrzqt = i;
    }
}
