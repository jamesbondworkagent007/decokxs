package org.luaj.vm2;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC60044zuT
public class JavaUserdata<T> extends LuaUserdata<T> {
    @InterfaceC60044zuT
    public JavaUserdata(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public JavaUserdata(Globals globals, T t) {
        super(globals, t);
    }
}
