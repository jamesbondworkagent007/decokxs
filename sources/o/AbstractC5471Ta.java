package o;

import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.Ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5471Ta<T> {
    public android.util.SparseIntArray OLrzqt;

    public abstract int OLrzqt(T t);

    public final int OLrzqt(java.util.List<T> list, int i) {
        T t = list.get(i);
        if (t != null) {
            return OLrzqt(t);
        }
        return -255;
    }

    public final int KWHzl(int i) {
        return this.OLrzqt.get(i, LuaValue.ERR_FILE_NOT_FOUND);
    }
}
