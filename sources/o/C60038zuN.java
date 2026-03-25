package o;

import java.lang.ref.SoftReference;
import org.luaj.vm2.LuaUserdata;

/* JADX INFO: renamed from: o.zuN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60038zuN {
    public android.util.LongSparseArray<SoftReference<LuaUserdata>> AEQbTJ;
    public volatile long EZpvd = 1;
    public boolean KWHzl = false;
    public final android.util.LongSparseArray<LuaUserdata> OLrzqt = new android.util.LongSparseArray<>(100);

    public void EZpvd(LuaUserdata luaUserdata) {
        if (!this.KWHzl && luaUserdata.id == 0) {
            long j = this.EZpvd;
            this.EZpvd = 1 + j;
            luaUserdata.id = j;
            this.OLrzqt.put(j, luaUserdata);
        }
    }

    public LuaUserdata AEQbTJ(long j) {
        LuaUserdata luaUserdata = this.OLrzqt.get(j);
        if (luaUserdata != null) {
            return luaUserdata;
        }
        if (C7318aha.KWHzl == 2) {
            android.util.LongSparseArray<SoftReference<LuaUserdata>> longSparseArray = this.AEQbTJ;
            SoftReference<LuaUserdata> softReference = longSparseArray != null ? longSparseArray.get(j) : null;
            luaUserdata = softReference != null ? softReference.get() : null;
            if (luaUserdata != null && C7318aha.copydefault) {
                return C7318aha.OLrzqt(j, luaUserdata);
            }
        }
        return luaUserdata;
    }

    public void EZpvd(LuaUserdata luaUserdata, boolean z) {
        if (z) {
            this.OLrzqt.remove(luaUserdata.id);
            return;
        }
        byte b = C7318aha.KWHzl;
        if (b == 1) {
            this.OLrzqt.remove(luaUserdata.id);
        } else {
            if (b != 2) {
                return;
            }
            this.OLrzqt.remove(luaUserdata.id);
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new android.util.LongSparseArray<>(50);
            }
            this.AEQbTJ.put(luaUserdata.id, new SoftReference<>(luaUserdata));
        }
    }

    public void EZpvd() {
        this.KWHzl = true;
        int size = this.OLrzqt.size();
        for (int i = 0; i < size; i++) {
            LuaUserdata luaUserdataValueAt = this.OLrzqt.valueAt(i);
            if (luaUserdataValueAt != null) {
                luaUserdataValueAt.__onLuaGc();
            }
        }
        this.OLrzqt.clear();
        android.util.LongSparseArray<SoftReference<LuaUserdata>> longSparseArray = this.AEQbTJ;
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
