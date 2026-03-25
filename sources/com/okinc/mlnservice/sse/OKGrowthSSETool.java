package com.okinc.mlnservice.sse;

import android.os.Handler;
import android.os.Looper;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.Map;
import o.C43209rkv;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class OKGrowthSSETool {
    public final Globals KWHzl;
    public final Handler copydefault = new Handler(Looper.getMainLooper());

    public OKGrowthSSETool(Globals globals, LuaValue[] luaValueArr) {
        this.KWHzl = globals;
    }

    @LuaBridge
    public LuaValue start(String str, Map<String, Object> map, InterfaceC7835arN interfaceC7835arN, InterfaceC7835arN interfaceC7835arN2) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C43209rkv.EZpvd.AEQbTJ(str, map, interfaceC7835arN, interfaceC7835arN2);
        return null;
    }

    @LuaBridge
    public LuaValue stop() {
        C43209rkv.EZpvd.AYXKKw();
        return null;
    }

    @LuaBridge
    public LuaValue isActive() {
        return LuaBoolean.AEQbTJ(C43209rkv.EZpvd.AhwBna());
    }

    @LuaBridge
    public LuaValue connectionState() {
        return LuaNumber.valueOf(C43209rkv.EZpvd.copydefault());
    }

    public void copydefault() {
        C43209rkv.EZpvd.AYXKKw();
    }
}
