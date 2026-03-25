package com.immomo.mls.fun.lt;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@InterfaceC60044zuT
public class LTPreferenceUtils_sbwrapper {
    public static final String[] methods = {"save", "get"};

    @InterfaceC60044zuT
    public static LuaValue[] save(long j, LuaValue[] luaValueArr) {
        LTPreferenceUtils.save(Globals.EZpvd(j), (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString());
        return null;
    }

    @InterfaceC60044zuT
    public static LuaValue[] get(long j, LuaValue[] luaValueArr) {
        Globals globalsEZpvd = Globals.EZpvd(j);
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(LTPreferenceUtils.get(globalsEZpvd, javaString2, javaString)));
    }
}
