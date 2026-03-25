package org.luaj.vm2;

import o.InterfaceC60044zuT;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC60044zuT
public class LuaThread extends NLuaValue {
    @Override // org.luaj.vm2.LuaValue
    public final LuaThread toLuaThread() {
        return this;
    }

    @Override // org.luaj.vm2.LuaValue
    public final int type() {
        return 8;
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public /* bridge */ /* synthetic */ void destroy() {
        super.destroy();
    }

    @Override // org.luaj.vm2.NLuaValue
    @InterfaceC60044zuT
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // org.luaj.vm2.NLuaValue
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @InterfaceC60044zuT
    public LuaThread(long j, long j2) {
        super(j, j2);
    }
}
