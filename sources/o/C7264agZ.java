package o;

import com.immomo.mls.utils.AssertUtils;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.agZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7264agZ implements InterfaceC7339ahv {
    public final LuaFunction OLrzqt;

    public C7264agZ(LuaFunction luaFunction) {
        AssertUtils.AEQbTJ(luaFunction);
        this.OLrzqt = luaFunction;
    }

    @Override // o.InterfaceC7339ahv
    public boolean OLrzqt(int i, android.content.Intent intent) {
        if (i == 0) {
            AEQbTJ(false, null);
            return true;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            AEQbTJ(true, null);
            return true;
        }
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(this.OLrzqt.getGlobals());
        for (java.lang.String str : extras.keySet()) {
            luaTableAEQbTJ.set(str, C7910asj.KWHzl(this.OLrzqt.getGlobals(), extras.get(str)));
        }
        AEQbTJ(true, luaTableAEQbTJ);
        luaTableAEQbTJ.destroy();
        return true;
    }

    public final void AEQbTJ(boolean z, LuaTable luaTable) {
        try {
            if (luaTable == null) {
                this.OLrzqt.KWHzl(z);
                return;
            }
            LuaFunction luaFunction = this.OLrzqt;
            LuaValue[] luaValueArr = new LuaValue[2];
            luaValueArr[0] = z ? LuaValue.True() : LuaValue.False();
            luaValueArr[1] = luaTable;
            luaFunction.invoke(LuaValue.varargsOf(luaValueArr));
            luaTable.destroy();
        } catch (java.lang.Throwable th) {
            C7320ahc.AEQbTJ(th, this.OLrzqt.getGlobals());
        }
    }
}
