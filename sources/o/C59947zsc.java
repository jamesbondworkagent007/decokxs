package o;

/* JADX INFO: renamed from: o.zsc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59947zsc {
    public java.lang.String KWHzl;
    public int copydefault;

    public C59947zsc(int i, java.lang.String str) {
        this.copydefault = i;
        this.KWHzl = str;
    }

    public C59947zsc(int i, java.lang.String str, java.lang.Object... objArr) {
        this.KWHzl = java.lang.String.format(str, objArr);
        this.copydefault = i;
    }

    public java.lang.String toString() {
        return this.copydefault + ": " + this.KWHzl;
    }
}
