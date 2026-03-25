package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.zkk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59635zkk {
    public final boolean AEQbTJ;
    public java.lang.String EZpvd;
    public final int KWHzl;
    public final java.lang.String OLrzqt;
    public final InterfaceC59638zkn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ(int i) {
        return i <= 0 ? this.KWHzl : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59638zkn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C59635zkk(java.lang.String str, int i, InterfaceC59638zkn interfaceC59638zkn) {
        C59851zoo.AEQbTJ(str, "Scheme name");
        C59851zoo.copydefault(i > 0 && i <= 65535, "Port is invalid");
        C59851zoo.AEQbTJ(interfaceC59638zkn, "Socket factory");
        this.OLrzqt = str.toLowerCase(java.util.Locale.ENGLISH);
        this.KWHzl = i;
        if (interfaceC59638zkn instanceof InterfaceC59637zkm) {
            this.AEQbTJ = true;
            this.copydefault = interfaceC59638zkn;
        } else if (interfaceC59638zkn instanceof InterfaceC59629zke) {
            this.AEQbTJ = true;
            this.copydefault = new C59633zki((InterfaceC59629zke) interfaceC59638zkn);
        } else {
            this.AEQbTJ = false;
            this.copydefault = interfaceC59638zkn;
        }
    }

    @java.lang.Deprecated
    public C59635zkk(java.lang.String str, InterfaceC59641zkq interfaceC59641zkq, int i) {
        C59851zoo.AEQbTJ(str, "Scheme name");
        C59851zoo.AEQbTJ(interfaceC59641zkq, "Socket factory");
        C59851zoo.copydefault(i > 0 && i <= 65535, "Port is invalid");
        this.OLrzqt = str.toLowerCase(java.util.Locale.ENGLISH);
        if (interfaceC59641zkq instanceof InterfaceC59630zkf) {
            this.copydefault = new C59634zkj((InterfaceC59630zkf) interfaceC59641zkq);
            this.AEQbTJ = true;
        } else {
            this.copydefault = new C59639zko(interfaceC59641zkq);
            this.AEQbTJ = false;
        }
        this.KWHzl = i;
    }

    public final java.lang.String toString() {
        if (this.EZpvd == null) {
            this.EZpvd = this.OLrzqt + AbstractJsonLexerKt.COLON + java.lang.Integer.toString(this.KWHzl);
        }
        return this.EZpvd;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59635zkk)) {
            return false;
        }
        C59635zkk c59635zkk = (C59635zkk) obj;
        return this.OLrzqt.equals(c59635zkk.OLrzqt) && this.KWHzl == c59635zkk.KWHzl && this.AEQbTJ == c59635zkk.AEQbTJ;
    }

    public int hashCode() {
        return C59852zop.KWHzl(C59852zop.EZpvd(C59852zop.EZpvd(17, this.KWHzl), this.OLrzqt), this.AEQbTJ);
    }
}
