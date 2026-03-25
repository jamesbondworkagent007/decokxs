package o;

import androidx.collection.SparseArrayCompat;

/* JADX INFO: renamed from: o.oHv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C35899oHv<T> {
    public final int KWHzl = -100;
    public SparseArrayCompat<InterfaceC35897oHt<T>> OLrzqt = new SparseArrayCompat<>();
    public InterfaceC35897oHt<T> EZpvd = new C35892oHo();

    public void OLrzqt(InterfaceC35897oHt<T> interfaceC35897oHt) {
        int size = this.OLrzqt.size();
        if (interfaceC35897oHt != null) {
            this.OLrzqt.put(size, interfaceC35897oHt);
        }
    }

    public InterfaceC35897oHt<T> KWHzl(int i) {
        InterfaceC35897oHt<T> interfaceC35897oHt = this.OLrzqt.get(i);
        return interfaceC35897oHt == null ? this.EZpvd : interfaceC35897oHt;
    }

    public int AEQbTJ(T t, int i) {
        for (int size = this.OLrzqt.size() - 1; size >= 0; size--) {
            if (this.OLrzqt.valueAt(size).AEQbTJ(t)) {
                return this.OLrzqt.keyAt(size);
            }
        }
        return -100;
    }

    public InterfaceC35897oHt<T> AEQbTJ(T t) {
        for (int i = 0; i < this.OLrzqt.size(); i++) {
            InterfaceC35897oHt<T> interfaceC35897oHtValueAt = this.OLrzqt.valueAt(i);
            if (interfaceC35897oHtValueAt.AEQbTJ(t)) {
                return interfaceC35897oHtValueAt;
            }
        }
        return this.EZpvd;
    }
}
