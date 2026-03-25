package o;

/* JADX INFO: renamed from: o.aez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7184aez implements InterfaceC7141aeI {
    public final int EZpvd;

    @Override // o.InterfaceC7141aeI
    public void KWHzl(C7145aeM c7145aeM) {
    }

    public static C7184aez copydefault(int i) {
        return new C7184aez(i);
    }

    public C7184aez(int i) {
        this.EZpvd = i;
    }

    @Override // o.InterfaceC7141aeI
    public boolean AEQbTJ(C7031acE c7031acE, C7145aeM c7145aeM) {
        if (!c7031acE.copydefault(this.EZpvd)) {
            return false;
        }
        c7031acE.EZpvd();
        c7145aeM.copydefault(c7031acE);
        return false;
    }

    @Override // o.InterfaceC7141aeI
    public boolean OLrzqt(C7031acE c7031acE) {
        return c7031acE.copydefault(this.EZpvd);
    }

    public java.lang.String toString() {
        return "<CodePointMatcher U+" + java.lang.Integer.toHexString(this.EZpvd) + ">";
    }
}
