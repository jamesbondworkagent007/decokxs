package com.immomo.mls.fun.java;

import com.immomo.mls.annotation.LuaClass;
import o.C7323ahf;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes22.dex */
@LuaClass
public class JToast {
    public JToast(Globals globals, LuaValue[] luaValueArr) {
        C7323ahf.fIwbmz().copydefault(luaValueArr[0].isString() ? luaValueArr[0].toJavaString() : "", luaValueArr.length > 1 ? luaValueArr[1].toInt() : 0);
    }
}
