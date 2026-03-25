package o;

/* JADX INFO: renamed from: o.agy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7289agy implements InterfaceC7284agt {
    public java.lang.StringBuffer copydefault;

    public C7289agy(java.lang.String str) {
        this.copydefault = new java.lang.StringBuffer(str);
    }

    public C7289agy() {
        this.copydefault = new java.lang.StringBuffer();
    }

    public java.lang.String toString() {
        return this.copydefault.toString();
    }

    @Override // o.InterfaceC7284agt
    public int KWHzl() {
        return this.copydefault.length();
    }

    @Override // o.InterfaceC7284agt
    public char EZpvd(int i) {
        return this.copydefault.charAt(i);
    }
}
