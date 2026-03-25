package com.immomo.mls.fun.lt;

import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class LTPrinter_sbwrapper {
    public static final String[] methods = {"printTable", "printObject"};

    @InterfaceC60044zuT
    public static LuaValue[] printTable(long j, LuaValue[] luaValueArr) {
        LTPrinter.printTable(luaValueArr.length > 0 ? luaValueArr[0] : null);
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] printObject(long j, LuaValue[] luaValueArr) {
        LTPrinter.printObject(luaValueArr.length > 0 ? luaValueArr[0] : null);
        return null;
    }
}
