package o;

/* JADX INFO: renamed from: o.aia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7371aia implements InterfaceC7308ahQ {
    @Override // o.InterfaceC7308ahQ
    public void copydefault(java.lang.String str) {
        copydefault(str, 0);
    }

    @Override // o.InterfaceC7308ahQ
    public void copydefault(java.lang.String str, int i) {
        synchronized (this) {
            if (i != 0) {
                i = 1;
            }
            android.widget.Toast.makeText(C7326ahi.OLrzqt(), str, i).show();
        }
    }
}
