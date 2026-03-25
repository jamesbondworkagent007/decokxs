package o;

/* JADX INFO: renamed from: o.zjI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59554zjI<I> {
    public final java.util.Map<java.lang.String, I> KWHzl = new java.util.HashMap();

    public static <I> C59554zjI<I> OLrzqt() {
        return new C59554zjI<>();
    }

    public C59554zjI<I> EZpvd(java.lang.String str, I i) {
        C59851zoo.OLrzqt(str, "ID");
        C59851zoo.AEQbTJ(i, "Item");
        this.KWHzl.put(str.toLowerCase(java.util.Locale.ROOT), i);
        return this;
    }

    public C59552zjG<I> AEQbTJ() {
        return new C59552zjG<>(this.KWHzl);
    }

    public java.lang.String toString() {
        return this.KWHzl.toString();
    }
}
