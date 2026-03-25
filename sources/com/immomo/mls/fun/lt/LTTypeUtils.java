package com.immomo.mls.fun.lt;

import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDMap;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class LTTypeUtils {
    public static final String[] EZpvd = {"isMap", "isArray"};

    @InterfaceC60044zuT
    public static LuaValue[] isMap(long j, LuaValue[] luaValueArr) {
        return (luaValueArr.length == 1 && (luaValueArr[0] instanceof UDMap)) ? LuaValue.rTrue() : LuaValue.rFalse();
    }

    @InterfaceC60044zuT
    public static LuaValue[] isArray(long j, LuaValue[] luaValueArr) {
        return (luaValueArr.length == 1 && (luaValueArr[0] instanceof UDArray)) ? LuaValue.rTrue() : LuaValue.rFalse();
    }
}
