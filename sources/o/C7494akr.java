package o;

/* JADX INFO: renamed from: o.akr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7494akr {
    public int EZpvd = 0;
    public final android.util.SparseArray<java.lang.String> copydefault = new android.util.SparseArray<>(20);
    public final java.util.Map<java.lang.String, java.lang.Integer> OLrzqt = new java.util.HashMap(20);

    public int AEQbTJ(java.lang.String str) {
        java.lang.Integer num = this.OLrzqt.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (this.EZpvd == Integer.MAX_VALUE) {
            this.EZpvd = 0;
        }
        int i = this.EZpvd;
        this.EZpvd = i + 1;
        this.OLrzqt.put(str, java.lang.Integer.valueOf(i));
        this.copydefault.put(i, str);
        return i;
    }

    public java.lang.String OLrzqt(int i) {
        return this.copydefault.get(i);
    }

    public void OLrzqt() {
        this.copydefault.clear();
        this.OLrzqt.clear();
    }
}
