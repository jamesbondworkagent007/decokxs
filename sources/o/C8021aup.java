package o;

import com.immomo.mls.base.exceptions.CalledFromWrongThreadException;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.aup, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8021aup implements InterfaceC8024aus, InterfaceC8023aur {
    public java.lang.Thread EZpvd = java.lang.Thread.currentThread();
    public LuaFunction OLrzqt;

    public C8021aup(LuaFunction luaFunction) {
        this.OLrzqt = luaFunction;
    }

    public LuaValue[] AEQbTJ(java.lang.Object... objArr) {
        EZpvd();
        C7982auB.KWHzl(this.OLrzqt);
        return C7982auB.OLrzqt(this.OLrzqt, objArr);
    }

    @Override // o.InterfaceC8024aus
    public void OLrzqt() {
        LuaFunction luaFunction = this.OLrzqt;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.OLrzqt = null;
    }

    @Override // o.InterfaceC8023aur
    public boolean AEQbTJ() {
        EZpvd();
        LuaFunction luaFunction = this.OLrzqt;
        return luaFunction == null || luaFunction.isDestroyed();
    }

    public void EZpvd() {
        if (this.EZpvd != java.lang.Thread.currentThread()) {
            throw new CalledFromWrongThreadException("Only the original thread that created lua stack can touch its stack.");
        }
    }
}
