package com.okinc.core.ok_app.mlnservices;

import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.Arrays;
import o.C34704nhP;
import o.C43251rlk;
import o.C7910asj;
import o.InterfaceC33171mrS;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes8.dex */
@LuaClass
public class UDOKApp {
    public static final String LUA_CLASS_NAME = "OKApp";
    public Globals globals;

    @LuaBridge
    public int property;

    public UDOKApp(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public LuaValue[] getMode(LuaValue[] luaValueArr) {
        int i;
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
            i = 3;
        } else {
            i = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ() ? 2 : 1;
        }
        return LuaValue.rNumber(i);
    }

    @LuaBridge
    public LuaValue[] isModeLite(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ());
    }

    @LuaBridge
    public LuaValue[] isFullApp(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(true);
    }

    @LuaBridge
    public LuaValue[] supportScheme(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C7910asj.OLrzqt(this.globals, Arrays.asList(C34704nhP.EZpvd)));
    }
}
