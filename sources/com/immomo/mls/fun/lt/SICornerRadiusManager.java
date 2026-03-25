package com.immomo.mls.fun.lt;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C7322ahe;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SICornerRadiusManager {
    public static final String LUA_CLASS_NAME = "CornerManager";
    public final Globals globals;

    public void EZpvd() {
    }

    public SICornerRadiusManager(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public void openDefaultClip(boolean z) {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe != null) {
            c7322ahe.copydefault(z);
        }
    }
}
