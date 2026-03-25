package com.okinc.mln_ui.ui.okkit;

import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.concurrent.ConcurrentHashMap;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class UDGlobalValue {
    public static final String LUA_CLASS_NAME = "GlobalValue";
    public static ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();

    public UDGlobalValue(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
    }

    @LuaBridge
    public LuaValue[] set(LuaValue[] luaValueArr) {
        if (luaValueArr.length >= 2) {
            map.put(luaValueArr[0].toJavaString(), luaValueArr[1]);
        }
        return LuaValue.rNil();
    }

    @LuaBridge
    public LuaValue[] get(String str) {
        return LuaValue.varargsOf((LuaValue) map.get(str));
    }

    public static void AEQbTJ() {
        map.clear();
    }
}
